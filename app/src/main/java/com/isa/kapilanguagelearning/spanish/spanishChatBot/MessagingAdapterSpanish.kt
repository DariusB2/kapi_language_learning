package com.isa.kapilanguagelearning.spanish.spanishChatBot

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.RECEIVE_ID
import com.isa.kapilanguagelearning.spanish.spanishChatBot.Constants.SEND_ID
import kotlinx.android.synthetic.main.activity_spanish_message_item.view.*

class MessagingAdapterSpanish: RecyclerView.Adapter<MessagingAdapterSpanish.MessageViewHolder>() {

    var messagesList = mutableListOf<MessageSpanish>()

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {

                //Remove message on the item clicked
                messagesList.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_spanish_message_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return messagesList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]

        when (currentMessage.id_spanish) {
            SEND_ID -> {
                holder.itemView.text_view_spanish_message.apply {
                    text = currentMessage.message_spanish
                    visibility = View.VISIBLE
                }
                holder.itemView.text_view_spanish_bot_message.visibility = View.GONE
            }
            RECEIVE_ID -> {
                holder.itemView.text_view_spanish_bot_message.apply {
                    text = currentMessage.message_spanish
                    visibility = View.VISIBLE
                }
                holder.itemView.text_view_spanish_message.visibility = View.GONE
            }
        }
    }

    fun insertMessage(message_spanish: MessageSpanish) {
        this.messagesList.add(message_spanish)
        notifyItemInserted(messagesList.size)
    }
}