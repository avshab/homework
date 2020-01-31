package ru.skillbranch.skillarticles.extensions

fun String?.indexesOf(query: String, ignoreCase: Boolean = true) : List<Int> {
    this ?: return listOf()
    if (query.isBlank()) return listOf()
    val searchString = if(ignoreCase) this.toLowerCase() else this
    val searchQuery = if(ignoreCase) query.toLowerCase() else query
    val l = searchQuery.length
    return searchString.mapIndexed{ index, ch ->
        if(ch == searchQuery.first() && l + index <= length && searchString.substring(index, l+index) == searchQuery)
            return@mapIndexed index
        else -1
    }.filter{ it > 0 }
}
