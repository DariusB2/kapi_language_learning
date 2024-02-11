package com.isa.kapilanguagelearning.spanish.spanishDate

import com.isa.kapilanguagelearning.R

object SpanishDateConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishDateQuestion>{
        val questionsList=ArrayList<SpanishDateQuestion>()

        // 1
        val que1= SpanishDateQuestion(10, "What is the coldest season?", R.drawable.icon_winter,
            "Otoño", "Verano", "Inviero", "Primavera", 3)
        questionsList.add(que1)
        // 2
        val que2 = SpanishDateQuestion(9, "In what month does Santa Claus come?", R.drawable.icon_december,
            "Diciembre", "Noviembre", "Enero", "Mayo", 1)
        questionsList.add(que2)
        // 3
        val que3 = SpanishDateQuestion(8, "What is the first month of the year?", R.drawable.icon_january,
            "Enero", "Diciembre", "Febrero", "Agosto", 1)
        questionsList.add(que3)
        // 4
        val que4 = SpanishDateQuestion(7, "In which season does the snowdrop rise?", R.drawable.icon_spring,
            "Otoño", "Inviero", "Verano", "Primavera", 4)
        questionsList.add(que4)
        // 5
        val que5 = SpanishDateQuestion(6, "What is the last day of the week?", R.drawable.icon_sunday,
            "Viernes", "Domingo", "Sábado", "Lunes", 2)
        questionsList.add(que5)
        // 6
        val que6 = SpanishDateQuestion(5, "What is the hottest season?", R.drawable.icon_summer,
            "Primavera", "Otoño", "Verano", "Inviero", 3)
        questionsList.add(que6)
        // 7
        val que7 = SpanishDateQuestion(4, "How is called the fifth day of the week?", R.drawable.icon_friday,
            "Viernes", "Miércoles", "Jueves", "Domingo", 1)
        questionsList.add(que7)
        // 8
        val que8 = SpanishDateQuestion(3, "What month is between May and July?", R.drawable.icon_june,
            "Agosto", "Mayo", "Julion", "Junio", 4)
        questionsList.add(que8)
        // 9
        val que9 = SpanishDateQuestion(2, "What is the first day of the week?", R.drawable.icon_monday,
            "Martes", "Domingo", "Lunes", "Viernes", 3)
        questionsList.add(que9)
        // 10
        val que10 = SpanishDateQuestion(1, "In which season do the leaves fall?", R.drawable.icon_autumn,
            "Verano", "Otoño", "Primavera", "Inviero", 2)
        questionsList.add(que10)
        return questionsList
    }
}