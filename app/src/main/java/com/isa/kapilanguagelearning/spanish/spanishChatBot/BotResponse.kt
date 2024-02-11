package com.isa.kapilanguagelearning.spanish.spanishChatBot

import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.OPEN_GOOGLE
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {
            //Flips a coin
            message.contains("dar la vuelta") && message.contains("moneda")
                    || message.contains("lanzar") && message.contains("moneda")->
            {
                val r = (0..1).random()
                val result = if (r == 0) "cabeza" else "cruz"
                "Tiré la moneda y el resultado fue $result!"
            }

            //Hello
            message.contains("hola") || message.contains("bueno") || message.contains("buenos días")
                    || message.contains("buenos dias") ->
            {
                when (random) {
                    0 -> "Hola!"
                    1 -> "Bueno!"
                    2 -> "Buenos días!"
                    else -> "error"
                }
            }

            //Goodbye
            message.contains("adiós") || message.contains("adios") || message.contains("despedida") -> {
                when (random)
                {
                    0 -> "Adios!"
                    1 -> "Despedida!"
                    2 -> "Hasta mañana!"
                    else -> "error"
                }
            }

            //Goodbye night
            message.contains("buenas noches") || message.contains("felices sueños")
                    || message.contains("felices suenos") ->
            {
                when(random)
                {
                    0 -> "Buenas noches!"
                    1 -> "Nos vemos mañana!"
                    2 -> "Felices sueeños!"
                    3 -> "Hasta mañana!"
                    else -> "error"
                }
            }

            //How are you?
            message.contains("cómo estás") || message.contains("como estas?")
                    || message.contains("que estas haciendo")
                    || message.contains("qué pasa") || message.contains("que pasa") ->
            {
                when (random)
                {
                    0 -> "Estoy bien gracias!"
                    1 -> "Soy súper!"
                    2 -> "Excelente, y tú?"
                    else -> "error"
                }
            }

            //Feeling
            message.contains("bien") || message.contains("buena")
                    || message.contains("bonita") || message.contains("bonito")
                    || message.contains("belleza")
                    || message.contains("hermosa") || message.contains("hermoso")->
            {
                when (random)
                {
                    0 -> "Entiendo!"
                    1 -> "Estoy feliz por ti!"
                    2 -> "OK!"
                    else -> "error"
                }
            }

            //Thank you!
            message.contains("muchísimas gracias") || message.contains("muchisimas gracias")
                    || message.contains("gracias") || message.contains("muchas gracias") ->
            {
                when (random)
                {
                    0 -> "Eres bienvenido!"
                    1 -> "Con mucho gusto!"
                    2 -> "No hay problema! :)"
                    else -> "error"
                }
            }

            //What time is it?
            message.contains("hora") && message.contains("?") ->
            {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))
                date.toString()
            }

            //Ceva/altceva
            message.contains("alguna cosa") || message.contains("algo")
                    || message.contains("otra cosa") || message.contains("cosa") ->
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
            message.contains("hambre") || message.contains("hambrienta")
                    || message.contains("hambriento")->
            {
                when (random)
                {
                    0 -> "Sí!"
                    1 -> "No."
                    else -> "error"
                }
            }

            //Thirst
            message.contains("sedienta") || message.contains("sediento")
                    || message.contains("sed") ->
            {
                when (random)
                {
                    0 -> "Sí!"
                    1 -> "No."
                    else -> "error"
                }
            }

            //Open Google
            message.contains("abre") || message.contains("abierta") || message.contains("abierto")
                    && message.contains("google") ->
            {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("buscar") ->
            {
                OPEN_SEARCH
            }

            //Translate
            message.contains("que es") || message.contains("que significa")
                    || message.contains("definiendo") ->
            {
                OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else ->
            {
                when (random)
                {
                    0 -> "No lo sé..."
                    1 -> "Preguntame otra cosa."
                    2 -> "Puedes preguntarme otra cosa?"
                    else -> "error"
                }
            }
        }
    }
}