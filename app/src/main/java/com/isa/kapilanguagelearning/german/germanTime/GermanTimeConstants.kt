package com.isa.kapilanguagelearning.german.germanTime

import com.isa.kapilanguagelearning.R

object GermanTimeConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<GermanTimeQuestion>{
        val questionsList=ArrayList<GermanTimeQuestion>()

        // 1
        val que1= GermanTimeQuestion(1, "What time is it?", R.drawable.icon_10_30,
            "Es ist halb zehn.", "Es ist halb elf.", "Es ist viertel vor elf.", "Es ist viertel nach elf.", 2
        )
        questionsList.add(que1)
        // 2
        val que2 = GermanTimeQuestion(2, "What time is it?", R.drawable.icon_11_59,
            "Es is zwei vor zwölf.", "Es is ein vor elf.", "Es is ein vor zwölf.", "Es ist zwölf.", 3
        )
        questionsList.add(que2)
        // 3
        val que3 = GermanTimeQuestion(3, "What time is it?", R.drawable.icon_12_20,
            "Es ist zwei nach zwölf.", "Es is zwölf.", "Es ist zwanzig nach elf.", "Es ist zwanzig nach zwölf.", 4
        )
        questionsList.add(que3)
        // 4
        val que4 = GermanTimeQuestion(4, "What time is it?", R.drawable.icon_01_49,
            "Es ist viertel vor zwei.", "Es ist ein Uhr neunundvierzig.", "Es ist vier Uhr neunundvierzig.", "Es ist viertel nach zwei.", 2
        )
        questionsList.add(que4)
        // 5
        val que5 = GermanTimeQuestion(5, "What time is it?", R.drawable.icon_04_15,
            "Es ist viertel nach vier.", "Es ist viertel vor vier.", "Es ist viertel nach fünf.", "Es ist viertel vor fünf.", 1
        )
        questionsList.add(que5)
        // 6
        val que6 = GermanTimeQuestion(6, "What time is it?", R.drawable.icon_09_31,
            "Es is neun Uhr.", "Es ist neunundzwanzig vor neun.", "Es ist neunundzwanzig vor zehn.", "Es ist neun Uhr dreißig.", 3
        )
        questionsList.add(que6)
        // 7
        val que7 = GermanTimeQuestion(7, "What time is it?", R.drawable.icon_02_22,
            "Es ist zwei Uhr dreiunddreißig.", "Es ist zwei Uhr zweiundzwanzig.", "Es ist drei Uhr zweiundzwanzig.", "Es ist zweiundzwanzig vor drei.", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = GermanTimeQuestion(8, "What time is it?", R.drawable.icon_03_05,
            "Es ist fünf nach drei.", "Es ist drei.", "Es ist vier nach drei.", "Es ist fünf vor drei.", 1
        )
        questionsList.add(que8)
        // 9
        val que9 = GermanTimeQuestion(9, "What time is it?", R.drawable.icon_07_45,
            "Es ist viertel vor acht.", "Es ist sieben Uhr.", "Es ist sieben Uhr dreiunddreißig.", "Es ist viertel vor sieben.", 1
        )
        questionsList.add(que9)
        // 10
        val que10 = GermanTimeQuestion(10, "What time is it?", R.drawable.icon_06_00,
            "Es ist sieben Uhr.", "Es ist halb sechs.", "Es ist viertel nach sechs.", "Es ist sechs Uhr.", 4
        )
        questionsList.add(que10)

        return questionsList
    }
}