package com.isa.kapilanguagelearning.spanish.spanishChatBot

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.general.AboutAppActivity
import com.isa.kapilanguagelearning.general.AboutUserActivity
import com.isa.kapilanguagelearning.general.MainActivity
import com.isa.kapilanguagelearning.german.LearningSelectorGermanActivity
import com.isa.kapilanguagelearning.romanian.LearningSelectorRomanianActivity
import com.isa.kapilanguagelearning.spanish.LearningSelectorSpanishActivity
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.OPEN_GOOGLE
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.OPEN_SEARCH
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.RECEIVE_ID
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.SEND_ID
import kotlinx.android.synthetic.main.activity_spanish_chatbot.*
import kotlinx.coroutines.*

class SpanishChatBotActivity : AppCompatActivity() {
    var messagesList = mutableListOf<MessageSpanish>()
    private lateinit var preferences: SharedPreferences
    private lateinit var adapter: MessagingAdapterSpanish
    private val botList = listOf("Adalberto", "Sofía", "Adelaida", "Mateo", "Martín")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spanish_chatbot)

        recyclerView()

        clickEvents()

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val random = (0..3).random()
        customBotMessage("Hola! Me llamo ${botList[random]}. Le puedo ayudar en algo?")

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Chatbot")
        builder.setMessage("Things that you cand ask the bot: \n" +
                "- to flip the coin\n" +
                "- what time is it\n" +
                "- how he/she feels\n" +
                "- to search on Google\n" +
                "- to translate using Google\n")
        builder.setNeutralButton("OK") { _: DialogInterface, _: Int -> }
        builder.show()
    }

    private fun clickEvents() {

        //Send a message
        button_send_spanish.setOnClickListener {
            sendMessage()
        }

        //Scroll back to correct position when user clicks on text view
        edit_text_message_spanish.setOnClickListener {
            GlobalScope.launch {
                delay(100)

                withContext(Dispatchers.Main) {
                    recycler_view_messages_spanish.scrollToPosition(adapter.itemCount - 1)

                }
            }
        }
    }

    private fun recyclerView() {
        adapter = MessagingAdapterSpanish()
        recycler_view_messages_spanish.adapter = adapter
        recycler_view_messages_spanish.layoutManager = LinearLayoutManager(applicationContext)

    }

    override fun onStart() {
        super.onStart()
        //In case there are messages, scroll to bottom when re-opening app
        GlobalScope.launch {
            delay(100)
            withContext(Dispatchers.Main) {
                recycler_view_messages_spanish.scrollToPosition(adapter.itemCount - 1)
            }
        }
    }

    private fun sendMessage() {
        val message = edit_text_message_spanish.text.toString()
        val timeStamp = Time.timeStamp()

        if (message.isNotEmpty()) {
            //Adds it to our local list
            messagesList.add(MessageSpanish(message, SEND_ID, timeStamp))
            edit_text_message_spanish.setText("")

            adapter.insertMessage(MessageSpanish(message, SEND_ID, timeStamp))
            recycler_view_messages_spanish.scrollToPosition(adapter.itemCount - 1)

            botResponse(message)
        }
    }

    private fun botResponse(message: String) {
        val timeStamp = Time.timeStamp()

        GlobalScope.launch {
            //Fake response delay
            delay(1000)

            withContext(Dispatchers.Main) {
                //Gets the response
                val response = BotResponse.basicResponses(message)

                //Adds it to our local list
                messagesList.add(MessageSpanish(response, RECEIVE_ID, timeStamp))

                //Inserts our message into the adapter
                adapter.insertMessage(MessageSpanish(response, RECEIVE_ID, timeStamp))

                //Scrolls us to the position of the latest message
                recycler_view_messages_spanish.scrollToPosition(adapter.itemCount - 1)

                //Starts Google
                when (response) {
                    OPEN_GOOGLE -> {
                        val site = Intent(Intent.ACTION_VIEW)
                        site.data = Uri.parse("https://www.google.com/")
                        startActivity(site)
                    }
                    OPEN_SEARCH -> {
                        val site = Intent(Intent.ACTION_VIEW)
                        val searchTerm: String = message.substringAfterLast("search")
                        site.data = Uri.parse("https://www.google.com/search?&q=$searchTerm")
                        startActivity(site)
                    }

                }
            }
        }
    }

    private fun customBotMessage(message: String) {

        GlobalScope.launch {
            delay(1000)
            withContext(Dispatchers.Main) {
                val timeStamp = Time.timeStamp()
                messagesList.add(MessageSpanish(message, RECEIVE_ID, timeStamp))
                adapter.insertMessage(MessageSpanish(message, RECEIVE_ID, timeStamp))

                recycler_view_messages_spanish.scrollToPosition(adapter.itemCount - 1)
            }
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