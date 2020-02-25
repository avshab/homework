package ru.skillbranch.skillarticles.markdown

import java.util.regex.Pattern


object MarkdownParser {

    private val LINE_SEPARATOR = System.getProperty("line.separator") ?: "\n"

    //group regex
    private const val UNORDERED_LIST_ITEM_GROUP = "(^[*+-] .+$)"
    private const val HEADER_GROUP = "(^#{1,6} .+?$)"
    private const val QUOTE_GROUP = "(^> .+?$)"
    private const val ITALIC_GROUP = "((?<!\\*)\\*[^*].*?[^*]?\\*(?!\\*)|(?<!_)_[^_].*?[^_]?_(?!_))"
    private const val BOLD_GROUP =
        "((?<!\\*)\\*{2}[^*].*?[^*]?\\*{2}(?!\\*)|(?<!_)_{2}[^_].*?[^_]?_{2}(?!_))"
    private const val STRIKE_GROUP = "((?<!~)~{2}[^~].*?[^~]?~{2}(?!~))"
    private const val RULE_GROUP = "()^[-_*]{3}$"
    private const val INLINE_GROUP = "((?<!`)`[^`\\s].*?[^`\\s]?`(?!`))"
    private const val LINK_GROUP = "(\\[[^\\[\\]]*?]\\(.+?\\)|^\\[*?]\\(.*?\\))"
    private const val ORDER_LIST_GROUP = "(^[\\d^0]{1}\\d*\\. .+$)"
    private const val BLOCK_CODE_GROUP = "(^`{3}(.*?\\n?)*`{3}$)"

    //result regex
    private const val MARKDOWN_GROUPS =
        "$UNORDERED_LIST_ITEM_GROUP|$HEADER_GROUP|$QUOTE_GROUP|$ITALIC_GROUP|$BOLD_GROUP|$STRIKE_GROUP|$RULE_GROUP|$INLINE_GROUP|$LINK_GROUP|$ORDER_LIST_GROUP|$BLOCK_CODE_GROUP"

    private val elementsPattern by lazy { Pattern.compile(MARKDOWN_GROUPS, Pattern.MULTILINE) }

    /**
     * parse markdown text to elements
     */
    fun parse(string: String): MarkdownText {
        val elements = mutableListOf<Element>()
        elements.addAll(findElements(string))
        return MarkdownText(elements)
    }

    private fun Element.join(): String {
        val data: String = this.text.toString()
        val childs = this.elements.join()
        val result = if (childs.isNotBlank()) {
            childs
        } else data

        return result
    }

    private fun List<Element>.join(): String {
        return this.map {
            it.join()
        }.joinToString("")
    }

    /**
     * clear markdown text to string without markdown characters
     */
    fun clear(string: String?): String? {
        string ?: return null
        val elements = mutableListOf<Element>()
        elements.addAll(findElements(string))

        return elements.join()
    }

    /**
     * find markdown elements in markdown text
     */
    private fun findElements(string: CharSequence): List<Element> {

        val parents = mutableListOf<Element>()
        val matcher = elementsPattern.matcher(string)
        var lastStartIndex = 0

        loop@ while (matcher.find(lastStartIndex)) {

            val startIndex = matcher.start()
            val endIndex = matcher.end()

            if (lastStartIndex < startIndex) {
                parents.add(Element.Text(string.subSequence(lastStartIndex, startIndex)))
            }

            var text: CharSequence


            //groups range for iterate by groups (1..9) or (1..11) optionally
            val groups = 1..11

            var group = -1

            for (gr in groups) {
                if (matcher.group(gr) != null) {
                    group = gr
                    break
                }
            }

            when (group) {
                //NOT FOUND -> BREAK
                -1 -> break@loop

                //UNORDERED LIST
                1 -> {
                    //text without "*. "
                    text = string.subSequence(startIndex.plus(2), endIndex)

                    val subs = findElements(text)
                    val element = Element.UnorderedListItem(text, subs)
                    parents.add(element)

                    lastStartIndex = endIndex

                }

                //HEADER
                2 -> {
                    val reg = "^#{1,6}".toRegex().find(string.subSequence(startIndex, endIndex))
                    val level = reg!!.value.length

                    //text without "{#} "
                    text = string.subSequence(startIndex.plus(level.inc()), endIndex)

                    val element = Element.Header(level, text)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //QUOTE
                3 -> {
                    //text without "> "
                    text = string.subSequence(startIndex.plus(2), endIndex)
                    val subelement = findElements(text)

                    val element = Element.Quote(text, subelement)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //ITALIC
                4 -> {
                    //text without "> "
                    text = string.subSequence(startIndex.inc(), endIndex.dec())
                    val subelement = findElements(text)

                    val element = Element.Italic(text, subelement)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //BOLD
                5 -> {
                    //text without "**{}**"
                    text = string.subSequence(startIndex.plus(2), endIndex.minus(2))
                    val subelement = findElements(text)

                    val element = Element.Bold(text, subelement)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //STRIKE
                6 -> {
                    //text without "~~{}~~"
                    text = string.subSequence(startIndex.plus(2), endIndex.minus(2))
                    val subelement = findElements(text)

                    val element = Element.Strike(text, subelement)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //RULE
                7 -> {

                    val element = Element.Rule()
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //RULE
                8 -> {
                    //text without "`{}`"
                    text = string.subSequence(startIndex.inc(), endIndex.dec())
                    val element = Element.InlineCode(text)
                    parents.add(element)

                    lastStartIndex = endIndex
                }

                //LINK
                9 -> {
                    //full text for regex
                    text = string.subSequence(startIndex, endIndex)
                    val (title: String, link: String) = "\\[(.*)]\\((.*)\\)".toRegex().find(text)!!.destructured
                    val element = Element.Link(link, title)
                    parents.add(element)
                    lastStartIndex = endIndex
                }
                //10 -> NUMERIC LIST
                10 -> {
                    text = string.subSequence(startIndex, endIndex)
                    val order = text.subSequence(0, text.indexOf('.') + 1)
                    val str = text.subSequence(text.indexOf('.').plus(2), text.lastIndex.plus(1))
                    val element = Element.OrderedListItem(order.toString(), str)
                    parents.add(element)

                    lastStartIndex = endIndex
                }
                //11 -> BLOCK CODE - optionally
                11 -> {
                    text = string.subSequence(startIndex.plus(3), endIndex.minus(3))
                    val kkk = text.lines()
                    val data = text.lines()
                    if (data.size == 1) {
                        parents.add(Element.BlockCode(Element.BlockCode.Type.SINGLE, text))
                    } else {
                        parents.add(
                            Element.BlockCode(
                                Element.BlockCode.Type.START,
                                data.first() + '\n'
                            )
                        )
                        data.subList(1, data.lastIndex).forEach {
                            val element =
                                Element.BlockCode(Element.BlockCode.Type.MIDDLE, it + '\n')
                            parents.add(element)
                        }
                        parents.add(Element.BlockCode(Element.BlockCode.Type.END, data.last()))
                    }

                    lastStartIndex = endIndex
                }
            }

        }

        if (lastStartIndex < string.lastIndex) {
            parents.add(Element.Text(string.subSequence(lastStartIndex, string.lastIndex + 1)))
        }


        return parents
    }
}

data class MarkdownText(val elements: List<Element>)

sealed class Element {
    abstract val text: CharSequence
    abstract val elements: List<Element>

    data class Text(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class UnorderedListItem(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Header(
        val level: Int = 1,
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Quote(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Italic(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Bold(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Strike(
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Rule(
        override val text: CharSequence = " ", //for insert span
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class InlineCode(
        override val text: CharSequence, //for insert span
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class Link(
        val link: String,
        override val text: CharSequence, //for insert span
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class OrderedListItem(
        val order: String,
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element()

    data class BlockCode(
        val type: Type = Type.MIDDLE,
        override val text: CharSequence,
        override val elements: List<Element> = emptyList()
    ) : Element() {
        enum class Type { START, END, MIDDLE, SINGLE }
    }
}