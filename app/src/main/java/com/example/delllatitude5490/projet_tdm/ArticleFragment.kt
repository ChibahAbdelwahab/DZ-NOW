package com.example.delllatitude5490.projet_tdm

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_article.*
import kotlinx.android.synthetic.main.fragment_article.view.*


class ArticleFragment : Fragment() {
    private lateinit var list: ArrayList<Article>;
    private var clickedItem: Int = 0;
    private var adapter: ArticleListAdapter? = null;
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        list = arguments?.getParcelableArrayList<Article>("data")!!
        var view = inflater!!.inflate(R.layout.fragment_article, container, false)
        adapter = ArticleListAdapter(list)
        view.recyclerView.adapter = adapter
        view.recyclerView.setOnClickListener {
            val itemPosition = recyclerView.getChildLayoutPosition(view)
            val item = list.get(itemPosition)

            val intent = Intent(activity, ReadingActivity::class.java)
            intent.putExtra("data", item)
            clickedItem = itemPosition
            activity?.startActivityForResult(intent, Activity.RESULT_OK)

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

    override fun onResume() {
        super.onResume()
        adapter?.notifyDataSetChanged()
    }
}