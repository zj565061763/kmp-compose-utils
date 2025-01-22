package com.sd.lib.kmp.compose_utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.layout.LocalPinnableContainer
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle

@Composable
fun fPin(): PinnedHandle? {
  val container = LocalPinnableContainer.current ?: return null
  return remember(container) { container.pin() }.also { pinnedHandle ->
    DisposableEffect(pinnedHandle) {
      onDispose { pinnedHandle.release() }
    }
  }
}