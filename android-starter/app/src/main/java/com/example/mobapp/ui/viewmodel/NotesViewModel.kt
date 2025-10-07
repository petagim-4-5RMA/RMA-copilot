package com.example.mobapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobapp.data.Note
import com.example.mobapp.data.NotesRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class NotesViewModel(private val repo: NotesRepository) : ViewModel() {
    val notes: StateFlow<List<Note>> = repo.notes
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    suspend fun loadNote(id: Long) = repo.getNote(id)

    fun save(id: Long?, title: String, content: String, onDone: () -> Unit) {
        viewModelScope.launch {
            repo.upsert(id, title, content)
            onDone()
        }
    }

    fun delete(id: Long, onDone: () -> Unit) {
        viewModelScope.launch {
            repo.delete(id)
            onDone()
        }
    }
}