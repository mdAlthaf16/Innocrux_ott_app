package com.task.innocrux.features.moviedetail.presentation.tabs.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.presentation.tabs.components.ListEpisodeItem

@Composable
fun RelatedMovieScreen(movieDetailResponse: MovieDetailResponse) {

    Column(
        modifier = Modifier
            .padding(horizontal = 12.dp)

    ) {

        movieDetailResponse.relatedMovie.forEach { movies ->
            ListEpisodeItem(movies)
        }
    }
}