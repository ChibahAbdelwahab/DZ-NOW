package com.example.delllatitude5490.dz_now

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class ViewPagerArticleAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) :
    FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): ArticleFragment{
        return ArticleFragment.newInstance(p0)
    }

    override fun getCount(): Int {
       return totalTabs
    }

}