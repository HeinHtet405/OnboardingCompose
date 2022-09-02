package com.devshub.onboardingcompose.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.devshub.onboardingcompose.screen.HomeScreen
import com.devshub.onboardingcompose.screen.WelcomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

/**
 * Created by Hein Htet Aung on 01/09/2022 11:21 PM.
 */
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navHostController = navHostController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
    }
}