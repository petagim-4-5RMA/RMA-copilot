package com.example.app

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner

private const val TAG = "LifecycleDemo"

class MainActivity : ComponentActivity() {

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContent {
            MaterialTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableLifecycleLogger(lifecycleOwner.lifecycle)

    Scaffold(
        topBar = { TopAppBar(title = { Text("Hello Compose") }) }
    ) { padding ->
        Button(onClick = { Log.i("PermCheck", "Klik na dugme") },
            modifier = androidx.compose.ui.Modifier.padding(padding)) {
            Text("Klikni me")
        }
    }
}

@Composable
private fun DisposableLifecycleLogger(lifecycle: Lifecycle) {
    androidx.compose.runtime.DisposableEffect(lifecycle) {
        val obs = LifecycleEventObserver { _, event ->
            Log.d(TAG, "Lifecycle event: $event")
        }
        lifecycle.addObserver(obs)
        onDispose { lifecycle.removeObserver(obs) }
    }
}

@Preview
@Composable
fun PreviewHome() {
    MaterialTheme { HomeScreen() }
}