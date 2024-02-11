package com.isa.kapilanguagelearning.german.germanNumbers

import com.isa.kapilanguagelearning.R

object GermanNumbersConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanNumbersQuestion>{
        val questionsList=ArrayList<GermanNumbersQuestion>()

        // 1
        val que1= GermanNumbersQuestion(1, "What number is in the photo?", R.drawable.icon_14,
            "vierzig", "vierzehn", "einundvierzig", "dreizehn", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanNumbersQuestion(2, "What number is in the photo?", R.drawable.icon_11,
            "einundeinzehn", "zehn", "elf", "zwölf", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanNumbersQuestion(3, "What number is in the photo?", R.drawable.icon_4,
            "vier", "ein", "drei", "vierzehn", 1
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanNumbersQuestion(4, "What number is in the photo?", R.drawable.icon_100,
            "tausend", "ein", "einhundertein", "hundert", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanNumbersQuestion(5, "What number is in the photo?", R.drawable.icon_250,
            "zweiundfünfzig", "zweitausendfünfzig", "dreihundertfünfzig", "zweihundertfünfzig", 4
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanNumbersQuestion(6, "What number is in the photo?", R.drawable.icon_33,
            "dreiunddreißig", "zweiunddreißig", "dreiundzwanzig", "dreizehn", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanNumbersQuestion(7, "What number is in the photo?", R.drawable.icon_793,
            "siebenhundertvierundneunzig", "siebentausenddreiundneunzig", "siebenhundertdreiundneunzig", "sechshundertdreiundneunzig", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanNumbersQuestion(8, "What number is in the photo?", R.drawable.icon_25,
            "fünfzehn", "fünfundzwanzig", "fünfzig", "fünfunddreizig", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanNumbersQuestion(9, "What number is in the photo?", R.drawable.icon_99,
            "achtundneunzig", "neunzehn", "neun", "neunundneunzig", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanNumbersQuestion(10, "What number is in the photo?", R.drawable.icon_123,
            "eintausenddreiundzwanzig", "eintausendzweiunddreißig", "eintausendzweiundzwanzig", "einhundert", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}