package com.example.delllatitude5490.projet_tdm

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_article.view.*

class ArticleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var list: ArrayList<Article> = arguments?.getParcelableArrayList<Article>("data")!!
        val view = inflater!!.inflate(R.layout.fragment_article, container, false)
        view.listView.adapter = CustomListAdapter(this!!.activity!!, R.layout.customlistitem, list)
        Toast.makeText(activity, "inside", Toast.LENGTH_SHORT).show()
        return view
    }

    companion object {

        fun newInstance(p0:Int): ArticleFragment {

            val args = Bundle()
            args.putParcelableArrayList("data", DemoData.data(p0))

            val fragment = ArticleFragment()
            fragment.arguments = args
            return fragment
        }
    }
}