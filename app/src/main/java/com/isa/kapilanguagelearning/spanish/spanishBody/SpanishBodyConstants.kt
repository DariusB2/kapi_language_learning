package com.isa.kapilanguagelearning.spanish.spanishBody

import com.isa.kapilanguagelearning.R

object SpanishBodyConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<SpanishBodyQuestion>{
        val questionsList=ArrayList<SpanishBodyQuestion>()

        // 1
        val que1= SpanishBodyQuestion(1, "What body part is in the photo?", R.drawable.icon_brain,
            "el dedo", "el cuerpo", "el cerebro", "la nariz", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = SpanishBodyQuestion(2, "What body part is in the photo?", R.drawable.icon_arm,
            "el brazo", "la nariz", "el diente", "los ojos", 1
        )
        questionsList.add(que2)
        // 3
        val que3 = SpanishBodyQuestion(3, "What body part is in the photo?", R.drawable.icon_head,
            "los ojos", "la cabeza", "la oreja", "el dedo", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = SpanishBodyQuestion(4, "What body part is in the photo?", R.drawable.icon_back,
            "la nariz", "la espalda", "los ojos", "la cara", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = SpanishBodyQuestion(5, "What body part is in the photo?", R.drawable.icon_lungs,
            "la nariz", "la cara", "el cuerpo", "los pulmones", 4
        )
        questionsList.add(que5)
        // 6
        val que6 = SpanishBodyQuestion(6, "What body part is in the photo?", R.drawable.icon_liver,
            "la oreja", "el diente", "el hígado", "la nariz", 3
        )
        questionsList.add(que6)
        // 7
        val que7 = SpanishBodyQuestion(7, "What body part is in the photo?", R.drawable.icon_foot,
            "el cuerpo", "el pie", "el dedo", "la oreja", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = SpanishBodyQuestion(8, "What body part is in the photo?", R.drawable.icon_heart,
            "el corazón", "la cara", "el diente", "el estómago", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = SpanishBodyQuestion(9, "What body part is in the photo?", R.drawable.icon_leg,
            "el estómago", "el cuerpo", "la oreja", "la pierna", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = SpanishBodyQuestion(10, "What body part is in the photo?", R.drawable.icon_hand,
            "el diente", "el estómago", "la mano", "el dedo", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}