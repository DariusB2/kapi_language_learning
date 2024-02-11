package com.isa.kapilanguagelearning.german.germanHouse

import com.isa.kapilanguagelearning.R

object GermanHouseConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanHouseQuestion>{
        val questionsList=ArrayList<GermanHouseQuestion>()

        // 1
        val que1= GermanHouseQuestion(1, "What is in the photo?", R.drawable.icon_house,
            "das Schlafzimmer", "das Haus", "der Balkon", "der Flur", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanHouseQuestion(2, "What is in the photo?", R.drawable.icon_garage,
            "der Zaun", "das Schlafzimmer", "das Fenster", "die Garage", 4
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanHouseQuestion(3, "What is in the photo?", R.drawable.icon_wall,
            "die Wand", "das Tor", "der Hof", "der Balkon", 1
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanHouseQuestion(4, "What is in the photo?", R.drawable.icon_door,
            "das Haus", "die Küche", "die Tür", "der Hof", 3
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanHouseQuestion(5, "What is in the photo?", R.drawable.icon_window,
            "das Fenster", "die Garage", "die Treppe", "der Boden", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanHouseQuestion(6, "What is in the photo?", R.drawable.icon_fence,
            "das Tor", "der Zaun", "das Haus", "die Wand", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanHouseQuestion(7, "What is in the photo?", R.drawable.icon_stairs,
            "der Boden", "die Treppe", "das Fenster", "der Balkon", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanHouseQuestion(8, "What is in the photo?", R.drawable.icon_kitchen,
            "der Zaun", "die Tür", "die Garage", "die Küche", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanHouseQuestion(9, "What is in the photo?", R.drawable.icon_bedroom,
            "das Schlafzimmer", "der Kamin", "die Treppe", "der Balkon", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanHouseQuestion(10, "What is in the photo?", R.drawable.icon_fireplace,
            "die Wand", "die Tür", "der Kamin", "das Haus", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}