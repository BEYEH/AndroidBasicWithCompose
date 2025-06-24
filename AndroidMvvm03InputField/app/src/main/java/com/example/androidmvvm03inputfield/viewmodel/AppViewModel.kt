package com.example.androidmvvm03inputfield.viewmodel

import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _inputText = MutableLiveData("")
    val inputText: LiveData<String> = _inputText

    private val _inputTextFieldValue = MutableLiveData(
        TextFieldValue("")
    )
    val inputTextFieldValue: LiveData<TextFieldValue> = _inputTextFieldValue

    fun onTextChanged(newText: String) {
        _inputText.value = newText
    }

    fun onTextFieldValueChanged(newValue: TextFieldValue) {
        _inputTextFieldValue.value = newValue
    }
}
