package com.example.androidmvvm05managestate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm05managestate.ui.theme.AndroidMvvm05ManageStateTheme
import com.example.androidmvvm05managestate.view.AppScreen
import com.example.androidmvvm05managestate.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appViewModel = ViewModelProvider(this)[AppViewModel::class]

        setContent {
            AndroidMvvm05ManageStateTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    AppScreen(modifier = Modifier.padding(innerPadding), appViewModel)
                }
            }
        }
    }
}
