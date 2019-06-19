package com.example.delllatitude5490.projet_tdm

import android.os.Bundle
import android.preference.CheckBoxPreference
import android.preference.Preference
import android.preference.PreferenceCategory
import android.preference.PreferenceFragment

class SettingsScreen : PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityContext = activity
        val preferenceScreen = preferenceManager.createPreferenceScreen(activityContext)
        setPreferenceScreen(preferenceScreen)

        val preferenceCategory = PreferenceCategory(activityContext)
        preferenceCategory.title = "Selectionne les catégories à afficher"
        addPreferencesFromResource(R.xml.settings_screen)

        getPreferenceScreen().addPreference(preferenceCategory)
        var indice = 0
        DemoData.categories.forEach {
            val checkbox = CheckBoxPreference(activity)
            checkbox.key= indice.toString()
            checkbox.title = it.name
            checkbox.isChecked = it.isSelected
            checkbox.onPreferenceChangeListener = object : Preference.OnPreferenceChangeListener {
                override fun onPreferenceChange(pref: Preference, `val`: Any): Boolean {
                    val checkBoxVal = `val` as Boolean
                    DemoData.setSelected(pref.key.toInt(), checkBoxVal)
                    return true // Finally, let the checkbox value go through to update itself
                }
            }
            preferenceCategory.addPreference(checkbox)
            indice++
        }

    }


}
