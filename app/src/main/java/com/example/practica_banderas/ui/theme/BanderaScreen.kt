
package com.example.banderascompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Pikachu() {
    val amarillo = Color(0xFFFFD928)
    val negro = Color(0xFF222222)
    val rojo = Color(0xFFE53935)
    val blanco = Color.White
    val fondo = Color(0xFFEEEEEE)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp).background(blanco))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(negro))
            Box(Modifier.size(40.dp).background(blanco))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(rojo))
            Box(Modifier.size(40.dp).background(rojo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(rojo))
            Box(Modifier.size(40.dp).background(rojo))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp).background(amarillo))
        }

        Row {
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
            Box(Modifier.size(40.dp))
            Box(Modifier.size(40.dp).background(amarillo))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PikachuPreview() {
    Surface {
        Pikachu()
    }
}

