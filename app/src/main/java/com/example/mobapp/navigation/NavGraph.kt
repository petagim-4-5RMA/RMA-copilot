package com.example.mobapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mobapp.ui.screens.DetailsScreen
import com.example.mobapp.ui.screens.HomeScreen
import com.example.mobapp.ui.screens.PhotoListScreen

object Routes {
    const val HOME = "home"
    const val DETAILS = "details/{title}"
    const val PHOTOS = "photos"
}

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(
                toDetails = { title -> nav.navigate("details/$title") },
                toPhotos = { nav.navigate(Routes.PHOTOS) }
            )
        }
        composable(
            route = Routes.DETAILS,
            arguments = listOf(navArgument("title") { type = NavType.StringType })
        ) { backStack ->
            val title = backStack.arguments?.getString("title") ?: "Detalji"
            DetailsScreen(title = title) { nav.popBackStack() }
        }
        composable(Routes.PHOTOS) {
            PhotoListScreen(onBack = { nav.popBackStack() })
        }
    }
}