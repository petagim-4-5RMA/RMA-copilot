package com.example.mobapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobapp.ui.viewmodel.NotesViewModel
import com.example.mobapp.ui.viewmodel.NotesViewModelFactory

@Composable
fun NotesListScreen(
    onBack: () -> Unit,
    onNew: () -> Unit,
    onOpen: (Long) -> Unit
) {
    val vm: NotesViewModel = viewModel(factory = NotesViewModelFactory())
    val notes by vm.notes.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Bilješke") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Nazad")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onNew) {
                Icon(Icons.Default.Add, contentDescription = "Nova bilješka")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(notes, key = { it.id }) { note ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onOpen(note.id) }
                        .padding(16.dp)
                ) {
                    Text(note.title, style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(4.dp))
                    Text(
                        note.content.take(100),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                Divider()
            }
        }
    }
}