package com.example.delllatitude5490.projet_tdm

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reading.*
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
        var saved: Boolean = data.saved.toBoolean()
        article_is_saved(saved)

        btn_save.setOnClickListener {
            saved = !saved
            data.saved = saved.toString()
            article_is_saved(saved)
            val resultIntent = Intent()
            data.saved = saved.toString()
            DemoData.list[data.id - 1].saved = saved.toString()
            if (saved)
                Toast.makeText(getApplicationContext(), getString(R.string.article_was_saved), Toast.LENGTH_SHORT).show();

        }
        btn_share1.setOnClickListener{
            Toast.makeText(getApplicationContext(), getString(R.string.available_next_version), Toast.LENGTH_SHORT).show();
        }
        btn_share2.setOnClickListener{
            Toast.makeText(getApplicationContext(), getString(R.string.available_next_version), Toast.LENGTH_SHORT).show();
        }
        btn_share3.setOnClickListener{
            Toast.makeText(getApplicationContext(), getString(R.string.available_next_version), Toast.LENGTH_SHORT).show();
        }
    }


    fun article_is_saved(saved: Boolean) {
        if (saved) btn_save.setImageResource(android.R.drawable.btn_star_big_on)
        else btn_save.setImageResource(android.R.drawable.btn_star_big_off)
    }

}
