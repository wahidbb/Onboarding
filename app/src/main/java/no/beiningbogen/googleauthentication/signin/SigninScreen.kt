package no.beiningbogen.googleauthentication.signin

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import no.beiningbogen.oboardinginternal.R


@Composable
fun SignInScreen(
    state: SignInState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current

    // Handle the sign-in error with a Toast
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_LONG).show()
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            // Logo as an SVG image
            Icon(
                painter = painterResource(id = R.drawable.b_b_logo), // Replace with the actual resource ID for your logo
                contentDescription = "Company Logo",
                modifier = Modifier.size(width = 285.92.dp, height = 131.dp) // Adjust size accordingly
            )

            Spacer(modifier = Modifier.height(300.dp))

            // Google Sign-In button as an SVG image
            Icon(
                painter = painterResource(id = R.drawable.login_button),
                contentDescription = "Log in with Google",
                modifier = Modifier.padding(bottom = 0.dp)
                    .size(width = 310.dp, height = 64.dp)
                    .clickable(onClick = onSignInClick),
                tint = Color.Unspecified            )
        }
    }
}
