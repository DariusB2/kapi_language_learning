package com.isa.kapilanguagelearning.romanian

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isa.kapilanguagelearning.R


class RomanianAdapters(var context: Context, var arrayList: ArrayList<RomanianChar>) : BaseAdapter() {


    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.image_view_categories_romanian)
        var alphas = itemView.findViewById<TextView>(R.id.text_view_categories_romanian)
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
        var view:View = View.inflate(context, R.layout.activity_grid_layout_list_item_romanian, null)
        var icons:ImageView = view.findViewById(R.id.image_view_categories_romanian)
        var names:TextView = view.findViewById(R.id.text_view_categories_romanian)

        var listItem: RomanianChar = arrayList.get(position)

        icons.setImageResource(listItem.iconsCharRomanian!!)
        names.text = listItem.alphaCharRomanian

        return view
    }
}