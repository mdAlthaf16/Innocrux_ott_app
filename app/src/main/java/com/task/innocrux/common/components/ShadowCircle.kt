package com.task.innocrux.common.components

import android.graphics.Shader
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.unit.dp

@Composable
fun ShadowCircle(
    size : Int = 400,
    color: Color = Color.White.copy(0.2f)
) {

    val largeRadialGradient = object : ShaderBrush() {
        override fun createShader(size: Size): Shader {
            val biggerDimension = maxOf(size.height, size.width)
            return RadialGradientShader(
                colors = listOf(color, Color.Transparent),
                center = size.center,
                radius = biggerDimension / 2f,
                colorStops = listOf(0f, 0.99f)
            )
        }
    }

    Box(
        modifier = Modifier
            .size(size.dp)
            .background(largeRadialGradient)
    )
}