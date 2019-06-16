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
import com.example.delllatitude5490.projet_tdm.R.id.recyclerView
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast


class ArticleFragment() : Fragment() {
    private lateinit var list: ArrayList<Article>;
    private var clickedItem: Int = 0;
    private var adapter: ArticleListAdapter? = null;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        list = arguments?.getParcelableArrayList<Article>("data")!!

        var view = inflater!!.inflate(R.layout.fragment_article, container, false)
        adapter = ArticleListAdapter(activity!!.baseContext, list,clickListener = {clickedItem(it)})
        view.recyclerView.adapter = adapter

        view.recyclerView.setHasFixedSize(true);
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        view.recyclerView.layoutManager = linearLayoutManager


        view.recyclerView.setOnClickListener() {
            val itemPosition = recyclerView.getChildLayoutPosition(view)
            val item = list.get(itemPosition)

            val intent = Intent(activity, ReadingActivity::class.java)
            intent.putExtra("data", item)
            clickedItem = itemPosition
            activity?.startActivityForResult(intent, Activity.RESULT_OK)
            Toast.makeText(context, "Hello toast!" + item.date, Toast.LENGTH_SHORT).show();
        }
        return view
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

    override fun onResume() {
        super.onResume()
        adapter?.notifyDataSetChanged()
    }

    fun itemClicked(position:Int){
        Toast.makeText(context, "Hello toast!" , Toast.LENGTH_SHORT).show();
    }


}

private operator fun Int.invoke(it: Int) {

}
