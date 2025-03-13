package com.task.innocrux.features.moviedetail.presentation.tabs.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.task.innocrux.R
import com.task.innocrux.features.moviedetail.domain.model.Episode
import com.task.innocrux.features.moviedetail.presentation.components.DurationView
import com.task.innocrux.utils.TextUtils

@Composable
fun ListEpisodeItem(episode: Episode) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
            .clickable { }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(70.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Gray.copy(0.2f))
            ) {


                AsyncImage(
                    model = episode.episodeBanner,
                    contentDescription = "episode_image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.align(Alignment.Center)
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Black.copy(0.2f)),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(painter = painterResource(R.drawable.play_circle_icon), contentDescription = null, Modifier.size(30.dp), tint = Color.White)
                }

            }
            Spacer(Modifier.width(10.dp))

            Column(
                modifier = Modifier.weight(2f),
                horizontalAlignment = Alignment.Start
            ) {

                TextUtils.Title(text = episode.episodeTitle, maxLines = 2)
                Spacer(Modifier.height(5.dp))


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    if (episode.playedDuration > 0) {
                        DurationView(episode.episodeDuration, episode.playedDuration)
                    }

                    val duration = if (episode.episodeDuration - episode.playedDuration == episode.episodeDuration) "${episode.episodeDuration} mins"
                    else if (episode.episodeDuration - episode.playedDuration <= 0) "Watched" else "${episode.episodeDuration - episode.playedDuration} mins left"

                    TextUtils.SubTitle(text = duration)
                }

            }
        }

        Spacer(Modifier.height(5.dp))
        TextUtils.SubTitle(text = episode.episodeDescription, maxLines = 2)

    }
}