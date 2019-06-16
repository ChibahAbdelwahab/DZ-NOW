package com.example.delllatitude5490.projet_tdm

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var tabs = findViewById<TabLayout>(R.id.tabs)
        var container = findViewById<ViewPager>(R.id.container)
        val adapter = ViewPagerArticleAdapter(supportFragmentManager)

        container.adapter = adapter
        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(container)

        var categories = DemoData.categories()
        for ((index, item) in categories.withIndex()) {
            val data = DemoData.data(index)
            adapter.addFragement(ArticleFragment.newInstance(data), item)
        }
        adapter.notifyDataSetChanged()
        var clicked = false
        fab.setOnClickListener {
            clicked = !clicked
            if(clicked)
                fab.setBackgroundColor(Color.YELLOW)
            else
                fab.setBackgroundColor(Color.GRAY)
            for (item in adapter.lstFragment) {
                item.showOnlySaved(clicked)
            }
        }
    }


}
