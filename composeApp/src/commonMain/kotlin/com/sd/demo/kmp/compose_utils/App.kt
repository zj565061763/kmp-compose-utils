package com.sd.demo.kmp.compose_utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun App() {
  MaterialTheme {
    val navController = rememberNavController()
    NavHost(
      navController = navController,
      startDestination = AppRoute.Home,
    ) {
      composable<AppRoute.Home> {
        RouteHome(
          onClickSampleClick = { navController.navigate(AppRoute.SampleClick) },
          onClickSamplePin = { navController.navigate(AppRoute.SamplePin) },
        )
      }
      composable<AppRoute.SampleClick> {
        SampleClick(onClickBack = { navController.popBackStack() })
      }
      composable<AppRoute.SamplePin> {
        SamplePin(onClickBack = { navController.popBackStack() })
      }
    }
  }
}

expect fun logMsg(tag: String = "kmp-compose-utils", block: () -> String)