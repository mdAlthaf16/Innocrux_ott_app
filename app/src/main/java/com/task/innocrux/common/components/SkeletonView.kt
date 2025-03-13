package com.task.innocrux.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

@Composable
fun SkeletonView(
    modifier: Modifier,
    radius: Int = 10
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(radius))
            .background(Color.Gray.copy(0.1f))
    )
}