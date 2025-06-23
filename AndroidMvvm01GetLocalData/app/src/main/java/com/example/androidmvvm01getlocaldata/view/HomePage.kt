package com.example.androidmvvm01getlocaldata.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.androidmvvm01getlocaldata.viewmodel.HomeViewModel

@Composable
fun HomePage(modifier: Modifier = Modifier, viewModel: HomeViewModel) {

    // Add dependency to observe user data.
    val userData = viewModel.userData.observeAsState()
    val isLoading = viewModel.isLoading.observeAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Press button and wait 2 seconds to get data.")

        Button(onClick = {
            viewModel.getUserData()
        }) {
            Text(text = "Get Data")
        }

        // Add progress bar till datas are loaded.
        if (isLoading.value == true) {
            CircularProgressIndicator()
        } else {
            userData.value?.name?.let {
                Text(text = "Name: $it")
            }

            userData.value?.age?.let {
                Text(text = "Age: $it")
            }
        }
    }
}
