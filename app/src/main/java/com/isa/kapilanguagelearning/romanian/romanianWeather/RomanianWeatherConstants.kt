package com.isa.kapilanguagelearning.romanian.romanianWeather

import com.isa.kapilanguagelearning.R

object RomanianWeatherConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianWeatherQuestion>{
        val questionsList=ArrayList<RomanianWeatherQuestion>()

        // 1
        val que1= RomanianWeatherQuestion(5, "What weather phenomenon is in the photo?", R.drawable.icon_sunrise,
            "apus", "soare", "răsărit", "ceață", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianWeatherQuestion(4, "What weather phenomenon is in the photo?", R.drawable.icon_tsunami,
            "zăpadă", "tsunami", "răsărit", "apus", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianWeatherQuestion(3, "What weather phenomenon is in the photo?", R.drawable.icon_eclipse,
            "ploaie", "eclipsă", "tornadă", "tsunami", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianWeatherQuestion(2, "What weather phenomenon is in the photo?", R.drawable.icon_haze,
            "tornadă", "zăpadă", "eclipsă", "ceață", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianWeatherQuestion(1, "What weather phenomenon is in the photo?", R.drawable.icon_wind,
            "vânt", "ceață", "ploaie", "eclipsă", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianWeatherQuestion(10, "What weather phenomenon is in the photo?", R.drawable.icon_rain,
            "răsărit", "ploaie", "ceață", "soare", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianWeatherQuestion(9, "What weather phenomenon is in the photo?", R.drawable.icon_tornado,
            "tornadă", "vânt", "soare", "tsunami", 1
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianWeatherQuestion(8, "What weather phenomenon is in the photo?", R.drawable.icon_sunset,
            "vânt", "eclipsă", "apus", "răsărit", 3
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianWeatherQuestion(7, "What weather phenomenon is in the photo?", R.drawable.icon_snow,
            "ceață", "soare", "vânt", "zăpadă", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianWeatherQuestion(6, "What weather phenomenon is in the photo?", R.drawable.icon_rainbow,
            "soare", "curcubeu", "ploaie", "apus", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}