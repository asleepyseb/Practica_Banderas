package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin
import com.example.practica_banderas.ui.theme.AzulCuba
import com.example.practica_banderas.ui.theme.RojoCuba

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize().background(Color.White)) {
        val w = size.width
        val h = size.height

        //franjas azules
        val bandHeight = h / 5f
        for (i in 0 until 5 step 2) {
            drawRect(
                color = AzulCuba,
                topLeft = Offset(0f, i * bandHeight),
                size = Size(w, bandHeight)
            )
        }

        //triangulo rojo
        val triWidth = w * 0.45f
        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, h / 2f)
            lineTo(0f, h)
            close()
        }
        drawPath(path = trianglePath, color = RojoCuba)

        // estrella Blanca centrada en el triángulo
        val starCenterX = (0f + triWidth + 0f) / 3f
        val starCenterY = h / 2f
        val rOutStar = h * 0.12f
        val rInStar = h * 0.05f

        val starPath = Path()
        val points = 5
        val angleStep = Math.PI / points
        val startAngle = -Math.PI / 2.0

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