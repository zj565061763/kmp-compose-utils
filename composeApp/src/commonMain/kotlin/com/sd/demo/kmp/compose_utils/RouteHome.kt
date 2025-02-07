package com.sd.demo.kmp.compose_utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RouteHome(
  onClickSampleClick: () -> Unit,
  onClickSamplePin: () -> Unit,
  onClickSampleVerticalGrid: () -> Unit,
) {
  Scaffold { padding ->
    Column(
      modifier = Modifier.fillMaxSize().padding(padding),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      Button(onClick = onClickSampleClick) { Text(text = "SampleClick") }
      Button(onClick = onClickSamplePin) { Text(text = "SamplePin") }
      Button(onClick = onClickSampleVerticalGrid) { Text(text = "SampleVerticalGrid") }
    }
  }
}