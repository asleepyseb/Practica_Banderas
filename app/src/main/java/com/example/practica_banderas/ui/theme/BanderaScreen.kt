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
import com.example.practica_banderas.ui.theme.AzulColombia
import com.example.practica_banderas.ui.theme.AmarilloColombia
import com.example.practica_banderas.ui.theme.RojoColombia



@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(cajaAmarilla, cajaAzul, cajaRoja) = createRefs()

        //guias
        val guiaMit = createGuidelineFromTop(0.5f)
        val guiaTresCuartos = createGuidelineFromTop(0.75f)

        //caja amarilla
        Box(
            modifier = Modifier
                .background(AmarilloColombia)
                .constrainAs(cajaAmarilla){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(guiaMit)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja azu
        Box(
            modifier = Modifier
                .background(AzulColombia)
                .constrainAs(cajaAzul){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(guiaMit)
                    bottom.linkTo(guiaTresCuartos)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja roja
        Box(
            modifier = Modifier
                .background(RojoColombia)
                .constrainAs(cajaRoja){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(guiaTresCuartos)
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