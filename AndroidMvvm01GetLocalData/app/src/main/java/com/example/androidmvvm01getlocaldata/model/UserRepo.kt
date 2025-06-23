package com.example.androidmvvm01getlocaldata.model

import kotlinx.coroutines.delay

class UserRepo {

    /**
     * Get the data from retrofit, firebase or any other api.
     */
    suspend fun fetchUserData(): UserData {
        delay(2000)
        return UserData("John", 25)
    }
}