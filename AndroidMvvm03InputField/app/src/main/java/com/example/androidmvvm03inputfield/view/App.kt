package com.example.androidmvvm03inputfield.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidmvvm03inputfield.viewmodel.AppViewModel

@Composable
fun App(modifier: Modifier, viewModel: AppViewModel) {
    val inputTextState = viewModel.inputText.observeAsState("")
    val inputText = inputTextState.value

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = inputText,
            onValueChange = { viewModel.onTextChanged(it) },
            label = { Text("Input") }
        )

        Spacer(modifier = modifier.height(16.dp))

        Text(text = "Your input is：$inputText")
    }
}
