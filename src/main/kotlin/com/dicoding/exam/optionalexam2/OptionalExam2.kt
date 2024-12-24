package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.digitToInt() }

    val digitTerkecil = digits.minOrNull() ?: 0
    val digitTerbesar = digits.maxOrNull() ?: 0

    return digitTerbesar + digitTerkecil
}
