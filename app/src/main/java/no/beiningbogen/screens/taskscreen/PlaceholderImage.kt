package no.beiningbogen.screens.taskscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import no.beiningbogen.oboardinginternal.R

@Composable
fun PlaceholderImage() {
    val markerFelt = FontFamily(
        Font(R.font.marker_felt)
    )
    // This box acts as the container for your placeholder
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray)
    ) {
        Column {
            // Top half with text and image
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(11f) // Takes half the height of the Box
            ) {
                Image(
                    painter = painterResource(id = R.drawable.segmented_control),
                    contentDescription = "Placeholder Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f) // Takes the remaining half of the height
                        .padding(top = 10.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(11f) // Takes half the height of the Box
            ) {
                Text(
                    text = "The basics",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 16.dp, bottom = 20.dp),
                    fontFamily = markerFelt,
                    fontSize = 50.sp,
                )
            }
            Image(
                painter = painterResource(id = R.drawable.avatar_3),
                contentDescription = "Placeholder Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Takes the remaining half of the height
            )

            // Bottom half with just an image
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Placeholder Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
    }
}

