package com.example.delllatitude5490.dz_now

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomListAdapter(var mcontext: Context, var ressource: Int, var items: ArrayList<Article>) :
    ArrayAdapter<Article>(mcontext, ressource, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mcontext)
        val view :View = layoutInflater.inflate(ressource,null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val title:TextView= view.findViewById(R.id.title)
        val content: TextView = view.findViewById(R.id.content)
        val date:TextView= view.findViewById(R.id.date)

        var mItems = items.get(position)

        imageView.setImageDrawable(mcontext.resources.getDrawable(mItems.imageView))
        title.text = mItems.title
        content.text = mItems.content
        date.text = mItems.date


        return view
    }

}