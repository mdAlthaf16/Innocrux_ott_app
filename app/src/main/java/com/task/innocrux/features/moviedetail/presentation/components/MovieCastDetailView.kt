package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.task.innocrux.R
import com.task.innocrux.common.components.TitleHeaderView
import com.task.innocrux.features.moviedetail.domain.model.CastMember

@Composable
fun MovieCastDetailView(movieCast: List<CastMember>) {

    Column {

        TitleHeaderView(
            title = stringResource(R.string.castDetails),
            onClickSeeAll = { }
        )

        Spacer(Modifier.height(10.dp))

        LazyRow(
            modifier = Modifier.height(120.dp)
        ) {

            items(movieCast) { castDetails ->
                CastView(castDetails)
            }
        }

    }
}