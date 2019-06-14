package com.example.delllatitude5490.dz_now

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.delllatitude5490.dz_now.R.id.content
import kotlinx.android.synthetic.main.activity_reading.*


class ReadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)
        var data: Article = intent.getParcelableExtra("data") as Article

        date.text = data.date
//        content.text = data.content
        image.setImageDrawable(this.resources.getDrawable(data.imageView))
        tvTitle.text = data.title

        save.setOnClickListener {
            save.setImageResource ( R.drawable.img1);
        }
    }

}
