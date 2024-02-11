package com.isa.kapilanguagelearning.german

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.isa.kapilanguagelearning.*
import com.isa.kapilanguagelearning.german.germanChatBot.GermanChatBotActivity
import com.isa.kapilanguagelearning.german.germanVerbForms.VerbFormsActivity
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.LanguageSelectorActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity
import kotlinx.android.synthetic.main.activity_learning_selector_german.*

class LearningSelectorGermanActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_selector_german)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        text_view_facts_viewer_german.setOnClickListener {
            val intent = Intent(this, FactsGermanActivity::class.java)
            startActivity(intent)
        }

        text_view_verbs_forms_viewer_german.setOnClickListener {
            val intent = Intent(this, VerbFormsActivity::class.java)
            startActivity(intent)
        }

        text_view_visitable_places_viewer_german.setOnClickListener {
            val intent = Intent(this, VisitablePlacesGermanActivity::class.java)
            startActivity(intent)
        }

        text_view_start_learning_german.setOnClickListener {
            val intent = Intent(this, StartLearningGermanActivity::class.java)
            startActivity(intent)
        }
        text_view_chat_bot_german.setOnClickListener {
            val intent = Intent(this, GermanChatBotActivity::class.java)
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
        val intent = Intent(this, LanguageSelectorActivity::class.java)
        startActivity(intent)
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