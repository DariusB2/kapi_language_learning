package com.isa.kapilanguagelearning.romanian.romanianAnimals

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.romanian.StartLearningRomanianActivity
import kotlinx.android.synthetic.main.activity_romanian_animals_result.*

class RomanianAnimalsResultActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romanian_animals_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        val totalQuestions=intent.getIntExtra(RomanianAnimalsConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(RomanianAnimalsConstants.CORRECT_ANSWERS,0)
        text_view_romanian_animals_score.text = "Your score is $correctAnswers out of $totalQuestions"
        button_romanian_animals_finish.setOnClickListener{
            startActivity(Intent(this, StartLearningRomanianActivity::class.java))
            finish()
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}