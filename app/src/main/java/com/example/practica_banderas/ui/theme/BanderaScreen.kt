package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_banderas.ui.theme.Practica_BanderasTheme
import com.example.practica_banderas.ui.theme.RojoEspana
import com.example.practica_banderas.ui.theme.AmarilloEspana
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
                   .background(RojoEspana)
           )

           Box(
               modifier = Modifier
                   .weight(2f)
                   .fillMaxWidth()
                   .background(AmarilloEspana),
               contentAlignment = Alignment.CenterStart
           ){
               Image(
                   painter = painterResource(id = R.drawable.escudo_espana),
                   contentDescription = "escudo espana",
                   modifier = Modifier
                       .padding(start = 60.dp)
                       .size(120.dp)
               )
           }

           Box(
               modifier = modifier
                   .weight(1f)
                   .fillMaxWidth()
                   .background(RojoEspana)
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