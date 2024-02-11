package com.isa.kapilanguagelearning.german.germanObjects

import com.isa.kapilanguagelearning.R

object GermanObjectsConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanObjectsQuestion>{
        val questionsList=ArrayList<GermanObjectsQuestion>()

        // 1
        val que1= GermanObjectsQuestion(1, "What object is in the photo?", R.drawable.icon_desk,
            "die Geschirrspülmaschine", "das Sofa", "der Spiegel", "der Schreibtisch", 4
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanObjectsQuestion(2, "What object is in the photo?", R.drawable.icon_mirror,
            "das Bücherregal", "der Sessel", "der Spiegel", "die Geschirrspülmaschine", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanObjectsQuestion(3, "What object is in the photo?", R.drawable.icon_wardrobe,
            "der Kühlschrank", "das Bücherregal", "der Kleiderschrank", "das Bett", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanObjectsQuestion(4, "What object is in the photo?", R.drawable.icon_armchair,
            "das Bücherregal", "der Sessel", "der Tisch", "das Bett", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanObjectsQuestion(5, "What object is in the photo?", R.drawable.icon_bookshelf,
            "der Fernsehen", "der Backofen", "das Bücherregal", "der Teppich", 3
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanObjectsQuestion(6, "What object is in the photo?", R.drawable.icon_fridge,
            "der Kühlschrank", "der Schreibtisch", "die Lampe", "der Fernsehen", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanObjectsQuestion(7, "What object is in the photo?", R.drawable.icon_lamp,
            "der Kleiderschrank", "die Lampe", "der Spiegel", "der Backofen", 2
        )
        questionsList.add(que7)

        val que8 = GermanObjectsQuestion(8, "What object is in the photo?", R.drawable.icon_oven,
            "das Sofa", "der Teppich", "der Kleiderschrank", "der Backofen", 4
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanObjectsQuestion(9, "What object is in the photo?", R.drawable.icon_table,
            "der Backofen", "der Tisch", "der Sessel", "das Bild", 2
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanObjectsQuestion(10, "What object is in the photo?", R.drawable.icon_sofa,
            "der Kühlschrank", "der Schreibtisch", "das Sofa", "die Lampe", 3
        )
        questionsList.add(que10)

        return questionsList
    }
}