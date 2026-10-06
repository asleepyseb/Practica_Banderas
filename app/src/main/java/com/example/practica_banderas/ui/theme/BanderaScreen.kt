package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.practica_banderas.ui.theme.VerdeMexico
import com.example.practica_banderas.ui.theme.RojoMexico
import com.example.practica_banderas.R


@Composable
fun BanderaScreen(modifier: Modifier = Modifier){
    Row(modifier = modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(VerdeMexico)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.escudo_mexico),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(110.dp)
            )
        }

        Box (
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(RojoMexico)
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