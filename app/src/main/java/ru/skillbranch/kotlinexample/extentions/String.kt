package ru.skillbranch.kotlinexample.extentions

fun String.isValidPhone() =
    if (trimPhone().startsWith("+") && trimPhone().length == 12) true
    else false
fun String.trimPhone() = this.replace("[^+\\d]".toRegex(), replacement = "")