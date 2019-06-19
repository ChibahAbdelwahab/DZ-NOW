package com.example.delllatitude5490.projet_tdm

import android.content.res.ColorStateList
import android.graphics.Color
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.content.ContextCompat.getSystemService
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        for(item in DemoData.categories){
            if(item.isSelected)
            tabs.addTab(tabs.newTab().setText(item.name))
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

        val adapter = ViewPagerArticleAdapter(supportFragmentManager)
        container.adapter = adapter
        container.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.setupWithViewPager(container)

        var categories = DemoData.categories
        for ((index, item) in categories.withIndex()) {
            val data = DemoData.data(index)
            adapter.addFragement(ArticleFragment.newInstance(data), item.name)
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
                adapter.notifyDataSetChanged()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if(container.adapter!= null)
            container.adapter!!.notifyDataSetChanged()
    }

    fun goToSetting(item: MenuItem) {
        val i = Intent(this, SettingsActivity::class.java)
        startActivity(i);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
