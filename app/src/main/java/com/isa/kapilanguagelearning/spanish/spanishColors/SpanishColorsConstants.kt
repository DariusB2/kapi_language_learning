package com.isa.kapilanguagelearning.spanish.spanishColors

import com.isa.kapilanguagelearning.R

object SpanishColorsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishColorsQuestion>{
        val questionsList=ArrayList<SpanishColorsQuestion>()

        // 1
        val que1= SpanishColorsQuestion(3, "What color is in the photo?", R.drawable.icon_red,
            "rojo", "blanco", "blau", "azul", 1
        )
        questionsList.add(que1)
        // 2
        val que2 = SpanishColorsQuestion(5, "What color is in the photo?", R.drawable.icon_blue,
            "negro", "rojo", "azul", "blanco", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = SpanishColorsQuestion(7, "What color is in the photo?", R.drawable.icon_black,
            "rojo", "negro", "naranjo", "blanco", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = SpanishColorsQuestion(8, "What color is in the photo?", R.drawable.icon_yellow,
            "rosa", "rojo", "gris", "amarillo", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = SpanishColorsQuestion(1, "What color is in the photo?", R.drawable.icon_green,
            "marrón", "verde", "rosa", "rojo", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = SpanishColorsQuestion(2, "What color is in the photo?", R.drawable.icon_white,
            "verde", "azul", "blanco", "marrón", 3
        )
        questionsList.add(que6)
        // 7
        val que7 = SpanishColorsQuestion(4, "What color is in the photo?", R.drawable.icon_pink,
            "rosa", "verde", "gris", "marrón", 1
        )
        questionsList.add(que7)
        // 8
        val que8 = SpanishColorsQuestion(8, "What color is in the photo?", R.drawable.icon_orange,
            "marrón", "naranjo", "verde", "amarillo", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = SpanishColorsQuestion(10, "What color is in the photo?", R.drawable.icon_gray,
            "blanco", "azul", "gris", "amarillo", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = SpanishColorsQuestion(6, "What color is in the photo?", R.drawable.icon_brown,
            "amarillo", "gris", "naranjo", "marrón", 4
        )
        questionsList.add(que10)

        return questionsList
    }
}