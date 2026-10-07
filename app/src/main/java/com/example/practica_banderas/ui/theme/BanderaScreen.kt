package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_banderas.ui.theme.VerdeBrasil
import com.example.practica_banderas.ui.theme.AzulBrasil
import com.example.practica_banderas.ui.theme.AmarilloBrasil
import com.example.practica_banderas.R


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
      Box(
          modifier = Modifier
              .fillMaxSize()
              .background(VerdeBrasil),
          contentAlignment = Alignment.Center
      ){
          Box(
              modifier = Modifier
                  .fillMaxWidth()
                  .aspectRatio(10f/7f)//para evitar que se estire verticalmente
                  .padding(16.dp),
              contentAlignment = Alignment.Center
          ){
              Canvas(
              modifier = Modifier
                  .fillMaxSize()
          ) {
              val width = size.width
              val height = size.height

              val path = Path().apply{
                  moveTo(width/ 2f,0f)
                  lineTo(width, height/2f)
                  lineTo(width/2f, height)
                  lineTo(0f,height/2f)
                  close()
              }
              drawPath(path = path, color= AmarilloBrasil)
          }

              Box(
                  modifier = Modifier
                      .fillMaxHeight(0.5f)
                      .aspectRatio(1f)
                      .clip(CircleShape)
                      .background(AzulBrasil)
              )
          }
      }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}