# Rješenje — Provjera 2

1) StrictMode u `Application` (samo debug):
```kotlin
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
```

2) Coil s placeholder-om i keširanjem u LazyColumn:
```kotlin
LazyColumn {
    items(photos, key = { it.id }) { p ->
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(p.url)
                .crossfade(true)
                .build(),
            contentDescription = p.title,
            modifier = Modifier.size(72.dp),
            placeholder = painterResource(R.drawable.ic_placeholder),
            error = painterResource(R.drawable.ic_error)
        )
    }
}
```

3) Teške operacije van glavne niti:
```kotlin
val scope = rememberCoroutineScope()
Button(onClick = {
    scope.launch(Dispatchers.IO) {
        val data = repository.loadHeavyData()
        withContext(Dispatchers.Main) { viewModel.onData(data) }
    }
}) { Text("Učitaj") }
```

4) Mjerenje:
- U Performance Profiler-u pratiti “Frames” i CPU tokom skrolanja
- Očekivano: manje “jank” frame-ova, niže vrijeme renderovanja po frame-u nakon optimizacija