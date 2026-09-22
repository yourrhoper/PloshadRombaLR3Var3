package com.example.ploshadrombalr3var3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ploshadrombalr3var3.ui.theme.PloshadRombaLR3Var3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                RombApp()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun RombApp() {

    var variant by remember { mutableStateOf(1) }

    var a by remember { mutableStateOf("") }
    var h by remember { mutableStateOf("") }

    var d1 by remember { mutableStateOf("") }
    var d2 by remember { mutableStateOf("") }

    var result by remember { mutableStateOf("") }
}