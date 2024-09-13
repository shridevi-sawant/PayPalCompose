package com.paypal.composedemo

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// custom composable
@Composable
fun TextComponent(
    title: String,
    modifier: Modifier = Modifier,
    textSize: TextUnit = 30.sp,
    textColor: Color = Color.Magenta,
    bgColor: Color = Color.Cyan
) {

    Text(
        text = title,
        color = textColor,
        fontSize = textSize,
        //maxLines = 5,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = modifier

            //.fillMaxWidth()
            .wrapContentWidth()
            .background(
                bgColor,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(10.dp)


    )
}

// stateless composable
@Composable
fun OneLineTextField(
    text: String,
    onChange: (String) -> Unit,
    keyboardType: KeyboardType = KeyboardType.Text,
    hint: String = "",
    title: String = "",
    showError: Boolean = false,
    transformation: VisualTransformation = VisualTransformation.None
) {

    OutlinedTextField(value = text,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        isError = showError,
        visualTransformation = transformation,
        singleLine = true,
        label = {
            Text(text = title)
        },
        placeholder = {
            Text(text = hint)
        },
        onValueChange = {
            onChange(it)
        })
}

@Composable
fun ConfirmationDialog(
    modifier: Modifier = Modifier,
    message: String,
    onCancel: () -> Unit = {},
    onConfirm: () -> Unit = {}
) {

    AlertDialog(onDismissRequest = { },
        dismissButton = {
            Button(onClick = { onCancel() }) {
                Text(text = "Cancel")
            }
        },
        confirmButton = {
            Button(onClick = { onConfirm() }) {
                Text(text = "OK")
            }
        }, text = {
            Text(text = message)
        })
}