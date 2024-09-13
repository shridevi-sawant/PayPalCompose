package com.paypal.composedemo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VerticalScreen(modifier: Modifier = Modifier) {
    Column(modifier= modifier
        .fillMaxSize()
        .background(Color.LightGray, shape = RoundedCornerShape(50.dp))
        .border(5.dp,Color.Black)
        .padding(horizontal = 40.dp, vertical = 80.dp)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(40.dp)

    ) {
        TextComponent(title = "Android")
        TextComponent(title = "iOS")
        Spacer(modifier = Modifier.size(40.dp))
        TextComponent(title = "Flutter")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewVertical() {
    VerticalScreen()
}