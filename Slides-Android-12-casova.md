# Slides — Razvoj mobilnih aplikacija (Android, Kotlin, Jetpack Compose) — 12 časova

Napomena: Svaki “slajd set” je outline s ključnim pojmovima i napomenama za predavača. Možeš lako prebaciti u Google Slides/PowerPoint.

## Čas 1 — OS i alati (A.IV.1.1)
- Pojmovi: Android ekosistem, sandboxing, dozvole, Play Store
- Alati: Android Studio, SDK, AVD, ADB
- Demo: Kreirati “Hello Compose”
- Aktivnost: Pokrenuti emulator, Logcat pregled
- Zadaca: Refleksija “Zašto su SDK i emulator ključni?”

Napomena predavaču:
- Istaknuti razliku emulator vs. fizički uređaj
- Pojasniti sigurnosni model (sandboxing i dozvole)

## Čas 2 — Životni ciklus i dozvole (A.IV.1.1)
- Activity/Process lifecycle: onCreate/onStart/onResume/...
- Runtime dozvole (kamera, lokacija), privatnost
- Demo: Logcat lifecycle događaja, traženje dozvole
- Zadaca: Nacrtati lifecycle dijagram i označiti gdje logovati

## Čas 3 — Struktura projekta (A.IV.1.2)
- Gradle (root vs. module), BuildConfig, variant-e
- AndroidManifest.xml (activity, permission, intent-filter)
- Resursi (strings, drawables), namespace
- Demo: Izmjena Manifest-a (ikona, permission), tema
- Zadaca: Promijeniti temu i dokumentovati izmjene

## Čas 4 — UI s Jetpack Compose (A.IV.1.2)
- Composable, State, recomposition, Preview
- Navigacija (Navigation Compose), parametri ruta
- Demo: Dva ekrana + navigacija
- Zadaca: Wireframe 3 ekrana i mapiranje na Composable-e

## Čas 5 — Ograničenja HW/SW (A.IV.1.3)
- CPU/RAM/baterija, mreža, veličina paketa
- Fragmentacija OS verzija
- Demo: Velika vs. optimizovana slika, opažanje janka
- Zadaca: Plan optimizacije za listu sa slikama

## Čas 6 — Mjerenje i optimizacija (A.IV.1.3)
- Android Profiler (CPU/Memory/Network)
- Lint, StrictMode
- Demo: Namjerni anti-pattern (glavna nit/slike), profilisanje i popravka
- Zadaca: 5 preporuka za performanse + obrazloženje

## Čas 7 — Provjera znanja 1
- Kviz 1 + kratki praktični zadatak (Manifest, dozvole, Logcat)

## Čas 8 — Konceptualni model i specifikacija (A.IV.2.1)
- SRS, user stories, use-case, nefunkcionalni zahtjevi
- Demo: SRS šablon i primjer
- Aktivnost: Početak SRS-a za mini-projekat
- Zadaca: Dovršiti SRS

## Čas 9 — UI/UX i model podataka (A.IV.2.1)
- Navigacija, stanja, pristupačnost
- MVVM osnove (ViewModel, state)
- Demo: Wireframe u Figmi
- Zadaca: Backlog i plan milestone-a

## Čas 10 — Praćenje grešaka (A.IV.2.2)
- Debugger: breakpoints, watches
- Logcat strategija
- Crashlytics (konceptualno)
- Demo: Čitanje stack trace-a, globalno hvatanje grešaka
- Zadaca: Smjernice za logovanje

## Čas 11 — Optimizacija koda (A.IV.2.2)
- Lint, R8/ProGuard, smanjenje veličine paketa
- Lazy liste, memoizacija, izbjegavanje nečistih side-effect-a u Compose-u
- Demo: Uključiti Lint/StrictMode, ispraviti upozorenja
- Zadaca: Kratki izvještaj o optimizacijama

## Čas 12 — Provjera znanja 2
- Kviz 2 + praktični debugging/performance zadatak
