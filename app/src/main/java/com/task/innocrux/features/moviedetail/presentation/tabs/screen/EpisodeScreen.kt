package com.task.innocrux.features.moviedetail.presentation.tabs.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.presentation.tabs.components.ListEpisodeItem
import com.task.innocrux.features.moviedetail.presentation.tabs.components.SeasonView

@Composable
fun EpisodeScreen(movieDetailResponse: MovieDetailResponse) {

    Column(
        modifier = Modifier
            .padding(horizontal = 12.dp)
            .padding(top = 20.dp)

    ) {

        LazyRow {

            itemsIndexed(movieDetailResponse.movieSeasons) { _, season ->
                SeasonView(season)

            }

        }

        movieDetailResponse.movieEpisodes.forEachIndexed { _, episode ->
            ListEpisodeItem(episode)
        }

    }


}