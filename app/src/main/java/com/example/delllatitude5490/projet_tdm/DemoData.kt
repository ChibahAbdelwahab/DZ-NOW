package com.example.delllatitude5490.projet_tdm

import android.content.Context
import android.content.res.Resources
import android.util.Log
import java.io.BufferedReader
import java.io.File
import java.util.*
import com.google.gson.Gson
import kotlin.collections.ArrayList

class DemoData(val context: Context) {


    companion object {
        var list = ArrayList<Article>()
        var categories = ArrayList<Category>()
        init {
            categories.add(Category(App.context!!.getString(R.string.sport),true,R.drawable.img1));
            categories.add(Category(App.context!!.getString(R.string.technologie),true,R.drawable.img1))
            categories.add(Category(App.context!!.getString(R.string.medecine),true,R.drawable.img1))
            categories.add(Category(App.context!!.getString(R.string.economie),true,R.drawable.img1))
            categories.add(Category(App.context!!.getString(R.string.politique),true,R.drawable.img1))
            categories.add(Category(App.context!!.getString(R.string.others),true,R.drawable.img1))
        }

        fun data(p0: Int): ArrayList<Article> {
            if (list.isEmpty()) loadData()
            //TODO Implement a filter
            return ArrayList<Article>(list.filter { s -> s.category.equals(p0.toString()) })
        }

        fun loadData() {
            list.add(
                Article(
                    1,
                    "false",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    2,
                    "false",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    3,
                    "false",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    4,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    5,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    6,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    7,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    8,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    9,
                    "true",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    10,
                    "2",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    11,
                    "2",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    12,
                    "2",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    13,
                    "3",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    14,
                    "3",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    15,
                    "3",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    16,
                    "4",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    17,
                    "5",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    18,
                    "5",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    19,
                    "5",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    20,
                    "6",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    21,
                    "7",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "false", R.drawable.img1
                )
            )
            list.add(
                Article(
                    22,
                    "8",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "true", R.drawable.img1
                )
            )
            list.add(
                Article(
                    23,
                    "9",
                    "Title",
                    "01-01-2019 ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "true",
                    R.drawable.img1
                )
            )


        }

        //TODO Activate/desactivate categories
        fun categories(): ArrayList<Category> {
            return this.categories
        }

        fun setSelected(position:Int, selected:Boolean) {
            categories[position].isSelected = selected
            Log.e("Categorieeee", "$position  $selected")
        }

    }

}