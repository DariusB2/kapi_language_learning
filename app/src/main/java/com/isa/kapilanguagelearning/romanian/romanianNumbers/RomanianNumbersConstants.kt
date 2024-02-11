package com.isa.kapilanguagelearning.romanian.romanianNumbers

import com.isa.kapilanguagelearning.R

object RomanianNumbersConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianNumbersQuestion>{
        val questionsList=ArrayList<RomanianNumbersQuestion>()

        // 1
        val que1= RomanianNumbersQuestion(4, "What number is in the photo?", R.drawable.icon_14,
            "treisprezece", "patruzeci", "patru", "paisprezece", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianNumbersQuestion(5, "What number is in the photo?", R.drawable.icon_11,
            "unu", "unsprezece", "zece", "o sută", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianNumbersQuestion(6, "What number is in the photo?", R.drawable.icon_4,
            "patru", "unu", "doi", "paisprezece", 1
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianNumbersQuestion(7, "What number is in the photo?", R.drawable.icon_100,
            "două sute", "o sută", "zece", "nouăzeci", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianNumbersQuestion(8, "What number is in the photo?", R.drawable.icon_250,
            "o sută cinci zeci", "două sute cincizeci", "două sute cincizeci și unu", "două sute", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianNumbersQuestion(9, "What number is in the photo?", R.drawable.icon_33,
            "treizeci și doi", "douăzeci și trei", "treizeci și trei", "treisprezece", 3
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianNumbersQuestion(10, "What number is in the photo?", R.drawable.icon_793,
            "șapte sute treisprezece", "șapte sute optzeci și trei", "șapte sute nouăzeci și doi", "șapte sute nouăzeci și trei", 4
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianNumbersQuestion(1, "What number is in the photo?", R.drawable.icon_25,
            "douăzeci și cinci", "douăzeci și patru", "cincisprezece", "douăzeci", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianNumbersQuestion(2, "What number is in the photo?", R.drawable.icon_99,
            "nouăzeci și unu", "nouăzeci și nouă", "nouăzeci și opt", "nouăsprezece", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianNumbersQuestion(3, "What number is in the photo?", R.drawable.icon_123,
            "o sută trei", "o sută trei și trei", "o sută douăzeci și trei", "o sută douăzeci și doi", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}