package com.example.androidmvvm06weatherapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {

    fun getData(city: String) {
        Log.d("appViewModel", city)
    }
}