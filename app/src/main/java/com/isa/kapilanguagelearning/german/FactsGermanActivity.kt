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
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity
import kotlinx.android.synthetic.main.activity_facts_german.*
import java.util.*


class FactsGermanActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences

    private val factList : MutableList<String> = mutableListOf(
        "One of the major languages of the world, German is a native language to almost 100 million people worldwide and is spoken by a total of over 130 million people. It is the most spoken native language within the European Union.",
        "German is also widely taught as a foreign language, especially in Europe, where it is the third most taught foreign language (after English and French), and the United States. The language has been influential in the fields of philosophy, theology, science and technology.",
        "German is an inflected language, with four cases for nouns, pronouns, and adjectives (nominative, accusative, genitive, dative); three genders (masculine, feminine, neuter); and two numbers (singular, plural). It has strong and weak verbs.",
        "German is a pluricentric language; the three standardized variants are German, Austrian, and Swiss Standard High German.",
        "Modern Standard German is a West Germanic language in the Germanic branch of the Indo-European languages. The Germanic languages are traditionally subdivided into three branches, North Germanic, East Germanic, and West Germanic.",
        "Standard German is based on a combination of Thuringian-Upper Saxon and Upper Franconian dialects, which are Central German and Upper German dialects belonging to the High German dialect group.",
        "German was the language of commerce and government in the Habsburg Empire, which encompassed a large area of Central and Eastern Europe. Until the mid-nineteenth century, it was essentially the language of townspeople throughout most of the Empire. Its use indicated that the speaker was a merchant or someone from an urban area, regardless of nationality.",
        "The most comprehensive guide to the vocabulary of the German language is found within the Deutsches Wörterbuch. This dictionary was created by the Brothers Grimm, and is composed of 16 parts which were issued between 1852 and 1860. In 1872, grammatical and orthographic rules first appeared in the Duden Handbook.",
        "A 2020 estimate by Ethnologue places the total number of Standard German speakers at 132 million, of which over 75 million are native speakers.",
        "Namibia was a colony of the German Empire from 1884 to 1919. About 30,000 people still speak German as a native tongue today, mostly descendants of German colonial settlers.",
        "The German dialects are the traditional local varieties of the language; many of them are not mutually intelligibile with standard German, and they have great differences in lexicon, phonology, and syntax.",
        "German is written in the Latin alphabet. In addition to the 26 standard letters, German has three vowels with an umlaut mark, namely ä, ö and ü, as well as the eszett or scharfes s (sharp s): ß.")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facts_german)
        button_facts_german.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(factList.count())
            text_view_facts_german.text = factList[randomProgram]}

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.activity_navigation_menu, menu)
        return true
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
