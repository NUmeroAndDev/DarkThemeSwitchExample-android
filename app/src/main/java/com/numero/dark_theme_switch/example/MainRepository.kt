package com.numero.dark_theme_switch.example

import androidx.lifecycle.LiveData

interface MainRepository {
    fun readAny(timeMillis: Long): LiveData<Int>
}