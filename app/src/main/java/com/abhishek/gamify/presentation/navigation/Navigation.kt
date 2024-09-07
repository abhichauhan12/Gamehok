package com.abhishek.gamify.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abhishek.gamify.presentation.community.Community
import com.abhishek.gamify.presentation.home.Home
import com.abhishek.gamify.presentation.streams.Stream
import com.abhishek.gamify.presentation.tournament.Tournament
import com.abhishek.gamify.presentation.tournamentdetails.TournamentData

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Tournament : Screen("tournament")
    object Community : Screen("community")
    object Stream : Screen("stream")
    object TournamentDetail : Screen("tournamentDetail")
}

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { Home() }
        composable(Screen.Tournament.route) { Tournament(navController) }
        composable(Screen.Community.route) { Community() }
        composable(Screen.Stream.route) { Stream() }
        composable(Screen.TournamentDetail.route) { TournamentData()}
    }
}