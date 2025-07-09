package com.example.androidmvvm06weatherapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidmvvm06weatherapp.api.Constant
import com.example.androidmvvm06weatherapp.api.NetworkResponse
import com.example.androidmvvm06weatherapp.api.RetrofitInstance
import com.example.androidmvvm06weatherapp.api.WeatherModel
import kotlinx.coroutines.launch
import java.io.IOException

class AppViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherResult = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherResult: LiveData<NetworkResponse<WeatherModel>> = _weatherResult

    fun getData(city: String) {
        _weatherResult.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(
                    Constant.apiKey,
                    city
                )
                if (response.isSuccessful) {
                    Log.d("appViewModel", "Response: ${response.body().toString()}")
                    response.body()?.let {
                        _weatherResult.value = NetworkResponse.Success(it)
                    }
                } else {
                    Log.d("appViewModel", "Errors: ${response.message()}")
                    _weatherResult.value = NetworkResponse.Error("Failed to load data.")
                }
            } catch (e: IOException) {
                Log.e("Network", "Network error: ${e.message}")
                _weatherResult.value = NetworkResponse.Error("Failed to load data.")
            } catch (e: Exception) {
                Log.e("General", "Unknown error: ${e.message}")
                _weatherResult.value = NetworkResponse.Error("Failed to load data.")
            }
        }
    }
}
