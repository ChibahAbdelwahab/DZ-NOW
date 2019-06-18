package com.example.delllatitude5490.projet_tdm

import android.app.Fragment
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import SettingsScreen

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        var fragment: Fragment = SettingsScreen()
        val fragmentTransaction = fragmentManager.beginTransaction()
        if (savedInstanceState == null) {
            fragmentTransaction.add(R.id.relative_layout, fragment, "settings_fragment")
            fragmentTransaction.commit()
        } else {
            fragment = fragmentManager.findFragmentByTag("settings_fragment")
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
    }


}


