package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults.SecondaryIndicator
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.task.innocrux.R
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.features.moviedetail.presentation.tabs.screen.EpisodeScreen
import com.task.innocrux.features.moviedetail.presentation.tabs.screen.ProductionDetailScreen
import com.task.innocrux.features.moviedetail.presentation.tabs.screen.RelatedMovieScreen
import com.task.innocrux.ui.theme.LightGreenColor
import com.task.innocrux.ui.theme.PrimaryColor
import com.task.innocrux.utils.TextUtils

@Composable
fun MovieDetailTabView(
    movieDetailResponse: MovieDetailResponse,
    onClickTab: (Int) -> Unit
) {
    val tabItems = listOf(
        TabItem(title = stringResource(R.string.episodes)),
        TabItem(title = stringResource(R.string.movieDetails)),
        TabItem(title = stringResource(R.string.moreLikeThis)),
    )

    var selectedTabIndex by remember { mutableIntStateOf(0) }


    Column {
        ScrollableTabRow(
            containerColor = PrimaryColor,
            edgePadding = 0.dp,
            selectedTabIndex = selectedTabIndex,
            divider = {},
            indicator = { tabPositions ->
                SecondaryIndicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex])
                        .padding(horizontal = 18.dp),
                    height = 3.dp,
                    color = LightGreenColor
                )
            }
        ) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    modifier = Modifier
                        .background(PrimaryColor)
                        .height(50.dp),
                    interactionSource = MutableInteractionSource(),
                    selected = index == selectedTabIndex,
                    onClick = {
                        selectedTabIndex = index
                        onClickTab.invoke(selectedTabIndex)
                    }
                ) {

                    TextUtils.Title(
                        text = item.title, color = if (selectedTabIndex == index) Color.White else Color.Gray, modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp)
                    )
                }
            }
        }


        when (selectedTabIndex) {
            0 -> {
                EpisodeScreen(movieDetailResponse)
            }

            1 -> {
                ProductionDetailScreen(movieDetailResponse)
            }

            2 -> {
                RelatedMovieScreen(movieDetailResponse)
            }

            else -> Unit
        }
    }
}

data class TabItem(
    val title: String
)

