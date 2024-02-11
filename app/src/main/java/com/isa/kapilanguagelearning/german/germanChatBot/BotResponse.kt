package com.isa.kapilanguagelearning.german.germanChatBot

import android.annotation.SuppressLint
import com.isa.kapilanguagelearning.german.germanChatBot.Constants.OPEN_GOOGLE
import com.isa.kapilanguagelearning.german.germanChatBot.Constants.OPEN_SEARCH
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

object BotResponse {

    @SuppressLint("SimpleDateFormat")
    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message = _message.toLowerCase(Locale.ROOT)

        return when
        {
            //Flips a coin
            message.contains("flip") && message.contains("münze") ->
            {
                val r = (0..1).random()
                val result = if (r == 0) "Köpfen" else "Schwänzen"
                "Ich warf eine Münze und sie landete auf $result"
            }

            //Hello
            message.contains("hello") || message.contains("hallo") || message.contains("guten tag") ->
            {
                when (random)
                {
                    0 -> "Hallo!"
                    1 -> "Guten Tag!"
                    2 -> "Was ist los?"
                    else -> "error"
                }
            }

            //Goodbye
            message.contains("ciao") || message.contains("auf wiedersehen") || message.contains("tschüss")->
            {
                when (random)
                {
                    0 -> "Tschüss!"
                    1 -> "Auf Wiedersehen!"
                    2 -> "Bis bald!"
                    3 -> "Ciao!"
                    else -> "error"
                }
            }

            //Goodbye night
            message.contains("gute nacht") || message.contains("süße träume") || message.contains("susse traume")
                    || message.contains("suße traume") ->
            {
                when(random)
                {
                    0 -> "Gute Nacht!"
                    1 -> "Süße Träume!"
                    2 -> "Schlaf gut!"


                    else -> "error"
                }
            }

            //How are you?
            message.contains("wie geht es dir") || message.contains("wie geht's") ->
            {
                when (random)
                {
                    0 -> "Mir geht es gut, Danke!"
                    1 -> "Ich habe Hunger..."
                    2 -> "Ziemlich gut! Wie ist es mit Ihnen?"
                    else -> "error"
                }
            }

            //Thank you!
            message.contains("danke") || message.contains("vielen dank") || message.contains("danke schön") ->
            {
                when (random)
                {
                    0 -> "Bitte!"
                    1 -> "Bitte schön!"
                    2 -> "Kein Problem! :)"
                    else -> "error"
                }
            }

            //Feeling
            message.contains("gut") || message.contains("nett") || message.contains("schön") ->
            {
                when (random)
                {
                    0 -> "Alles klar!"
                    1 -> "Das ist Nett!"
                    2 -> "OK!"
                    3 ->  "Ich fühle mich gut für dich!"
                    else -> "error"
                }
            }

            //What time is it?
            message.contains("zeit") || message.contains("uhr") && message.contains("?")->
            {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))
                date.toString()
            }

            //Ceva/altceva
            message.contains("etwas") || message.contains("etwas anderes")
                    || message.contains("Sache") || message.contains("sache") ->
            {
                when (random)
                {
                    0 -> "Deutsch macht Spaß!"
                    1 -> "Das Wetter ist schön."
                    2 -> "Ich arbeite für Kapi."
                    else -> "error"
                }
            }

            //Hungry
            message.contains("hungrig") || message.contains("hungernd")
                    || message.contains("Hunger") || message.contains("hunger") ->
            {
                when (random)
                {
                    0 -> "Ja!"
                    1 -> "Nein."
                    else -> "error"
                }
            }

            //Thirst
            message.contains("durstig") ->
            {
                when (random)
                {
                    0 -> "Ja!"
                    1 -> "Nein."
                    else -> "error"
                }
            }

            //Open Google
            message.contains("öffnen") && message.contains("google") || message.contains("open") && message.contains("google")->
            {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search") || message.contains("suche")->
            {
                OPEN_SEARCH
            }

            //Translate
            message.contains("was ist") || message.contains("was bedeutet")
                    || message.contains("definieren")->
            {
                Constants.OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else ->
            {
                when (random)
                {
                    0 -> "Ich verstehe nicht..."
                    1 -> "Fragen Sie mich etwas anderes."
                    2 -> "Ich weiß nicht!"
                    else -> "error"
                }
            }
        }
    }
}