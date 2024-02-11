package com.isa.kapilanguagelearning.spanish.spanishFood

import com.isa.kapilanguagelearning.R

object SpanishFoodConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishFoodQuestion>{
        val questionsList=ArrayList<SpanishFoodQuestion>()

        // 1
        val que1=  SpanishFoodQuestion(2, "What aliment is in the photo?", R.drawable.icon_egg,
            "la sal", "el agua", "la pizza", "el huevo", 4)
        questionsList.add(que1)
        // 2
        val que2 =  SpanishFoodQuestion(3, "What aliment is in the photo?", R.drawable.icon_bread,
            "el pan", "el huevo", "el helado", "la mantequilla", 1)
        questionsList.add(que2)
        // 3
        val que3 =  SpanishFoodQuestion(4, "What aliment is in the photo?", R.drawable.icon_honey,
            "la mantequilla", "la miel", "el jamón", "la sal", 2)
        questionsList.add(que3)
        // 4
        val que4 =  SpanishFoodQuestion(5, "What aliment is in the photo?", R.drawable.icon_pizza,
            "el chile", "la sal", "el pan", "la pizza", 4)
        questionsList.add(que4)
        // 5
        val que5 =  SpanishFoodQuestion(6, "What aliment is in the photo?", R.drawable.icon_cake,
            "el chile", "el pastel", "la mantequilla", "el agua", 2)
        questionsList.add(que5)
        // 6
        val que6 =  SpanishFoodQuestion(7, "What aliment is in the photo?", R.drawable.icon_jam,
            "el pastel", "el helado", "la marmelada", "la ensalada", 3)
        questionsList.add(que6)
        // 7
        val que7 =  SpanishFoodQuestion(8, "What aliment is in the photo?", R.drawable.icon_milk,
            "la leche", "el agua", "el jamón", "la marmelada", 1)
        questionsList.add(que7)
        // 8
        val que8 =  SpanishFoodQuestion(9, "What aliment is in the photo?", R.drawable.icon_steak,
            "la salchicha", "la ensalada", "la leche", "el filete", 4)
        questionsList.add(que8)
        // 9
        val que9 =  SpanishFoodQuestion(10, "What aliment is in the photo?", R.drawable.icon_sausage,
            "el agua", "la salchicha", "la marmelada", "el filete", 2)
        questionsList.add(que9)
        // 10
        val que10 =  SpanishFoodQuestion(1, "What aliment is in the photo?", R.drawable.icon_cheese,
            "el helado", "el jamón", "el queso", "la ensalada", 3)
        questionsList.add(que10)
        return questionsList
    }
}