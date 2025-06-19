package com.example.unit4navigationandapparchitecture

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unit4navigationandapparchitecture.ui.theme.Unit4NavigationAndAppArchitectureTheme

class MainActivity : ComponentActivity() {
    private val tagOfMainActivity = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tagOfMainActivity, "onCreate Called")

        enableEdgeToEdge()
        setContent {
            Unit4NavigationAndAppArchitectureTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tagOfMainActivity, "onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tagOfMainActivity, "onRestart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tagOfMainActivity, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tagOfMainActivity, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tagOfMainActivity, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tagOfMainActivity, "onDestroy Called")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Unit4NavigationAndAppArchitectureTheme {
        Greeting("Android")
    }
}