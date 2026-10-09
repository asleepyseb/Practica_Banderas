package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin
import com.example.practica_banderas.ui.theme.RojoPapua
import com.example.practica_banderas.ui.theme.NegroPapua
import com.example.practica_banderas.ui.theme.AmarilloPapua

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        val w = size.width
        val h = size.height

        drawRect(color = Color(0xFFCE1126))

        val pathNegro = Path().apply {
            moveTo(0f, 0f)
            lineTo(0f, h)
            lineTo(w, h)
            close()
        }
        drawPath(path = pathNegro, color = Color(0xFF000000))

        fun dibujarEstrella(cx: Float, cy: Float, rOut: Float, rIn: Float, color: Color) {
            val path = Path()
            val points = 5
            val angleStep = Math.PI / points
            val startAngle = -Math.PI / 2.0

            for (i in 0 until points * 2) {
                val r = if (i % 2 == 0) rOut else rIn
                val theta = startAngle + i * angleStep
                val x = cx + r * cos(theta).toFloat()
                val y = cy + r * sin(theta).toFloat()
                if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
            }
            path.close()
            drawPath(path = path, color = color)
        }

        dibujarEstrella(w * 0.25f, h * 0.40f, h * 0.06f, h * 0.025f, Color.White)
        dibujarEstrella(w * 0.15f, h * 0.60f, h * 0.06f, h * 0.025f, Color.White)
        dibujarEstrella(w * 0.35f, h * 0.60f, h * 0.06f, h * 0.025f, Color.White)
        dibujarEstrella(w * 0.25f, h * 0.80f, h * 0.06f, h * 0.025f, Color.White)
        dibujarEstrella(w * 0.31f, h * 0.70f, h * 0.04f, h * 0.015f, Color.White)

        val cxAve = w * 0.75f
        val cyAve = h * 0.35f
        val rAveOut = h * 0.18f
        val rAveIn = h * 0.08f
        val pathAve = Path()
        val puntosAve = 8
        val aveAngleStep = Math.PI / puntosAve

        for (i in 0 until puntosAve * 2) {
            val r = if (i % 2 == 0) rAveOut else rAveIn
            val theta = i * aveAngleStep
            val x = cxAve + r * cos(theta).toFloat()
            val y = cyAve + r * sin(theta).toFloat()
            if (i == 0) pathAve.moveTo(x, y) else pathAve.lineTo(x, y)
        }
        pathAve.close()
        drawPath(path = pathAve, color = Color(0xFFFCD116))
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}