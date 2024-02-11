package com.isa.kapilanguagelearning.romanian.romanianOccupations

data class RomanianOccupationsQuestion (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)