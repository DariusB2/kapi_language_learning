package com.isa.kapilanguagelearning.romanian.romanianObjects

import com.isa.kapilanguagelearning.R

object RomanianObjectsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianObjectsQuestion>{
        val questionsList=ArrayList<RomanianObjectsQuestion>()

        // 1
        val que1= RomanianObjectsQuestion(5, "What object is in the photo?", R.drawable.icon_desk,
            "pat", "cuptor", "lampă", "birou", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianObjectsQuestion(7, "What object is in the photo?", R.drawable.icon_mirror,
            "lampă", "cuptor", "oglindă", "covor", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianObjectsQuestion(9, "What object is in the photo?", R.drawable.icon_wardrobe,
            "frigider", "masă", "dulap", "pat", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianObjectsQuestion(1, "What object is in the photo?", R.drawable.icon_armchair,
            "bibliotecă", "fotoliu", "masă", "pat", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianObjectsQuestion(3, "What object is in the photo?", R.drawable.icon_bookshelf,
            "frigider", "dulap", "bibliotecă", "covor", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianObjectsQuestion(10, "What object is in the photo?", R.drawable.icon_fridge,
            "frigider", "canapea", "lampă", "fereastră", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianObjectsQuestion(2, "What object is in the photo?", R.drawable.icon_lamp,
            "fotoliu", "lampă", "oglindă", "canapea", 2
        )
        questionsList.add(que7)

        val que8 = RomanianObjectsQuestion(4, "What object is in the photo?", R.drawable.icon_oven,
            "masă", "covor", "dulap", "cuptor", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianObjectsQuestion(6, "What object is in the photo?", R.drawable.icon_table,
            "cuptor", "masă", "scaun", "canapea", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianObjectsQuestion(8, "What object is in the photo?", R.drawable.icon_sofa,
            "frigider", "cuptor", "canapea", "covor", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}