import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practica_banderas.ui.theme.AzulBrasil
import com.example.practica_banderas.ui.theme.AmarilloBrasil
import com.example.practica_banderas.ui.theme.VerdeBrasil

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier
            .fillMaxSize()
            .background(VerdeBrasil)
    ) {
        val (rombo, circulo) = createRefs()


        val guiaArriba = createGuidelineFromTop(0.30f)
        val guiaAbajo = createGuidelineFromTop(0.70f)

        val guiaIzquierda = createGuidelineFromStart(0.05f)
        val guiaDerecha = createGuidelineFromStart(0.95f)


        Box(
            modifier = Modifier.constrainAs(rombo) {
                top.linkTo(guiaArriba)
                bottom.linkTo(guiaAbajo)
                start.linkTo(guiaIzquierda)
                end.linkTo(guiaDerecha)
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
            }
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val w = size.width
                val h = size.height

                val path = Path().apply {
                    moveTo(w / 2f, 0f)
                    lineTo(w, h / 2f)
                    lineTo(w / 2f, h)
                    lineTo(0f, h / 2f)
                    close()
                }

                drawPath(path = path, color = AmarilloBrasil)
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(0.35f)
                .aspectRatio(1f)
                .clip(CircleShape)
                .background(AzulBrasil)
                .constrainAs(circulo) {
                    top.linkTo(rombo.top)
                    bottom.linkTo(rombo.bottom)
                    start.linkTo(rombo.start)
                    end.linkTo(rombo.end)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    Surface {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
}