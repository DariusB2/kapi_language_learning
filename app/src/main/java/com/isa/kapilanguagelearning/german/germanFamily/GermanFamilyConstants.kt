package com.isa.kapilanguagelearning.german.germanFamily

import com.isa.kapilanguagelearning.R

object GermanFamilyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions3(): ArrayList<GermanFamilyQuestion>{
        val questionsList=ArrayList<GermanFamilyQuestion>()

        // 1
        val que1= GermanFamilyQuestion(1, "Who is in the photo?(The father)?", R.drawable.icon_father,
            "der Cousin", "die Kinder", "der Vater", "die Großmutter", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanFamilyQuestion(2, "Who is in the photo?(The children)?", R.drawable.icon_children,
            "die Mutter", "die Kinder", "das Kind", "die Großvater", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanFamilyQuestion(3, "Who is in the photo?(The mother)?", R.drawable.icon_mother,
            "die Ehefrau", "die Enkel", "die Familie", "die Mutter", 4
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanFamilyQuestion(4, "Who is in the photo?(The grandmother)?", R.drawable.icon_grandmother,
            "die Großmutter", "die Ehefrau", "das Kind", "der Ehemann", 1
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanFamilyQuestion(5, "Who is in the photo?(The daughter)?", R.drawable.icon_daughter,
            "die Enkel", "die Tochter", "der Vater", "der Ehemann", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanFamilyQuestion(6, "Who is in the photo?(The wife)?", R.drawable.icon_wife,
            "die Kinder", "die Ehefrau", "die Mutter", "die Enkelin", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanFamilyQuestion(7, "Who is in the photo?(The grandson)?", R.drawable.icon_grandson,
            "der Onkel", "der Cousin", "die Enkel", "die Familie", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanFamilyQuestion(8, "What is in the photo?(The family)?", R.drawable.icon_family,
            "der Neffe", "die Nichte", "die Großeltern", "die Familie", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanFamilyQuestion(9, "Who is in the photo?(The cousin)?", R.drawable.icon_cousin,
            "der Cousin", "die Tochter", "der Vater", "die Großeltern", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanFamilyQuestion(10, "Who is in the photo?(The grandparents)?", R.drawable.icon_grandparents,
            "die Tochter", "die Großmutter", "die Mutter", "die Großeltern", 4
        )
        questionsList.add(que10)

        return questionsList
    }
}