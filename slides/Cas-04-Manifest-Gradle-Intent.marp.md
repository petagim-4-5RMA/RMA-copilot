---
marp: true
title: Čas 4 — Manifest, Gradle i Intent (A.IV.1.2)
paginate: true
theme: default
---

# Čas 4 — Manifest, Gradle, Intent
Deklaracije u Manifestu, uloga Gradle-a, eksplicitni/implicitni intent.

---

## Ishodi učenja
- Tumači ključne deklaracije u Manifestu
- Objašnjava osnovna Gradle podešavanja
- Primjenjuje intent-e

---

## Manifest (ključne tačke)
- <application>, <activity>, <intent-filter>
- uses-permission
- LAUNCHER activity

---

## Gradle (app)
- applicationId, minSdk, targetSdk
- dependencies

---

## Intenti
- Eksplicitni: startActivity(DetailActivity)
- Implicitni: ACTION_VIEW (URL), ACTION_SEND (share)

---

## Demo
- Prikaži LAUNCHER intent-filter
- Promijeni targetSdk u Gradle-u
- Dugme: otvori URL implicitnim intentom

---

## Aktivnosti
- A: “Podijeli tekst” ACTION_SEND
- B: Dodaj “deep link” i testiraj adb-om

---

## Mini‑kviz
1) Šta radi intent-filter?
2) Eksplicitni vs implicitni intent?
3) Zašto je minSdk/targetSdk bitan?

---

## Reference (priručnik)
- 3.3.4 Manifest — str. 69–70
- 3.3.5 Gradle — str. 70
- 3.3.6 Namjera (Intent) — str. 71