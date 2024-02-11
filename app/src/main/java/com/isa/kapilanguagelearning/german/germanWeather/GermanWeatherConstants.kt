package com.isa.kapilanguagelearning.german.germanWeather

import com.isa.kapilanguagelearning.R

object GermanWeatherConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanWeatherQuestion>{
        val questionsList=ArrayList<GermanWeatherQuestion>()

        // 1
        val que1= GermanWeatherQuestion(1, "What weather phenomenon is in the photo?", R.drawable.icon_sunrise,
            "der Regenbogen", "der Tsunami", "der Sonnenaufgang", "die Wolke", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanWeatherQuestion(2, "What weather phenomenon is in the photo?", R.drawable.icon_tsunami,
            "der Schnee", "der Tsunami", "der Dunst", "eie Sonnenfinsternis", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanWeatherQuestion(3, "What weather phenomenon is in the photo?", R.drawable.icon_eclipse,
            "der Regen", "eie Sonnenfinsternis", "der Tornado", "die Wolke", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanWeatherQuestion(4, "What weather phenomenon is in the photo?", R.drawable.icon_haze,
            "der Schnee", "der Regen", "der Wind", "der Dunst", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanWeatherQuestion(5, "What weather phenomenon is in the photo?", R.drawable.icon_wind,
            "der Wind", "der Sonnenuntergang", "der Regen", "der Schnee", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanWeatherQuestion(6, "What weather phenomenon is in the photo?", R.drawable.icon_rain,
            "die Sonne", "der Regen", "der Sonnenaufgang", "der Schnee", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanWeatherQuestion(7, "What weather phenomenon is in the photo?", R.drawable.icon_tornado,
            "der Tornado", "der Sonnenuntergang", "die Sonne", "der Tsunami", 1
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanWeatherQuestion(8, "What weather phenomenon is in the photo?", R.drawable.icon_sunset,
            "der Wind", "eie Sonnenfinsternis", "der Sonnenuntergang", "der Tornado", 3
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanWeatherQuestion(9, "What weather phenomenon is in the photo?", R.drawable.icon_snow,
            "der Sonnenuntergang", "der Dunst", "der Regenbogen", "der Schnee", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanWeatherQuestion(10, "What weather phenomenon is in the photo?", R.drawable.icon_rainbow,
            "der Sonnenaufgang", "der Regenbogen", "die Wolke", "der Sonnenuntergang", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}