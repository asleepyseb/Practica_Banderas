package com.example.practica_banderas.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.R
import com.example.practica_banderas.ui.theme.RojoEspana
import com.example.practica_banderas.ui.theme.AmarilloEspana



@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(cajaRojaT, cajaAmarilla, cajaRojaB,escudo) = createRefs()

        //guias
        val guiaSup = createGuidelineFromTop(0.25f)
        val guiaInf = createGuidelineFromTop(0.75f)

        //caja roja
        Box(
            modifier = Modifier
                .background(RojoEspana)
                .constrainAs(cajaRojaT){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(guiaSup)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja amarilla
        Box(
            modifier = Modifier
                .background(AmarilloEspana)
                .constrainAs(cajaAmarilla){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(guiaSup)
                    bottom.linkTo(guiaInf)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja roja bottom
        Box(
            modifier = Modifier
                .background(RojoEspana)
                .constrainAs(cajaRojaB){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(guiaInf)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Image(
            painter = painterResource(id = R.drawable.escudo_espana),
            contentDescription = "escudo españa",
            modifier = Modifier
                .size(120.dp)
                .constrainAs(escudo){
                    top.linkTo(cajaAmarilla.top)
                    bottom.linkTo(cajaAmarilla.bottom)
                    start.linkTo(parent.start, margin = 60.dp)
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