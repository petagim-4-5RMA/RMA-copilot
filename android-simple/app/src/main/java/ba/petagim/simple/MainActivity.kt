package ba.petagim.simple

import android.Manifest
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.*

private const val TAG = "AppLog"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent { SimpleApp() }
    }
    override fun onStart() { super.onStart(); Log.d(TAG, "onStart") }
    override fun onResume() { super.onResume(); Log.d(TAG, "onResume") }
    override fun onPause() { super.onPause(); Log.d(TAG, "onPause") }
    override fun onStop() { super.onStop(); Log.d(TAG, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}

@Composable
fun SimpleApp() {
    val context = LocalContext.current
    var count by remember { mutableStateOf(0) }
    var loading by remember { mutableStateOf(false) }

    val cameraLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (!granted) {
            Toast.makeText(context, "Korisnik je odbio kameru", Toast.LENGTH_SHORT).show()
        }
        Log.i("PermCheck", "Kamera dozvola: $granted")
    }

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().padding(24.dp)
    ) {
        Text("Dobrodošli!")
        Button(onClick = { Log.i(TAG, "Pozdrav iz aplikacije") }) {
            Text("Loguj poruku")
        }
        Button(onClick = { cameraLauncher.launch(Manifest.permission.CAMERA) }) {
            Text("Traži kameru")
        }
        Text("Brojač: $count")
        Button(onClick = { count++ }) { Text("Povećaj") }

        Button(
            enabled = !loading,
            onClick = {
                loading = true
                // simulacija učitavanja bez blokiranja UI
                CoroutineScope(Dispatchers.Main).launch {
                    delay(1000)
                    loading = false
                    Toast.makeText(context, "Gotovo!", Toast.LENGTH_SHORT).show()
                }
            }
        ) {
            Text(if (loading) "Učitavam..." else "Učitaj podatke")
        }
    }
}