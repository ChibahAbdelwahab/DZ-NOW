package com.example.delllatitude5490.projet_tdm

import android.content.res.ColorStateList
import android.graphics.Color
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.view.Menu


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        for(item in DemoData.categories){
            if(item.isSelected)
            {
                Log.e("a", item.name)
                tabs.addTab(tabs.newTab().setText(item.name))
            }
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

        for ((index, item) in DemoData.categories.withIndex()) {
            if(item.isSelected)
            {
                val data = DemoData.data(index)
                adapter.addFragement(ArticleFragment.newInstance(data), item.name)
            }
        }
        adapter.notifyDataSetChanged()
        var clicked = false
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.backgroundTintList = ColorStateList.valueOf(Color.LTGRAY)
        fab.setOnClickListener {
            clicked = !clicked
            if(clicked){
                fab.backgroundTintList = ColorStateList.valueOf(Color.YELLOW)
                Toast.makeText(applicationContext,getString(R.string.only_saved), Toast.LENGTH_SHORT).show()
            }
            else
                fab.backgroundTintList = ColorStateList.valueOf(Color.LTGRAY)
            for (item in adapter.lstFragment) {
                item.showOnlySaved(clicked)
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
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
