package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = "(\\D+)(\\d*)".toRegex()
    val matchResult = regex.matchEntire(str)

    return if (matchResult != null) {
        val (text, number) = matchResult.destructured
        if (number.isNotEmpty()) {
            val multiplied = number.toInt() * int
            text + multiplied
        } else {
            text + int
        }
    } else {
        str
    }
}
