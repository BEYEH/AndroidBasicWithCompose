package com.example.androidmvvm06weatherapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidmvvm06weatherapp.api.Constant
import com.example.androidmvvm06weatherapp.api.RetrofitInstance
import kotlinx.coroutines.launch

class AppViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi

    fun getData(city: String) {
        viewModelScope.launch {
            val response = weatherApi.getWeather(
                Constant.apiKey,
                city
            )

            if (response.isSuccessful){
                Log.d("appViewModel", "Response: ${response.body().toString()}")
            }else{
                Log.d("appViewModel", "Errors: ${response.message()}")
            }
        }
    }
}
