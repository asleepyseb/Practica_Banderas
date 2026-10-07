package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.ui.theme.NegroAlemania
import com.example.practica_banderas.ui.theme.RojoAlemania
import com.example.practica_banderas.ui.theme.AmarilloAlemania


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(cajaNegra, cajaRoja, cajaAmarilla) = createRefs()

        //caja negra
        Box(
            modifier = Modifier
                .background(NegroAlemania)
                .constrainAs(cajaNegra){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(cajaRoja.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja roja
        Box(
            modifier = Modifier
                .background(RojoAlemania)
                .constrainAs(cajaRoja){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(cajaNegra.bottom)
                    bottom.linkTo(cajaAmarilla.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja amarilla
        Box(
            modifier = Modifier
                .background(AmarilloAlemania)
                .constrainAs(cajaAmarilla){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(cajaRoja.bottom)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
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