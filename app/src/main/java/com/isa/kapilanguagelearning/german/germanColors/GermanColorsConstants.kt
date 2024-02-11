package com.isa.kapilanguagelearning.german.germanColors

import com.isa.kapilanguagelearning.R

object GermanColorsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanColorsQuestion>{
        val questionsList=ArrayList<GermanColorsQuestion>()

        // 1
        val que1= GermanColorsQuestion(1, "What color is in the photo?", R.drawable.icon_red,
            "braun", "rot", "blau", "grün", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanColorsQuestion(2, "What color is in the photo?", R.drawable.icon_blue,
            "gelb", "blau", "lila", "grün", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanColorsQuestion(3, "What color is in the photo?", R.drawable.icon_black,
            "blau", "braun", "orange", "schwarz", 4
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanColorsQuestion(4, "What color is in the photo?", R.drawable.icon_yellow,
            "rosa", "weiß", "gelb", "rot", 3
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanColorsQuestion(5, "What color is in the photo?", R.drawable.icon_green,
            "grün", "blau", "rosa", "weiß", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanColorsQuestion(6, "What color is in the photo?", R.drawable.icon_white,
            "rot", "schwarz", "grün", "weiß", 4
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanColorsQuestion(7, "What color is in the photo?", R.drawable.icon_pink,
            "orange", "grau", "rosa", "lila", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanColorsQuestion(8, "What color is in the photo?", R.drawable.icon_orange,
            "gelb", "orange", "blau", "weiß", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanColorsQuestion(9, "What color is in the photo?", R.drawable.icon_gray,
            "gelb", "weiß", "grün", "grau", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanColorsQuestion(10, "What color is in the photo?", R.drawable.icon_brown,
            "braun", "schwarz", "lila", "gelb", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}