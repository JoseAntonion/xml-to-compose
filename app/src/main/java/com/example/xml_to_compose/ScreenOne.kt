package com.example.xml_to_compose

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScreenOne() {
    MaterialTheme {
        Box(){
            Text(text = "Prueba compose en XML")
        }
    }
}