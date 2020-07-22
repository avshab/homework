package ru.skillbranch.skillarticles.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u001b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lru/skillbranch/skillarticles/data/repositories/MarkdownParser;", "", "()V", "BLOCK_CODE_GROUP", "", "BOLD_GROUP", "HEADER_GROUP", "IMAGE_GROUP", "INLINE_GROUP", "ITALIC_GROUP", "LINK_GROUP", "MARKDOWN_GROUPS", "ORDER_LIST_GROUP", "QUOTE_GROUP", "RULE_GROUP", "STRIKE_GROUP", "UNORDERED_LIST_ITEM_GROUP", "elementsPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "getElementsPattern", "()Ljava/util/regex/Pattern;", "elementsPattern$delegate", "Lkotlin/Lazy;", "findElements", "", "Lru/skillbranch/skillarticles/data/repositories/Element;", "string", "", "parse", "Lru/skillbranch/skillarticles/data/repositories/MarkdownElement;", "app_debug"})
public final class MarkdownParser {
    private static final java.lang.String UNORDERED_LIST_ITEM_GROUP = "(^[*+-] .+$)";
    private static final java.lang.String HEADER_GROUP = "(^#{1,6} .+?$)";
    private static final java.lang.String QUOTE_GROUP = "(^> .+?$)";
    private static final java.lang.String ITALIC_GROUP = "((?<!\\*)\\*[^*].*?[^*]?\\*(?!\\*)|(?<!_)_[^_].*?[^_]?_(?!_))";
    private static final java.lang.String BOLD_GROUP = "((?<!\\*)\\*{2}[^*].*?[^*]?\\*{2}(?!\\*)|(?<!_)_{2}[^_].*?[^_]?_{2}(?!_))";
    private static final java.lang.String STRIKE_GROUP = "(~~.+?~~)";
    private static final java.lang.String RULE_GROUP = "(^[-_*]{3}$)";
    private static final java.lang.String INLINE_GROUP = "((?<!`)`[^`\\s].*?[^`\\s]?`(?!`))";
    private static final java.lang.String LINK_GROUP = "(\\[[^\\[\\]]*?]\\(.+?\\)|^\\[*?]\\(.*?\\))";
    private static final java.lang.String BLOCK_CODE_GROUP = "(^```[\\s\\S]+?```$)";
    private static final java.lang.String ORDER_LIST_GROUP = "(^\\d{1,2}\\.\\s.+?$)";
    private static final java.lang.String IMAGE_GROUP = "(^!\\[[^\\[\\]]*?\\]\\(.*?\\)$)";
    private static final java.lang.String MARKDOWN_GROUPS = "(^[*+-] .+$)|(^#{1,6} .+?$)|(^> .+?$)|((?<!\\*)\\*[^*].*?[^*]?\\*(?!\\*)|(?<!_)_[^_].*?[^_]?_(?!_))|((?<!\\*)\\*{2}[^*].*?[^*]?\\*{2}(?!\\*)|(?<!_)_{2}[^_].*?[^_]?_{2}(?!_))|(~~.+?~~)|(^[-_*]{3}$)|((?<!`)`[^`\\s].*?[^`\\s]?`(?!`))|(\\[[^\\[\\]]*?]\\(.+?\\)|^\\[*?]\\(.*?\\))|(^```[\\s\\S]+?```$)|(^\\d{1,2}\\.\\s.+?$)|(^!\\[[^\\[\\]]*?\\]\\(.*?\\)$)";
    private static final kotlin.Lazy elementsPattern$delegate = null;
    public static final ru.skillbranch.skillarticles.data.repositories.MarkdownParser INSTANCE = null;
    
    private final java.util.regex.Pattern getElementsPattern() {
        return null;
    }
    
    /**
     * parse markdown text to elements
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.skillarticles.data.repositories.MarkdownElement> parse(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    /**
     * find markdown elements in markdown text
     */
    private final java.util.List<ru.skillbranch.skillarticles.data.repositories.Element> findElements(java.lang.CharSequence string) {
        return null;
    }
    
    private MarkdownParser() {
        super();
    }
}