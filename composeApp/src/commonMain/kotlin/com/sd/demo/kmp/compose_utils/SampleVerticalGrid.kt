package com.sd.demo.kmp.compose_utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sd.lib.kmp.compose_utils.FVerticalGrid

@Composable
fun SampleVerticalGrid(
  onClickBack: () -> Unit,
) {
  RouteScaffold(
    title = "SampleVerticalGrid",
    onClickBack = onClickBack,
  ) {
    FVerticalGrid(
      modifier = Modifier.fillMaxWidth().background(Color.Red),
      itemCount = 9,
      itemCountPerRow = 3,
      horizontalSpacing = 1.dp,
      verticalSpacing = 1.dp,
    ) { index ->
      ItemView(
        text = index.toString()
      )
    }

    FVerticalGrid(
      modifier = Modifier.fillMaxWidth().background(Color.Red),
      itemCount = 10,
      itemCountPerRow = 3,
      horizontalSpacing = 1.dp,
      verticalSpacing = 1.dp,
    ) { index ->
      ItemView(text = index.toString())
    }

    FVerticalGrid(
      modifier = Modifier.fillMaxWidth().background(Color.Red),
      itemCount = 5,
      itemCountPerRow = 1,
      horizontalSpacing = 1.dp,
      verticalSpacing = 1.dp,
    ) { index ->
      ItemView(text = index.toString())
    }
  }
}

@Composable
private fun ItemView(
  modifier: Modifier = Modifier,
  text: String,
) {
  Box(
    modifier = modifier
      .fillMaxWidth()
      .aspectRatio(1f)
      .background(Color.Green),
    contentAlignment = Alignment.Center,
  ) {
    Text(text = text)
  }
}