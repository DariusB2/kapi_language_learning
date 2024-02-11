package com.isa.kapilanguagelearning.spanish

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.isa.kapilanguagelearning.*
import com.isa.kapilanguagelearning.german.LearningSelectorGermanActivity
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import kotlinx.android.synthetic.main.activity_facts_spanish.*
import java.util.*


class FactsSpanishActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences
    private val factList : MutableList<String> = mutableListOf(
        "Spanish is the primary language in 20 countries worldwide. As of 2020, it is estimated that about 463 million people speak Spanish as a native language, making it the second most spoken language by number of native speakers. An additional 75 million speak Spanish as a second or foreign language, making it the fourth most spoken language in the world overall after English, Mandarin Chinese, and Hindi with a total number of 538 million speakers. Spanish is also the third most used language on the Internet, after English and Russian.",
        "Spanish is a part of the Ibero-Romance group of languages of the Indo-European language family, which evolved from several dialects of Vulgar Latin in Hispania after the collapse of the Western Roman Empire in the 5th century. The oldest Latin texts with traces of Spanish come from mid-northern Iberia in the 9th century, and the first systematic written use of the language happened in Toledo, a prominent city of the Kingdom of Castile, in the 13th century.",
        "As a Romance language, Spanish is a descendant of Latin and has one of the smaller degrees of difference from it (about 20%) alongside Sardinian and Italian. Around 75% of modern Spanish vocabulary is derived from Latin, including Latin borrowings from Ancient Greek. Its vocabulary has also been influenced by Arabic, having developed during the Al-Andalus era in the Iberian Peninsula, with around 8% of its vocabulary having Arabic lexical roots.",
        "Spanish is one of the six official languages of the United Nations, and it is also used as an official language by the European Union, the Organization of American States, the Union of South American Nations, the Community of Latin American and Caribbean States, the African Union and many other international organizations.",
        "In Spain and in some other parts of the Spanish-speaking world, Spanish is called not only español but also castellano (Castilian), the language from the kingdom of Castile, contrasting it with other languages spoken in Spain such as Galician, Basque, Asturian, Catalan, Aragonese and Occitan.",
        "The Spanish language evolved from Vulgar Latin, which was brought to the Iberian Peninsula by the Romans during the Second Punic War, beginning in 210 BC. Previously, several pre-Roman languages (also called Paleohispanic languages)—some related to Latin via Indo-European, and some that are not related at all—were spoken in the Iberian Peninsula. These languages included Basque (still spoken today), Iberian, Celtiberian and Gallaecian.",
        "Spanish is classified by its rhythm as a syllable-timed language: each syllable has approximately the same duration regardless of stress.",
        "Spanish is the official, or national language in 18 countries and one territory in the Americas, Spain, and Equatorial Guinea. With a population of over 410 million, Hispanophone America accounts for the vast majority of Spanish speakers, of which Mexico is the most populous Spanish-speaking country. In the European Union, Spanish is the mother tongue of 8% of the population, with an additional 7% speaking it as a second language.",
        "Most of the grammatical and typological features of Spanish are shared with the other Romance languages. Spanish is a fusional language. The noun and adjective systems exhibit two genders and two numbers. In addition, articles and some pronouns and determiners have a neuter gender in their singular form. There are about fifty conjugated forms per verb, with 3 tenses: past, present, future; 2 aspects for past: perfective, imperfective; 4 moods: indicative, subjunctive, conditional, imperative; 3 persons: first, second, third; 2 numbers: singular, plural; 3 verboid forms: infinitive, gerund, and past participle.",
    )

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facts_spanish)
        button_facts_spanish.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(factList.count())
            text_view_facts_spanish.text = factList[randomProgram]}

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.activity_navigation_menu, menu);
        return true;
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
