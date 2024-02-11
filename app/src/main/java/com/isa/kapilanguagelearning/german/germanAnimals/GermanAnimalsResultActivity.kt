package com.isa.kapilanguagelearning.german.germanAnimals

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.german.StartLearningGermanActivity
import kotlinx.android.synthetic.main.activity_german_animals_result.*

class GermanAnimalsResultActivity : AppCompatActivity()
{
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german_animals_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        val totalQuestions=intent.getIntExtra(GermanAnimalsConstants.TOTAL_QUESTIONS, 0)
        val correctAnswers=intent.getIntExtra(GermanAnimalsConstants.CORRECT_ANSWERS,0)
        text_view_german_animals_score.text = "Your score is $correctAnswers out of $totalQuestions"
        button_german_animals_finish.setOnClickListener{
            startActivity(Intent(this, StartLearningGermanActivity::class.java))
            finish()
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}