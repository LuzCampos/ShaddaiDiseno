package com.myprojects.shaddaidiseno

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.myprojects.shaddaidiseno.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    LaunchedEffect(key1 = true ){
        delay(3000)
        navController.popBackStack()
        navController.navigate(AppScreens.HomeScreen.route)
    }
    Splash()
}

@Composable
fun Splash(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.icon), contentDescription = "logo" )
        //Text("")
    }
}

@Preview (showBackground = true)
@Composable
fun PreviewSplash(){
    Splash()
}