package com.example.androidmvvm01getlocaldata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm01getlocaldata.ui.theme.AndroidMvvm01GetLocalDataTheme
import com.example.androidmvvm01getlocaldata.view.HomePage
import com.example.androidmvvm01getlocaldata.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]

        setContent {
            AndroidMvvm01GetLocalDataTheme {
                Scaffold(modifier = Modifier) { innerPadding ->
                    HomePage(
                        modifier = Modifier.padding(innerPadding),
                        homeViewModel
                    )
                }
            }
        }
    }
}
