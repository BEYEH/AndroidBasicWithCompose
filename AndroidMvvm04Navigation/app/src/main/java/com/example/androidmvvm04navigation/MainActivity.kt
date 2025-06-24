package com.example.androidmvvm04navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.example.androidmvvm04navigation.ui.theme.AndroidMvvm04NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidMvvm04NavigationTheme {
                App(modifier = Modifier)
            }
        }
    }
}
