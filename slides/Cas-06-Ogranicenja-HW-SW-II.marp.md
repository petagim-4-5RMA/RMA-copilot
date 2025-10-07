---
marp: true
title: Čas 6 — Ograničenja HW/SW II (A.IV.1.3)
paginate: true
theme: default
---

# Čas 6 — Ograničenja II
Lokalna baza, mreža (REST), debug alati, ne blokirati UI.

---

## Ishodi učenja
- Procjenjuje troškove baze i mreže
- Primjenjuje osnovne debug prakse

---

## Baza i mreža
- Nativno vs. ORM (koncept)
- REST/JSON; latencija, payload, timeout/retry

---

## Debug alati
- Logcat filteri i tagovi
- Breakpoints, step over/into/out

---

## Demo
- “Loading” 0.5–1 s bez blokiranja UI
- Breakpoint i mjerenje trajanja (nanoTime/ms)

---

## Aktivnosti
- A: Plan keširanja (šta/kad/koliko)
- B: Test različitih kašnjenja i uticaj na UX

---

## Mini‑kviz
1) Zašto ne blokirati glavnu nit?
2) Šta utiče na trajanje mrežnog poziva?
3) Kako filtrirati Logcat?

---

## Reference (priručnik)
- 4.3 Mobilna baza — str. 92–105
- 4.4 Web servisi — str. 106–110
- 3.4.2 Debug alati — str. 74–75
- 3.4.3 Ostali alati — str. 75–76