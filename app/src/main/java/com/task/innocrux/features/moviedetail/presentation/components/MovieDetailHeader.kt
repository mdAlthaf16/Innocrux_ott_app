package com.task.innocrux.features.moviedetail.presentation.components

import MovieDescriptionView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.task.innocrux.R
import com.task.innocrux.features.moviedetail.domain.model.MovieDetailResponse
import com.task.innocrux.ui.theme.GradientBrush
import com.task.innocrux.utils.TextUtils

@Composable
fun MovieDetailHeader(movieDetailResponse: MovieDetailResponse) {

    val (expanded, onExpandedChange) = rememberSaveable { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box {

            // Poster image
            AsyncImage(
                model = movieDetailResponse.moviePosterUrl,
                contentDescription = "movie_poster",
                placeholder = painterResource(R.drawable.poster_image),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            // Back button top of the post image
            IconButton(
                modifier = Modifier.padding(top = 24.dp, start = 7.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.Gray.copy(0.4f)
                ),
                onClick = {}
            ) { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowLeft, contentDescription = null, tint = Color.White) }


        }

        Spacer(Modifier.height(5.dp))

        // move title image
        AsyncImage(
            model = movieDetailResponse.movieNameUrl,
            contentDescription = "movie_poster",
            placeholder = painterResource(R.drawable.iron_man_title_image),
            modifier = Modifier
                .width(150.dp)
                .height(60.dp),
        )

        Spacer(Modifier.height(5.dp))
        MovieInfoView(movieDetailResponse.movieInfo)
        Spacer(Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(GradientBrush)
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color.Transparent
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(Icons.Filled.PlayArrow, contentDescription = null, Modifier.size(20.dp), tint = Color.White)
                    Spacer(Modifier.width(10.dp))
                    TextUtils.Title(stringResource(R.string.startWatching))
                }
            }

        }

        Spacer(Modifier.height(25.dp))

        MovieActionView()
        Spacer(Modifier.height(20.dp))


        MovieDescriptionView(
            modifier = Modifier.padding(horizontal = 12.dp),
            description = movieDetailResponse.movieDescription,
            expandedState = expanded,
            onExpandedChange = onExpandedChange
        )

        Spacer(Modifier.height(20.dp))


    }

}