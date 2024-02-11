package com.isa.kapilanguagelearning.romanian.romanianOccupations

import com.isa.kapilanguagelearning.R

object RomanianOccupationsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianOccupationsQuestion>{
        val questionsList=ArrayList<RomanianOccupationsQuestion>()

        // 1
        val que1= RomanianOccupationsQuestion(10, "What is the occupation of the person in the photo?", R.drawable.icon_builder,
            "pilot", "polițist", "pompier", "constructor", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianOccupationsQuestion(9, "What is the occupation of the person in the photo?", R.drawable.icon_waiter,
            "pilot", "chelneriță", "judecător", "constructor", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianOccupationsQuestion(8, "What is the occupation of the person in the photo?", R.drawable.icon_cook,
            "fotbalist", "profesoară", "bucătar", "grădinar", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianOccupationsQuestion(7, "What is the occupation of the person in the photo?", R.drawable.icon_nurse,
            "asistentă medicală", "pompier", "bucătar", "doctor", 1
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianOccupationsQuestion(6, "What is the occupation of the person in the photo?", R.drawable.icon_sailor,
            "bucătar", "polițist", "marinar", "muzician", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianOccupationsQuestion(5, "What is the occupation of the person in the photo?", R.drawable.icon_cashier,
            "muzician", "pompier", "casieriță", "pilot", 3
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianOccupationsQuestion(4, "What is the occupation of the person in the photo?", R.drawable.icon_judge,
            "soldat", "fotbalist", "polițist", "judecător", 4
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianOccupationsQuestion(3, "What is the occupation of the person in the photo?", R.drawable.icon_farmer,
            "judecător", "fermier", "soldat", "doctor", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianOccupationsQuestion(2, "What is the occupation of the person in the photo?", R.drawable.icon_doctor,
            "marinar", "grădinar", "muzician", "doctor", 4
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianOccupationsQuestion(1, "What is the occupation of the person in the photo?", R.drawable.icon_cop,
            "doctor", "polițist", "profesoară", "marinar", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}