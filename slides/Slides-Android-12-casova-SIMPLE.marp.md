---
marp: true
title: Razvoj mobilnih aplikacija — Android (Kotlin, Jetpack Compose) — SIMPLE
paginate: true
theme: default
---

# Čas 1 — OS i alati (A.IV.1.1)
- Android ekosistem: IDE, SDK, Emulator, ADB
- Aktivnost: Hello app + Logcat
- Citat: [3.1.2 Android Studio, str. 57–58; 3.1.3 Kreiranje projekta, str. 59–60; 3.2.2 Struktura SDK-a, str. 62–63; 3.4.1 Alati za razvoj, str. 72–73]

---
# Čas 2 — Lifecycle i dozvole (A.IV.1.1)
- Aplikacijski stog; Activity i lifecycle; dozvole (Manifest)
- Aktivnost: runtime dozvola CAMERA + Logcat
- Citat: [3.2.1 Stog, str. 61–62; 3.3 Logika, str. 64–65; 3.3.1 Aktivnosti, str. 65–66; 3.3.4 Manifest, str. 69–70]

---
# Čas 3 — Struktura projekta I (A.IV.1.2)
- Moduli, ključni fajlovi, resursi, kvalifikatori
- Aktivnost: promjena naziva u strings.xml
- Citat: [3.1.3 Struktura projekta, str. 59–60; 3.3 Logika, str. 64–65; Resursi, str. 67; Kvalifikatori, str. 68]

---
# Čas 4 — Struktura projekta II (A.IV.1.2)
- Manifest/dozvole; Gradle osnove; Intent (implicitni)
- Aktivnost: demonstracija implicitnog intenta
- Citat: [3.3.4 Manifest, str. 69–70; 3.3.5 Gradle, str. 70; 3.3.6 Namjera, str. 71]

---
# Čas 5 — Ograničenja HW/SW I (A.IV.1.3)
- CPU/RAM/baterija; I/O i skladištenje
- Aktivnost: uticaj veličine slika na rad
- Citat: [3.2.1 Stog, str. 61–62; 4.1 Pohrana, str. 80–85; 4.2 Datoteke, str. 85–91]

---
# Čas 6 — Ograničenja HW/SW II (A.IV.1.3)
- Baze i mreža: latencija/format/obrada
- Alati: log, debugger, osnovna mjerenja
- Aktivnost: “fake loading” (ne blokirati UI)
- Citat: [4.3 Baza, str. 92–105; 4.4 Web servisi, str. 106–110; 3.4.2 Debug alati, str. 74–75; 3.4.3 Ostali alati, str. 75–76]

---
# Čas 7 — Provjera znanja 1
- Kviz 1 + mini praktični zadatak (dozvole + Logcat)
- Citat: [3.1–3.4; 4.1–4.4]

---
# Čas 8 — Koncept aplikacije I (A.IV.2.1)
- Od ideje do SRS (one-pager)
- Aktivnost: cilj, korisnici, ključne funkcije
- Citat: [1.1 Ideja, str. 6–9; 1.2 Proces, str. 10–13]

---
# Čas 9 — Koncept aplikacije II (A.IV.2.1)
- Scrum osnove; uloge; backlog i sprint
- Aktivnost: mini backlog + plan sprinta
- Citat: [1.3 Scrum, str. 14–19; 1.4 Tim/uloge, str. 20–23]

---
# Čas 10 — Debug osnove (A.IV.2.2)
- Logcat, breakpoint, stack trace (osnove)
- Aktivnost: namjerna greška + ispravka
- Citat: [3.4.2 Debug alati, str. 74–75; 3.4.3 Ostali alati, str. 75–76]

---
# Čas 11 — Kod higijena i mini-optimizacije (A.IV.2.2)
- Organizacija koda; Gradle; I/O i mreža
- Aktivnost: mali refaktor + smanjenje I/O/mrežnih poziva
- Citat: [3.3.5 Gradle, str. 70; 4.1–4.4, str. 80–110; 5.3 RecyclerView, str. 130–141; 5.6 Baza, str. 154–168; 5.7 Web servisi, str. 169–179]

---
# Čas 12 — Provjera znanja 2
- Kviz 2 + praktični zadatak (analiza i fix)
- Citat: [1.1–1.4; 3.3–3.4; 4.*; 5.3/5.6/5.7]