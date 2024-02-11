package com.isa.kapilanguagelearning.romanian

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R
import kotlinx.android.synthetic.main.activity_romanian_quiz_result_bad.*

class QuizRomanianResultBadActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_romanian_quiz_result_bad)

        button_quiz_result_bad_romanian.setOnClickListener {
            val intent = Intent(this, StartLearningRomanianActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "You can't go back!", Toast.LENGTH_SHORT).show()
    }
}