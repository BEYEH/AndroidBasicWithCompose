package com.example.testexecutesofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.testexecutesofile.ui.theme.TestExecuteSoFileTheme
import com.example.testexecutesofile.view.App

class MainActivity : ComponentActivity() {

    companion object {
        init {
            System.loadLibrary("get-lib") // Load libget-lib.so
        }
    }

    external fun getMsg(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val nativeMessage = getMsg()

        setContent {
            TestExecuteSoFileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(modifier = Modifier.padding(innerPadding), nativeMessage)
                }
            }
        }
    }
}
