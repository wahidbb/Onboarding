package no.beiningbogen.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import no.beiningbogen.oboardinginternal.R

@Composable
fun MainScreen(navController: NavController) {
    // Box to center the content
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp),
        contentAlignment = Alignment.Center
    ) {
        // Column for the buttons
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            // Nyansatt Button with an image
            Button(modifier = Modifier
                .width(310.dp)
                .height(64.dp)
                .border(1.dp, Color.Black, shape = RoundedCornerShape(30.dp)),
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = {
                    navController.navigate("nyansatt")
                }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.nyansatt),
                    contentDescription = "Nyansatt",
                    tint = Color.Black
                )
            }
            // Mentor Button with an image
            Button(modifier = Modifier
                .width(310.dp)
                .height(64.dp)
                .border(1.dp, Color.Black, shape = RoundedCornerShape(30.dp)),
                colors = ButtonDefaults.buttonColors(Color.White),
                onClick = {
                    navController.navigate("mentor")
                }) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.mentor),
                    contentDescription = "Mentor",
                    tint = Color.Black
                )
            }
        }
    }
}