package com.example.mobapp.data

import kotlinx.coroutines.flow.Flow

class NotesRepository(private val dao: NoteDao) {
    val notes: Flow<List<Note>> = dao.getAll()

    suspend fun getNote(id: Long): Note? = dao.getById(id)

    suspend fun upsert(id: Long?, title: String, content: String) {
        if (id == null || id == 0L) {
            dao.insert(Note(title = title, content = content))
        } else {
            val existing = dao.getById(id) ?: return
            dao.update(existing.copy(title = title, content = content, updatedAt = System.currentTimeMillis()))
        }
    }

    suspend fun delete(id: Long) = dao.deleteById(id)
}