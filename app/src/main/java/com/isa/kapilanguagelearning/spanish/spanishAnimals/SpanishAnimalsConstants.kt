package com.isa.kapilanguagelearning.spanish.spanishAnimals

import com.isa.kapilanguagelearning.R

object SpanishAnimalsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions2(): ArrayList<SpanishAnimalsQuestion>{
        val questionsList=ArrayList<SpanishAnimalsQuestion>()

        // 1
        val que1 = SpanishAnimalsQuestion(2, "What animal is in the photo?", R.drawable.icon_chicken,
            "el conejo", "el pollo", "el perro", "el gato", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = SpanishAnimalsQuestion(3, "What animal is in the photo?", R.drawable.icon_cow,
            "el gato", "el caballo", "la vaca", "el burro", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = SpanishAnimalsQuestion(4, "What animal is in the photo?", R.drawable.icon_sheep,
            "el conejo", "el burro", "el pato", "la oveja", 4
        )
        questionsList.add(que3)
        // 4
        val que4= SpanishAnimalsQuestion(5, "What animal is in the photo?", R.drawable.icon_horse,
            "el conejo", "el caballo", "el pato", "el cerdo", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = SpanishAnimalsQuestion(6, "What animal is in the photo?", R.drawable.icon_rabbit,
            "el conejo", "el burro", "la cabra", "el pavo", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = SpanishAnimalsQuestion(7, "What animal is in the photo?", R.drawable.icon_cat,
            "el carnero", "el gato", "el pavo", "la cabra", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = SpanishAnimalsQuestion(8, "What animal is in the photo?", R.drawable.icon_pig,
            "el perro", "el pato", "el cerdo", "el carnero", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = SpanishAnimalsQuestion(9, "What animal is in the photo?", R.drawable.icon_donkey,
            "el pavo", "la cabra", "el caballo", "el burro", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = SpanishAnimalsQuestion(10, "What animal is in the photo?", R.drawable.icon_dog,
            "el perro", "el caballo", "el cerdo", "la oveja", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = SpanishAnimalsQuestion(1, "What animal is in the photo?", R.drawable.icon_duck,
            "el perro", "el cerdo", "la oveja", "el pato", 4
        )
        questionsList.add(que10)
        return questionsList
    }
}