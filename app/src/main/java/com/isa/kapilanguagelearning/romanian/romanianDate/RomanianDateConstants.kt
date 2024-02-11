package com.isa.kapilanguagelearning.romanian.romanianDate

import com.isa.kapilanguagelearning.R

object RomanianDateConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianDateQuestion>{
        val questionsList=ArrayList<RomanianDateQuestion>()

        // 1
        val que1= RomanianDateQuestion(3, "What is the coldest season?", R.drawable.icon_winter,
            "vara", "iarna", "toamna", "primăvara", 2)
        questionsList.add(que1)
        // 2
        val que2 = RomanianDateQuestion(4, "In what month does Santa Claus come?", R.drawable.icon_december,
            "decembrie", "noiembrie", "ianuarie", "octombrie", 1)
        questionsList.add(que2)
        // 3
        val que3 = RomanianDateQuestion(1, "What is the first month of the year?", R.drawable.icon_january,
            "martie", "decembrie", "august", "ianuarie", 4)
        questionsList.add(que3)
        // 4
        val que4 = RomanianDateQuestion(2, "In which season does the snowdrop rise?", R.drawable.icon_spring,
            "vara", "primăvara", "toamna", "iarna", 2)
        questionsList.add(que4)
        // 5
        val que5 = RomanianDateQuestion(8, "What is the last day of the week?", R.drawable.icon_sunday,
            "vineri", "luni", "duminică", "miercuri", 3)
        questionsList.add(que5)
        // 6
        val que6 = RomanianDateQuestion(6, "What is the hottest season?", R.drawable.icon_summer,
            "primăvara", "vara", "iarna", "toamna", 2)
        questionsList.add(que6)
        // 7
        val que7 = RomanianDateQuestion(5, "How is called the fifth day of the week?", R.drawable.icon_friday,
            "duminică", "sâmbătă", "vineri", "luni", 3)
        questionsList.add(que7)
        // 8
        val que8 = RomanianDateQuestion(7, "What month is between May and July?", R.drawable.icon_june,
            "august", "aprilie", "iulie", "iunie", 4)
        questionsList.add(que8)
        // 9
        val que9 = RomanianDateQuestion(10, "What is the first day of the week?", R.drawable.icon_monday,
            "sâmbătă", "luni", "marți", "vineri", 2)
        questionsList.add(que9)
        // 10
        val que10 = RomanianDateQuestion(9, "In which season do the leaves fall?", R.drawable.icon_autumn,
            "toamna", "iarna", "vara", "primăvara", 1)
        questionsList.add(que10)
        return questionsList
    }
}