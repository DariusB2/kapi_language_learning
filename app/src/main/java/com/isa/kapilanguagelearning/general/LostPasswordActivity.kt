package com.isa.kapilanguagelearning.general

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.WindowManager
import android.widget.Toast
import com.isa.kapilanguagelearning.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_lost_password.*

class LostPasswordActivity : AppCompatActivity()
{
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost_password)
        auth = FirebaseAuth.getInstance()

        window.setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        button_lost_password.setOnClickListener {
            if(text_lost_password.text.toString().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(text_lost_password.text.toString()).matches())
            {
                Toast.makeText(baseContext, "Please introduce the email address first.", Toast.LENGTH_SHORT).show()
            }
            else {
                auth.sendPasswordResetEmail(
                    text_lost_password.text.toString())
                    .addOnCompleteListener (this) { task ->
                        if(task.isSuccessful)
                        {
                            val user = auth.currentUser
                            Toast.makeText(baseContext, "Reset Password link was sent to your email address!",
                                Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(baseContext, "Reset Password link could not be sent!",
                                Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }
    }
}