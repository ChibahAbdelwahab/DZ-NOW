package com.example.delllatitude5490.projet_tdm

import android.support.v4.app.FragmentPagerAdapter
import android.content.Context;
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class ViewPagerArticleAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) :
    FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
        return ArticleFragment()
    }

    override fun getCount(): Int {
       return totalTabs
    }

}