package com.isa.kapilanguagelearning.romanian.romanianFood

import com.isa.kapilanguagelearning.R

object RomanianFoodConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList< RomanianFoodQuestion>{
        val questionsList=ArrayList< RomanianFoodQuestion>()

        // 1
        val que1=  RomanianFoodQuestion(2, "What aliment is in the photo?", R.drawable.icon_egg,
            "pizza", "ou", "tort", "lapte", 2
        )
        questionsList.add(que1)
        // 2
        val que2 =  RomanianFoodQuestion(3, "What aliment is in the photo?", R.drawable.icon_bread,
            "pâine", "gem", "cârnat", "lapte", 1
        )
        questionsList.add(que2)
        // 3
        val que3 =  RomanianFoodQuestion(4, "What aliment is in the photo?", R.drawable.icon_honey,
            "tort", "gem", "friptură", "miere", 4
        )
        questionsList.add(que3)
        // 4
        val que4 =  RomanianFoodQuestion(5, "What aliment is in the photo?", R.drawable.icon_pizza,
            "lapte", "brânză", "pizza", "cârnat", 3
        )
        questionsList.add(que4)
        // 5
        val que5 =  RomanianFoodQuestion(6, "What aliment is in the photo?", R.drawable.icon_cake,
            "ou", "gem", "tort", "pâine", 3
        )
        questionsList.add(que5)
        // 6
        val que6 =  RomanianFoodQuestion(7, "What aliment is in the photo?", R.drawable.icon_jam,
            "ou", "gem", "brânză", "lapte", 2
        )
        questionsList.add(que6)
        // 7
        val que7 =  RomanianFoodQuestion(8, "What aliment is in the photo?", R.drawable.icon_milk,
            "lapte", "friptură", "pizza", "miere", 1
        )
        questionsList.add(que7)
        // 8
        val que8 =  RomanianFoodQuestion(9, "What aliment is in the photo?", R.drawable.icon_steak,
            "piper", "friptură", "cârnat", "tort", 2
        )
        questionsList.add(que8)
        // 9
        val que9 =  RomanianFoodQuestion(10, "What aliment is in the photo?", R.drawable.icon_sausage,
            "brânză", "piper", "zahăr", "cârnat", 4
        )
        questionsList.add(que9)
        // 10
        val que10 =  RomanianFoodQuestion(1, "What aliment is in the photo?", R.drawable.icon_cheese,
            "friptură", "tort", "brânză", "sare", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}