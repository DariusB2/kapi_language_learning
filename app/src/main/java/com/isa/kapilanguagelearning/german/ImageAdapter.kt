package com.isa.kapilanguagelearning.german

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R

class ImageAdapter (
    private val context: Context,
    private val images : List<Image>,
    private val listener : (Image) -> Unit
        ) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder> () {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSource = view.findViewById<ImageView>(R.id._image)
        private val title = view.findViewById<TextView>(R.id._title)
        fun bindView(image: Image, listener: (Image) -> Unit) {
            imageSource.setImageResource(image.imageSource)
            title.text = image.imageTitle
            itemView.setOnClickListener { listener(image)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image, parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size
}