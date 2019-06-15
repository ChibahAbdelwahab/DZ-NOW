package com.example.delllatitude5490.projet_tdm

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        for(item in DemoData.categories()){
            tabs.addTab(tabs.newTab().setText(item.toString()))
        }

        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {
                container.currentItem = p0?.position!!
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
            }

        })

        val adapter = ViewPagerArticleAdapter(baseContext, supportFragmentManager, tabs.tabCount)
        container.adapter = adapter
        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        var onlysaved :Boolean = false;
        floatingActionButton.setOnClickListener({
            onlysaved=!onlysaved
            container.adapter= ViewPagerArticleAdapter(baseContext, supportFragmentManager, tabs.tabCount)
        })
    }


}
