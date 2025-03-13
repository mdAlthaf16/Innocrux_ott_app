package com.task.innocrux.features.moviedetail.presentation.tabs.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.presentation.components.MovieMakingDetail

@Composable
fun ProductionDetailScreen(movieDetailResponse: MovieDetailResponse) {

    Column(
        modifier = Modifier.padding(vertical = 15.dp)

    ) {

        movieDetailResponse.movieDetail.forEach { movieDetail ->
            MovieMakingDetail(movieDetail)
        }
    }
}