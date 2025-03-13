package com.task.innocrux.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.task.innocrux.ui.theme.GradientBrush

@Composable
fun DotView(
    size: Int = 5
) {

    Box(
        modifier = Modifier
            .padding(horizontal = 5.dp)
            .size(size.dp)
            .clip(RoundedCornerShape(100))
            .background(GradientBrush)

    )

}