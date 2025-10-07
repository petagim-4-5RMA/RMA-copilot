package com.example.mobapp.ui.components

import android.Manifest
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext

@Composable
fun CameraPermissionButton() {
    val context = LocalContext.current
    var granted by remember { mutableStateOf<Boolean?>(null) }

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        granted = isGranted
        if (!isGranted) {
            Toast.makeText(context, "Korisnik je odbio kameru", Toast.LENGTH_SHORT).show()
        }
    }

    Button(onClick = { launcher.launch(Manifest.permission.CAMERA) }) {
        Text(
            when (granted) {
                null -> "Traži dozvolu (kamera)"
                true -> "Dozvola odobrena"
                false -> "Pokušaj ponovo"
            }
        )
    }
}