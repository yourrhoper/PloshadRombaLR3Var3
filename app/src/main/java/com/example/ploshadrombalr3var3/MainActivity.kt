package com.example.ploshadrombalr3var3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    var variant by remember { mutableIntStateOf(1) }

    var a by remember { mutableStateOf("") }
    var h by remember { mutableStateOf("") }
    var d1 by remember { mutableStateOf("") }
    var d2 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = variant == 1,
                onClick = {
                    variant = 1
                }
            )

            Text("1. По стороне и высоте")
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = variant == 2,
                onClick = {
                    variant = 2
                }
            )

            Text("2. По диагоналям")
        }

        Spacer(modifier = Modifier.height(30.dp))

        when (variant) {

            1 -> {
                OutlinedTextField( // текстовое поле
                    value = a, // показ значения а в поле
                    onValueChange = { newValue ->
                        a = newValue
                    }, // обновляем значение
                    label = { Text("Сторона a") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = h,
                    onValueChange = { newValue ->
                        h = newValue
                    },
                    label = { Text("Высота h") },
                    modifier = Modifier.fillMaxWidth()
                )
            }

            2 -> {
                OutlinedTextField(
                    value = d1,
                    onValueChange = { newValue ->
                        d1 = newValue
                    },
                    label = { Text("Диагональ d1") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(10.dp))

                OutlinedTextField(
                    value = d2,
                    onValueChange = { newValue ->
                        d2 = newValue
                    },
                    label = { Text("Диагональ d2") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

