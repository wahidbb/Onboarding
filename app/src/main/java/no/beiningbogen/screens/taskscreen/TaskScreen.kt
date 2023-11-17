package no.beiningbogen.screens.taskscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import no.beiningbogen.bars.MainTaskScreenTopBar
import no.beiningbogen.oboardinginternal.R

@Composable
fun TaskScreen(onSignOut: () -> Unit, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    ) {
        // Top bar with back button, title, and sign out button
        val markerFelt = FontFamily(
            Font(R.font.marker_felt)
        )
        MainTaskScreenTopBar(
            title = "Wahid\nJunior Android developer", score = "29", onBackClicked = {
                navController.navigate("game_screen")
            }, onSignOut = onSignOut // Pass the sign-out action
            , navController
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
        ) {
            TaskScreenItems()

        }
    }
}
