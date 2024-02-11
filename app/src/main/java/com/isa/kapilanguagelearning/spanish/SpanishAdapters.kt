package com.isa.kapilanguagelearning.spanish

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R


class SpanishAdapters(var context: Context, var arrayList: ArrayList<SpanishChar>) : BaseAdapter() {


    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.image_view_categories_spanish)
        var alphas = itemView.findViewById<TextView>(R.id.text_view_categories_spanish)
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.activity_grid_layout_list_item_spanish, null)
        var icons:ImageView = view.findViewById(R.id.image_view_categories_spanish)
        var names:TextView = view.findViewById(R.id.text_view_categories_spanish)

        var listItem: SpanishChar = arrayList.get(position)

        icons.setImageResource(listItem.iconsCharSpanish!!)
        names.text = listItem.alphaCharSpanish

        return view
    }
}