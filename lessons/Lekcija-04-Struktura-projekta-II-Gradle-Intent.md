# Lekcija 04 — Struktura mobilne aplikacije II: Manifest, Gradle, Intent (A.IV.1.2)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–03

Ishodi učenja
- Tumači ključne deklaracije u AndroidManifest.xml.
- Objašnjava ulogu Gradle-a u build procesu.
- Primjenjuje intent-e (osnovni scenariji).

Ključne tačke
- Manifest: application, activity, intent-filter, uses-permission.
- Gradle (app-level): applicationId, minSdk/targetSdk, dependencies.
- Intent: eksplicitni i implicitni; startActivity i prenos podataka (extras).

Scenarij predavanja
- Kako se build konfiguriše (u jednoj datoteci) i šta može poći po zlu.
- Kada i kako koristiti implicitne intente (npr. otvoriti web, podijeliti tekst).
- Veza intent-filtera u Manifestu s implicitnim intentima.

Primjeri
- Manifest “LAUNCHER”:
```xml
<intent-filter>
  <action android:name="android.intent.action.MAIN"/>
  <category android:name="android.intent.category.LAUNCHER"/>
</intent-filter>
```
- Gradle izmjene (primjer):
```kotlin
android {
  defaultConfig {
    applicationId = "ba.petagim.simple"
    minSdk = 24
    targetSdk = 34
  }
}
```
- Implicitni intent – otvori URL:
```kotlin
val uri = Uri.parse("https://www.foi.unizg.hr/")
startActivity(Intent(Intent.ACTION_VIEW, uri))
```

Demo (koraci)
1) Prikaži LAUNCHER activity u Manifestu; dodaj komentar šta radi.
2) Pokaži gdje se mijenja minSdk/targetSdk i zašto to utiče na kompatibilnost.
3) Dodaj dugme “Otvori web” koje šalje implicitni intent.

Aktivnosti
- Aktivnost A: Napravi “Podijeli tekst” implicitnim intentom (`Intent.ACTION_SEND`, `text/plain`).
- Aktivnost B: Dodaj “Deep link” (intent-filter sa `<data android:scheme="app" android:host="detalj"/>`) i testiraj `adb`‑om: `adb shell am start -a android.intent.action.VIEW -d "app://detalj"`.

Mini‑kviz
1) Šta je intent-filter i zašto je važan?
2) Razlika eksplicitni vs implicitni intent?
3) Koje su dvije najvažnije stvari u app-level Gradle-u za početak?

Domaći
- Napravi drugi Activity i pokreni ga eksplicitnim intentom, prenesi `putExtra("msg","Hello")`.

Rubrika (0–10)
- Ispravno objašnjenje Manifest/Gradle (0–4)
- Funkcionalni implicitni intent (0–3)
- Dodatni Activity sa extra (0–3)

Reference (Priručnik)
- 3.3.4 Android Manifest — str. 69–70
- 3.3.5 Gradle — str. 70
- 3.3.6 Namjera (Intent) — str. 71