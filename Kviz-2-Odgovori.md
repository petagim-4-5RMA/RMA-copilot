# Kviz 2 — Ključ odgovora

1) Breakpoint zaustavlja izvršavanje na liniji; watch prati vrijednost izraza/promjenljive tokom stepovanja.
2) Koristiti Memory Profiler i heap dump; tražiti neotpuštene reference (leak); provjeriti lifecycle/observers; StrictMode VM pravila za leakove.
3) CPU: vrijeme po metodi/threadu; Memory: alokacije, GC događaji, heap; Network: zahtjevi, veličina, latencija/propusnost.
4) Statička analiza koja otkriva anti-pattern-e: neiskorišteni resursi, blokirajuće operacije na UI niti, hardkodirane vrijednosti, nekompatibilnosti API nivoa.
5) Mehanizam koji prijavljuje skupe/nesigurne operacije na glavnoj niti/VM — uključiti u debug tokom razvoja.
6) Keširanje i veličina slika (Coil/Glide s placeholderima), LazyColumn sa stable key-evima, izbjegavanje teških operacija na glavnoj niti, paginacija.
7) Pročitati najdonji “Caused by” uzrok; mapa klase i linije; locirati metodu u kodu; replicirati i postaviti breakpoint.
8) Ukloniti neiskorištene resurse/dep-ove, R8/ProGuard shrink i minify, kompresija slika; split APK-s po ABI-u.
9) Definisati nivoe (v/d/i/w/e), dosljedne tagove, strukturisane poruke; u produkciji smanjiti logove (BuildConfig.DEBUG).
10) CPU optimizovati kad je app “spora”; memoriju kad se dešavaju GC pauze/OutOfMemory. Tradeoff: više keširanja = veća memorija, manje CPU.
