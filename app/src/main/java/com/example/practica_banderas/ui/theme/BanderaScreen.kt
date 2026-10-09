import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin
import com.example.practica_banderas.ui.theme.AzulIsrael

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize().background(Color.White)) {
        
        //franjas azules superiores e inferiores
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.weight(0.15f))
            Box(modifier = Modifier.weight(0.15f).fillMaxWidth().background(AzulIsrael))
            Spacer(modifier = Modifier.weight(0.40f))
            Box(modifier = Modifier.weight(0.15f).fillMaxWidth().background(AzulIsrael))
            Spacer(modifier = Modifier.weight(0.15f))
        }

       //estrella
        Canvas(modifier = Modifier.fillMaxSize()) {
            val cx = size.width / 2f
            val cy = size.height / 2f
            val r = size.height * 0.15f //radio del hexagrama

            fun trianglePath(rotationDeg: Float): Path {
                val path = Path()
                for (i in 0..2) {
                    val angle = Math.toRadians((rotationDeg + i * 120).toDouble())
                    val x = cx + r * cos(angle).toFloat()
                    val y = cy + r * sin(angle).toFloat()
                    if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
                }
                path.close()
                return path
            }

            drawPath(
                path = trianglePath(-90f),
                color = AzulIsrael,
                style = Stroke(width = 12f) //stroke para dibujar solo el contorno
            )

            drawPath(
                path = trianglePath(90f),
                color = AzulIsrael,
                style = Stroke(width = 12f)
            )
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