package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    val tengah = length / 2

    return if (length % 2 == 0) {
        string.substring(tengah - 1, tengah + 1)
    } else {
        string.substring(tengah, tengah + 1)
    }
}
