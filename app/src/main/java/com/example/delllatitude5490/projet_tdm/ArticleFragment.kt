package com.example.delllatitude5490.projet_tdm

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_article.view.*

class ArticleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var list = mutableListOf<Article>()

        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
        list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))

        val view = inflater!!.inflate(R.layout.fragment_article, container, false)
        view.listView.adapter = CustomListAdapter(this!!.activity!!, R.layout.customlistitem, list)
        return view
    }
}