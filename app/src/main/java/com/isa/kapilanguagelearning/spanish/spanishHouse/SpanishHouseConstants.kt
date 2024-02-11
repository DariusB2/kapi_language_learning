package com.isa.kapilanguagelearning.spanish.spanishHouse

import com.isa.kapilanguagelearning.R

object SpanishHouseConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishHouseQuestion>{
        val questionsList=ArrayList<SpanishHouseQuestion>()

        // 1
        val que1= SpanishHouseQuestion(5, "What is in the photo?", R.drawable.icon_house,
            "el baño", "el pasillo", "la casa", "el balcón", 3)
        questionsList.add(que1)
        // 2
        val que2 = SpanishHouseQuestion(6, "What is in the photo?", R.drawable.icon_garage,
            "el garaje", "el baño", "la piscina", "el piso", 1)
        questionsList.add(que2)
        // 3
        val que3 = SpanishHouseQuestion(7, "What is in the photo?", R.drawable.icon_wall,
            "la piscina", "la pared", "el balcón", "el pasillo", 2)
        questionsList.add(que3)
        // 4
        val que4 = SpanishHouseQuestion(8, "What is in the photo?", R.drawable.icon_door,
            "el piso", "la piscina", "el patio", "la puerta", 4)
        questionsList.add(que4)
        // 5
        val que5 = SpanishHouseQuestion(9, "What is in the photo?", R.drawable.icon_window,
            "el pasillo", "la ventada", "el patio", "el balcón", 2)
        questionsList.add(que5)
        // 6
        val que6 = SpanishHouseQuestion(10, "What is in the photo?", R.drawable.icon_fence,
            "el piso", "la piscina", "la cerca", "el patio", 3)
        questionsList.add(que6)
        // 7
        val que7 = SpanishHouseQuestion(1, "What is in the photo?", R.drawable.icon_stairs,
            "el pasillo", "el balcón", "el patio", "las escaleras", 4)
        questionsList.add(que7)
        // 8
        val que8 = SpanishHouseQuestion(2, "What is in the photo?", R.drawable.icon_kitchen,
            "la cocina", "la puerta", "el pasillo", "la piscina", 1)
        questionsList.add(que8)
        // 9
        val que9 = SpanishHouseQuestion(3, "What is in the photo?", R.drawable.icon_bedroom,
            "el pasillo", "el dormitorio", "el baño", "el patio", 2)
        questionsList.add(que9)
        // 10
        val que10 = SpanishHouseQuestion(4, "What is in the photo?", R.drawable.icon_fireplace,
            "el pasillo", "la chimenea", "el baño", "el balcón", 2)
        questionsList.add(que10)

        return questionsList
    }
}