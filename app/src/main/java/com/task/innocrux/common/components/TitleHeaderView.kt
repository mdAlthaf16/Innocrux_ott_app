package com.task.innocrux.common.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.task.innocrux.R
import com.task.innocrux.ui.theme.LightGreenColor
import com.task.innocrux.utils.TextUtils

@Composable
fun TitleHeaderView(
    title: String,
    onClickSeeAll: () -> Unit
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        TextUtils.Heading(title)
        Spacer(Modifier.width(10.dp))
        TextButton(onClick = { onClickSeeAll.invoke() }, contentPadding = PaddingValues(end = 0.dp, start = 10.dp)) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TextUtils.Title(stringResource(R.string.seeAll), color = LightGreenColor)
                Icon(
                    Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = LightGreenColor,
                    modifier = Modifier.size(15.dp)
                )
            }
        }
    }
}