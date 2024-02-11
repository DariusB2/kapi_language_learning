package com.isa.kapilanguagelearning.romanian.romanianHouse

import com.isa.kapilanguagelearning.R

object RomanianHouseConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianHouseQuestion>{
        val questionsList=ArrayList<RomanianHouseQuestion>()

        // 1
        val que1= RomanianHouseQuestion(3, "What is in the photo?", R.drawable.icon_house,
            "gard", "bucătărie", "fereastră", "casă", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianHouseQuestion(4, "What is in the photo?", R.drawable.icon_garage,
            "ușă", "garaj", "bucătărie", "gard", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianHouseQuestion(5, "What is in the photo?", R.drawable.icon_wall,
            "fereastră", "perete", "ușă", "balcon", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianHouseQuestion(6, "What is in the photo?", R.drawable.icon_door,
            "fereastră", "ușă", "dormitor", "scări", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianHouseQuestion(7, "What is in the photo?", R.drawable.icon_window,
            "scări", "șemineu", "fereastră", "gard", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianHouseQuestion(8, "What is in the photo?", R.drawable.icon_fence,
            "scări", "șemineu", "casă", "gard", 4
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianHouseQuestion(9, "What is in the photo?", R.drawable.icon_stairs,
            "scări", "casă", "bucătărie", "șemineu", 1
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianHouseQuestion(10, "What is in the photo?", R.drawable.icon_kitchen,
            "casă", "bucătărie", "dormitor", "garaj", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianHouseQuestion(1, "What is in the photo?", R.drawable.icon_bedroom,
            "șemineu", "garaj", "dormitor", "casă", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianHouseQuestion(2, "What is in the photo?", R.drawable.icon_fireplace,
            "garaj", "dormitor", "ușă", "șemineu", 4
        )
        questionsList.add(que10)

        return questionsList
    }
}