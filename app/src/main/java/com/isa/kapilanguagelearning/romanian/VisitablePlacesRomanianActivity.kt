package com.isa.kapilanguagelearning.romanian

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
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.german.LearningSelectorGermanActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity

class VisitablePlacesRomanianActivity : AppCompatActivity()
{
    private lateinit var preferences: SharedPreferences

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitable_places_romanian)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val imageListRomanian = listOf(
            ImageRomanian(R.drawable.cluj, "Cluj-Napoca", "Cluj-Napoca is the fourth-most populous city in Romania. It is the seat of Cluj County in the northwestern part of the country. Located in the Someșul Mic river valley, the city is considered the unofficial capital to the historical province of Transylvania. From 1790 to 1848 and from 1861 to 1867, it was the official capital of the Grand Principality of Transylvania. Cluj-Napoca has a diverse and growing cultural scene, with cultural life exhibited in a number of fields, including the visual arts, performing arts and nightlife. The city's cultural scene spans its history, dating back to Roman times: the city started to be built in that period, which has left its mark on the urban layout (centered on today's Piața Muzeului) as well as surviving ruins. However, the medieval town saw a shift in its centre towards new civil and religious structures, notably St. Michael's Church."),
            ImageRomanian(R.drawable.bucharest, "Bucharest", "Bucharest is the capital and largest city of Romania, as well as its cultural, industrial, and financial centre. It is in the southeast of the country, on the banks of the Dâmbovița River, less than 60 km (37.3 mi) north of the Danube River and the Bulgarian border. Bucharest was first mentioned in documents in 1459. It became the capital of Romania in 1862 and is the centre of Romanian media, culture, and art. Its architecture is a mix of historical (Neoclassical and Art Nouveau), interbellum (Bauhaus and Art Deco), communist era and modern. In the period between the two World Wars, the city's elegant architecture and the sophistication of its elite earned Bucharest the nickname of 'Paris of the East' (Romanian: Parisul Estului) or 'Little Paris' (Romanian: Micul Paris). Economically, Bucharest is the most prosperous city in Romania."),
            ImageRomanian(R.drawable.timisoara, "Timișoara", "Timișoara is the capital city of Timiș County  and the main economic, social and cultural center in western Romania. Located on the Bega River, Timișoara is considered the informal capital city of the historical Banat. From 1848 to 1860 it was the capital of the Serbian Vojvodina and the Voivodeship of Serbia and Banat of Temeschwar. Nicknamed the \"Little Vienna\" or the \"City of Flowers\", Timișoara is noted for its large number of historical monuments and its 36 parks and green spaces. It is also a member of Eurocities. Timișoara has a very active cultural scene thanks to the city's three state theaters, opera, philharmonic and many other cultural institutions."),
            ImageRomanian(R.drawable.brasov, "Brașov", "Brașov is a city in Transylvania, Romania and the administrative centre of Brașov County.According to the latest Romanian census (2011), Brașov has a population of 253,200 making it the 7th most populous city in Romania. The metropolitan area is home to 382,896 residents. Brașov is located in the central part of the country. It is surrounded by the Southern Carpathians and is part of the historical region of Transylvania. The city is notable for being the regional capital of the Transylvanian Saxons of the Burzenland (Romanian: Țara Bârsei) administrative area in the past, and a large commercial hub on the trade roads between East and West."),
            ImageRomanian(R.drawable.chisinau, "Chișinău", "Chișinău is the capital and largest city of the Republic of Moldova. The city is Moldova's main industrial and commercial center, and is located in the middle of the country, on the river Bâc, a tributary of the Dniester. According to the results of the 2014 census, the city proper had a population of 532,513, while the population of the Municipality of Chișinău (which includes the city itself and other nearby communities) was 700,000. Chișinău is the most economically prosperous locality in Moldova and its largest transportation hub. Nearly a third of Moldova's population lives in the metro area."),
            ImageRomanian(R.drawable.sibiu, "Sibiu", "Sibiu is a city in Transylvania, a historical region of Romania. Now the capital of the Sibiu County, between 1692 and 1791 and 1849–65 Sibiu was also the capital of the Principality of Transylvania. Nicknamed The City with Eyes, the city is a well-known tourist destination for both domestic and foreign visitors. Known for its culture, history, gastronomy and its diverse architecture, which includes its much iconic houses with eyes that gave Sibiu its nickname. Sibiu is also known for its Christmas market.")
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerViewRomanian)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapterRomanian(this, imageListRomanian) {
            val intent = Intent(this, DetailActivityRomanian::class.java)
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