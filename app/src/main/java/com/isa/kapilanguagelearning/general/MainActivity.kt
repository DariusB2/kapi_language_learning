package com.isa.kapilanguagelearning.general

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.isa.kapilanguagelearning.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity()
{
    private lateinit var auth: FirebaseAuth
    private lateinit var sharedPreferences: SharedPreferences
    private var isRemembered = false

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        sharedPreferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        isRemembered = sharedPreferences.getBoolean("CHECKBOX", false)
        if(isRemembered)
        {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val buttonLogin = findViewById<Button>(R.id.button_login)
        val createAccount = findViewById<TextView>(R.id.text_view_create_account)
        val lostPassword = findViewById<TextView>(R.id.text_view_lost_password)

        buttonLogin.setOnClickListener {
            val checked: Boolean = check_box_remember.isChecked
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putBoolean("CHECKBOX", checked)
            editor.apply()

            if(user_mail.text.toString().isEmpty() || user_password.text.toString().isEmpty())
                Toast.makeText(applicationContext, "Sign in failed! Please provide both a valid email and a password!", Toast.LENGTH_SHORT).show()
            else {
                auth.signInWithEmailAndPassword(user_mail.text.toString(), user_password.text.toString())
                    .addOnCompleteListener { task ->
                        if(task.isSuccessful)
                        {
                            Toast.makeText(baseContext, "Login successful!", Toast.LENGTH_SHORT).show()
                            val user = auth.currentUser
                            updateUI(user, user_mail.text.toString())
                            val intent = Intent(this, WelcomeActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else
                        {
                            Toast.makeText(baseContext, "Invalid Email or Password!", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

        createAccount.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        lostPassword.setOnClickListener {
            val intent = Intent(this, LostPasswordActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateUI (currentUser: FirebaseUser?, emailAdd:String)
    {
        if(currentUser !=null)
        {
            if(currentUser.isEmailVerified)
            {
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        else
        {
            Toast.makeText(baseContext, "Email is not verified!", Toast.LENGTH_SHORT).show()
        }
    }
}