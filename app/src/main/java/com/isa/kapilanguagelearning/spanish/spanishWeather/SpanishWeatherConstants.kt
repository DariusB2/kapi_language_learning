package com.isa.kapilanguagelearning.spanish.spanishWeather

import com.isa.kapilanguagelearning.R

object SpanishWeatherConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishWeatherQuestion>{
        val questionsList=ArrayList<SpanishWeatherQuestion>()

        // 1
        val que1= SpanishWeatherQuestion(1, "What weather phenomenon is in the photo?", R.drawable.icon_sunrise,
            "el arcoiris", "el amanecer", "la lluvia", "el eclipse", 2)
        questionsList.add(que1)
        // 2
        val que2 = SpanishWeatherQuestion(3, "What weather phenomenon is in the photo?", R.drawable.icon_tsunami,
            "el tsunami", "el eclipse", "la nebina", "el tornado", 1)
        questionsList.add(que2)
        // 3
        val que3 = SpanishWeatherQuestion(5, "What weather phenomenon is in the photo?", R.drawable.icon_eclipse,
            "el amanecer", "el atardecer", "el eclipse", "el arcoiris", 3)
        questionsList.add(que3)
        // 4
        val que4 = SpanishWeatherQuestion(7, "What weather phenomenon is in the photo?", R.drawable.icon_haze,
            "la nebina", "la nube", "el amanecer", "la nieve", 1)
        questionsList.add(que4)
        // 5
        val que5 = SpanishWeatherQuestion(9, "What weather phenomenon is in the photo?", R.drawable.icon_wind,
            "la nieve", "el atardecer", "la lluvia", "el viento", 4)
        questionsList.add(que5)
        // 6
        val que6 = SpanishWeatherQuestion(10, "What weather phenomenon is in the photo?", R.drawable.icon_rain,
            "el atardecer", "el tsunami", "la lluvia", "la nube", 3)
        questionsList.add(que6)
        // 7
        val que7 = SpanishWeatherQuestion(8, "What weather phenomenon is in the photo?", R.drawable.icon_tornado,
            "el arcoiris", "el tornado", "la nube", "la nieve", 2)
        questionsList.add(que7)
        // 8
        val que8 = SpanishWeatherQuestion(6, "What weather phenomenon is in the photo?", R.drawable.icon_sunset,
            "la nube", "la nieve", "el viento", "el atardecer", 4)
        questionsList.add(que8)
        // 9
        val que9 = SpanishWeatherQuestion(4, "What weather phenomenon is in the photo?", R.drawable.icon_snow,
            "la nieve", "el arcoiris", "la nebina", "el tsunami", 1)
        questionsList.add(que9)
        // 10
        val que10 = SpanishWeatherQuestion(2, "What weather phenomenon is in the photo?", R.drawable.icon_rainbow,
            "el tornado", "la nebina", "el arcoiris", "el viento", 3)
        questionsList.add(que10)
        return questionsList
    }
}