package com.isa.kapilanguagelearning.spanish.spanishFamily

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.spanish.QuizSpanishResultBadActivity
import com.isa.kapilanguagelearning.spanish.StartLearningSpanishActivity
import kotlinx.android.synthetic.main.activity_spanish_family_result.*

class SpanishFamilyResultActivity : AppCompatActivity()
{
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val totalQuestions=intent.getIntExtra(SpanishFamilyConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(SpanishFamilyConstants.CORRECT_ANSWERS,0)
        if(correctAnswers >=6 )
        {
            setContentView(R.layout.activity_spanish_family_result)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            text_view_spanish_family_score.text = "Your score is $correctAnswers out of $totalQuestions"
            button_spanish_family_finish.setOnClickListener{
                startActivity(Intent(this, StartLearningSpanishActivity::class.java))
                finish()
            }
        }
        else
        {
            startActivity(Intent(this, QuizSpanishResultBadActivity::class.java))
            finish()
        }
    }
}