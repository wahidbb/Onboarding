package no.beiningbogen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import no.beiningbogen.screens.MainScreen
import no.beiningbogen.screens.MentorScreen
import no.beiningbogen.screens.NyansattScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen") {
        composable("main_screen") { MainScreen(navController) }
        composable("nyansatt") { NyansattScreen() }
        composable("mentor") { MentorScreen() }
        // Add more destinations as needed
    }
}
