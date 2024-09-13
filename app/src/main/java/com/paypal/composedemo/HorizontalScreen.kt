package com.paypal.composedemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HorizontalScreen(modifier: Modifier = Modifier) {

    Row(modifier.fillMaxSize()
        .background(Color.Blue),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround) {
        TextComponent(title = "Google")
        TextComponent(title = "Apple")
        TextComponent(title = "Samsung")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewHR() {
    HorizontalScreen()
}