package com.isa.kapilanguagelearning.spanish.spanishFamily

import com.isa.kapilanguagelearning.R

object SpanishFamilyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions3(): ArrayList<SpanishFamilyQuestion>{
        val questionsList=ArrayList<SpanishFamilyQuestion>()

        // 1
        val que1= SpanishFamilyQuestion(1, "Who is in the photo?(The father)?", R.drawable.icon_father,
            "la hermana", "el padre", "la tía", "el niño", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = SpanishFamilyQuestion(2, "Who is in the photo?(The aunt)?", R.drawable.icon_aunt,
            "la nieta", "la sobrina", "la tía", "el tío", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = SpanishFamilyQuestion(3, "Who is in the photo?(The mother)?", R.drawable.icon_mother,
            "la sobrina", "la nieta", "el esposo", "la madre", 4
        )
        questionsList.add(que3)
        // 4
        val que4 = SpanishFamilyQuestion(4, "Who is in the photo?(The grandmother)?", R.drawable.icon_grandmother,
            "el tío", "la abuela", "el niño", "el padre", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = SpanishFamilyQuestion(5, "Who is in the photo?(The daughter)?", R.drawable.icon_daughter,
            "la hija", "la nieta", "la hermana", "el tío", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = SpanishFamilyQuestion(6, "Who is in the photo?(The wife)?", R.drawable.icon_wife,
            "la nieta", "las niñas", "la sobrina", "la esposa", 4
        )
        questionsList.add(que6)
        // 7
        val que7 = SpanishFamilyQuestion(7, "Who is in the photo?(The grandson)?", R.drawable.icon_grandson,
            "la hermana", "el nieto", "el niño", "el esposo", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = SpanishFamilyQuestion(8, "What is in the photo?(The family)?", R.drawable.icon_family,
            "la familia", "las niñas", "el esposo", "la sobrina", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = SpanishFamilyQuestion(9, "Who is in the photo?(The nephew)?", R.drawable.icon_nephew,
            "el tío", "el niño", "el sobrino", "la hermana", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = SpanishFamilyQuestion(10, "Who is in the photo?(The grandfather)?", R.drawable.icon_grandfather,
            "el esposo", "el abuelo", "las niñas", "la sobrina", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}