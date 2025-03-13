package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.task.innocrux.common.components.DotView
import com.task.innocrux.features.moviedetail.domain.model.MovieInfo
import com.task.innocrux.utils.TextUtils

@Composable
fun MovieInfoView(movieInfo: List<MovieInfo>) {

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        itemsIndexed(movieInfo) { index, info ->

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextUtils.Title(text = info.movieInfo, fontSize = 10)
                if (index != movieInfo.size - 1) {
                    DotView()
                }
            }
        }


    }

}

