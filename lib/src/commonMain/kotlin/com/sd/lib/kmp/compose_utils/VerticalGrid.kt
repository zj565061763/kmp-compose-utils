package com.sd.lib.kmp.compose_utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun FVerticalGrid(
  modifier: Modifier = Modifier,
  /** Item的数量 */
  itemCount: Int,
  /** 每一行的Item数量 */
  itemCountPerRow: Int,
  /** 水平间距 */
  horizontalSpacing: Dp = 0.dp,
  /** 竖直间距 */
  verticalSpacing: Dp = 0.dp,
  /** Item的内容 */
  itemContent: @Composable (Int) -> Unit,
) {
  require(itemCount >= 0)
  require(itemCountPerRow > 0)

  val (safeCount, maxIndex) = remember(itemCount, itemCountPerRow) {
    val mod = itemCount % itemCountPerRow
    val safeCount = if (mod > 0) itemCount + (itemCountPerRow - mod) else itemCount
    val maxIndex = itemCount - 1
    safeCount to maxIndex
  }

  @OptIn(ExperimentalLayoutApi::class)
  FlowRow(
    modifier = modifier,
    horizontalArrangement = Arrangement.spacedBy(horizontalSpacing),
    verticalArrangement = Arrangement.spacedBy(verticalSpacing),
    maxItemsInEachRow = itemCountPerRow,
  ) {
    repeat(safeCount) { index ->
      Box(modifier = Modifier.weight(1f)) {
        if (index <= maxIndex) {
          itemContent(index)
        }
      }
    }
  }
}