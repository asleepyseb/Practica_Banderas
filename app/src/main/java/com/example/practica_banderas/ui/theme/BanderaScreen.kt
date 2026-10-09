package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.ui.theme.AzulSeychelles
import com.example.practica_banderas.ui.theme.RojoSeychelles
import com.example.practica_banderas.ui.theme.VerdeSeychelles
import com.example.practica_banderas.ui.theme.AmarilloSeychelles


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        // el punto de origen para todas las franjas
        val origin = Offset(0f, h)

        //franja azul
        val pathAzul = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(0f, 0f) //esquina superior izq
            lineTo(w / 3f, 0f)
            close()
        }
        drawPath(path = pathAzul, color = AzulSeychelles)

        //franja amarilla
        val pathAmarillo = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(w / 3f, 0f)
            lineTo(w * (2f / 3f), 0f)
            close()
        }
        drawPath(path = pathAmarillo, color = AmarilloSeychelles)

        //franja roja
        val pathRojo = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(w * (2f / 3f), 0f)
            lineTo(w, 0f) // Esquina superior derecha
            lineTo(w, h / 3f)
            close()
        }
        drawPath(path = pathRojo, color = RojoSeychelles)

        //franja blanca
        val pathBlanco = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(w, h / 3f)
            lineTo(w, h * (2f / 3f))
            close()
        }
        drawPath(path = pathBlanco, color = Color.White)

        //franja verde
        val pathVerde = Path().apply {
            moveTo(origin.x, origin.y)
            lineTo(w, h * (2f / 3f))
            lineTo(w, h) //esquina inferior derecha
            close()
        }
        drawPath(path = pathVerde, color = VerdeSeychelles)
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}