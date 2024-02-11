package com.isa.kapilanguagelearning.spanish.spanishNumbers

import com.isa.kapilanguagelearning.R

object SpanishNumbersConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishNumbersQuestion>{
        val questionsList=ArrayList<SpanishNumbersQuestion>()

        // 1
        val que1= SpanishNumbersQuestion(4, "What number is in the photo?", R.drawable.icon_14,
            "diez", "cuatro", "catorce", "trece", 3)
        questionsList.add(que1)
        // 2
        val que2 = SpanishNumbersQuestion(5, "What number is in the photo?", R.drawable.icon_11,
            "diez", "once", "uno", "doce", 2)
        questionsList.add(que2)
        // 3
        val que3 = SpanishNumbersQuestion(6, "What number is in the photo?", R.drawable.icon_4,
            "cuatro", "seis", "cinco", "dos", 1)
        questionsList.add(que3)
        // 4
        val que4 = SpanishNumbersQuestion(7, "What number is in the photo?", R.drawable.icon_100,
            "diez", "centenar", "doscientos", "treinta", 2)
        questionsList.add(que4)
        // 5
        val que5 = SpanishNumbersQuestion(8, "What number is in the photo?", R.drawable.icon_250,
            "veinticinco", "doscientos cincuenta", "doscientos", "cincuenta", 2)
        questionsList.add(que5)
        // 6
        val que6 = SpanishNumbersQuestion(9, "What number is in the photo?", R.drawable.icon_33,
            "treinta y dos", "tres", "treinta y tres", "treinta", 3)
        questionsList.add(que6)
        // 7
        val que7 = SpanishNumbersQuestion(10, "What number is in the photo?", R.drawable.icon_793,
            "setecientos noventa y dos", "setecientos noventa", "setecientos", "setecientos noventa y tres", 4)
        questionsList.add(que7)
        // 8
        val que8 = SpanishNumbersQuestion(3, "What number is in the photo?", R.drawable.icon_25,
            "veinticinco", "quince", "cinco", "treinta y cinco", 1)
        questionsList.add(que8)
        // 9
        val que9 = SpanishNumbersQuestion(2, "What number is in the photo?", R.drawable.icon_99,
            "centenar", "noventa y nueve", "noventa y tres", "noventa", 2)
        questionsList.add(que9)
        // 10
        val que10 = SpanishNumbersQuestion(1, "What number is in the photo?", R.drawable.icon_123,
            "ciento veintitrés", "ciento", "veintitrés", "ciento viente", 1)
        questionsList.add(que10)
        return questionsList
    }
}