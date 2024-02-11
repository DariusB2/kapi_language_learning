package com.isa.kapilanguagelearning.spanish.spanishObjects

import com.isa.kapilanguagelearning.R

object SpanishObjectsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishObjectsQuestion>{
        val questionsList=ArrayList<SpanishObjectsQuestion>()

        // 1
        val que1= SpanishObjectsQuestion(2, "What object is in the photo?", R.drawable.icon_desk,
            "el escritorio", "la cama", "la silla", "el lavavajillas", 1)
        questionsList.add(que1)
        // 2
        val que2 = SpanishObjectsQuestion(3, "What object is in the photo?", R.drawable.icon_mirror,
            "la cama", "el espejo", "la almohada", "la ducha", 2)
        questionsList.add(que2)
        // 3
        val que3 = SpanishObjectsQuestion(4, "What object is in the photo?", R.drawable.icon_wardrobe,
            "el ropero", "el lavavajillas", "la cama", "la televisión", 1)
        questionsList.add(que3)
        // 4
        val que4 = SpanishObjectsQuestion(5, "What object is in the photo?", R.drawable.icon_armchair,
            "la televisión", "la almohada", "la silla", "el sillón", 4)
        questionsList.add(que4)
        // 5
        val que5 = SpanishObjectsQuestion(6, "What object is in the photo?", R.drawable.icon_bookshelf,
            "el inodoro", "la libreria", "el lavavajillas", "la alfombra", 2)
        questionsList.add(que5)
        // 6
        val que6 = SpanishObjectsQuestion(7, "What object is in the photo?", R.drawable.icon_fridge,
            "la silla", "la nevera", "el inodoro", "la televisión", 2)
        questionsList.add(que6)
        // 7
        val que7 = SpanishObjectsQuestion(8, "What object is in the photo?", R.drawable.icon_lamp,
            "la imagen", "la alfombra", "la lámpara", "el inodoro", 3)
        questionsList.add(que7)

        val que8 = SpanishObjectsQuestion(9, "What object is in the photo?", R.drawable.icon_oven,
            "el horno", "la cama", "la alfombra", "la imagen", 1)
        questionsList.add(que8)
        // 9
        val que9 = SpanishObjectsQuestion(10, "What object is in the photo?", R.drawable.icon_table,
            "la imagen", "el lavavajillas", "la alfombra", "la mesa", 4)
        questionsList.add(que9)
        // 10
        val que10 = SpanishObjectsQuestion(1, "What object is in the photo?", R.drawable.icon_sofa,
            "el sofá", "la silla", "la televisión", "la cama", 1)
        questionsList.add(que10)

        return questionsList
    }
}