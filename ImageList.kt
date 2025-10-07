package com.example.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.platform.LocalContext

data class Photo(val id: String, val url: String, val title: String)

@Composable
fun PhotoList(photos: List<Photo>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(photos, key = { it.id }) { p ->
            Row(modifier = Modifier.fillMaxWidth().padding(12.dp)) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(p.url)
                        .crossfade(true)
                        .build(),
                    contentDescription = p.title,
                    modifier = Modifier.size(72.dp),
                    placeholder = coil.compose.rememberAsyncImagePainter(
                        model = android.R.drawable.ic_menu_report_image
                    ),
                    error = coil.compose.rememberAsyncImagePainter(
                        model = android.R.drawable.ic_delete
                    )
                )
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(p.title, style = MaterialTheme.typography.titleMedium)
                    Text(p.url, style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}