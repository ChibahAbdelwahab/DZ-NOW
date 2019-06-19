package com.example.delllatitude5490.projet_tdm

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class ArticleListAdapter(
    val context: Context,
    var list: List<Article>,
    val clickListener: View.OnClickListener
) : RecyclerView.Adapter<ArticleListAdapter.ArticleViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ArticleViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.customlistitem, p0, false)
        return ArticleViewHolder(v)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ArticleViewHolder, p1: Int) {
        val article: Article = list[p1]
        p0.title.text = article.title
        p0.date.text = article.date
        p0.content.text = article.content
        p0.image.setImageDrawable(context.getDrawable(article.imageView))
        if (article.saved == "true"){
            p0.bookmark.visibility = View.VISIBLE
        }
        else
            p0.bookmark.setVisibility(View.INVISIBLE)

        p0.itemView.setOnClickListener(clickListener)
    }

    class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title = itemView.findViewById(R.id.title) as TextView
        var content = itemView.findViewById(R.id.content) as TextView
        var date = itemView.findViewById(R.id.date) as TextView
        val image = itemView.findViewById(R.id.image) as ImageView
        val bookmark = itemView.findViewById(R.id.bookmark) as ImageView
    }
}