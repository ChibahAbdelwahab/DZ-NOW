package com.example.delllatitude5490.projet_tdm

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_article.*
import kotlinx.android.synthetic.main.fragment_article.view.*
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast


class ArticleFragment : Fragment() {
    private var list: ArrayList<Article> = ArrayList()
    private var clickedItem: Int = 0
    private var adapter: ArticleListAdapter? = null
    private var defaultList: ArrayList<Article> = ArrayList()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        defaultList = arguments?.getParcelableArrayList<Article>("data")!!
        list = ArrayList(defaultList)
        var view = inflater!!.inflate(R.layout.fragment_article, container, false)
        adapter = ArticleListAdapter(activity!!.baseContext, list, clickListener = View.OnClickListener {
            val itemPosition = view.recyclerView.getChildLayoutPosition(it)
            val item = list[itemPosition]

            val intent = Intent(activity, ReadingActivity::class.java)
            intent.putExtra("data", item)
            clickedItem = itemPosition
            activity?.startActivityForResult(intent, Activity.RESULT_OK)
        })
        view.recyclerView.adapter = adapter

        view.recyclerView.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        view.recyclerView.layoutManager = linearLayoutManager

        return view
    }

    fun showOnlySaved(saved: Boolean) {
        list.clear()
        if (saved)
            for (item in defaultList) {
                if (item.saved == "true")
                    list.add(item)
            }
        else
            list.addAll(defaultList)

        if (adapter !=null)
            adapter!!.notifyDataSetChanged()
    }

    companion object {
        fun newInstance(p0: java.util.ArrayList<Article>): ArticleFragment {
            val args = Bundle()
            args.putParcelableArrayList("data", p0)
            val fragment = ArticleFragment()
            fragment.arguments = args
            return fragment
        }
    }


}

