package com.isa.kapilanguagelearning.romanian.romanianAnimals

import com.isa.kapilanguagelearning.R

object RomanianAnimalsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions2(): ArrayList<RomanianAnimalsQuestion>{
        val questionsList=ArrayList<RomanianAnimalsQuestion>()

        // 1
        val que1 = RomanianAnimalsQuestion(1, "What animal is in the photo?", R.drawable.icon_chicken,
            "porc", "cocoș", "curcan", "găină", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianAnimalsQuestion(2, "What animal is in the photo?", R.drawable.icon_cow,
            "vacă", "găină", "curcan", "cocoș", 1
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianAnimalsQuestion(3, "What animal is in the photo?", R.drawable.icon_sheep,
            "câine", "cocoș", "găină", "oaie", 4
        )
        questionsList.add(que3)
        // 4
        val que4= RomanianAnimalsQuestion(4, "What animal is in the photo?", R.drawable.icon_horse,
            "oaie", "câine", "cal", "berbec", 3
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianAnimalsQuestion(5, "What animal is in the photo?", R.drawable.icon_rabbit,
            "taur", "iepure", "oaie", "porc", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianAnimalsQuestion(6, "What animal is in the photo?", R.drawable.icon_cat,
            "porc", "pisică", "oaie", "rață", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianAnimalsQuestion(7, "What animal is in the photo?", R.drawable.icon_pig,
            "porc", "găină", "rață", "gâscă", 1
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianAnimalsQuestion(8, "What animal is in the photo?", R.drawable.icon_donkey,
            "rață", "măgar", "berbec", "taur", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianAnimalsQuestion(9, "What animal is in the photo?", R.drawable.icon_dog,
            "taur", "gâscă", "berbec", "câine", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianAnimalsQuestion(10, "What animal is in the photo?", R.drawable.icon_duck,
            "câine", "curcan", "rață", "gâscă", 3
        )
        questionsList.add(que10)
        return questionsList
    }
}