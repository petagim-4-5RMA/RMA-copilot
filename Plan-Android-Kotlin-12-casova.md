# Nastavni plan — Razvoj mobilnih aplikacija (Android, Kotlin, Jetpack Compose) — 12 časova

Ciljevi po indikatorima:
- A.IV.1.1: Objašnjava ulogu OS-a i razvojnih alata (SDK, emulator, ADB, Android Studio).
- A.IV.1.2: Raščlanjuje strukturu Android aplikacije i ključne fajlove (Manifest, Gradle, res, Kotlin/Compose).
- A.IV.1.3: Procjenjuje uticaj HW/SW ograničenja (CPU, RAM, baterija, verzije OS-a, dozvole) na performanse.
- A.IV.2.1: Izrađuje konceptualni model i specifikaciju (SRS) prema zadatim zahtjevima/standardima.
- A.IV.2.2: Koristi alate za praćenje grešaka i optimizaciju (debugger, profiler, Lint, StrictMode).

Struktura časova (12):
1) OS i alati (A.IV.1.1)
   - Teorija: Android ekosistem, sandboxing, dozvole, Play Store, SDK komponentne, ADB, emulator.
   - Praksa: Instalacija Android Studio; kreiranje “Hello Compose”.
   - Zadaća: Kratki refleks: “Zašto su SDK i emulator ključni?”

2) Životni ciklus i dozvole (A.IV.1.1)
   - Teorija: Activity/Process lifecycle; runtime dozvole; privatnost.
   - Praksa: Logcat praćenje lifecycle događaja; zahtjev za kameru (runtime permission).
   - Zadaća: Dijagram lifecycle-a i gdje logovati.

3) Struktura Android projekta (A.IV.1.2)
   - Teorija: Gradle (moduli), AndroidManifest.xml, res/, BuildConfig, paketna struktura.
   - Praksa: Pregled i izmjena Manifest-a (ikona, permission), dodavanje teme.
   - Zadaća: U projektu promijeniti temu i objasniti izmjene.

4) UI s Jetpack Compose (A.IV.1.2)
   - Teorija: Composable, State, recomposition, preview.
   - Praksa: Dva ekrana + navigacija, prijenos parametara.
   - Zadaća: Skica 3-ekranske aplikacije (wireframe) i mapiranje na Composable-e.

5) Ograničenja HW/SW i performanse (A.IV.1.3)
   - Teorija: CPU/RAM, baterija, mreža, veličina paketa, fragmentacija verzija.
   - Praksa: Učitati veliku sliku vs optimizovanu; mjeriti učinak (osjećaj janka).
   - Zadaća: Plan optimizacije za listu sa slikama.

6) Mjerenje i optimizacija (A.IV.1.3)
   - Teorija: Android Profiler (CPU/Memory/Network), Lint, StrictMode.
   - Praksa: Namjerni anti-pattern (prevelike slike/glavna nit) i njegovo otklanjanje.
   - Zadaća: 5 preporuka za performanse + obrazloženje.

7) Provjera znanja 1 (A.IV.1.3)
   - Kviz 1 + praktični zadatak OS/struktura/dozvole.

8) Konceptualni model i specifikacija (A.IV.2.1)
   - Teorija: SRS, user stories, use-case, nefunkcionalni zahtjevi.
   - Praksa: Definisanje SRS za mini-projekat (“Student Notes/To-Do”).
   - Zadaća: Dovršiti SRS.

9) UI/UX i model podataka (A.IV.2.1)
   - Teorija: Navigacija, stanja, pristupačnost, MVVM osnove.
   - Praksa: Wireframe u Figmi + skica arhitekture.
   - Zadaća: Backlog i plan milestone-a.

10) Praćenje grešaka i debugging (A.IV.2.2)
    - Teorija: Breakpoints, watches, Logcat strategija, Crashlytics (konceptualno).
    - Praksa: Globalno hvatanje grešaka; čitanje stack trace-a.
    - Zadaća: Pravila logovanja za projekat.

11) Optimizacija koda i analiza (A.IV.2.2)
    - Teorija: Lint, R8/ProGuard, smanjenje paketa, lazy liste, memoizacija.
    - Praksa: Uključiti Lint/StrictMode; ispraviti upozorenja; smanjiti re-render.
    - Zadaća: Kratki izvještaj o optimizacijama.

12) Provjera znanja 2 (A.IV.2.2)
    - Kviz 2 + praktični debugging/performance task.

Mini-projekat (izvan nastave, 4–6 časova)
- Tema: “Student Notes/To-Do” (offline-first + lokalna pohrana Room; 2+ ekrana; svijetla/tamna tema).
- Ocjena: vidi “Rubrika-Projekat-Android.md”.

Napomene:
- Diferencijacija: napredniji učenici — paginacija, WorkManager za sync, tamna/svijetla tema.
- Privatnost: princip minimalnih dozvola; jasna obavještenja korisniku.
- Procjena: formativno (mini-kviz, exit ticket) + sumativno (kvizovi, projekt).