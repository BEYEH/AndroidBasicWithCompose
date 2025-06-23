package com.example.androidmvvm01getlocaldata.model

import kotlinx.coroutines.delay

class UserRepo {
    suspend fun fetchUserDate(): UserData {
        // Get the data from retrofit, firebase or any other api.
        delay(2000)
        return UserData("John", 25)
    }
}