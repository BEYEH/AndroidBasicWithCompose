package com.example.androidmvvm04loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm04loginscreen.ui.theme.AndroidMvvm04LoginScreenTheme
import com.example.androidmvvm04loginscreen.view.LoginScreen
import com.example.androidmvvm04loginscreen.viewmodel.LoginViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val loginViewModel = ViewModelProvider(this)[LoginViewModel::class]

        setContent {
            AndroidMvvm04LoginScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        modifier = Modifier.padding(innerPadding),
                        loginViewModel
                    )
                }
            }
        }
    }
}
