package com.isa.kapilanguagelearning.german

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import kotlinx.android.synthetic.main.activity_german_quiz_result_bad.*

class QuizGermanResultBadActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german_quiz_result_bad)

        button_quiz_result_bad.setOnClickListener {
            val intent = Intent(this, StartLearningGermanActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}