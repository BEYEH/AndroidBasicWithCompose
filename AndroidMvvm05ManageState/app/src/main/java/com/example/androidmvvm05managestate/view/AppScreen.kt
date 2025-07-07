package com.example.androidmvvm05managestate.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidmvvm05managestate.viewmodel.AppViewModel

@Composable
fun AppScreen(
    modifier: Modifier = Modifier,
    appViewModel: AppViewModel,
) {
    var email by remember { mutableStateOf("") }
    var emailSaveable by rememberSaveable { mutableStateOf("") }
    val emailLiveData by appViewModel.email.observeAsState(initial = "")

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Page", style = TextStyle(fontSize = 30.sp))
        Spacer(Modifier.height(10.dp))
        HorizontalDivider(thickness = 2.dp)

        // remember: persist state on recomposition
        AppContent("remember", email) { email = it }

        // rememberSaveable: persist even on configuration changes
        AppContent(
            "rememberSaveable", emailSaveable
        ) { emailSaveable = it }

        // ViewModel & Livedate
        Spacer(Modifier.height(10.dp))
        Text(text = "ViewModel & Livedata")
        OutlinedTextField(
            label = { Text("E-mail") },
            value = emailLiveData,
            onValueChange = { appViewModel.onEmailUpdate(it) }
        )
        Text(
            text = "E-mail: $emailLiveData",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(Modifier.height(10.dp))
        HorizontalDivider(thickness = 2.dp)

        // Note
        Spacer(Modifier.height(10.dp))
        Text(text = "Different types of state", style = TextStyle(fontSize = 30.sp))
        Text("mutableStateOf: remember, rememberSaveable")
        Text("observeAsState: LiveData")
    }
}

@Composable
fun AppContent(
    title: String,
    email: String,
    onEmailChange: (String) -> Unit
) {
    Spacer(Modifier.height(10.dp))
    Text(text = title)
    OutlinedTextField(
        value = email, onValueChange = onEmailChange, label = { Text("E-mail") })
    Text(
        text = "E-mail: $email",
        modifier = Modifier.padding(bottom = 8.dp),
        style = MaterialTheme.typography.bodyMedium
    )
    Spacer(Modifier.height(10.dp))
    HorizontalDivider(thickness = 2.dp)
}
