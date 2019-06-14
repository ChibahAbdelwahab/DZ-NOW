package com.example.delllatitude5490.projet_tdm

import android.app.FragmentManager
import android.support.v7.app.FragmentPagerAdapter

import android.content.Context;

class ViewPagerArticleAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) :
    FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): ArticleFragment{
        return ArticleFragment.newInstance(p0)
    }

    override fun getCount(): Int {
       return totalTabs
    }

}