package com.paypal.composedemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(modifier: Modifier = Modifier) {
    var isAdmin by remember {
        mutableStateOf(false)
    }

    var dlgDisplay by remember {
        mutableStateOf(false)
    }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = if (isAdmin) Color.Blue else Color.White
    ) {
        Column(
            modifier = modifier.padding(vertical = 50.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                TextComponent(title = "Is Admin?")
                Switch(checked = isAdmin, onCheckedChange = {
                    isAdmin = it
                    dlgDisplay = it
                })
            }

            if (isAdmin){
//                HorizontalDivider(thickness = 5.dp)
//                LoginScreen()

                if (dlgDisplay) {
                    ConfirmationDialog(message = "You are admin user",
                        onCancel = {
                            dlgDisplay = false
                        }, onConfirm = {
                            dlgDisplay = false
                        })
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewSettings() {
    
    SettingsScreen()
}