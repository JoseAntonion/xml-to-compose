package com.example.xml_to_compose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.xml_to_compose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bView = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(bView.root)

        setContent {
            ScreenOne()
        }

        /*bView.composeView.setContent {
            MainScreen()
        }*/
    }
}

@Composable
fun MainScreen() {
    var state by remember { mutableStateOf("") }
    var state2 by remember { mutableStateOf("") }
    MaterialTheme {
        Column {
            Text(text = "Demo XML --> Compose")
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = state,
                label = { Text(text = "Usuario") },
                placeholder = { Text(text = "Usuario") },
                onValueChange = { state = it })
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            TextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = state2,
                label = { Text(text = "Contraseña") },
                placeholder = { Text(text = "Contraseña") },
                onValueChange = { state2 = it })
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(16.dp)
            )
            Button(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Ingresar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}