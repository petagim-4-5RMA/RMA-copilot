package com.example.mobapp.di

import android.content.Context
import androidx.room.Room
import com.example.mobapp.data.AppDatabase
import com.example.mobapp.data.NotesRepository

object NotesGraph {
    lateinit var db: AppDatabase
        private set
    lateinit var repo: NotesRepository
        private set

    fun provide(context: Context) {
        db = Room.databaseBuilder(context, AppDatabase::class.java, "notes.db")
            .fallbackToDestructiveMigration()
            .build()
        repo = NotesRepository(db.noteDao())
    }
}