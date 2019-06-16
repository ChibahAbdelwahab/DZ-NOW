package com.example.delllatitude5490.projet_tdm

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);

        var tabs = findViewById(R.id.tabs) as TabLayout
        var container = findViewById(R.id.container) as ViewPager
        val adapter = ViewPagerArticleAdapter(supportFragmentManager)

        container.adapter = adapter
        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(container)

        var index: Int = 0;
        var categories =DemoData.categories() as ArrayList<String>
        for (item in categories){
            val data= DemoData.data(index)
            adapter.addFragement(ArticleFragment.newInstance(data), item);
            index++;
        }
        adapter.notifyDataSetChanged()

    }


}
