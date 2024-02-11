package com.isa.kapilanguagelearning.german

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.*
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity

class VisitablePlacesGermanActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitable_places_german)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val imageList = listOf(
            Image(R.drawable.berlin, "Berlin", "Berlin is the capital and largest city of Germany by both area and population. Its 3,769,495 inhabitants, as of 31 December 2019 makes it the most-populous city of the European Union, according to population within city limits. One of Germany's 16 constituent states, Berlin is surrounded by the state of Brandenburg, and contiguous with Potsdam, Brandenburg's capital. Berlin's urban area has a population of around 4.5 million and is the second most populous urban area in Germany after the Ruhr. The Berlin-Brandenburg capital region has about six million inhabitants and is Germany's third-largest metropolitan region after the Rhine-Ruhr and Rhine-Main regions."),
            Image(R.drawable.vienna, "Vienna", "Vienna is the national capital, largest city, and one of nine states of Austria. Vienna is Austria's most populous city, with about 1.9 million inhabitants (2.6 million within the metropolitan area, nearly one third of the country's population), and its cultural, economic, and political center. It is the 6th-largest city by population within city limits in the European Union. Until the beginning of the 20th century, Vienna was the largest German-speaking city in the world, and before the splitting of the Austro-Hungarian Empire in World War I, the city had 2 million inhabitants. Today, it is the second-largest German-speaking city after Berlin."),
            Image(R.drawable.rothenburg, "Rothenburg", "Rothenburg is a town in the district of Ansbach of Mittelfranken (Middle Franconia), the Franconia region of Bavaria, Germany. It is well known for its well-preserved medieval old town, a destination for tourists from around the world. It is part of the popular Romantic Road through southern Germany. Today it is one of only three towns in Germany that still have completely intact city walls, the other two being Nördlingen and Dinkelsbühl. Rothenburg was a Free imperial city from the late Middle Ages to 1803. In 1884 Johann Friedrich (von) Hessing (1838–1918) built Wildbad Rothenburg o.d.T. 1884–1903."),
            Image(R.drawable.heidelberg, "Heidelberg", "Heidelberg is a university town in the German state of Baden-Württemberg, situated on the river Neckar in south-west Germany. In the 2016 census, its population was 159,914, of which roughly a quarter consisted of students. Located about 78 km (48 mi) south of Frankfurt, Heidelberg is the fifth-largest city in Baden-Württemberg. Heidelberg is part of the densely populated Rhine-Neckar Metropolitan Region. Heidelberg University, founded in 1386, is Germany's oldest and one of Europe's most reputable universities. Heidelberg was a seat of government of the former Electorate of the Palatinate and is a popular tourist destination due to its romantic cityscape, including Heidelberg Castle, the Philosophers' Walk, and the Baroque old town."),
            Image(R.drawable.bolzano, "Bolzano", "Bolzano (German: Bozen (formerly Botzen); Bavarian: Bozn) is the capital city of the province of South Tyrol in northern Italy. With a population of 108,245, Bolzano is also by far the largest city in South Tyrol and the third largest in historical Tyrol. The greater metro area has about 250,000 inhabitants and is one of the urban centers within the Alps. Bolzano is the seat of the Free University of Bozen-Bolzano, where lectures and seminars are held in English, German, and Italian. In the 2020 version of the annual ranking of quality of life in Italian cities, Bolzano was ranked joint best quality of life alongside Bologna. Along with other Alpine towns in South Tyrol, Bolzano engages in the Alpine Town of the Year Association for the implementation of the Alpine Convention. Bolzano is considered a bridge between Northern Europe and Southern Europe due to the three spoken languages in South Tyrol (Italian, German, and Ladin) and the confluence of Italian and German-Austrian culture."),
            Image(R.drawable.basel, "Basel", "Basel is a city in northwestern Switzerland on the river Rhine. Basel is Switzerland's third-most-populous city (after Zürich and Geneva) with about 200,000 inhabitants. The official language of Basel is (the Swiss variety of Standard) German, but the main spoken language is the local Basel German dialect. Basel is commonly considered to be the cultural capital of Switzerland. The University of Basel, Switzerland's oldest university (founded in 1460), and the city's centuries-long commitment to humanism, have made Basel a safe haven at times of political unrest in other parts of Europe for such notable people as Erasmus of Rotterdam, the Holbein family, Friedrich Nietzsche, and in the 20th century also Hermann Hesse and Karl Jaspers. Basel was the seat of a Prince-Bishopric starting in the 11th century, and joined the Swiss Confederacy in 1501.")
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
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