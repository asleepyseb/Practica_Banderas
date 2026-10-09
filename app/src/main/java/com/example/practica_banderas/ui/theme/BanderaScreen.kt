package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun PatitoPixelArtScreen(modifier: Modifier = Modifier) {
    val T = Color.Transparent
    val B = Color(0xFF2C2C2C)
    val Y = Color(0xFFF1E04B)
    val O = Color(0xFFED7E29)
    val G = Color(0xFF868686)
    val P = Color(0xFF4C2A4C)


    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE8E8E8))
    ) {
        val (titulo, lienzo) = createRefs()

        //lienzo
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .aspectRatio(1f)
                .constrainAs(lienzo) {
                    top.linkTo(titulo.bottom)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        ) {

            PixelRow(Modifier.weight(1f), T, T, T, T, T, B, B, B, B, B, B, T, T, T, T, T)
            PixelRow(Modifier.weight(1f), T, T, T, B, B, Y, Y, Y, Y, Y, Y, B, B, T, T, T)
            PixelRow(Modifier.weight(1f), T, T, B, Y, Y, Y, Y, Y, Y, Y, Y, Y, Y, B, T, T)
            PixelRow(Modifier.weight(1f), T, B, Y, Y, B, B, Y, Y, Y, B, B, Y, Y, B, T, T) // Ojos
            PixelRow(Modifier.weight(1f), T, B, Y, Y, B, B, Y, Y, Y, B, B, Y, Y, Y, B, T)
            PixelRow(Modifier.weight(1f), B, Y, Y, Y, Y, B, B, B, B, B, Y, Y, Y, Y, B, T)
            PixelRow(Modifier.weight(1f), B, Y, Y, Y, B, O, O, O, O, O, B, Y, Y, Y, Y, B) // Pico
            PixelRow(Modifier.weight(1f), B, Y, Y, Y, B, O, O, O, O, O, B, Y, Y, Y, Y, B)
            PixelRow(Modifier.weight(1f), B, Y, Y, B, B, B, B, B, B, B, B, Y, Y, Y, Y, B)
            PixelRow(Modifier.weight(1f), B, Y, B, P, P, G, G, G, G, B, Y, Y, Y, Y, Y, B) // Cuchillo (mango y hoja)
            PixelRow(Modifier.weight(1f), B, Y, B, P, P, G, G, G, G, G, B, Y, Y, Y, Y, B)
            PixelRow(Modifier.weight(1f), T, B, B, B, B, B, G, G, G, G, B, Y, Y, Y, B, T)
            PixelRow(Modifier.weight(1f), T, B, Y, Y, Y, B, B, B, B, B, Y, Y, Y, B, T, T)
            PixelRow(Modifier.weight(1f), T, T, B, Y, Y, Y, Y, Y, Y, Y, Y, Y, B, T, T, T)
            PixelRow(Modifier.weight(1f), T, T, T, B, O, O, B, T, T, B, O, O, B, T, T, T) // Patitas
            PixelRow(Modifier.weight(1f), T, T, T, B, B, B, B, T, T, B, B, B, B, T, T, T)
        }
    }
}

//composable auxilifiar para ls filas
@Composable
fun PixelRow(
    modifier: Modifier = Modifier,
    c1: Color, c2: Color, c3: Color, c4: Color,
    c5: Color, c6: Color, c7: Color, c8: Color,
    c9: Color, c10: Color, c11: Color, c12: Color,
    c13: Color, c14: Color, c15: Color, c16: Color
) {
    Row(modifier = modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).fillMaxHeight().background(c1))
        Box(Modifier.weight(1f).fillMaxHeight().background(c2))
        Box(Modifier.weight(1f).fillMaxHeight().background(c3))
        Box(Modifier.weight(1f).fillMaxHeight().background(c4))
        Box(Modifier.weight(1f).fillMaxHeight().background(c5))
        Box(Modifier.weight(1f).fillMaxHeight().background(c6))
        Box(Modifier.weight(1f).fillMaxHeight().background(c7))
        Box(Modifier.weight(1f).fillMaxHeight().background(c8))
        Box(Modifier.weight(1f).fillMaxHeight().background(c9))
        Box(Modifier.weight(1f).fillMaxHeight().background(c10))
        Box(Modifier.weight(1f).fillMaxHeight().background(c11))
        Box(Modifier.weight(1f).fillMaxHeight().background(c12))
        Box(Modifier.weight(1f).fillMaxHeight().background(c13))
        Box(Modifier.weight(1f).fillMaxHeight().background(c14))
        Box(Modifier.weight(1f).fillMaxHeight().background(c15))
        Box(Modifier.weight(1f).fillMaxHeight().background(c16))
    }
}

@Preview(showBackground = true)
@Composable
fun PatitoPixelArtPreview() {
    Surface {
        PatitoPixelArtScreen()
    }
}