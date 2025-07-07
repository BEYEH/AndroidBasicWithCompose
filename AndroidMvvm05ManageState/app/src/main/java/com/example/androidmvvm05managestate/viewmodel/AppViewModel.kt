package com.example.androidmvvm05managestate.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AppViewModel : ViewModel() {
    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    fun onEmailUpdate(newEmail: String){
        _email.value = newEmail
    }
}