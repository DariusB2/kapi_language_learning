package com.isa.kapilanguagelearning.spanish

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isa.kapilanguagelearning.*
import com.isa.kapilanguagelearning.german.LearningSelectorGermanActivity
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.spanishAnimals.SpanishAnimalsTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishBasic.SpanishBasicTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishBody.SpanishBodyTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishColors.SpanishColorsTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishDate.SpanishDateTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishDirections.SpanishDirectionsTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishFamily.SpanishFamilyTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishFood.SpanishFoodTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishHouse.SpanishHouseTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishNumbers.SpanishNumbersTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishObjects.SpanishObjectsTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishOccupations.SpanishOccupationsTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishTime.SpanishTimeTrainingActivity
import com.isa.kapilanguagelearning.spanish.spanishWeather.SpanishWeatherTrainingActivity

class StartLearningSpanishActivity : AppCompatActivity () , AdapterView.OnItemClickListener
{
    private lateinit var preferences: SharedPreferences
    private var arrayList:ArrayList<SpanishChar> ? =null
    private var gridView:GridView ? = null
    private var spanishAdapters: SpanishAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_learning_spanish)

        gridView = findViewById(R.id.grid_view_spanish)
        arrayList = setDataList()
        spanishAdapters = SpanishAdapters(applicationContext, arrayList!!)
        gridView?.adapter = spanishAdapters
        gridView?.onItemClickListener = this

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    override fun onBackPressed()
    {
        val intent = Intent(this, LearningSelectorSpanishActivity::class.java)
        startActivity(intent)
    }

    private fun setDataList() : ArrayList<SpanishChar> {

        val arrayList:ArrayList<SpanishChar> = ArrayList()
        arrayList.add(SpanishChar(R.drawable.chowchow_one, "Basic"))
        arrayList.add(SpanishChar(R.drawable.icon_german_food, "Food"))
        arrayList.add(SpanishChar(R.drawable.chowchow_three, "Animals"))
        arrayList.add(SpanishChar(R.drawable.icon_german_family, "Family"))
        arrayList.add(SpanishChar(R.drawable.icon_german_house, "House"))
        arrayList.add(SpanishChar(R.drawable.icon_german_body, "Body"))
        arrayList.add(SpanishChar(R.drawable.icon_german_colors, "Colors"))
        arrayList.add(SpanishChar(R.drawable.icon_german_number, "Numbers"))
        arrayList.add(SpanishChar(R.drawable.icon_german_time, "Time"))
        arrayList.add(SpanishChar(R.drawable.icon_german_date, "Date"))
        arrayList.add(SpanishChar(R.drawable.icon_german_directions, "Directions"))
        arrayList.add(SpanishChar(R.drawable.icon_german_weather, "Weather"))
        arrayList.add(SpanishChar(R.drawable.icon_german_objects, "Objects"))
        arrayList.add(SpanishChar(R.drawable.icon_german_occupations, "Occupations"))
        return arrayList
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

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val items: SpanishChar = arrayList!![position]
        Toast.makeText(applicationContext, items.alphaCharSpanish, Toast.LENGTH_SHORT).show()

        if (position == 0) //C1R1 Basic
        {
            val intent = Intent(this, SpanishBasicTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 1) //C2R1 Food
        {
            val intent = Intent(this, SpanishFoodTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 2) //C1R2 Animals
        {
            val intent = Intent(this, SpanishAnimalsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 3) //C2R2 Family
        {
            val intent = Intent(this, SpanishFamilyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 4) //C1R3 House
        {
            val intent = Intent(this, SpanishHouseTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 5) //C2R3 Body
        {
            val intent = Intent(this, SpanishBodyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 6) //C1R4 Colors
        {
            val intent = Intent(this, SpanishColorsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 7) //C2R4 Numbers
        {
            val intent = Intent(this, SpanishNumbersTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 8) //C1R5 Time
        {
            val intent = Intent(this, SpanishTimeTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 9) //C2R5 Date
        {
            val intent = Intent(this, SpanishDateTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 10) //C1R6 Directions
        {
            val intent = Intent(this, SpanishDirectionsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 11) //C2R6 Weather
        {
            val intent = Intent(this, SpanishWeatherTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 12) //C1R7 Objects
        {
            val intent = Intent(this, SpanishObjectsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 13) //C2R7 Occupations
        {
            val intent = Intent(this, SpanishOccupationsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }
    }
}