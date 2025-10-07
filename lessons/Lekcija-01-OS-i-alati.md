# Lekcija 01 — Operativni sistemi za mobilne uređaje: OS i alati (A.IV.1.1)

Trajanje: 45–90 min
Preduslovi: Nema (poželjno osnovno snalaženje u Windows/macOS/Linux)

Ishodi učenja
- Objašnjava ulogu Android OS-a, SDK-a i alata (Android Studio, AVD, ADB).
- Orijentiše se u Android Studio okruženju (projekat, modul, Run/Debug, Logcat).
- Kreira i pokreće minimalnu “Hello” aplikaciju na emulatoru.

Kontekst i motivacija (zašto je važno)
- Mobilni OS (Android) pruža standardizovano okruženje u kojem aplikacije žive (sandbox, dozvole, lifecycle). Razumjeti ekosistem znači brže otklanjati probleme i sigurnije isporučivati aplikacije.

Ključni pojmovi i objašnjenja
- Android ekosistem: OS + aplikacijski stog + SDK + IDE + emulator + ADB.
- SDK (Software Development Kit): platforme (API nivoi), build-tools, platform-tools (adb), images za emulator.
- Android Studio (IDE): Project/Editor/Gradle/Logcat/Device Manager/SDK Manager.
- Emulator (AVD): virtualni uređaj; podešavanja: veličina memorije, ABI (x86_64/ARM), rezolucija.
- ADB (Android Debug Bridge): komandna linija za spajanje, instaliranje, čitanje logova.

Demonstracija (korak‑po‑korak)
1) Pokretanje Android Studija:
   - File > New Project > “Empty Activity” > naziv: HelloMob > Kotlin, minSdk 24.
   - Kreiraj projekat i sačekaj Gradle sync.
2) SDK Manager:
   - Tools > SDK Manager > instaliraj posljednji stabilni Android SDK (platformu) i build-tools.
3) AVD Manager (emulator):
   - Tools > Device Manager > Create Device > Pixel 5 (API recimo 34) > Finish.
4) Run:
   - Klik “Run” ▶ i izaberi emulator; sačekaj da se app podigne.
5) Logcat:
   - Otvori Logcat (Views > Tool Windows > Logcat) i filtriraj po procesu aplikacije.

Kratki primjeri/komande
- ADB provjera uređaja:
  - Windows/macOS/Linux: u Terminalu: `adb devices` (lista emul/uređaja)
- Logovanje iz koda (Kotlin):
```kotlin
import android.util.Log
private const val TAG = "AppLog"
Log.d(TAG, "App started")
```

Aktivnosti (učionica)
- Aktivnost A (5–10 min): Prepoznaj sekcije IDE‑a (Project, Editor, Logcat, Gradle).
- Aktivnost B (15–20 min): Kreiraj i pokreni “Hello” app; dodaj jedan Log.d i pronađi ga u Logcatu.
- Aktivnost C (5 min): “Šta radi ADB?” — kratke primjere upotrebe.

Pitanja za diskusiju
- Koja je razlika između SDK i IDE?
- Kada birati emulator, a kada fizički uređaj?
- Koje rizike (sigurnost/privatnost) OS mitigira sandboxom i dozvolama?

Mini‑kviz (5 pitanja)
1) Navedite 3 ključne komponente Android ekosistema za razvoj.
2) Kako instalirati dodatni API nivo?
3) Čemu služi AVD Manager?
4) Šta radi ADB? Navedite dvije tipične komande.
5) Gdje se vidi izlaz Log.d poruke?

Domaći zadatak (15–20 min)
- Kreiraj drugi AVD (druga rezolucija) i pokreni aplikaciju na njemu; uporedi UI (skaliranje/font).
- Napravi screenshot Logcat poruke “App started”.

Rubrika ocjenjivanja (formativno, 0–10)
- Pokretanje projekta i emulatora (0–4)
- Navigacija kroz IDE i SDK Manager (0–3)
- Log.d i nalaženje poruke u Logcatu (0–3)

Reference (Priručnik)
- 3.1.2 Android Studio — str. 57–58
- 3.1.3 Kreiranje novog projekta — str. 59–60
- 3.2.2 Struktura SDK-a — str. 62–63
- 3.4.1 Alati za razvoj — str. 72–73

Dodatni izvori
- [Android Studio User Guide](https://developer.android.com/studio/intro)
- [ADB Overview](https://developer.android.com/tools/adb)

Savjeti za diferencijaciju
- Za učenike početnike: demonstriraj sporo korak‑po‑korak i daj snimke ekrana.
- Za naprednije: traži da ručno pokrenu ADB i filtriraju Logcat po tagu.