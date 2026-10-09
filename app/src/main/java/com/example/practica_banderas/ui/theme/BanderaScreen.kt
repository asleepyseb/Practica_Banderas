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
import kotlin.math.cos
import kotlin.math.sin
import com.example.practica_banderas.ui.theme.RojoTurquia

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = RojoTurquia)

        // centro vertical de la pantalla
        val cy = size.height / 2f


        val rOut = size.height * 0.30f
        drawCircle(
            color = Color.White,
            radius = rOut,
            center = Offset(size.width * 0.38f, cy)
        )

        // circulo interior rojo desplazado a la derecha (hace el efecto de recorte)
        drawCircle(
            color = RojoTurquia,
            radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
        )

        // estrella de 5 puntas
        val starCenterX = size.width * 0.65f
        val starCenterY = cy
        val rOutStar = size.height * 0.12f //radio picos exteriores
        val rInStar = size.height * 0.05f  //radio picos interiores

        val starPath = Path()
        val points = 5
        val angleStep = Math.PI / points
        val startAngle = -Math.PI / 2.0 // -90 grados para que el primer pico apunte hacia arriba

        // calcular los 10 puntos
        for (i in 0 until points * 2) {
            val r = if (i % 2 == 0) rOutStar else rInStar
            val theta = startAngle + i * angleStep
            val x = starCenterX + r * cos(theta).toFloat()
            val y = starCenterY + r * sin(theta).toFloat()

            if (i == 0) starPath.moveTo(x, y) else starPath.lineTo(x, y)
        }
        starPath.close()

        drawPath(path = starPath, color = Color.White)
    }

}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}