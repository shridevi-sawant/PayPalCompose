package com.paypal.composedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxScreen(modifier: Modifier = Modifier) {
    
    Box(
        modifier
            .background(Color.DarkGray)
            //.size(400.dp)
            .fillMaxSize()
            .padding(vertical = 50.dp, horizontal = 40.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            colorFilter = ColorFilter.tint(Color.White),
            imageVector = Icons.Filled.Home,
           contentDescription = "home")
        TextComponent(title = "PayPal",
            modifier = Modifier.align(Alignment.Center))
        TextComponent(title = "Bangalore",
            modifier = Modifier.align(Alignment.BottomStart))
        TextComponent(title = "India",
            modifier = Modifier.align(Alignment.BottomEnd))
        
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewBox() {
    BoxScreen()
}