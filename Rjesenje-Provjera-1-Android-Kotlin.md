# Rješenje — Provjera 1

1) Manifest (CAMERA):
```xml
<uses-permission android:name="android.permission.CAMERA" />
```

2) Runtime dozvola — primjer s Compose:
```kotlin
@Composable
fun CameraPermissionButton() {
    val context = LocalContext.current
    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (!granted) Toast.makeText(context, "Korisnik je odbio kameru", Toast.LENGTH_SHORT).show()
        Log.i("PermCheck", "Rezultat dozvole: $granted")
    }
    Button(onClick = { launcher.launch(Manifest.permission.CAMERA) }) {
        Text("Traži dozvolu (kamera)")
    }
}
```

3) Logcat filter:
- Otvoriti Logcat, klik “Edit Filter Configuration”
- Filter Name: PermCheck; Log Tag: PermCheck
- Alternativno upisati u pretragu: `tag:PermCheck`

Napomena:
- Za Android 13+ provjeriti i PHOTO_PICKER alternativu gdje kamera nije potrebna.