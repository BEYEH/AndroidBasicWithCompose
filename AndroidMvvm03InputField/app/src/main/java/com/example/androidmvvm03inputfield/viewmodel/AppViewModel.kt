package com.example.androidmvvm03inputfield.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _inputText = MutableLiveData("")
    val inputText: LiveData<String> = _inputText

    fun onTextChanged(newText: String) {
        _inputText.value = newText
    }
}
