package com.isa.kapilanguagelearning.german.germanOccupations

import com.isa.kapilanguagelearning.R

object GermanOccupationsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanOccupationsQuestion>{
        val questionsList=ArrayList<GermanOccupationsQuestion>()

        // 1
        val que1= GermanOccupationsQuestion(1, "What is the occupation of the person in the photo?", R.drawable.icon_builder,
            "der Fußballspieler", "der Polizist", "der Bauarbeiter", "der Koch", 3
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanOccupationsQuestion(2, "What is the occupation of the person in the photo?", R.drawable.icon_waiter,
            "die Kellnerin", "der Polizist", "der Lehrer", "der Kassiererin", 1
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanOccupationsQuestion(3, "What is the occupation of the person in the photo?", R.drawable.icon_cook,
            "der Fußballspieler", "der Koch", "der Kassiererin", "die Kellnerin", 2
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanOccupationsQuestion(4, "What is the occupation of the person in the photo?", R.drawable.icon_nurse,
            "der Pilot", "der Richter", "der Koch", "die Krankenschwester", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanOccupationsQuestion(5, "What is the occupation of the person in the photo?", R.drawable.icon_sailor,
            "der Bauarbeiter", "der Seemann", "der Bauer", "der Arzt", 2
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanOccupationsQuestion(6, "What is the occupation of the person in the photo?", R.drawable.icon_cashier,
            "der Fußballspieler", "der Kassiererin", "der Bauer", "der Pilot", 2
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanOccupationsQuestion(7, "What is the occupation of the person in the photo?", R.drawable.icon_judge,
            "das Militär", "die Kellnerin", "der Richter", "der Lehrer", 3
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanOccupationsQuestion(8, "What is the occupation of the person in the photo?", R.drawable.icon_farmer,
            "der Bauer", "der Seemann", "das Militär", "die Krankenschwester", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanOccupationsQuestion(9, "What is the occupation of the person in the photo?", R.drawable.icon_doctor,
            "der Richter", "die Krankenschwester", "der Arzt", "der Lehrer", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanOccupationsQuestion(10, "What is the occupation of the person in the photo?", R.drawable.icon_cop,
            "der Polizist", "der Pilot", "der Arzt", "der Seemann", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}