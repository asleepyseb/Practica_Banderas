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
import com.example.practica_banderas.ui.theme.VerdeItalia
import com.example.practica_banderas.ui.theme.RojoItalia


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(cajaVerde, cajaBlanca, cajaRoja) = createRefs()

        //caja verde
        Box(
            modifier = Modifier
                .background(VerdeItalia)
                .constrainAs(cajaVerde){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(cajaBlanca.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja blanca
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cajaBlanca){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(cajaVerde.end)
                    end.linkTo(cajaRoja.start)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja roja
        Box(
            modifier = Modifier
                .background(RojoItalia)
                .constrainAs(cajaRoja){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(cajaBlanca.end)
                    end.linkTo(parent.end)
                    width = Dimension.fillToConstraints
                    height  = Dimension.fillToConstraints
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