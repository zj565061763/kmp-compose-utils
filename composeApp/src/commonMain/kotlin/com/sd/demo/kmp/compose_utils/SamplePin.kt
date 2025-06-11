package com.sd.demo.kmp.compose_utils

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import com.sd.lib.kmp.compose_utils.fPin

@Composable
fun SamplePin(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SamplePin",
    onClickBack = onClickBack,
    verticalScroll = false,
  ) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
      items(100) { index ->
        if (index <= 5) fPin()
        ItemView(index = index)
      }
    }
  }
}

@Composable
private fun ItemView(
  modifier: Modifier = Modifier,
  index: Int,
) {
  Button(
    modifier = modifier.fillMaxWidth(),
    onClick = {},
  ) {
    Text(text = index.toString())
  }

  DisposableEffect(index) {
    logMsg { "ItemView $index" }
    onDispose { logMsg { "ItemView $index onDispose" } }
  }
}