package com.example.testexecutebinfile.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import java.io.File
import java.io.IOException

@Composable
fun App(modifier: Modifier) {
    val context = LocalContext.current
    val output = remember { mutableStateOf("") }


    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello Kotlin.")

        LaunchedEffect(Unit) {
            output.value = runNativeBinary(context)
        }

        Text(text = output.value)
    }
}

@SuppressLint("SetWorldReadable")
fun runNativeBinary(context: Context): String {
    val fileName = "hello_c"
    val outFile = File(context.filesDir, fileName)
    val tag = "NativeBinaryRunner"

    Log.d(tag, "${context.filesDir}")

    return try {
        if (!outFile.exists()) {
            Log.d(tag, "Binary not found, copying from assets...")
            context.assets.open(fileName).use { input ->
                outFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            outFile.setReadable(true, false)
            outFile.setExecutable(true, false)

            Log.d(tag, "File exists: ${outFile.exists()}")
            Log.d(tag, "Can execute: ${outFile.canExecute()}")
            Log.d(tag, "Path: ${outFile.absolutePath}")
        } else {
            Log.d(tag, "Binary already exists at: ${outFile.absolutePath}")
        }

        Log.d(tag, "Executing binary...")
        val process = ProcessBuilder(outFile.absolutePath)
            .redirectErrorStream(true)
            .start()

        val output = process.inputStream.bufferedReader().readText()
        val exitCode = process.waitFor()

        Log.d(tag, "Execution completed with exit code: $exitCode")
        Log.d(tag, "Output:\n$output")

        output

    } catch (ioe: IOException) {
        Log.e(tag, "IO Error while executing binary", ioe)
        "IO Error: ${ioe.message}"
    } catch (se: SecurityException) {
        Log.e(tag, "Security Error while executing binary", se)
        "Security Error: ${se.message}"
    } catch (e: Exception) {
        Log.e(tag, "Unexpected Error while executing binary", e)
        "Unknown Error: ${e.message}"
    }
}
