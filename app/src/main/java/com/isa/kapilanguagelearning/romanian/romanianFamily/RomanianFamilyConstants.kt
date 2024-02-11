package com.isa.kapilanguagelearning.romanian.romanianFamily

import com.isa.kapilanguagelearning.R

object RomanianFamilyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions3(): ArrayList<RomanianFamilyQuestion>{
        val questionsList=ArrayList<RomanianFamilyQuestion>()

        // 1
        val que1= RomanianFamilyQuestion(9, "Who is in the photo?(The father)?", R.drawable.icon_father,
            "soție", "tată", "mamă", "copii", 2)
        questionsList.add(que1)
        // 2
        val que2 = RomanianFamilyQuestion(6, "Who is in the photo?(The children)?", R.drawable.icon_children,
            "copii", "bunici", "mamă", "bunici", 1)
        questionsList.add(que2)
        // 3
        val que3 = RomanianFamilyQuestion(7, "Who is in the photo?(The mother)?", R.drawable.icon_mother,
            "mamă", "copii", "bunică", "bunic", 1)
        questionsList.add(que3)
        // 4
        val que4 = RomanianFamilyQuestion(5, "Who is in the photo?(The grandmother)?", R.drawable.icon_grandmother,
            "văr", "fiică", "bunici", "bunică", 4)
        questionsList.add(que4)
        // 5
        val que5 = RomanianFamilyQuestion(4, "Who is in the photo?(The daughter)?", R.drawable.icon_daughter,
            "soție", "văr", "fiică", "bunici", 3)
        questionsList.add(que5)
        // 6
        val que6 = RomanianFamilyQuestion(2, "Who is in the photo?(The wife)?", R.drawable.icon_wife,
            "bunici", "soție", "familie", "tată", 2)
        questionsList.add(que6)
        // 7
        val que7 = RomanianFamilyQuestion(3, "Who is in the photo?(The grandson)?", R.drawable.icon_grandson,
            "văr", "nepot(de bunic)", "copii", "familie", 2)
        questionsList.add(que7)
        // 8
        val que8 = RomanianFamilyQuestion(10, "What is in the photo?(The family)?", R.drawable.icon_family,
            "familie", "bunică", "fiică", "nepot(de bunic)", 1)
        questionsList.add(que8)
        // 9
        val que9 = RomanianFamilyQuestion(1, "Who is in the photo?(The cousin)?", R.drawable.icon_cousin,
            "bunică", "tată", "văr", "mamă", 3)
        questionsList.add(que9)
        // 10
        val que10 = RomanianFamilyQuestion(8, "Who is in the photo?(The grandparents)?", R.drawable.icon_grandparents,
            "mamă", "bunici", "fiică", "tată", 2)
        questionsList.add(que10)

        return questionsList
    }
}