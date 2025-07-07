package com.example.unit5connecttointernet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.unit5connecttointernet.ui.theme.Unit5ConnectToInternetTheme
import com.example.unit5connecttointernet.view.AppScreen
import com.example.unit5connecttointernet.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val appViewModel = ViewModelProvider(this)[AppViewModel::class]

        setContent {
            Unit5ConnectToInternetTheme {
                AppScreen(
                    modifier = Modifier,
                    appViewModel
                )
            }
        }
    }
}
