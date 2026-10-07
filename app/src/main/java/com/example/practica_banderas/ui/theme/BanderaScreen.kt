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
import com.example.practica_banderas.ui.theme.CelesteArgentina


@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val(cajaCelT, cajaBlan, cajaCelB, escudo) = createRefs()

        //caja top
        Box(
            modifier = Modifier
                .background(CelesteArgentina)
                .constrainAs(cajaCelT){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(cajaBlan.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja blanca
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(cajaBlan){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(cajaCelT.bottom)
                    bottom.linkTo(cajaCelB.top)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        //caja roja
        Box(
            modifier = Modifier
                .background(CelesteArgentina)
                .constrainAs(cajaCelB){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(cajaBlan.bottom)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Image(
            painter = painterResource(id = R.drawable.sol_argentina),
            contentDescription = "sol de mayo",
            modifier = Modifier
                .size(130.dp)
                .constrainAs(escudo){
                    top.linkTo(cajaBlan.top)
                    bottom.linkTo(cajaBlan.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
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