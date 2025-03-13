package com.task.innocrux.features.moviedetail.presentation.components

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.task.innocrux.R
import com.task.innocrux.utils.TextUtils

@Composable
fun MovieActionView() {

    val context = LocalContext.current

    val actionList = listOf(
        ActionContent(icon = R.drawable.add_icon, description = stringResource(R.string.addToList)),
        ActionContent(icon = R.drawable.screen_play_icon, description = stringResource(R.string.trailer)),
        ActionContent(icon = R.drawable.download_icon, description = stringResource(R.string.download)),
        ActionContent(icon = R.drawable.share_icon, description = stringResource(R.string.share)),
        ActionContent(icon = R.drawable.bookmark_icon, description = stringResource(R.string.bookMark)),
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        items(actionList) { actions ->
            ActionButtons(
                icon = actions.icon,
                description = actions.description,
                onClick = { action -> showToast(context, action) }
            )
        }

    }
}

@SuppressLint("UnrememberedMutableInteractionSource")
@Composable
fun ActionButtons(
    icon: Int,
    description: String,
    onClick: (String) -> Unit

) {
    Column(
        modifier = Modifier
            .width(65.dp)
            .clickable(
                interactionSource = MutableInteractionSource(),
                indication = null
            ) {
                onClick.invoke(description)
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(100))
                .background(Color.Gray.copy(0.5f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(icon), contentDescription = description, Modifier.size(18.dp), tint = Color.White.copy(alpha = 0.7f))
        }

        Spacer(Modifier.height(5.dp))

        TextUtils.SubTitle(text = description, modifier = Modifier.padding(horizontal = 2.dp))
    }
}

fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

data class ActionContent(
    val icon: Int,
    val description: String
)