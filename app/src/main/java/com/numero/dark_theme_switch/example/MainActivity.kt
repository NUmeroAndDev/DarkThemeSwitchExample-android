package com.numero.dark_theme_switch.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.observe
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyAppTheme(false)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        setupObserve()
        mainViewModel.executeLoadAny(2000)

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

    private fun setupObserve() {
        mainViewModel.countLiveData.observe(this) {
            Log.d("Log:MainActivity", "Called observe : count $it")
        }
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
