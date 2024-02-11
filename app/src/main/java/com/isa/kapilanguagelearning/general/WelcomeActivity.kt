package com.isa.kapilanguagelearning.general

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.R

class WelcomeActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //val intent = intent
        //val receivedEmail = intent.getStringExtra("Email Address")
        //text_view_account_mail.text = "" + receivedEmail
        Handler().postDelayed({
            val intent = Intent(this, LanguageSelectorActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}