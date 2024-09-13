package com.paypal.composedemo

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    
    Column(
        modifier
            .fillMaxSize()
            .background(Color.LightGray),

        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextComponent(title = "Welcome to PayPal",
            bgColor = Color.Transparent)
        Surface(shape = RoundedCornerShape(30.dp),
            border = BorderStroke(2.dp, Color.Blue)) {
            Image(
                modifier = Modifier.size(250.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo"
            )
        }
        OutlinedButton(onClick = {
            Log.d("WelcomeScreen", "Continue clicked")
        },
            colors = ButtonDefaults.outlinedButtonColors(Color.Green)) {
            Icon(imageVector = Icons.Default.CheckCircle,
                contentDescription = "", tint = Color.Blue)
            TextComponent(title = "Continue",
                bgColor = Color.Transparent,
                )
        }

        IconButton(onClick = { },
            modifier = Modifier
                .size(50.dp)
                .background(Color.White)) {
            Icon(imageVector = Icons.Filled.Person,
                contentDescription = "")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewWelcome() {
    WelcomeScreen()
}