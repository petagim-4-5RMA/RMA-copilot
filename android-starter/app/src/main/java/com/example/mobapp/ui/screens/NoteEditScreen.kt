package com.example.mobapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mobapp.ui.viewmodel.NotesViewModel
import com.example.mobapp.ui.viewmodel.NotesViewModelFactory
import kotlinx.coroutines.launch

@Composable
fun NoteEditScreen(
    noteId: Long?,
    onBack: () -> Unit
) {
    val vm: NotesViewModel = viewModel(factory = NotesViewModelFactory())
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var loaded by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(noteId) {
        if (!loaded && noteId != null && noteId > 0) {
            vm.loadNote(noteId)?.let {
                title = it.title
                content = it.content
            }
            loaded = true
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(if (noteId == null || noteId == 0L) "Nova bilješka" else "Uredi bilješku") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Nazad")
                    }
                },
                actions = {
                    if (noteId != null && noteId > 0) {
                        IconButton(onClick = {
                            scope.launch { vm.delete(noteId) { onBack() } }
                        }) {
                            Icon(Icons.Default.Delete, contentDescription = "Obriši")
                        }
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Naslov") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = content,
                onValueChange = { content = it },
                label = { Text("Sadržaj") },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                minLines = 6
            )
            Button(
                onClick = { vm.save(noteId, title, content) { onBack() } },
                modifier = Modifier.fillMaxWidth(),
                enabled = title.isNotBlank()
            ) {
                Text("Sačuvaj")
            }
        }
    }
}