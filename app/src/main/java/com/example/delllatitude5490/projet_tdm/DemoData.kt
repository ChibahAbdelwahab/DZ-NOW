package com.example.delllatitude5490.projet_tdm

class DemoData{

    companion object {
        var list = ArrayList<Article>()
        var categories= ArrayList<String>()
        fun data(p0:Int): ArrayList<Article> {
            if(list.isEmpty()) loadData()
            //TODO Implement a filter
            return list
        }
        fun loadData(){
            list.add(Article("1","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("2","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("3","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("4","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("5","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("6","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("7","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("8","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))
            list.add(Article("9","Title", "date ", "lorem ipsum habibiw hqsdqs qsd qsdq sdqs dqs dqsd ", R.drawable.img1))

            categories.addAll(5, listOf("Politique","Culture","Sport","Medecine","Autres"))
        }
        fun categories(): ArrayList<String>{
            loadData()
            return categories
        }
    }
}