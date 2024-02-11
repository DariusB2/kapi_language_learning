package com.isa.kapilanguagelearning.german.germanColors

data class GermanColorsQuestion (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)