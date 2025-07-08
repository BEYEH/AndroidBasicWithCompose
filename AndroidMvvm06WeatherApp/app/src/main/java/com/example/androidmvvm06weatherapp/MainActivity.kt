package com.example.androidmvvm06weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm06weatherapp.ui.theme.AndroidMvvm06WeatherAppTheme
import com.example.androidmvvm06weatherapp.view.App
import com.example.androidmvvm06weatherapp.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appViewModel = ViewModelProvider(this)[AppViewModel::class]

        setContent {
            AndroidMvvm06WeatherAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App(appViewModel)
                }
            }
        }
    }
}
