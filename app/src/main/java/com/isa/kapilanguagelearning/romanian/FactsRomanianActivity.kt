package com.isa.kapilanguagelearning.romanian

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
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity
import kotlinx.android.synthetic.main.activity_facts_romanian.*
import java.util.*


class FactsRomanianActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences
    private val factList : MutableList<String> = mutableListOf("Romanian is a part of the Eastern Romance sub-branch of Romance languages, a linguistic group that evolved from several dialects of Vulgar Latin which separated from the Western Romance languages in the course of the period from the 5th to the 8th centuries. To distinguish it within the Eastern Romance languages, in comparative linguistics it is called Daco-Romanian as opposed to its closest relatives, Aromanian, Megleno-Romanian and Istro-Romanian. Romanian is also known as Moldovan in Moldova, although the Constitutional Court of Moldova ruled in 2013 that \"the official language of the republic is Romanian\".",
            "Numerous immigrant Romanian speakers live scattered across many other regions and countries worldwide, with large populations in Italy, Spain, Germany, United Kingdom, Canada, and the United States of America.",
            "Romanian descended from the Vulgar Latin spoken in the Roman provinces of Southeastern Europe. Roman inscriptions show that Latin was primarily used to the north of the so-called Jireček Line (a hypothetical boundary between the predominantly Latin- and Greek-speaking territories of the Balkan Peninsula in the Roman Empire), but the exact territory where Proto-Romanian (or Common Romanian) developed cannot certainly be determined.",
            "Most regions where Romanian is now widely spoken—Bessarabia, Bukovina, Crișana, Maramureș, Moldova, and significant parts of Muntenia—were not incorporated in the Roman Empire. Other regions—Banat, western Muntenia, Oltenia and Transylvania—formed the Roman province of Dacia Traiana for about 170 years.",
            "Romanian has preserved a part of the Latin declension, but whereas Latin had six cases, from a morphological viewpoint, Romanian has only five: the nominative, accusative, genitive, dative, and marginally the vocative. Romanian nouns also preserve the neuter gender, although instead of functioning as a separate gender with its own forms in adjectives, the Romanian neuter became a mixture of masculine and feminine. ",
            "The verb morphology of Romanian has shown the same move towards a compound perfect and future tense as the other Romance languages. Compared with the other Romance languages, during its evolution, Romanian simplified the original Latin tense system in extreme ways, in particular the absence of sequence of tenses.",
            "Romanian is a Romance language, belonging to the Italic branch of the Indo-European language family, having much in common with languages such as French, Italian, Spanish and Portuguese.",
            "The languages closest to Romanian are the other Balkan Romance languages, spoken south of the Danube: Aromanian, Megleno-Romanian and Istro-Romanian. An alternative name for Romanian used by linguists to disambiguate with the other Balkan Romance languages is \"Daco-Romanian\", referring to the area where it is spoken (which corresponds roughly to the onetime Roman province of Dacia).",
            "Slavic influence on Romanian is especially noticeable in its vocabulary, with words of Slavic origin constituting about 10–15% of modern Romanian lexicon, and with further influences in its phonetics, morphology and syntax. The greater part of its Slavic vocabulary comes from Old Church Slavonic",
            "Old Church Slavonic, which was the official written language of Wallachia and Moldavia from the 14th to the 18th century (although not understood by most people), as well as the liturgical language of the Romanian Orthodox Church. As a result, much Romanian vocabulary dealing with religion, ritual, and hierarchy is Slavic.")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facts_romanian)
        button_facts_romanian.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(factList.count())
            text_view_facts_romanian.text = factList[randomProgram]}

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
