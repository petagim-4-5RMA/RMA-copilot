package com.example.mobapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    toDetails: (String) -> Unit,
    toPhotos: () -> Unit,
    toNotes: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(24.dp)
    ) {
        Button(onClick = { Log.i("PermCheck", "Klik na dugme") }) {
            Text("Log test (PermCheck)")
        }
        CameraPermissionButton()
        Button(onClick = { toDetails("Pozdrav sa Home") }) {
            Text("Otvori Detalje")
        }
        Button(onClick = toPhotos) {
            Text("Lista fotografija")
        }
        Button(onClick = toNotes) {
            Text("Bilješke (Room)")
        }
    }
}