package com.example.androidmvvm04navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.example.androidmvvm04navigation.ui.theme.AndroidMvvm04NavigationTheme
import com.example.androidmvvm04navigation.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appViewModel = ViewModelProvider(this)[AppViewModel::class]

        setContent {
            AndroidMvvm04NavigationTheme {
                val navController = rememberNavController()

                AppNav(modifier = Modifier, navController = navController, appViewModel)
            }
        }
    }
}
