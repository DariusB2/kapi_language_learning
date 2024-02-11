@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package com.isa.kapilanguagelearning.german

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
import com.isa.kapilanguagelearning.german.germanAnimals.GermanAnimalsTrainingActivity
import com.isa.kapilanguagelearning.german.germanBasic.GermanBasicTrainingActivity
import com.isa.kapilanguagelearning.german.germanBody.GermanBodyTrainingActivity
import com.isa.kapilanguagelearning.german.germanColors.GermanColorsTrainingActivity
import com.isa.kapilanguagelearning.german.germanDate.GermanDateTrainingActivity
import com.isa.kapilanguagelearning.german.germanDirections.GermanDirectionsTrainingActivity
import com.isa.kapilanguagelearning.german.germanFamily.GermanFamilyTrainingActivity
import com.isa.kapilanguagelearning.german.germanFood.GermanFoodTrainingActivity
import com.isa.kapilanguagelearning.german.germanHouse.GermanHouseTrainingActivity
import com.isa.kapilanguagelearning.german.germanNumbers.GermanNumbersTrainingActivity
import com.isa.kapilanguagelearning.german.germanObjects.GermanObjectsTrainingActivity
import com.isa.kapilanguagelearning.german.germanOccupations.GermanOccupationsTrainingActivity
import com.isa.kapilanguagelearning.german.germanTime.GermanTimeTrainingActivity
import com.isa.kapilanguagelearning.german.germanWeather.GermanWeatherTrainingActivity
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity

class StartLearningGermanActivity : AppCompatActivity () , AdapterView.OnItemClickListener
{
    private lateinit var preferences: SharedPreferences
    private var arrayList:ArrayList<GermanChar> ? =null
    private var gridView:GridView ? = null
    private var germanAdapters: GermanAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_learning_german)

        gridView = findViewById(R.id.grid_view_german)
        arrayList = setDataList()
        germanAdapters = GermanAdapters(applicationContext, arrayList!!)
        gridView?.adapter = germanAdapters
        gridView?.onItemClickListener = this

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    override fun onBackPressed()
    {
        val intent = Intent(this, LearningSelectorGermanActivity::class.java)
        startActivity(intent)
    }

    private fun setDataList() : ArrayList<GermanChar> {

        val arrayList:ArrayList<GermanChar> = ArrayList()
        arrayList.add(GermanChar(R.drawable.chowchow_one, "Basic"))
        arrayList.add(GermanChar(R.drawable.icon_german_food, "Food"))
        arrayList.add(GermanChar(R.drawable.chowchow_three, "Animals"))
        arrayList.add(GermanChar(R.drawable.icon_german_family, "Family"))
        arrayList.add(GermanChar(R.drawable.icon_german_house, "House"))
        arrayList.add(GermanChar(R.drawable.icon_german_body, "Body"))
        arrayList.add(GermanChar(R.drawable.icon_german_colors, "Colors"))
        arrayList.add(GermanChar(R.drawable.icon_german_number, "Numbers"))
        arrayList.add(GermanChar(R.drawable.icon_german_time, "Time"))
        arrayList.add(GermanChar(R.drawable.icon_german_date, "Date"))
        arrayList.add(GermanChar(R.drawable.icon_german_directions, "Directions"))
        arrayList.add(GermanChar(R.drawable.icon_german_weather, "Weather"))
        arrayList.add(GermanChar(R.drawable.icon_german_objects, "Objects"))
        arrayList.add(GermanChar(R.drawable.icon_german_occupations, "Occupations"))
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
        val items: GermanChar = arrayList!![position]
        Toast.makeText(applicationContext, items.alphaCharGerman, Toast.LENGTH_SHORT).show()

        if (position === 0) //C1R1 Basic
        {
            val intent = Intent(this, GermanBasicTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 1) //C2R1 Food
        {
            val intent = Intent(this, GermanFoodTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 2) //C1R2 Animals
        {
            val intent = Intent(this, GermanAnimalsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 3) //C2R2 Family
        {
            val intent = Intent(this, GermanFamilyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 4) //C1R3 House
        {
            val intent = Intent(this, GermanHouseTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 5) //C2R3 Body
        {
            val intent = Intent(this, GermanBodyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 6) //C1R4 Colors
        {
            val intent = Intent(this, GermanColorsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 7) //C2R4 Numbers
        {
            val intent = Intent(this, GermanNumbersTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 8) //C1R5 Time
        {
            val intent = Intent(this, GermanTimeTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 9) //C2R5 Date
        {
            val intent = Intent(this, GermanDateTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 10) //C1R6 Directions
        {
            val intent = Intent(this, GermanDirectionsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 11) //C2R6 Weather
        {
            val intent = Intent(this, GermanWeatherTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 12) //C1R7 Objects
        {
            val intent = Intent(this, GermanObjectsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position === 13) //C2R7 Occupations
        {
            val intent = Intent(this, GermanOccupationsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }
    }
}