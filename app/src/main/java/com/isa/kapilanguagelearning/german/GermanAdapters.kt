package com.isa.kapilanguagelearning.german

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R


class GermanAdapters(var context: Context, var arrayList: ArrayList<GermanChar>) : BaseAdapter() {


    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons: ImageView = itemView.findViewById(R.id.image_view_categories_german)
        var alphas = itemView.findViewById<TextView>(R.id.text_view_categories_german)
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = View.inflate(context, R.layout.activity_grid_layout_list_item, null)
        val icons:ImageView = view.findViewById(R.id.image_view_categories_german)
        val names:TextView = view.findViewById(R.id.text_view_categories_german)

        val listItem: GermanChar = arrayList[position]

        icons.setImageResource(listItem.iconsCharGerman!!)
        names.text = listItem.alphaCharGerman

        return view
    }
}