import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.task.innocrux.ui.theme.LightGreenColor
import com.webtoonscorp.android.readmore.foundation.ReadMoreTextOverflow
import com.webtoonscorp.android.readmore.foundation.ToggleArea
import com.webtoonscorp.android.readmore.material3.ReadMoreText

@Composable
fun MovieDescriptionView(
    description: String,
    modifier: Modifier = Modifier,
    expandedState: Boolean,
    onExpandedChange: (Boolean) -> Unit,
) {
    ReadMoreText(
        text = description,
        color = Color.Gray,
        fontSize = 12.sp,
        expanded = expandedState,
        onExpandedChange = onExpandedChange,
        lineHeight = 18.sp,

        modifier = modifier,

        // Read More
        readMoreText = "Read More",
        readMoreColor = LightGreenColor,
        readMoreMaxLines = 3,
        readMoreFontSize = 12.sp,
        readMoreOverflow = ReadMoreTextOverflow.Ellipsis,

        // Read Less
        readLessText = "Read Less",
        readLessColor = LightGreenColor,
        readLessFontSize = 12.sp,
        toggleArea = ToggleArea.All
    )
}


