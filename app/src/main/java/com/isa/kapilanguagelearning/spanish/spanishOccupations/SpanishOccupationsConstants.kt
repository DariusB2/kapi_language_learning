package com.isa.kapilanguagelearning.spanish.spanishOccupations

import com.isa.kapilanguagelearning.R

object SpanishOccupationsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishOccupationsQuestion>{
        val questionsList=ArrayList<SpanishOccupationsQuestion>()

        // 1
        val que1= SpanishOccupationsQuestion(10, "What is the occupation of the person in the photo?", R.drawable.icon_builder,
            "el jardinero", "el constructor", "el musico", "la profesora", 2)
        questionsList.add(que1)
        // 2
        val que2 = SpanishOccupationsQuestion(9, "What is the occupation of the person in the photo?", R.drawable.icon_waiter,
            "el futbolista", "el jardinero", "la camarera", "la profesora", 3)
        questionsList.add(que2)
        // 3
        val que3 = SpanishOccupationsQuestion(8, "What is the occupation of the person in the photo?", R.drawable.icon_cook,
            "el cocinero", "el piloto", "el futbolista", "el jardinero", 1)
        questionsList.add(que3)
        // 4
        val que4 = SpanishOccupationsQuestion(7, "What is the occupation of the person in the photo?", R.drawable.icon_nurse,
            "el jardinero", "la enfermera", "el futbolista", "la profesora", 2)
        questionsList.add(que4)
        // 5
        val que5 = SpanishOccupationsQuestion(6, "What is the occupation of the person in the photo?", R.drawable.icon_sailor,
            "el futbolista", "el jardinero", "el marinero", "el piloto", 3)
        questionsList.add(que5)
        // 6
        val que6 = SpanishOccupationsQuestion(5, "What is the occupation of the person in the photo?", R.drawable.icon_cashier,
            "el piloto", "el jardinero", "el agricultor", "la cajera", 4)
        questionsList.add(que6)
        // 7
        val que7 = SpanishOccupationsQuestion(4, "What is the occupation of the person in the photo?", R.drawable.icon_judge,
            "el juez", "el musico", "el bombero", "el agricultor", 1)
        questionsList.add(que7)
        // 8
        val que8 = SpanishOccupationsQuestion(3, "What is the occupation of the person in the photo?", R.drawable.icon_farmer,
            "el piloto", "el agricultor", "el musico", "el agricultor", 2)
        questionsList.add(que8)
        // 9
        val que9 = SpanishOccupationsQuestion(2, "What is the occupation of the person in the photo?", R.drawable.icon_doctor,
            "el bombero", "el jardinero", "la profesora", "el doctor", 4)
        questionsList.add(que9)
        // 10
        val que10 = SpanishOccupationsQuestion(1, "What is the occupation of the person in the photo?", R.drawable.icon_cop,
            "el musico", "el bombero", "el policia", "el agricultor", 3)
        questionsList.add(que10)

        return questionsList
    }
}