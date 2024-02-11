package com.isa.kapilanguagelearning.general

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.isa.kapilanguagelearning.german.LearningSelectorGermanActivity
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity
import kotlinx.android.synthetic.main.activity_language_selector.*


class LanguageSelectorActivity : AppCompatActivity ()
{
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selector)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        text_view_german.setOnClickListener {
            val intent = Intent(this, LearningSelectorGermanActivity::class.java)
            startActivity(intent)
        }
        text_view_spanish.setOnClickListener {
            val intent = Intent(this, LearningSelectorSpanishActivity::class.java)
            startActivity(intent)
        }
        text_view_romanian.setOnClickListener {
            val intent = Intent(this, LearningSelectorRomanianActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.activity_navigation_menu, menu)
        return true
    }

    override fun onBackPressed()
    {
        Toast.makeText(applicationContext, "There is nothing to go back!", Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        return when (item.itemId)
        {
            R.id.miItem3 ->
            {
                Toast.makeText(baseContext, "You clicked on Languages", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItemLanguages1 ->
            {
                val intent = Intent(this, LearningSelectorGermanActivity::class.java)
                startActivity(intent)
                Toast.makeText(baseContext, "You clicked on German", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItemLanguages2 ->
            {
                val intent = Intent(this, LearningSelectorSpanishActivity::class.java)
                startActivity(intent)
                Toast.makeText(baseContext, "You clicked on Spanish", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItemLanguages3 ->
            {
                val intent = Intent(this, LearningSelectorRomanianActivity::class.java)
                startActivity(intent)
                Toast.makeText(baseContext, "You clicked on Romanian", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.miItem4 ->
            {
                Toast.makeText(baseContext, "You clicked on About the app", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subItemAbout1 ->
            {
                val intent = Intent(this, AboutUserActivity::class.java)
                startActivity(intent)
                Toast.makeText(baseContext, "You clicked on About the creator", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItemAbout2 ->
            {
                val intent = Intent(this, AboutAppActivity::class.java)
                startActivity(intent)
                Toast.makeText(baseContext, "You clicked on Credits", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.miItem5 ->
            {
                val editor: SharedPreferences.Editor = preferences.edit()
                editor.clear()
                editor.apply()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                Toast.makeText(baseContext, "You clicked on Logout", Toast.LENGTH_SHORT).show()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}