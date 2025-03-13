package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.task.innocrux.ui.theme.GradientBrush
import com.task.innocrux.ui.theme.SeasonViewColor

@Composable
fun DurationView(episodeDuration: Float, playedDuration: Float) {
    Canvas(
        modifier = Modifier
            .width(120.dp)
            .height(10.dp)
    ) {
        val totalWidth = size.width/1.8f
        val playedWidth = (playedDuration / episodeDuration) * totalWidth

        drawLine(
            color = SeasonViewColor,
            start = Offset(10f, size.height / 1.8f),
            end = Offset(totalWidth, size.height / 1.8f),
            strokeWidth = 10f,
            cap = StrokeCap.Round
        )

        drawLine(
            brush = GradientBrush,
            start = Offset(10f, size.height / 1.8f),
            end = Offset(10f + playedWidth, size.height / 1.8f),
            strokeWidth = 10f,
            cap = StrokeCap.Round
        )
    }
}


