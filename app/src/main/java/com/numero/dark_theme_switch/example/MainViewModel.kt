package com.numero.dark_theme_switch.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    private val actionLiveData: MutableLiveData<Long> = MutableLiveData()
    val countLiveData: LiveData<Int> = actionLiveData.switchMap {
        repository.readAny(it)
    }

    fun executeLoadAny(timeMillis: Long) {
        actionLiveData.value = timeMillis
    }
}