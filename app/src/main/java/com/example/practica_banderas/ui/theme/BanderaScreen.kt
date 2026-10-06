package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.practica_banderas.ui.theme.Practica_BanderasTheme
import com.example.practica_banderas.ui.theme.RojoRusia
import com.example.practica_banderas.ui.theme.AzulRusia
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.painterResource
import com.example.practica_banderas.R


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
       Column(modifier = modifier.fillMaxSize()) {
           Box(
               modifier = Modifier
                   .weight(1f)
                   .fillMaxWidth()
                   .background(Color.White)
           )

           Box(
               modifier = Modifier
                   .weight(1f)
                   .fillMaxWidth()
                   .background(AzulRusia)
           )

           Box(
               modifier = modifier
                   .weight(1f)
                   .fillMaxWidth()
                   .background(RojoRusia)
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