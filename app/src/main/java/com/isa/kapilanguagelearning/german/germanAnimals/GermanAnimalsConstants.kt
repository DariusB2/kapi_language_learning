package com.isa.kapilanguagelearning.german.germanAnimals

import com.isa.kapilanguagelearning.R

object GermanAnimalsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions2(): ArrayList<GermanAnimalsQuestion>{
        val questionsList=ArrayList<GermanAnimalsQuestion>()

        // 1
        val que1 = GermanAnimalsQuestion(1, "What animal is in the photo?", R.drawable.icon_chicken,
            "der Hund", "das Huhn", "die Gans", "die Katze", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanAnimalsQuestion(2, "What animal is in the photo?", R.drawable.icon_cow,
            "das Schwein", "die Ziege", "die Kuh", "der Hund", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanAnimalsQuestion(3, "What animal is in the photo?", R.drawable.icon_sheep,
            "die Katze", "die Ziege", "das Huhn", "das Schaf", 4
        )
        questionsList.add(que3)
        // 4
        val que4= GermanAnimalsQuestion(4, "What animal is in the photo?", R.drawable.icon_horse,
            "das Lamm", "das Pferd", "die Ente", "das Schaf", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanAnimalsQuestion(5, "What animal is in the photo?", R.drawable.icon_rabbit,
            "das Kaninchen", "das Meerschweinchen", "die Kuh", "das Schaf", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanAnimalsQuestion(6, "What animal is in the photo?", R.drawable.icon_cat,
            "der Stier", "die Katze", "der Hund", "das Schwein", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanAnimalsQuestion(7, "What animal is in the photo?", R.drawable.icon_pig,
            "der Widder", "die Gans", "das Schwein", "die Kuh", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanAnimalsQuestion(8, "What animal is in the photo?", R.drawable.icon_donkey,
            "der Hahn", "der Widder", "der Truthahn", "der Esel", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanAnimalsQuestion(9, "What animal is in the photo?", R.drawable.icon_dog,
            "der Hund", "der Hahn", "das Meerschweinchen", "der Truthahn", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanAnimalsQuestion(10, "What animal is in the photo?", R.drawable.icon_duck,
            "der Stier", "der Hund", "der Truthahn", "die Ente", 4
        )
        questionsList.add(que10)


        return questionsList
    }
}