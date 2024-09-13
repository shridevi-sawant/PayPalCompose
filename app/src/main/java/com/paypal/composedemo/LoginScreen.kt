package com.paypal.composedemo

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// recomposition - reexecution when data/state changes

// stateful composable - state hoisting
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    val ctx = LocalContext.current

    // by - property delegate - getter/setter
    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var pwdErr by remember {
        mutableStateOf(false)
    }

    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.Yellow
        ) {
        Column(
            modifier = Modifier.padding(vertical = 40.dp),
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            TextComponent(title = "Please Login")

            OneLineTextField(text = username,
                keyboardType = KeyboardType.Email,
                title = "Username",
                hint = "Enter Email",
                onChange = {
                username = it
            })

            OneLineTextField(text = password,
                keyboardType = KeyboardType.Number,
                showError = pwdErr,
                title = "Password",
                hint = "Min 8 chars",
                onChange = {
                    password = it
                    pwdErr = password.length < 8
            }, transformation = PasswordVisualTransformation())

            Button(onClick = {
                Toast.makeText(ctx,
                    "Login for $username",
                    Toast.LENGTH_LONG).show()

            }) {
                TextComponent(
                    title = "LOGIN",
                    bgColor = Color.Transparent,
                    textColor = Color.White
                )
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewLogin() {
    LoginScreen()
}