package com.isa.kapilanguagelearning.german.germanFood

import com.isa.kapilanguagelearning.R

object GermanFoodConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanFoodQuestion>{
        val questionsList=ArrayList<GermanFoodQuestion>()

        // 1
        val que1= GermanFoodQuestion(1, "What aliment is in the photo?", R.drawable.icon_egg,
            "das Ei", "der Honig", "das Brot", "das Huhn", 1
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanFoodQuestion(2, "What aliment is in the photo?", R.drawable.icon_bread,
            "der Kuchen", "die Milch", "das Brot", "der Käse", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanFoodQuestion(3, "What aliment is in the photo?", R.drawable.icon_honey,
            "das Brot", "der Honig", "die Pfeffer", "die Marmelade", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanFoodQuestion(4, "What aliment is in the photo?", R.drawable.icon_pizza,
            "die Pizza", "die Wurst", "das Ei", "das Steak", 1
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanFoodQuestion(5, "What aliment is in the photo?", R.drawable.icon_cake,
            "das Eis", "das Salz", "die Marmelade", "der Kuchen", 4
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanFoodQuestion(6, "What aliment is in the photo?", R.drawable.icon_jam,
            "der Käse", "das Brot", "die Pizza", "die Marmelade", 4
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanFoodQuestion(7, "What aliment is in the photo?", R.drawable.icon_milk,
            "das Salz", "die Milch", "der Käse", "das Brot", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanFoodQuestion(8, "What aliment is in the photo?", R.drawable.icon_steak,
            "das Brot", "der Schinken", "das Steak", "der Kuchen", 3
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanFoodQuestion(9, "What aliment is in the photo?", R.drawable.icon_sausage,
            "die Wurst", "die Pfeffer", "die Milch", "das Ei", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanFoodQuestion(10, "What aliment is in the photo?", R.drawable.icon_cheese,
            "der Kuchen", "der Käse", "der Salat", "die Marmelade", 2
        )
        questionsList.add(que10)

        return questionsList
    }
}