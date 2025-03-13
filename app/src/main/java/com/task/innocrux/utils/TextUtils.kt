package com.task.innocrux.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

object TextUtils {


    @Composable
    fun Heading(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.White,
        fontSize: Int = 14,
        fontWeight: FontWeight = FontWeight.SemiBold,
        textAlign: TextAlign = TextAlign.Start,
        maxLines: Int = 1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        lineHeight: Int = 15

    ) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize.sp,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines,
            overflow = overflow,
            lineHeight = lineHeight.sp
        )
    }

    @Composable
    fun Title(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.White,
        fontSize: Int = 13,
        fontWeight: FontWeight = FontWeight.Normal,
        textAlign: TextAlign = TextAlign.Start,
        maxLines: Int = 1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        lineHeight: Int = 15
    ) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize.sp,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines,
            overflow = overflow,
            lineHeight = lineHeight.sp
        )
    }


    @Composable
    fun SubTitle(
        text: String,
        modifier: Modifier = Modifier,
        color: Color = Color.Gray,
        fontSize: Int = 12,
        fontWeight: FontWeight = FontWeight.Normal,
        textAlign: TextAlign = TextAlign.Start,
        maxLines: Int = 1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        lineHeight: Int = 15

    ) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize.sp,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines,
            overflow = overflow,
            lineHeight = lineHeight.sp
        )
    }

}