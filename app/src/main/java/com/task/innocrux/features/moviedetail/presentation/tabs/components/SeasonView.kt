package com.task.innocrux.features.moviedetail.presentation.tabs.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.task.innocrux.features.moviedetail.domain.model.Season
import com.task.innocrux.ui.theme.SeasonViewColor
import com.task.innocrux.utils.TextUtils

@Composable
fun SeasonView(season: Season) {

    Box(
        modifier = Modifier
            .padding(start = 5.dp)
            .wrapContentWidth()
            .height(35.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(SeasonViewColor)
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextUtils.SubTitle(text = season.seasonTitle, color = Color.White, modifier = Modifier.padding(start = 15.dp))
            Icon(
                Icons.Outlined.KeyboardArrowDown, contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .size(20.dp),

                tint = Color.White
            )
        }
    }
}