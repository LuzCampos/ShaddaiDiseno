package com.myprojects.shaddaidiseno.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.myprojects.shaddaidiseno.SplashScreen
import com.myprojects.shaddaidiseno.ui.theme.home.HomeScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    val splashScreen = AppScreens.SplashScreen.route

    NavHost(navController = navController,
            startDestination = splashScreen)
    {
        composable(splashScreen){
            SplashScreen(navController)

        }
        composable(AppScreens.HomeScreen.route){
            HomeScreen()
        }
    }
}