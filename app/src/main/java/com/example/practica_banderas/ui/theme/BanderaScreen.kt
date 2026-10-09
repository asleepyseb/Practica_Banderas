package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.ui.theme.AzulReinoUnido
import com.example.practica_banderas.ui.theme.RojoReinoUnido

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1.5f)
        ) {
            val w = size.width
            val h = size.height

            drawRect(color = Color(0xFF012169))

            val grosorDiagonalBlanca = h * 0.22f
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = grosorDiagonalBlanca
            )
            drawLine(
                color = Color.White,
                start = Offset(w, 0f),
                end = Offset(0f, h),
                strokeWidth = grosorDiagonalBlanca
            )

            val grosorDiagonalRoja = h * 0.1f
            drawLine(
                color = Color(0xFFC8102E),
                start = Offset(0f, 0f),
                end = Offset(w, h),
                strokeWidth = grosorDiagonalRoja
            )
            drawLine(
                color = Color(0xFFC8102E),
                start = Offset(w, 0f),
                end = Offset(0f, h),
                strokeWidth = grosorDiagonalRoja
            )

            val grosorCruzBlanca = h * 0.33f
            drawLine(
                color = Color.White,
                start = Offset(w / 2f, 0f),
                end = Offset(w / 2f, h),
                strokeWidth = grosorCruzBlanca
            )
            drawLine(
                color = Color.White,
                start = Offset(0f, h / 2f),
                end = Offset(w, h / 2f),
                strokeWidth = grosorCruzBlanca
            )

            val grosorCruzRoja = h * 0.2f
            drawLine(
                color = Color(0xFFC8102E),
                start = Offset(w / 2f, 0f),
                end = Offset(w / 2f, h),
                strokeWidth = grosorCruzRoja
            )
            drawLine(
                color = Color(0xFFC8102E),
                start = Offset(0f, h / 2f),
                end = Offset(w, h / 2f),
                strokeWidth = grosorCruzRoja
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}