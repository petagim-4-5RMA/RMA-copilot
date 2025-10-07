---
marp: true
title: Čas 1 — Operativni sistemi i alati (A.IV.1.1)
paginate: true
theme: default
---

# Čas 1 — OS i alati
Uloga Android OS-a, SDK-a i alata (Android Studio, AVD, ADB). Kreiranje i pokretanje "Hello" aplikacije.

---

## Ishodi učenja
- Objašnjava ulogu Android OS-a i razvojnih alata.
- Orijentiše se u Android Studiju (Project/Editor/Logcat/Gradle).
- Pokreće minimalnu aplikaciju na emulatoru.

---

## Pojmovi i ekosistem
- Android OS i aplikacijski stog (framework/HAL/kernel)
- SDK: platforme (API nivoi), build-tools, platform-tools (adb)
- IDE: Android Studio; AVD (emulator)
- ADB: spajanje, instalacija, logovi

---

## Android Studio i SDK
- SDK Manager: dodavanje API nivoa i build-tools
- Device/AVD Manager: kreiranje emulatora (ABI, RAM, rezolucija)
- Run/Debug konfiguracije; Gradle sync

---

## Demo (koraci)
1) File → New Project → Empty Activity (Kotlin, minSdk 24)
2) Tools → SDK Manager (instaliraj aktuelnu platformu)
3) Tools → Device Manager → Create AVD → Pixel 5 (API 34)
4) Run ▶ i prikaži Logcat (filtriraj po procesu)

---

## ADB i Logcat (osnove)
- adb devices — lista uređaja/emulatora
- Log.d("AppLog","App started") — provjera u Logcatu

---

## Aktivnosti
- A: Identifikuj panele u Android Studiju (Project, Editor, Logcat, Gradle)
- B: Hello app + jedan Log.d i pronađi ga u Logcatu

---

## Mini‑kviz
1) Tri ključne komponente ekosistema?
2) Razlika SDK vs. IDE?
3) Svrha AVD-a? Kad koristiti uređaj?
4) Gdje se vidi Log.d?

---

## Reference (priručnik)
- 3.1.2 Android Studio — str. 57–58
- 3.1.3 Kreiranje novog projekta — str. 59–60
- 3.2.2 Struktura SDK-a — str. 62–63
- 3.4.1 Alati za razvoj — str. 72–73