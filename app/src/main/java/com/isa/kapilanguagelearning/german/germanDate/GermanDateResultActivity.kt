package com.isa.kapilanguagelearning.german.germanDate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.german.QuizGermanResultBadActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.german.StartLearningGermanActivity
import kotlinx.android.synthetic.main.activity_german_date_result.*

class GermanDateResultActivity : AppCompatActivity()
{
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val totalQuestions=intent.getIntExtra(GermanDateConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(GermanDateConstants.CORRECT_ANSWERS,0)
        if(correctAnswers >=6 )
        {
            setContentView(R.layout.activity_german_date_result)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            text_view_german_date_score.text = "Your score is $correctAnswers out of $totalQuestions"
            button_german_date_finish.setOnClickListener{
                startActivity(Intent(this, StartLearningGermanActivity::class.java))
                finish()
            }
        }
        else
        {
            startActivity(Intent(this, QuizGermanResultBadActivity::class.java))
            finish()
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}