package com.example.delllatitude5490.projet_tdm

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_reading.*
import kotlinx.android.synthetic.main.activity_reading.view.*
import kotlinx.android.synthetic.main.content_reading.*

class ReadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)
        var data: Article = intent.getParcelableExtra("data") as Article

        date.text = data.date
        content.text = data.content
        image.setImageDrawable(this.resources.getDrawable(data.imageView))
        tvTitle.text = data.title
    }
}
