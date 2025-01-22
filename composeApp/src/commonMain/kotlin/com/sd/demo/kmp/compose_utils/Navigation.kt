package com.sd.demo.kmp.compose_utils

import kotlinx.serialization.Serializable

sealed interface AppRoute {
  @Serializable
  data object Home : AppRoute

  @Serializable
  data object SampleClick : AppRoute

  @Serializable
  data object SamplePin : AppRoute
}