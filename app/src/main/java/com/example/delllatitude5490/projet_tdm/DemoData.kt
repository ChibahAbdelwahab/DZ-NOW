package com.example.delllatitude5490.projet_tdm

import java.util.*

class DemoData {

    companion object {
        var list = ArrayList<Article>()
        var categories = ArrayList<String>()
        fun data(p0: Int): ArrayList<Article> {
            if (list.isEmpty()) loadData()
            //TODO Implement a filter
            return ArrayList<Article>(list.filter { s -> s.category.equals(p0.toString()) })
        }

        fun loadData() {
            list.add(
                Article(
                    "0",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "0",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "0",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "1",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "2",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "2",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "2",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "3",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "3",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "3",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "4",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "5",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "5",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "5",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "6",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "7",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "8",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0", R.drawable.img1
                )
            )
            list.add(
                Article(
                    "9",
                    "Title",
                    "date ",
                    "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ",
                    "0",
                    R.drawable.img1
                )
            )


        }

        //TODO Activate/desactivate categories
        fun categories(): ArrayList<String> {
            categories.add("Sport")
            categories.add("Technologie")
            categories.add("Medecine")
            categories.add("Economie")
            categories.add("Politique")
            categories.add("Autres")
            categories.add("Sauvegardés")
            return categories
        }
    }
}