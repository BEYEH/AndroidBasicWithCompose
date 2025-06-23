package com.example.androidmvvm02counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm02counter.ui.theme.AndroidMvvm02CounterTheme
import com.example.androidmvvm02counter.view.HomePage
import com.example.androidmvvm02counter.viewmodel.CounterViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val counterViewModel = ViewModelProvider(this)[CounterViewModel::class]

        setContent {
            AndroidMvvm02CounterTheme {
                Scaffold(modifier = Modifier) { innerPadding ->
                    HomePage(modifier = Modifier.padding(innerPadding), counterViewModel)
                }
            }
        }
    }
}
