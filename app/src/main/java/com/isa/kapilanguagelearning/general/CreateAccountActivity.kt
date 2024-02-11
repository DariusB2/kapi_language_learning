package com.isa.kapilanguagelearning.general

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.isa.kapilanguagelearning.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccountActivity  : AppCompatActivity()
{
    private lateinit var auth:  FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        auth = FirebaseAuth.getInstance()

        button_create_account.setOnClickListener {
            createAccount()
        }
    }

    private fun createAccount()
    {
        if(text_account_mail.text.toString().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(text_account_mail.text.toString()).matches() || text_account_password.text.toString().isEmpty())
            Toast.makeText(baseContext, "Account creation failed! Please provide both a valid email and a password!",
                Toast.LENGTH_SHORT).show()
        else
        {
            auth.createUserWithEmailAndPassword(
                text_account_mail.text.toString(),
                text_account_password.text.toString())
                .addOnCompleteListener(this) { task->
                    if(task.isSuccessful) {
                        auth.currentUser?.sendEmailVerification()
                            ?.addOnCompleteListener { task->
                                if(task.isSuccessful)
                                {
                                    Toast.makeText(baseContext, "Account created. Email verification is sent!", Toast.LENGTH_SHORT).show()
                                    //val user = auth.currentUser
                                    //updateUI(user)
                                    val intent = Intent(this, MainActivity::class.java)
                                    startActivity(intent)
                                    finish()
                                }
                            }
                    } else {
                        Toast.makeText(baseContext, "Account creation failed! Try again later!",
                            Toast.LENGTH_SHORT).show()
                        //updateUI(null)
                    }
                }
        }
    }
    //private fun updateUI (currentUser: FirebaseUser?) { }
}