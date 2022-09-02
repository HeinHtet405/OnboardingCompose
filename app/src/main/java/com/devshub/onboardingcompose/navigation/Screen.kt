package com.devshub.onboardingcompose.navigation

/**
 * Created by Hein Htet Aung on 01/09/2022 11:21 PM.
 */
sealed class Screen(val route: String) {
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
}