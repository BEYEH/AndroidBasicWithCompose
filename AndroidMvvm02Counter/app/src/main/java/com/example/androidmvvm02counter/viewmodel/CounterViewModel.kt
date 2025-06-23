package com.example.androidmvvm02counter.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidmvvm02counter.model.CounterData
import com.example.androidmvvm02counter.model.CounterRepo
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {
    val counterRepo: CounterRepo = CounterRepo()

    // UI state exposure
    // Observables data holder: state flow, live data
    private val _counterData = MutableLiveData<CounterData>()

    // Expose the data
    val counterData: LiveData<CounterData> = _counterData

    // UI state production
    fun increment() {
        viewModelScope.launch {
            val counterResult = counterRepo.updateCounter(1)
            _counterData.postValue(counterResult)
        }
    }
    fun decrement() {
        viewModelScope.launch {
            val counterResult = counterRepo.updateCounter(-1)
            _counterData.postValue(counterResult)
        }
    }
}