package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.task.innocrux.features.moviedetail.domain.model.MovieDetail
import com.task.innocrux.utils.TextUtils

@Composable
fun MovieMakingDetail(movieDetail: MovieDetail) {

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            TextUtils.SubTitle(text = movieDetail.detailKey)
            Spacer(Modifier.width(5.dp))
            TextUtils.Title(text = movieDetail.detailValue)

        }

        Spacer(Modifier.height(7.dp))
    }
}