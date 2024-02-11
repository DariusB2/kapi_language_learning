package com.isa.kapilanguagelearning.romanian.romanianTime

import com.isa.kapilanguagelearning.R
import kotlin.collections.ArrayList

object RomanianTimeConstants
{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<RomanianTimeQuestion>{
        val questionsList=ArrayList<RomanianTimeQuestion>()

        // 1
        val que1= RomanianTimeQuestion(9, "What time is it?", R.drawable.icon_10_30,
            "Este ora zece și jumătate.", "Este jumătate trecut de 10.", "Este ora unsprezece și jumătate", "Este ora zece", 1
        )
        questionsList.add(que1)
        // 2
        val que2 = RomanianTimeQuestion(7, "What time is it?", R.drawable.icon_11_59,
            "Este ora unsprezece și cincizeci și opt de minute.", "Este ora unsprezece și cincizeci și nouă de minute.", "Este ora unsprezece.", "Este ora doiprezece.", 2
        )
        questionsList.add(que2)
        // 3
        val que3 = RomanianTimeQuestion(5, "What time is it?", R.drawable.icon_12_20,
            "Este ora doiprezece și douăzeci și două de minute.", "Este ora doiprezece și douăsprezece minute.", "Este ora doiprezece și douăzeci de minute.", "Este ora doiprezece.", 3
        )
        questionsList.add(que3)
        // 4
        val que4 = RomanianTimeQuestion(3, "What time is it?", R.drawable.icon_01_49,
            "Este ora unu și treizeci și nouă de minute.", "Este ora unu și patruzeci și trei de minute.", "Este ora două și patruzeci și nouă de minute.", "Este ora unu și patruzeci și nouă de minute.", 4
        )
        questionsList.add(que4)
        // 5
        val que5 = RomanianTimeQuestion(1, "What time is it?", R.drawable.icon_04_15,
            "Este ora patru și saisprezece minute.", "Este ora trei și un sfert.", "Este ora patru și jumătate.", "Este ora patru și un sfert.", 4
        )
        questionsList.add(que5)
        // 6
        val que6 = RomanianTimeQuestion(2, "What time is it?", R.drawable.icon_09_31,
            "Este ora nouă și treizeci și unu de minute.", "Este ora nouă și treizeci de minute.", "Este ora nouă și jumătate.", "Este ora zece și treizeci și unu de minute.", 1
        )
        questionsList.add(que6)
        // 7
        val que7 = RomanianTimeQuestion(4, "What time is it?", R.drawable.icon_02_22,
            "Este ora nouă și douăzeci și două de minute.", "Este ora două și douăzeci și două de minute.", "Este ora două și douăzeci de minute.", "Este ora două și treizeci și două de minute.", 2
        )
        questionsList.add(que7)
        // 8
        val que8 = RomanianTimeQuestion(6, "What time is it?", R.drawable.icon_03_05,
            "Este ora trei și jumătate.", "Este ora trei cinci minute.", "Este ora patru și un sfert.", "Este ora patru și un sfert.", 2
        )
        questionsList.add(que8)
        // 9
        val que9 = RomanianTimeQuestion(8, "What time is it?", R.drawable.icon_07_45,
            "Este ora șapte fără un sfert.", "Este ora șapte și un sfert.", "Este ora opt fără un sfert.", "Este ora opt și un sfert..", 3
        )
        questionsList.add(que9)
        // 10
        val que10 = RomanianTimeQuestion(10, "What time is it?", R.drawable.icon_06_00,
            "Este ora șase.", "Este ora șapte.", "Este ora șase fără un sfert.", "Este ora cinci.", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}