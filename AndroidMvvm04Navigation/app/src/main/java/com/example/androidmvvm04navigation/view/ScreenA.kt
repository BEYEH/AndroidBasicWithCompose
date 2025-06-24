package com.example.androidmvvm04navigation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidmvvm04navigation.Route
import com.example.androidmvvm04navigation.viewmodel.AppViewModel

@Composable
fun ScreenA(modifier: Modifier, navController: NavController, appViewModel: AppViewModel) {
    val inputTextFieldValueState =
        appViewModel.inputTextFieldValue.observeAsState(TextFieldValue(""))
    val inputTextFieldValue = inputTextFieldValueState.value

    val inputTextFieldValue2State =
        appViewModel.inputTextFieldValue2.observeAsState(TextFieldValue(""))
    val inputTextFieldValue2 = inputTextFieldValue2State.value

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen A",
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = inputTextFieldValue,
            onValueChange = { appViewModel.onTextFieldValueChanged(it, 1) },
            label = { Text("TextFieldValue input") })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Route.screen_b)
        }) {
            Text(text = "Go to Screen B")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Data: $inputTextFieldValue2")
    }
}
