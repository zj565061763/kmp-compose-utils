package com.sd.lib.kmp.compose_utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp

@Composable
infix fun PaddingValues.fPlus(other: PaddingValues): PaddingValues {
  val layoutDirection = LocalLayoutDirection.current
  return PaddingValues(
    top = this.calculateTopPadding() + other.calculateTopPadding(),
    bottom = this.calculateBottomPadding() + other.calculateBottomPadding(),
    start = this.calculateStartPadding(layoutDirection) + other.calculateStartPadding(layoutDirection),
    end = this.calculateEndPadding(layoutDirection) + other.calculateEndPadding(layoutDirection),
  )
}

@Composable
fun PaddingValues.fStartPadding(): Dp = calculateStartPadding(LocalLayoutDirection.current)

@Composable
fun PaddingValues.fEndPadding(): Dp = calculateEndPadding(LocalLayoutDirection.current)