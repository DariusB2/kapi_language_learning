package com.isa.kapilanguagelearning.german.germanDate

import com.isa.kapilanguagelearning.R

object GermanDateConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanDateQuestion>{
        val questionsList=ArrayList<GermanDateQuestion>()

        // 1
        val que1= GermanDateQuestion(1, "What is the coldest season?", R.drawable.icon_winter,
            "Sommer", "Winter", "Herbst", "Frühling", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanDateQuestion(2, "In what month does Santa Claus come?", R.drawable.icon_december,
            "Dezember", "November", "Januar", "Oktober", 1
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanDateQuestion(3, "What is the first month of the year?", R.drawable.icon_january,
            "März", "Dezember", "Februar", "Januar", 4
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanDateQuestion(4, "In which season does the snowdrop rise?", R.drawable.icon_spring,
            "Sommer", "Frühling", "Herbst", "Winter", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanDateQuestion(5, "What is the last day of the week?", R.drawable.icon_sunday,
            "Freitag", "Montag", "Sonntag", "Dienstag", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanDateQuestion(6, "What is the hottest season?", R.drawable.icon_summer,
            "Frühling", "Sommer", "Herbst", "Winter", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanDateQuestion(7, "How is called the fifth day of the week?", R.drawable.icon_friday,
            "Sonntag", "Samstag", "Freitag", "Donnerstag", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanDateQuestion(8, "What month is between May and July?", R.drawable.icon_june,
            "August", "Juli", "Mai", "Juni", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanDateQuestion(9, "What is the first day of the week?", R.drawable.icon_monday,
            "Samstag", "Montag", "Dienstag", "Freitag", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanDateQuestion(10, "In which season do the leaves fall?", R.drawable.icon_autumn,
            "Herbst", "Frühling", "Sommer", "Winter", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}