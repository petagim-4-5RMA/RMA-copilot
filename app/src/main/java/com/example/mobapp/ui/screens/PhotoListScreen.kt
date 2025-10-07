package com.example.mobapp.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.icons.Icons
import androidx.compose.material3.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

data class Photo(val id: String, val url: String, val title: String)

@Composable
fun PhotoListScreen(onBack: () -> Unit) {
    val sample = List(30) {
        Photo(
            id = it.toString(),
            url = "https://picsum.photos/seed/$it/200/200",
            title = "Foto $it"
        )
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Fotografije") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Nazad")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.fillMaxSize().padding(padding)) {
            items(sample, key = { it.id }) { p ->
                Row(modifier = Modifier.padding(12.dp)) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(p.url)
                            .crossfade(true)
                            .build(),
                        contentDescription = p.title,
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(Modifier.width(12.dp))
                    Text(p.title, style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}