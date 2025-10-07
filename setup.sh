#!/usr/bin/env bash
set -euo pipefail

echo "Creating directories..."
mkdir -p curriculum
mkdir -p slides
mkdir -p android-starter
mkdir -p android-starter/app/src/main/java/com/example/mobapp/navigation
mkdir -p android-starter/app/src/main/java/com/example/mobapp/ui/components
mkdir -p android-starter/app/src/main/java/com/example/mobapp/ui/screens
mkdir -p android-starter/app/src/main/java/com/example/mobapp/ui/theme
mkdir -p android-starter/app/src/main/java/com/example/mobapp/data
mkdir -p android-starter/app/src/main/java/com/example/mobapp/ui/viewmodel
mkdir -p android-starter/app/src/main/java/com/example/mobapp/di
mkdir -p android-starter/app/src/main/res/values

echo "Writing README.md..."
cat <<'EOF' > README.md
# petagim-4-5RMA — Nastavni materijali, Android (Kotlin) starter i Slides

Ovaj repozitorij sadrži kompletne materijale za predmet "Razvoj mobilnih aplikacija" (4. razred, informatički smjer) na Androidu (Kotlin, Jetpack Compose), uključujući:

- Nastavni plan, kvizove, praktične zadatke, SRS šablon i rubriku (folder `curriculum/`)
- Starter Android projekat (Kotlin + Jetpack Compose + Navigation + Coil + Room + MVVM) (folder `android-starter/`)
- Slides u Marp Markdown formatu, spremni za izvoz u PowerPoint (.pptx) ili PDF (folder `slides/`)

## Struktura

- `curriculum/` — plan, kvizovi, rješenja, šabloni
- `slides/` — Marp slide deck (`Slides-Android-12-casova.marp.md`)
- `android-starter/` — Android projekat (Compose, Navigation, Coil, Room, MVVM)

## Kako izvesti Slides u PowerPoint ili Google Slides

Opcija A — VS Code + Marp for VS Code:
1. Instalirajte VS Code i ekstenziju "Marp for VS Code".
2. Otvorite `slides/Slides-Android-12-casova.marp.md`.
3. Kliknite na "Export Slide Deck" i izaberite PPTX ili PDF.
4. Za Google Slides: otvorite Google Slides > Datoteka > Uvezi prezentaciju i uvezite PPTX ili PDF slajdove.

Opcija B — Marp CLI:
- Instalacija: `npm i -g @marp-team/marp-cli`
- Izvoz u PPTX: `marp slides/Slides-Android-12-casova.marp.md --pptx -o slides/Slides-Android-12-casova.pptx`
- Izvoz u PDF: `marp slides/Slides-Android-12-casova.marp.md --pdf -o slides/Slides-Android-12-casova.pdf`

## Kako pokrenuti Android starter

1. Otvorite folder `android-starter/` u Android Studio (posljednja stabilna verzija).
2. Android Studio će preuzeti zavisnosti.
3. Pokrenite konfiguraciju "app" na emulatoru ili fizičkom uređaju.
4. Testirajte:
   - Dugme "Log test (PermCheck)" — provjerite Logcat filter po tagu `PermCheck`.
   - Dugme "Traži dozvolu (kamera)" — testirajte runtime dozvole.
   - "Lista fotografija" — provjerite učitavanje slika (Coil) i performanse pri skrolanju.
   - "Bilješke (Room)" — otvorite listu, kreirajte, uredite i obrišite bilješku.

## Mini-projekat
Preporučeni mini-projekat: "Student Notes/To-Do" (offline-first, Room). Ako želite dodatni skeleton (pretraga, sortiranje), otvorite issue.

## Licenca
Materijali su namijenjeni nastavi; možete ih prilagoditi potrebama. Ako želite javnu OSS licencu (npr. MIT), javite pa ću je dodati.
EOF

echo "Writing .gitignore..."
cat <<'EOF' > .gitignore
# Root
.DS_Store
*.log

# Android Studio / Gradle
.gradle/
local.properties
**/.idea/
**/.iml
**/build/
**/captures/
**/.cxx/

# Android starter specific
android-starter/.gradle/
android-starter/build/
android-starter/app/build/

# Node (if using marp-cli)
node_modules/
EOF

echo "Writing curriculum files..."
cat <<'EOF' > curriculum/Plan-Android-Kotlin-12-casova.md
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
EOF

cat <<'EOF' > curriculum/Kviz-1-Android-Kotlin.md
# Kviz 1 — OS, alati i struktura Android aplikacije

1) Koja je uloga Android SDK-a i emulatora u razvoju aplikacija?
2) Objasnite razliku između dozvole deklarisane u Manifestu i runtime dozvole.
3) Navedite tri stvari koje se definišu u AndroidManifest.xml.
4) Šta je Activity lifecycle? Navedite tri callback metode i kada se pozivaju.
5) Čemu služi Logcat i kako filtrirati logove po tagu?
6) Gdje se obično nalaze resursi (npr. stringovi, ikone) i kako im pristupamo u kodu?
7) Šta znači “sandboxing” i zašto je važan za sigurnost?
8) Navedite dva ograničenja mobilnih uređaja koja utiču na performanse i kako ih ublažiti.
9) Šta je BuildConfig i kako može pomoći u razvoju?
10) Koja je razlika između Composable i klasičnog View pristupa?

Bodovanje: 10 poena; prag: 60%.
EOF

cat <<'EOF' > curriculum/Kviz-1-Odgovori.md
# Kviz 1 — Ključ odgovora

1) SDK daje alate, API-je i build chain; emulator omogućava pokretanje/test bez fizičkog uređaja.
2) Manifest dozvola je deklarativna i nužna za instalaciju; runtime dozvola traži pristanak korisnika tokom rada.
3) Komponente (activity, service), dozvole, intent-filter-i, min/target SDK, theme, provider-i.
4) Skup callback-ova toka aktivnosti, npr. onCreate (inicijalizacija), onStart (vidljivo), onResume (u fokusu), onPause/onStop (gubi fokus/vidljivost), onDestroy (čišćenje).
5) Logcat prikazuje sistemske i aplikacijske logove; filter po tagu npr. upisom tag:PermCheck ili odabirom “Edit Filter”.
6) Res/values (strings.xml), res/drawable (ikone); pristup preko R.string.ime itd.
7) Svaka app radi izolovano s vlastitim podacima i dozvolama — smanjuje rizik od curenja i zloupotrebe.
8) CPU/RAM/baterija — ublažiti optimizacijom (keširanje, lazy učitavanje, izbjegavati rad na glavnoj niti), mreža — kompresija/paginacija/offline cache.
9) BuildConfig sadrži compile-time konstante (npr. DEBUG) za feature flagove, log nivoe, URL-ove po varijanti.
10) Composable su deklarativne funkcije koje opisuju UI i recompose se po stanju; View pristup je imperativan s XML-om i mutacijama.
EOF

cat <<'EOF' > curriculum/Kviz-2-Android-Kotlin.md
# Kviz 2 — Debugging i optimizacija (Android/Kotlin)

1) Razlika između “breakpoint” i “watch” u debuggeru?
2) Kako biste dijagnostikovali curenje memorije u Android aplikaciji?
3) Koje metrike nudi Android Profiler (CPU/Memory/Network) i šta pokazuju?
4) Šta je Lint i navedite dva tipa problema koje može otkriti.
5) Šta je StrictMode i kada ga uključiti?
6) Dvije tehnike za smanjenje janka pri skrolanju lista sa slikama.
7) Kako čitati stack trace i pronaći uzrok greške?
8) Tri koraka za smanjenje veličine APK/AAB paketa.
9) Kako organizovati logovanje da ostane korisno (nivo, tagovi, format)?
10) Kada optimizirati CPU vs. memoriju i koji su tradeoff-i?

Bodovanje: 10 poena; prag: 60% (prilagodljivo).
EOF

cat <<'EOF' > curriculum/Kviz-2-Odgovori.md
# Kviz 2 — Ključ odgovora

1) Breakpoint zaustavlja izvršavanje na liniji; watch prati vrijednost izraza/promjenljive tokom stepovanja.
2) Koristiti Memory Profiler i heap dump; tražiti neotpuštene reference (leak); provjeriti lifecycle/observers; StrictMode VM pravila za leakove.
3) CPU: vrijeme po metodi/threadu; Memory: alokacije, GC događaji, heap; Network: zahtjevi, veličina, latencija/propusnost.
4) Statička analiza koja otkriva anti-pattern-e: neiskorišteni resursi, blokirajuće operacije na UI niti, hardkodirane vrijednosti, nekompatibilnosti API nivoa.
5) Mehanizam koji prijavljuje skupe/nesigurne operacije na glavnoj niti/VM — uključiti u debug tokom razvoja.
6) Keširanje i veličina slika (Coil s placeholderima), LazyColumn sa stable key-evima, izbjegavanje teških operacija na glavnoj niti, paginacija.
7) Pročitati najdonji “Caused by” uzrok; mapa klase i linije; locirati metodu u kodu; replicirati i postaviti breakpoint.
8) Ukloniti neiskorištene resurse/dep-ove, R8/ProGuard shrink i minify, kompresija slika; split APK-s po ABI-u.
9) Definisati nivoe (v/d/i/w/e), dosljedne tagove, strukturisane poruke; u produkciji smanjiti logove (BuildConfig.DEBUG).
10) CPU optimizovati kad je app “spora”; memoriju kad se dešavaju GC pauze/OutOfMemory. Tradeoff: više keširanja = veća memorija, manje CPU.
EOF

cat <<'EOF' > curriculum/Prakticni-Zadatak-Provjera-1-Android-Kotlin.md
# Praktični zadatak — Provjera 1 (OS, struktura, dozvole)

Zadatak:
1) Dodajte runtime dozvolu za kameru. Ako je korisnik odbije, prikažite poruku (Toast/Snackbar).
2) U AndroidManifest.xml dodajte `CAMERA` dozvolu i objasnite zašto je potrebna.
3) Pokrenite aplikaciju, otvorite ekran koji traži dozvolu i u Logcat-u filtrirajte tag `PermCheck`.
4) Predajte snimke ekrana: Manifest, dio koda za runtime provjeru, Logcat filtriran.

Kriteriji (10p): ispravnost Manifest + runtime (4), čitljivost koda (2), logovi (2), objašnjenje (2).
EOF

cat <<'EOF' > curriculum/Rjesenje-Provjera-1-Android-Kotlin.md
# Rješenje — Provjera 1

1) Manifest (CAMERA):
```xml
<uses-permission android:name="android.permission.CAMERA" />