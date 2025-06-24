package com.example.androidmvvm04navigation.viewmodel

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _inputTextFieldValue = MutableLiveData(TextFieldValue(""))
    val inputTextFieldValue: LiveData<TextFieldValue> = _inputTextFieldValue

    private val _inputTextFieldValue2 = MutableLiveData(TextFieldValue(""))
    val inputTextFieldValue2: LiveData<TextFieldValue> = _inputTextFieldValue2

    fun onTextFieldValueChanged(newValue: TextFieldValue, index: Int) {
        when (index) {
            1 -> _inputTextFieldValue.value = newValue
            2 -> _inputTextFieldValue2.value = newValue
        }
    }
}