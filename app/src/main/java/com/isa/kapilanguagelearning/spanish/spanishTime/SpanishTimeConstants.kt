package com.isa.kapilanguagelearning.spanish.spanishTime

import com.isa.kapilanguagelearning.R

object SpanishTimeConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishTimeQuestion>{
        val questionsList=ArrayList<SpanishTimeQuestion>()

        // 1
        val que1= SpanishTimeQuestion(1, "What time is it?", R.drawable.icon_10_30,
            "Son las diez y media.", "Son las diez.", "Son las diez y cuarto.", "Son las diez y diez.", 1)
        questionsList.add(que1)
        // 2
        val que2 = SpanishTimeQuestion(2, "What time is it?", R.drawable.icon_11_59,
            "Son la once.", "Son la once y cincuenta y nueve.", "Son la doce y cincuenta.", "Son la doce y cincuenta y nueve.", 2)
        questionsList.add(que2)
        // 3
        val que3 = SpanishTimeQuestion(3, "What time is it?", R.drawable.icon_12_20,
            "Son la doce y veinte.", "Son la once y veinte.", "Son la doce.", "Son la doce y cincueta.", 1)
        questionsList.add(que3)
        // 4
        val que4 = SpanishTimeQuestion(4, "What time is it?", R.drawable.icon_01_49,
            "Es la una cuarenta y nueve.", "Es la una cuarenta y cinco.", "Es la una cuarenta.", "Son las dos cuarenta y nueve.", 4)
        questionsList.add(que4)
        // 5
        val que5 = SpanishTimeQuestion(5, "What time is it?", R.drawable.icon_04_15,
            "Es la cuatro y cuarto.", "Son las cuatro y media.", "Son las cuatro y cuarto.", "Son las cuatro.", 3)
        questionsList.add(que5)
        // 6
        val que6 = SpanishTimeQuestion(6, "What time is it?", R.drawable.icon_09_31,
            "Son las nueve treinta.", "Son las nueve treinta y uno.", "Son las cinco treinta y uno.", "Es la nueve treinta y dos.", 2)
        questionsList.add(que6)
        // 7
        val que7 = SpanishTimeQuestion(7, "What time is it?", R.drawable.icon_02_22,
            "Son las dos y cuarto.", "Es la una veintidós.", "Son las dos.", "Son las dos veintidós.", 4)
        questionsList.add(que7)
        // 8
        val que8 = SpanishTimeQuestion(8, "What time is it?", R.drawable.icon_03_05,
            "Son las tres y cuarto.", "Son las tres y cinco.", "Son las dos y cinco.", "Son las tres.", 2)
        questionsList.add(que8)
        // 9
        val que9 = SpanishTimeQuestion(9, "What time is it?", R.drawable.icon_07_45,
            "Son las seis y cuarenta y cinco.", "Son las siete y cuarenta y cinco.", "Son las seis y cuarenta.", "Son las siete.", 2)
        questionsList.add(que9)
        // 10
        val que10 = SpanishTimeQuestion(10, "What time is it?", R.drawable.icon_06_00,
            "Son las nueve.", "Son las seis y cuarto.", "Son las seis.", "Son las siete.", 3)
        questionsList.add(que10)

        return questionsList
    }
}