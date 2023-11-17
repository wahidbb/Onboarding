package no.beiningbogen.screens.taskscreen

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import no.beiningbogen.oboardinginternal.R
import no.beiningbogen.oboardinginternal.pairs

@Composable
fun TaskScreenItems() {
    val markerFelt = FontFamily(Font(R.font.marker_felt)) // Replace with your font resource ID

    // Define your list of items with corresponding links
    val itemsList = pairs()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            PlaceholderImage()
        }
        items(itemsList) { itemPair ->
            RowItem(text = itemPair.first, url = itemPair.second, font = markerFelt)
        }
    }
}

@Composable
fun RowItem(text: String, url: String, font: FontFamily) {
    val context = LocalContext.current
    val interactionSource = remember { MutableInteractionSource() }

    Row(
        modifier = Modifier
            .border(width = 0.5.dp, color = Color(0xFF000000))
            .padding(start = 20.dp)
            .fillMaxWidth()
            .height(52.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 17.sp,
                lineHeight = 21.25.sp,
                fontFamily = font,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
        Icon(
            painter = painterResource(id = R.drawable.chevron),
            contentDescription = "Open Link",
            modifier = Modifier
                .padding(top = 10.dp, end = 20.dp)
                .then(
                    if (url.isNotEmpty()) Modifier.clickable(
                        interactionSource = interactionSource,
                        indication = rememberRipple(bounded = false),
                        onClick = { handleIconClick(context, url) }
                    ) else Modifier
                )
        )
    }
}

private fun handleIconClick(context: Context, url: String) {
    // Implementation to open the link
    openLink(context, url)
}

fun openLink(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW)
    intent.data = Uri.parse(url)
    context.startActivity(intent)
}


