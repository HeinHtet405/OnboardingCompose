package com.devshub.onboardingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.devshub.onboardingcompose.navigation.SetupNavGraph
import com.devshub.onboardingcompose.ui.theme.OnboardingComposeTheme
import com.devshub.onboardingcompose.ui.theme.Orange300
import com.devshub.onboardingcompose.viewmodel.SplashViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ExperimentalAnimationApi
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }
        setContent {
            OnboardingComposeTheme {
                rememberSystemUiController().setStatusBarColor(
                    Orange300,
                    darkIcons = true
                )
                val screen by splashViewModel.startDestination
                val navController = rememberNavController()
                SetupNavGraph(navHostController = navController, startDestination = screen)
            }
        }
    }
}