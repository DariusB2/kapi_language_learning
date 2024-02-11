package com.isa.kapilanguagelearning.spanish

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R

class ImageAdapterSpanish (
    private val context: Context,
    private val images : List<ImageSpanish>,
    private val listener : (ImageSpanish) -> Unit
) : RecyclerView.Adapter<ImageAdapterSpanish.ImageViewHolder> () {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSource = view.findViewById<ImageView>(R.id._image_spanish)
        private val title = view.findViewById<TextView>(R.id._title_spanish)
        fun bindView(image: ImageSpanish, listener: (ImageSpanish) -> Unit) {
            imageSource.setImageResource(image.imageSourceSpanish)
            title.text = image.imageTitleSpanish
            itemView.setOnClickListener { listener(image)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image_spanish, parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size

}