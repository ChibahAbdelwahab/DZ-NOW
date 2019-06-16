package com.example.delllatitude5490.projet_tdm

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerArticleAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    private var lstTitles: ArrayList<String> = ArrayList<String>();

    var lstFragment: ArrayList<ArticleFragment> = ArrayList();
    override fun getItem(p0: Int): Fragment {
        return lstFragment[p0]
    }


    override fun getCount(): Int {
        return lstTitles.size;
    }

    fun addFragement(fragment: ArticleFragment, title: String) {
        lstFragment.add(fragment)
        lstTitles.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return lstTitles.get(position)
    }

}