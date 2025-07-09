package com.example.androidmvvm06weatherapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidmvvm06weatherapp.api.NetworkResponse
import com.example.androidmvvm06weatherapp.viewmodel.AppViewModel

@Composable
fun App(appViewModel: AppViewModel) {
    AppScreen(appViewModel)
}

@Composable
fun AppScreen(appViewModel: AppViewModel) {
    var city by remember { mutableStateOf("") }
    val weatherResult = appViewModel.weatherResult.observeAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = city,
                onValueChange = { city = it },
                label = { Text(text = "Search for any location") }
            )

            IconButton(onClick = {
                appViewModel.getData(city)
            }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            }
        }

        when (val result = weatherResult.value) {
            is NetworkResponse.Error -> {
                Text(text = result.message)
            }

            NetworkResponse.Loading -> {
                CircularProgressIndicator()
            }

            is NetworkResponse.Success<*> -> {
                Text(text = result.data.toString())
            }

            null -> {}
        }
    }
}