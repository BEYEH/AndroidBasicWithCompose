package com.example.androidmvvm04navigation.viewmodel

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _field1 = MutableLiveData(TextFieldValue(""))
    private val _field2 = MutableLiveData(TextFieldValue(""))

    val inputTextFieldValue: LiveData<TextFieldValue> get() = _field1
    val inputTextFieldValue2: LiveData<TextFieldValue> get() = _field2

    var textFieldValue1: TextFieldValue
        get() = _field1.value ?: TextFieldValue("")
        set(value) {
            _field1.value = value
        }

    var textFieldValue2: TextFieldValue
        get() = _field2.value ?: TextFieldValue("")
        set(value) {
            _field2.value = value
        }
}
