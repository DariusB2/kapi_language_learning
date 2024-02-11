package com.isa.kapilanguagelearning.spanish

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
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity

class VisitablePlacesSpanishActivity : AppCompatActivity() {

    private lateinit var preferences: SharedPreferences

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitable_places_spanish)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val imageListSpanish = listOf<ImageSpanish>(
            ImageSpanish(R.drawable.madrid, "Madrid", "Madrid is the capital and most-populous city of Spain. The city has almost 3.4 millio inhabitants and a metropolitan area population of approximately 6.7 million. It is the second-largest city in the European Union (EU), surpassed only by Berlin in its administrative limits, and its monocentric metropolitan area is the second-largest in the EU, surpassed only by Paris. The municipality covers 604.3 km2 (233.3 sq mi) geographical area. Madrid houses the headquarters of the UN's World Tourism Organization (UNWTO), the Ibero-American General Secretariat (SEGIB), the Organization of Ibero-American States (OEI), and the Public Interest Oversight Board (PIOB). While Madrid possesses modern infrastructure, it has preserved the look and feel of many of its historic neighbourhoods and streets. Its landmarks include the Plaza Mayor, the Royal Palace of Madrid; the Royal Theatre with its restored 1850 Opera House; the Buen Retiro Park, founded in 1631; the 19th-century National Library building (founded in 1712) containing some of Spain's historical archives; many national museums, and the Golden Triangle of Art, located along the Paseo del Prado and comprising three art museums: Prado Museum, the Reina Sofía Museum, a museum of modern art, and the Thyssen-Bornemisza Museum, which complements the holdings of the other two museums. Cibeles Palace and Fountain has become one of the monument symbols of the city."),
            ImageSpanish(R.drawable.barcelona, "Barcelona", "Barcelona is a city on the coast of northeastern Spain. It is the capital and largest city of the autonomous community of Catalonia, as well as the second most populous municipality of Spain. With a population of 1.6 million within city limits, its urban area extends to numerous neighbouring municipalities within the Province of Barcelona and is home to around 4.8 million people, making it the fifth most populous urban area in the European Union after Paris, the Ruhr area, Madrid, and Milan. It is one of the largest metropolises on the Mediterranean Sea, located on the coast between the mouths of the rivers Llobregat and Besòs, and bounded to the west by the Serra de Collserola mountain range, the tallest peak of which is 512 metres (1,680 feet) high. Founded as a Roman city, in the Middle Ages Barcelona became the capital of the County of Barcelona. After joining with the Kingdom of Aragon to form the confederation of the Crown of Aragon, Barcelona, which continued to be the capital of the Principality of Catalonia, became the most important city in the Crown of Aragon and the main economic and administrative centre of the Crown, only to be overtaken by Valencia, wrested from Arab domination by the Catalans Barcelona has a rich cultural heritage and is today an important cultural centre and a major tourist destination."),
            ImageSpanish(R.drawable.bilbao, "Bilbao", "Bilbao is a city in northern Spain, the largest city in the province of Biscay and in the Basque Country as a whole. It is also the largest city proper in northern Spain. Bilbao is the tenth largest city in Spain, with a population of 345,141 as of 2015. The Bilbao metropolitan area has 1,037,847 inhabitants, making it one of the most populous metropolitan areas in northern Spain; with a population of 875,552 the comarca of Greater Bilbao is the fifth-largest urban area in Spain. Bilbao is also the main urban area in what is defined as the Greater Basque region. Bilbao is situated in the north-central part of Spain, some 16 kilometres (10 mi) south of the Bay of Biscay, where the economic social development is located, where the estuary of Bilbao is formed. Its main urban core is surrounded by two small mountain ranges with an average elevation of 400 metres (1,300 ft). Its climate is shaped by the Bay of Biscay low-pressure systems and mild air, moderating summer temperatures by Iberian standards, with low sunshine and high rainfall. The annual temperature range is low for its latitude. After its foundation in the early 14th century by Diego López V de Haro, head of the powerful Haro family, Bilbao was a commercial hub of the Basque Country that enjoyed significant importance in Green Spain. This was due to its port activity based on the export of iron extracted from the Biscayan quarries."),
            ImageSpanish(R.drawable.buenos_aires, "Buenos Aires", "Buenos Aires is the capital and largest city of Argentina. The city is located on the western shore of the Río de la Plata, on South America's southeastern coast. \"Buenos Aires\" can be translated as \"fair winds\" or \"good airs\", but the former was the meaning intended by the founders in the 16th century, by the use of the original name \"Real de Nuestra Señora Santa María del Buen Ayre\", named after the Madonna of Bonaria in Sardinia, Italy. The city of Buenos Aires is neither part of Buenos Aires Province nor the Province's capital; rather, it is an autonomous district. In 1880, after decades of political infighting, Buenos Aires was federalized and removed from Buenos Aires Province. The Greater Buenos Aires conurbation, which also includes several Buenos Aires Province districts, constitutes the fourth-most populous metropolitan area in the Americas, with a population of around 15.6 million. Buenos Aires' quality of life was ranked 91st in the world in 2018, being one of the best in Latin America. In 2012, it was the most visited city in South America, and the second-most visited city of Latin America."),
            ImageSpanish(R.drawable.mexico_city, "Mexico City", "Mexico City is the capital and largest city of Mexico and the most populous city in North America. Mexico City is one of the most important cultural and financial centers in the world. The 2020 population for the city proper was 9,209,944, with a land area of 1,485 square kilometers (573 sq mi). According to the most recent definition agreed upon by the federal and state governments, the population of Greater Mexico City is 21,804,515, which makes it the second-largest metropolitan area in the Western Hemisphere (behind São Paulo, Brazil), the eleventh-largest agglomeration (2017), and the largest Spanish-speaking city in the world. Mexico's capital is both the oldest capital city in the Americas and one of two founded by indigenous people, the other being Quito, Ecuador. The city was originally built on an island of Lake Texcoco by the Aztecs in 1325 as Tenochtitlan, which was almost completely destroyed in the 1521 Siege of Tenochtitlan and subsequently redesigned and rebuilt in accordance with the Spanish urban standards. In 1524, the municipality of Mexico City was established, known as México Tenochtitlán, and as of 1585, it was officially known as Ciudad de México (Mexico City). Mexico City was the political, administrative, and financial center of a major part of the Spanish colonial empire. After independence from Spain was achieved, the federal district was created in 1824."),
            ImageSpanish(R.drawable.los_angeles, "Los Angeles", "Los Angeles (Spanish: Los Ángeles; \"The Angels\"), officially the City of Los Angeles and often abbreviated as L.A., is the largest city in California. It has an estimated population of nearly 4 million, and is the second-largest city in the United States, after New York City, and the third-largest city in North America, after Mexico City and New York City. Los Angeles is known for its Mediterranean climate, ethnic and cultural diversity, Hollywood entertainment industry, and its sprawling metropolitan area. Home to the Chumash and Tongva, the area that became Los Angeles was claimed by Juan Rodríguez Cabrillo for Spain in 1542. The city was founded on September 4, 1781, under Spanish governor Felipe de Neve, on the village of Yaanga. It became a part of Mexico in 1821 following the Mexican War of Independence. In 1848, at the end of the Mexican–American War, Los Angeles and the rest of California were purchased as part of the Treaty of Guadalupe Hidalgo, and thus became part of the United States. According to the 2010 Census, hispanics or Latinos of any race were 1,838,822 persons (48.5%)."),
            )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerViewSpanish)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapterSpanish(this, imageListSpanish) {
            val intent = Intent(this, DetailActivitySpanish::class.java)
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
