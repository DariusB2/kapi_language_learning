package com.isa.kapilanguagelearning.romanian

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
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.romanian.romanianAnimals.RomanianAnimalsTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianBasic.RomanianBasicTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianBody.RomanianBodyTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianColors.RomanianColorsTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianDate.RomanianDateTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianDirections.RomanianDirectionsTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianFamily.RomanianFamilyTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianFood.RomanianFoodTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianHouse.RomanianHouseTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianNumbers.RomanianNumbersTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianObjects.RomanianObjectsTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianOccupations.RomanianOccupationsTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianTime.RomanianTimeTrainingActivity
import com.isa.kapilanguagelearning.romanian.romanianWeather.RomanianWeatherTrainingActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity

class StartLearningRomanianActivity : AppCompatActivity () , AdapterView.OnItemClickListener
{
    private lateinit var preferences: SharedPreferences
    private var arrayList:ArrayList<RomanianChar> ? =null
    private var gridView:GridView ? = null
    private var romanianAdapters: RomanianAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_learning_romanian)

        gridView = findViewById(R.id.grid_view_romanian)
        arrayList = setDataList()
        romanianAdapters = RomanianAdapters(applicationContext, arrayList!!)
        gridView?.adapter = romanianAdapters
        gridView?.onItemClickListener = this

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
    }

    override fun onBackPressed()
    {
        val intent = Intent(this, LearningSelectorRomanianActivity::class.java)
        startActivity(intent)
    }

    private fun setDataList() : ArrayList<RomanianChar> {

        val arrayList:ArrayList<RomanianChar> = ArrayList()
        arrayList.add(RomanianChar(R.drawable.chowchow_one, "Basic"))
        arrayList.add(RomanianChar(R.drawable.icon_german_food, "Food"))
        arrayList.add(RomanianChar(R.drawable.chowchow_three, "Animals"))
        arrayList.add(RomanianChar(R.drawable.icon_german_family, "Family"))
        arrayList.add(RomanianChar(R.drawable.icon_german_house, "House"))
        arrayList.add(RomanianChar(R.drawable.icon_german_body, "Body"))
        arrayList.add(RomanianChar(R.drawable.icon_german_colors, "Colors"))
        arrayList.add(RomanianChar(R.drawable.icon_german_number, "Numbers"))
        arrayList.add(RomanianChar(R.drawable.icon_german_time, "Time"))
        arrayList.add(RomanianChar(R.drawable.icon_german_date, "Date"))
        arrayList.add(RomanianChar(R.drawable.icon_german_directions, "Directions"))
        arrayList.add(RomanianChar(R.drawable.icon_german_weather, "Weather"))
        arrayList.add(RomanianChar(R.drawable.icon_german_objects, "Objects"))
        arrayList.add(RomanianChar(R.drawable.icon_german_occupations, "Occupations"))
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
        val items: RomanianChar = arrayList!![position]
        Toast.makeText(applicationContext, items.alphaCharRomanian, Toast.LENGTH_SHORT).show()

        if (position == 0) //C1R1 Basic
        {
            val intent = Intent(this, RomanianBasicTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 1) //C2R1 Food
        {
            val intent = Intent(this, RomanianFoodTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 2) //C1R2 Animals
        {
            val intent = Intent(this, RomanianAnimalsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 3) //C2R2 Family
        {
            val intent = Intent(this, RomanianFamilyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 4) //C1R3 House
        {
            val intent = Intent(this, RomanianHouseTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 5) //C2R3 Body
        {
            val intent = Intent(this, RomanianBodyTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 6) //C1R4 Colors
        {
            val intent = Intent(this, RomanianColorsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 7) //C2R4 Numbers
        {
            val intent = Intent(this, RomanianNumbersTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 8) //C1R5 Time
        {
            val intent = Intent(this, RomanianTimeTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 9) //C2R5 Date
        {
            val intent = Intent(this, RomanianDateTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 10) //C1R6 Directions
        {
            val intent = Intent(this, RomanianDirectionsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 11) //C2R6 Weather
        {
            val intent = Intent(this, RomanianWeatherTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 12) //C1R7 Objects
        {
            val intent = Intent(this, RomanianObjectsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }

        if (position == 13) //C2R7 Occupations
        {
            val intent = Intent(this, RomanianOccupationsTrainingActivity::class.java)
            startActivity(intent)
            intent.putExtra("ItemPosition", position)
        }
    }
}