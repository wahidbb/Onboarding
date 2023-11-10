package no.beiningbogen.Bars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import no.beiningbogen.oboardinginternal.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTaskScreenTopBar(title: String, score: String, onBackClicked: () -> Unit) {
    val markerFelt = FontFamily(
        Font(R.font.marker_felt) // Replace with your font resource ID
    )
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = onBackClicked) {
                        Icon(
                            painter = painterResource(id = R.drawable.rank), // Replace with your back arrow drawable resource ID
                            contentDescription = "Back",
                            tint = Color.Unspecified
                        )
                    }
                    Text(
                        text = title,
                        fontFamily = markerFelt,
                        color = Color.Black
                    )
                }
                Text(
                    modifier = Modifier.padding(top = 20.dp, end = 20.dp),
                    text = score,
                    fontFamily = markerFelt, // Adjust text style as needed
                    color = Color.Black
                )
            }
        },
        navigationIcon = {}, // Navigation icon is included in the title row
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White) // Set the TopAppBar background color
    )
}