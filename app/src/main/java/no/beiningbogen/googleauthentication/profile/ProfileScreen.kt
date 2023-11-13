package no.beiningbogen.googleauthentication.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import no.beiningbogen.googleauthentication.signin.UserData
import no.beiningbogen.oboardinginternal.R

@Composable
fun ProfileScreen(
    userData: UserData?,

    //TODO Going to use this signout in correct place
    navController: NavController
) {
    val markerFelt = FontFamily(
        Font(R.font.marker_felt)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (userData?.username != null) {
                Text(
                    text = "Hey ${userData.username}",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontFamily = markerFelt,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(R.string.welcome_txt),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontFamily = markerFelt
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 100.dp)
            ) {
                // Column for left arrows
                Column(verticalArrangement = Arrangement.Center) {
                    repeat(3) {
                        Icon(
                            painter = painterResource(id = R.drawable.button_arrow_left),
                            contentDescription = "Left Arrow"
                        )
                    }
                }

                // Check for profile picture URL and display image
                if (userData?.profilePictureUrl != null) {
                    AsyncImage(
                        model = userData.profilePictureUrl,
                        contentDescription = "Profile picture",
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }

                // Column for right arrows
                Column(verticalArrangement = Arrangement.Center) {
                    repeat(3) {
                        Icon(
                            painter = painterResource(id = R.drawable.button_arrow_right),
                            contentDescription = "Right Arrow"
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        //TODO Going to use this signout in correct place
        Icon(
            painter = painterResource(id = R.drawable.done_button),
            contentDescription = "Button Icon",
            tint = Color.Unspecified,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
                .clickable { navController.navigate("game_screen") }
        )
    }
}









