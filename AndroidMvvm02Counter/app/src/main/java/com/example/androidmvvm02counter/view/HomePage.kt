package com.example.androidmvvm02counter.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidmvvm02counter.viewmodel.CounterViewModel

@Composable
fun HomePage(modifier: Modifier = Modifier, viewModel: CounterViewModel) {
    // UI state consumption
    val counterData = viewModel.counterData.observeAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        counterData.value?.count?.let {
            Text(
                text = "Count: $it",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        } ?: run {
            Text(
                text = "Count: 0",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = { viewModel.increment() }) {
                Text(text = "+1")
            }
            Button(onClick = { viewModel.decrement() }) {
                Text(text = "-1")
            }
        }
    }
}
