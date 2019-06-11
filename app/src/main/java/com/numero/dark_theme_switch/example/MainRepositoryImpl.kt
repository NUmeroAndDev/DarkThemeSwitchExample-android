package com.numero.dark_theme_switch.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

class MainRepositoryImpl : MainRepository {

    private var count: Int = 0

    override fun readAny(timeMillis: Long): LiveData<Int> = liveData(Dispatchers.IO) {
        delay(timeMillis)
        emit(count)
        count++
    }
}