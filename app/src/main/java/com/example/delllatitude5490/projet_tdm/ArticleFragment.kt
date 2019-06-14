package com.example.delllatitude5490.projet_tdm

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import kotlinx.android.synthetic.main.fragment_article.view.*


class ArticleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var list: ArrayList<Article> = arguments?.getParcelableArrayList<Article>("data")!!
        val view = inflater!!.inflate(R.layout.fragment_article, container, false)
        view.listView.adapter = CustomListAdapter(this!!.activity!!, R.layout.customlistitem, list)

        view.listView.setOnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val intent = Intent(activity, ReadingActivity::class.java)
            intent.putExtra("data",list.get(position))
            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(p0: Int): ArticleFragment {

            val args = Bundle()
            args.putParcelableArrayList("data", DemoData.data(p0))

            val fragment = ArticleFragment()
            fragment.arguments = args
            return fragment
        }
    }
}