package no.beiningbogen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import no.beiningbogen.Bars.MainTaskScreenTopBar
import no.beiningbogen.oboardinginternal.R

@Composable
fun MainTaskScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        // Top bar with back button and title
        val markerFelt = FontFamily(
            Font(R.font.marker_felt)
        )
        MainTaskScreenTopBar(
            title = "Wahid\nJunior Android developer",
            score = "29",
            onBackClicked = {
                // Handle back button click here
            }, // Applying a black background
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            // Background
            Image(
                painter = painterResource(id = R.drawable.landscape),
                contentDescription = "Background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
            ) {
                // Characters and Houses
                Row(modifier = Modifier.padding(start = 146.dp, top = 30.dp, end = 213.dp)) {
                    // Character: Olav
                    Image(
                        painter = painterResource(id = R.drawable.avatar_2),
                        contentDescription = "Olav",
                        modifier = Modifier
                            .width(28.08.dp)
                            .height(55.17766.dp)
                            .size(64.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 225.dp, top = 58.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "Player",
                        modifier = Modifier
                            .width(60.5.dp)
                            .height(113.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 230.dp, top = 158.dp, end = 9.dp)) {
                    Text(
                        text = "ARENA", modifier = Modifier,
                        fontFamily = markerFelt,
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.Black, // Shadow color
                                offset = Offset(
                                    8f,
                                    8f
                                ), // Horizontal and vertical offset of the shadow
                                blurRadius = 8f // Blur radius of the shadow
                            )
                        )
                    )
                }

                Row(modifier = Modifier.padding(start = 255.dp, top = 230.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "House",
                        modifier = Modifier
                            .width(60.5.dp)
                            .height(113.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 260.dp, top = 330.dp, end = 9.dp)) {
                    Text(
                        text = "TASKS", modifier = Modifier,
                        fontFamily = markerFelt,
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.Black, // Shadow color
                                offset = Offset(
                                    8f,
                                    8f
                                ), // Horizontal and vertical offset of the shadow
                                blurRadius = 8f // Blur radius of the shadow
                            )
                        )
                    )
                }
                Row(modifier = Modifier.padding(start = 180.dp, top = 315.dp, end = 181.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = "Olav",
                        modifier = Modifier
                            .width(28.08.dp)
                            .height(55.17766.dp)
                            .size(64.dp)
                    )
                }
            }
            Box(modifier = Modifier) {
                Row(modifier = Modifier.padding(start = 100.dp, top = 350.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "House",
                        modifier = Modifier
                            .width(60.5.dp)
                            .height(113.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 110.dp, top = 450.dp, end = 9.dp)) {
                    Text(
                        text = "SHOP", modifier = Modifier,
                        fontFamily = markerFelt,
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.Black, // Shadow color
                                offset = Offset(
                                    8f,
                                    8f
                                ), // Horizontal and vertical offset of the shadow
                                blurRadius = 8f // Blur radius of the shadow
                            )
                        )
                    )
                }
                Row(modifier = Modifier.padding(start = 340.dp, top = 380.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar_3),
                        contentDescription = "Character 1",
                        modifier = Modifier
                            .width(28.08.dp)
                            .height(55.17766.dp)
                            .size(64.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 220.dp, top = 420.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "House",
                        modifier = Modifier
                            .width(60.5.dp)
                            .height(113.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 220.dp, top = 520.dp, end = 9.dp)) {
                    Text(
                        text = "CANTEEN", modifier = Modifier,
                        fontFamily = markerFelt,
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.Black, // Shadow color
                                offset = Offset(
                                    8f,
                                    8f
                                ), // Horizontal and vertical offset of the shadow
                                blurRadius = 8f // Blur radius of the shadow
                            )
                        )
                    )
                }
                Row(modifier = Modifier.padding(start = 100.dp, top = 490.dp, end = 9.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.house),
                        contentDescription = "House",
                        modifier = Modifier
                            .width(60.5.dp)
                            .height(113.dp)
                    )
                }
                Row(modifier = Modifier.padding(start = 108.dp, top = 590.dp, end = 9.dp)) {
                    Text(
                        text = "SHOP", modifier = Modifier,
                        fontFamily = markerFelt,
                        fontSize = 20.sp,
                        color = Color.White,
                        style = TextStyle(
                            shadow = Shadow(
                                color = Color.Black, // Shadow color
                                offset = Offset(
                                    8f,
                                    8f
                                ), // Horizontal and vertical offset of the shadow
                                blurRadius = 8f // Blur radius of the shadow
                            )
                        )
                    )
                }
            }

        }
    }
}

@Preview
@Composable
fun SquareComposablePreview() {
    Box(Modifier.background(Color.Yellow)) {
        MainTaskScreen()
    }
}