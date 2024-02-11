package com.isa.kapilanguagelearning.german.germanBody

import com.isa.kapilanguagelearning.R

object GermanBodyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanBodyQuestion>{
        val questionsList=ArrayList<GermanBodyQuestion>()

        // 1
        val que1= GermanBodyQuestion(1, "What body part is in the photo?", R.drawable.icon_brain,
            "der Arm", "die Hand", "der Zahn", "das Gehirn", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanBodyQuestion(2, "What body part is in the photo?", R.drawable.icon_arm,
            "das Gesicht", "der Arm", "die Leber", "der Zahn", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanBodyQuestion(3, "What body part is in the photo?", R.drawable.icon_head,
            "der Rücken", "der Fuß", "der Kopf", "das Bein", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanBodyQuestion(4, "What body part is in the photo?", R.drawable.icon_back,
            "der Rücken", "die Lungen", "der Fuß", "der Arm", 1
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanBodyQuestion(5, "What body part is in the photo?", R.drawable.icon_lungs,
            "der Herz", "die Lungen", "die Nase", "das Gesicht", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanBodyQuestion(6, "What body part is in the photo?", R.drawable.icon_liver,
            "die Leber", "das Bein", "der Herz", "die Lungen", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanBodyQuestion(7, "What body part is in the photo?", R.drawable.icon_foot,
            "die Augen", "der Kopf", "das Gehirn", "der Fuß", 4
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanBodyQuestion(8, "What body part is in the photo?", R.drawable.icon_heart,
            "die Nase", "der Herz", "die Augen", "der Kopf", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanBodyQuestion(9, "What body part is in the photo?", R.drawable.icon_leg,
            "der Rücken", "das Bein", "die Ohn", "die Hand", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanBodyQuestion(10, "What body part is in the photo?", R.drawable.icon_hand,
            "das Gehirn", "die Leber", "die Hand", "die Ohn", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}