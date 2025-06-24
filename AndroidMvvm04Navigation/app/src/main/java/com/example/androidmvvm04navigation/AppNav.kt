package com.example.androidmvvm04navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androidmvvm04navigation.view.ScreenA
import com.example.androidmvvm04navigation.view.ScreenB
import com.example.androidmvvm04navigation.viewmodel.AppViewModel

@Composable
fun AppNav(modifier: Modifier, navController: NavHostController, appViewModel: AppViewModel) {

    NavHost(navController = navController, startDestination = Route.screen_a, builder = {
        composable(Route.screen_a) {
            ScreenA(modifier, navController, appViewModel)
        }
        composable(Route.screen_b) {
            ScreenB(modifier, navController, appViewModel)
        }
    })
}
