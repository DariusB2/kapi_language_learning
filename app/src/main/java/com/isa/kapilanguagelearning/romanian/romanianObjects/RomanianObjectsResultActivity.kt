package com.isa.kapilanguagelearning.romanian.romanianObjects

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.romanian.QuizRomanianResultBadActivity
import com.isa.kapilanguagelearning.romanian.StartLearningRomanianActivity
import kotlinx.android.synthetic.main.activity_romanian_objects_result.*

class RomanianObjectsResultActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val totalQuestions=intent.getIntExtra(RomanianObjectsConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(RomanianObjectsConstants.CORRECT_ANSWERS,0)
        if(correctAnswers >=6 )
        {
            setContentView(R.layout.activity_romanian_objects_result)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            text_view_romanian_objects_score.text = "Your score is $correctAnswers out of $totalQuestions"
            button_romanian_objects_finish.setOnClickListener{
                startActivity(Intent(this, StartLearningRomanianActivity::class.java))
                finish()
            }
        }
        else
        {
            startActivity(Intent(this, QuizRomanianResultBadActivity::class.java))
            finish()
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}