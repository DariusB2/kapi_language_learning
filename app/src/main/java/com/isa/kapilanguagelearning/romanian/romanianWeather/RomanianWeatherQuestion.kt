package com.isa.kapilanguagelearning.romanian.romanianWeather

data class RomanianWeatherQuestion (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)