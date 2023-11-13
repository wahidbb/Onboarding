package no.beiningbogen.bars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import no.beiningbogen.oboardinginternal.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTaskScreenTopBar(
    title: String,
    score: String,
    onBackClicked: () -> Unit,
    onSignOut: () -> Unit,// Add this parameter for sign-out action
    navController: NavController
) {
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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        modifier = Modifier.padding(top = 20.dp),
                        text = score,
                        fontFamily = markerFelt, // Adjust text style as needed
                        color = Color.Black
                    )
                    SignOutMenu(
                        onSignOut = onSignOut
                    )

                }
            }
        },
        navigationIcon = {
//            navController.navigate("main_screen")
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White) // Set the TopAppBar background color
    )
}

@Composable
fun SignOutMenu(onSignOut: () -> Unit) {
    var showMenu by remember { mutableStateOf(false) }

    IconButton(onClick = { showMenu = true }) {
        Icon(
            imageVector = Icons.Default.MoreVert, // Three dots icon
            contentDescription = "More Options"
        )
    }
    DropdownMenu(
        expanded = showMenu,
        onDismissRequest = { showMenu = false }
    ) {
        DropdownMenuItem(
            text = { Text("Sign Out") },
            onClick = {
                onSignOut() // This is called when "Sign Out" is clicked
                showMenu = false
            }
        )
    }
}

