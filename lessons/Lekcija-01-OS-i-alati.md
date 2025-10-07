# Lekcija 01 — Operativni sistemi za mobilne uređaje: OS i alati (A.IV.1.1)

Ishodi učenja
- Objašnjava ulogu Android OS-a i razvojnih alata u kreiranju mobilnih aplikacija.
- Orijentiše se u Android Studio okruženju, SDK Manager-u i emulatoru.
- Razumije šta rade ADB i osnovne komponente ekosistema.

Ključne tačke
- Android ekosistem: OS, aplikacijski stog, SDK, IDE (Android Studio), emulator, ADB.
- Android Studio: projekat, modul, template, Run/Debug konfiguracije.
- SDK: API nivoi, platforme, build-tools; ažuriranja putem SDK Managera.
- Emulator: kreiranje AVD-a, osnovna podešavanja (ABI, veličina memorije).
- ADB: osnovne komande i svrha (instalacija, logovi, spajanje na uređaj/emulator).

Scenarij predavanja (sažetak)
- Uloga OS-a: sandbox, permisije, aplikacijski stog; gdje se uklapa naša aplikacija.
- IDE: prolaz kroz interfejs (Project, Editor, Logcat, Gradle).
- SDK Manager i AVD Manager: kako dodati platformu, napraviti emulator.
- Kratko o ADB i Logcat kanalima (D/I/W/E).

Demo/Praktikum
- Instalirati potrebne SDK komponente (najnoviji stabilni API + build-tools).
- Kreirati “Empty Activity” projekat i pokrenuti ga na emulatoru.
- Provjeriti Logcat poruke pri startu aplikacije.

Pitanja za provjeru
1) Koje su tri glavne komponente Android ekosistema potrebne za razvoj?
2) Šta sadrži Android SDK (navigacija: platforme, build-tools)?
3) Čemu služi emulator i kada je bolje koristiti fizički uređaj?
4) Šta radi ADB i kako ga tipično koristimo tokom razvoja?

Reference u priručniku
- 3.1.2 Android Studio — str. 57–58
- 3.1.3 Kreiranje novog projekta — str. 59–60
- 3.2.2 Struktura SDK-a — str. 62–63
- 3.4.1 Alati za razvoj — str. 72–73