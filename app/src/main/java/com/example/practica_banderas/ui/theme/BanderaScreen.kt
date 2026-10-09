package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.ui.theme.AzulUsa
import com.example.practica_banderas.ui.theme.RojoUsa

@Composable
fun UsaStarsPattern(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        for (row in 0 until 9) {
            val starCount = if (row % 2 == 0) 6 else 5
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                repeat(starCount) {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Estrella",
                        tint = Color.White,
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier.fillMaxSize()) {
        val (fondoFranjas, contenAzul) = createRefs()

        //guias para el cuadro azul
        val guiaCantDerecha = createGuidelineFromStart(0.4f)
        val guiaCantAbajo = createGuidelineFromTop(7f/13f)

        Column(
            modifier = Modifier.constrainAs(fondoFranjas){
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ){
            for (i in 0 until 13) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(if (i % 2 == 0) RojoUsa else Color.White)
                )
            }
        }



        Box(
            modifier = Modifier
                .background(AzulUsa)
                .padding(4.dp)
                .constrainAs(contenAzul) {
                    top.linkTo(parent.top)
                    bottom.linkTo(guiaCantAbajo)
                    start.linkTo(parent.start)
                    end.linkTo(guiaCantDerecha)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {
            UsaStarsPattern()
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