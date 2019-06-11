package com.numero.dark_theme_switch.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyAppTheme(false)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        Log.d("Log:MainActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log:MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Log:MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Log:MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log:MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log:MainActivity", "onDestroy")
    }

    private fun applyAppTheme(isNight: Boolean) {
        val mode = if (isNight) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }
        AppCompatDelegate.setDefaultNightMode(mode)
    }

}
