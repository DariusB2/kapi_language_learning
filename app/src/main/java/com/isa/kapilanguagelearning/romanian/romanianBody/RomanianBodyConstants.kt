package com.isa.kapilanguagelearning.romanian.romanianBody

import com.isa.kapilanguagelearning.R

object RomanianBodyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianBodyQuestion>{
        val questionsList=ArrayList<RomanianBodyQuestion>()

        // 1
        val que1= RomanianBodyQuestion(9, "What body part is in the photo?", R.drawable.icon_brain,
            "inimă", "spate", "picior", "creier", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianBodyQuestion(5, "What body part is in the photo?", R.drawable.icon_arm,
            "inimă", "braț", "spate", "laba piciorului", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianBodyQuestion(6, "What body part is in the photo?", R.drawable.icon_head,
            "dinte", "plămâni", "cap", "creier", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianBodyQuestion(2, "What body part is in the photo?", R.drawable.icon_back,
            "spate", "mână", "picior", "inimă", 1
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianBodyQuestion(7, "What body part is in the photo?", R.drawable.icon_lungs,
            "ureche", "plămâni", "cap", "laba piciorului", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianBodyQuestion(3, "What body part is in the photo?", R.drawable.icon_liver,
            "ficat", "ureche", "cap", "creier", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianBodyQuestion(5, "What body part is in the photo?", R.drawable.icon_foot,
            "cap", "spate", "picior", "laba piciorului", 4
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianBodyQuestion(10, "What body part is in the photo?", R.drawable.icon_heart,
            "nas", "inimă", "mână", "dinte", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianBodyQuestion(1, "What body part is in the photo?", R.drawable.icon_leg,
            "mână", "picior", "plămâni", "nas", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianBodyQuestion(8, "What body part is in the photo?", R.drawable.icon_hand,
            "ureche", "dinte", "mână", "nas", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}