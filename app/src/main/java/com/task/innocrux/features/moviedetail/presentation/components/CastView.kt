package com.task.innocrux.features.moviedetail.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.task.innocrux.features.moviedetail.domain.model.CastMember
import com.task.innocrux.utils.TextUtils

@Composable
fun CastView(castDetails: CastMember) {

    Column(
        modifier = Modifier
            .padding(end = 15.dp)
            .width(90.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(100))
                .background(Color.Gray.copy(0.2f))
        ) {

            AsyncImage(
                model = castDetails.profileUrl,
                contentDescription = "cast_image",
                contentScale = ContentScale.Crop
            )

        }

        Spacer(Modifier.height(5.dp))
        TextUtils.Title(castDetails.name)
        TextUtils.SubTitle(castDetails.role)

    }
}