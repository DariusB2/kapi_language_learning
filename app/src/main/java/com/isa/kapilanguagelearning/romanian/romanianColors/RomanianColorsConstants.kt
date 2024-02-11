package com.isa.kapilanguagelearning.romanian.romanianColors

import com.isa.kapilanguagelearning.R

object RomanianColorsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianColorsQuestion>{
        val questionsList=ArrayList<RomanianColorsQuestion>()

        // 1
        val que1= RomanianColorsQuestion(8, "What color is in the photo?", R.drawable.icon_red,
            "albastru", "galben", "roșu", "negru", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianColorsQuestion(3, "What color is in the photo?", R.drawable.icon_blue,
            "albastru", "alb", "portocaliu", "roșu", 1
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianColorsQuestion(4, "What color is in the photo?", R.drawable.icon_black,
            "alb", "negru", "roz", "verde", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianColorsQuestion(2, "What color is in the photo?", R.drawable.icon_yellow,
            "albastru", "portocaliu", "roz", "galben", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianColorsQuestion(6, "What color is in the photo?", R.drawable.icon_green,
            "verde", "albastru", "roșu", "alb", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianColorsQuestion(5, "What color is in the photo?", R.drawable.icon_white,
            "negru", "alb", "portocaliu", "roz", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianColorsQuestion(9, "What color is in the photo?", R.drawable.icon_pink,
            "negru", "verde", "roșu", "roz", 4
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianColorsQuestion(1, "What color is in the photo?", R.drawable.icon_orange,
            "portocaliu", "verde", "albastru", "maro", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianColorsQuestion(10, "What color is in the photo?", R.drawable.icon_gray,
            "maro", "roșu", "gri", "galben", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianColorsQuestion(7, "What color is in the photo?", R.drawable.icon_brown,
            "galben", "maro", "gri", "negru", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}