package com.example.mobapp

import android.app.Application
import android.os.StrictMode
import com.example.mobapp.di.NotesGraph

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Provide DI
        NotesGraph.provide(applicationContext)

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(
                StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build()
            )
            StrictMode.setVmPolicy(
                StrictMode.VmPolicy.Builder()
                    .detectLeakedClosableObjects()
                    .penaltyLog()
                    .build()
            )
        }
    }
}