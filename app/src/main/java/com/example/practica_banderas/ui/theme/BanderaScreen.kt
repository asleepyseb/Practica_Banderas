package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
       Column(modifier = modifier.fillMaxSize()) {
           Row(
               modifier = Modifier
                   .weight(1f)
                   .fillMaxWidth()
           ) {
               Box(
                   modifier = Modifier
                       .weight(1f)
                       .fillMaxHeight()
                       .background(AzulChile),
                   contentAlignment = Alignment.Center
               ) {
                   Icon(
                       imageVector = Icons.Filled.Star,
                       contentDescription = "Estrella",
                       tint = Color.White,
                       modifier = Modifier.size(120.dp)
                   )
               }

               Box(
                   modifier = Modifier
                       .weight(2f)
                       .fillMaxHeight()
                       .background(Color.White)
               )
           }

           Box(
               modifier = Modifier
                   .weight(1f)
                   .fillMaxWidth()
                   .background(RojoChile)
           )
       }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview(){
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}