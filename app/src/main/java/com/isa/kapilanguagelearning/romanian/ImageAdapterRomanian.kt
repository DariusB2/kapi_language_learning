package com.isa.kapilanguagelearning.romanian

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R

class ImageAdapterRomanian (
    private val context: Context,
    private val images : List<ImageRomanian>,
    private val listener : (ImageRomanian) -> Unit
) : RecyclerView.Adapter<ImageAdapterRomanian.ImageViewHolder> () {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageSource = view.findViewById<ImageView>(R.id._image_romanian)
        private val title = view.findViewById<TextView>(R.id._title_romanian)
        fun bindView(image: ImageRomanian, listener: (ImageRomanian) -> Unit) {
            imageSource.setImageResource(image.imageSourceRomanian)
            title.text = image.imageTitleRomanian
            itemView.setOnClickListener { listener(image)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_image_romanian, parent, false))

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }

    override fun getItemCount(): Int = images.size

}