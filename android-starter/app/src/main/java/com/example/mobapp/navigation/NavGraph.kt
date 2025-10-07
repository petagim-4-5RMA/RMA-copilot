package com.example.mobapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mobapp.ui.screens.*

object Routes {
    const val HOME = "home"
    const val DETAILS = "details/{title}"
    const val PHOTOS = "photos"

    const val NOTES = "notes"
    const val NOTE_NEW = "note/new"
    const val NOTE_EDIT = "note/{id}"
}

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(
                toDetails = { title -> nav.navigate("details/$title") },
                toPhotos = { nav.navigate(Routes.PHOTOS) },
                toNotes = { nav.navigate(Routes.NOTES) }
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
        composable(Routes.NOTES) {
            NotesListScreen(
                onBack = { nav.popBackStack() },
                onNew = { nav.navigate(Routes.NOTE_NEW) },
                onOpen = { id -> nav.navigate("note/$id") }
            )
        }
        composable(Routes.NOTE_NEW) {
            NoteEditScreen(noteId = null, onBack = { nav.popBackStack() })
        }
        composable(
            route = Routes.NOTE_EDIT,
            arguments = listOf(navArgument("id") { type = NavType.LongType })
        ) { backStack ->
            val id = backStack.arguments?.getLong("id")
            NoteEditScreen(noteId = id, onBack = { nav.popBackStack() })
        }
    }
}