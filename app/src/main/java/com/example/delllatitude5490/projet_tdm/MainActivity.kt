package com.example.delllatitude5490.projet_tdm

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
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
        var fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
        fab.setOnClickListener {
            clicked = !clicked
            if(clicked){
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
                Toast.makeText(getApplicationContext(),getString(R.string.only_saved), Toast.LENGTH_SHORT).show();
            }
            else
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY));
            for (item in adapter.lstFragment) {
                item.showOnlySaved(clicked)
            }
        }
    }


}
