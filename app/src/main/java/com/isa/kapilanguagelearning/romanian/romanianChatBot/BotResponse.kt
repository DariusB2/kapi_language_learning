package com.isa.kapilanguagelearning.romanian.romanianChatBot

import com.isa.kapilanguagelearning.romanian.romanianChatBot.Constants.OPEN_GOOGLE
import com.isa.kapilanguagelearning.romanian.romanianChatBot.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {
            //Flips a coin
            message.contains("aruncă") && message.contains("banul")
                    || message.contains("arunca") && message.contains("banul")
                    || message.contains("arunca") && message.contains("moneda")
                    || message.contains("aruncă") && message.contains("moneda")->
            {
                val r = (0..1).random()
                val result = if (r == 0) "cap" else "pajură"
                "Am aruncat moneda și a iesit $result!"
            }

            //Hello
            message.contains("hello") || message.contains("ceau") || message.contains("buna ziua")
                    || message.contains("bună ziua") || message.contains("bună") || message.contains("buna")
                    || message.contains("salut") || message.contains("sal") || message.contains("sall") ->
            {
                when (random) {
                    0 -> "Ceau!"
                    1 -> "Bună!"
                    2 -> "Bună ziua!"
                    else -> "error"
                }
            }

            //Goodbye
            message.contains("pa") || message.contains("la revedere")  -> {
                when (random)
                {
                    0 -> "Paaa!"
                    1 -> "La revedere!"
                    2 -> "Ne auzim!"
                    else -> "error"
                }
            }

            //Goodbye night
            message.contains("noapte bună") || message.contains("noapte buna") || message.contains("somn usor")
                    || message.contains("somn ușor") ->
            {
                when(random)
                {
                    0 -> "Noapte bună!"
                    1 -> "Ne auzim mâine!"
                    2 -> "Somn ușor!"


                    else -> "error"
                }
            }

            //How are you?
            message.contains("ce faci") || message.contains("cf") || message.contains("cum esti")|| message.contains("cum ești") ->
            {
                when (random)
                {
                    0 -> "Sunt bine, mersi!"
                    1 -> "Îmi este foarte sete..."
                    2 -> "Mă simt perfect, tu cum ești?"
                    else -> "error"
                }
            }

            //Thank you!
            message.contains("multumesc") || message.contains("mulțumesc") || message.contains("mersi") || message.contains("ms") ->
            {
                when (random)
                {
                    0 -> "Cu plăcere!"
                    1 -> "Nici-o problemă! :)"
                    else -> "error"
                }
            }

            //Feeling
            message.contains("bine") || message.contains("bun") || message.contains("frumos") ->
            {
                when (random)
                {
                    0 -> "Am înțeles!"
                    1 -> "Mă bucur pentru tine!"
                    2 -> "OK!"
                    else -> "error"
                }
            }

            //What time is it?
            message.contains("ceas") || message.contains("ceasul") ->
            {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))
                date.toString()
            }

            //Ceva/altceva
            message.contains("ceva") || message.contains("atceva") ->
            {
                when (random)
                {
                    0 -> "Româna este tare!"
                    1 -> "În România se află munții Carpați."
                    2 -> "România are ieșire la marea Neagră!"
                    0 -> "Limba română este înrudită cu franceza, italiana, spaniola și portugheza."
                    else -> "error"
                }
            }

            //Hungry
            message.contains("foame") || message.contains("foamete")
                    || message.contains("infometat") || message.contains("înfometat") ->
            {
                when (random)
                {
                    0 -> "Daa!"
                    1 -> "Nu."
                    else -> "error"
                }
            }

            //Thirst
            message.contains("sete") || message.contains("setos") ->
            {
                when (random)
                {
                    0 -> "Ja!"
                    1 -> "Nein."
                    else -> "error"
                }
            }

            //Open Google
            message.contains("deschide") && message.contains("google") ->
            {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("caută") || message.contains("cauta")->
            {
                OPEN_SEARCH
            }

            //Translate
            message.contains("ce este") || message.contains("ce inseamna")
                    || message.contains("ce înseamnă") || message.contains("defineste")
                    || message.contains("definește")->
            {
                OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else ->
            {
                when (random)
                {
                    0 -> "Nu știu..."
                    1 -> "Întreabă-mă altceva."
                    2 -> "Poți să îmi pui altă întrebare?"
                    else -> "error"
                }
            }
        }
    }
}