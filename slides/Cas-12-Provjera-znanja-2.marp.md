---
marp: true
title: Čas 12 — Provjera znanja 2 (A.IV.2.2)
paginate: true
theme: default
---

# Čas 12 — Provjera znanja 2
Kviz + praktikum (debug/optimizacija).

---

## Kviz (primjeri)
1) Breakpoint i čemu služi?
2) Kako locirati uzrok u stack trace-u?
3) Zašto ne blokirati UI nit?
4) Jedna mjera za liste (učinkovitost)?
5) Organizacija korisnog logovanja?

---

## Praktikum
- A: I/O na glavnoj niti → premjesti na IO dispatcher; izmjeri vrijeme
- B: “Loading” 1200 ms zbog payload-a → predloži kompresiju/keš
- C: Više malih mrežnih poziva → batch/keš/smanji payload

---

## Kriteriji ocjene
- Dijagnostika (0–4)
- Realnost rješenja (0–4)
- Mjerenje i objašnjenje (0–2)

---

## Reference (priručnik)
- 1.1–1.4; 3.3–3.4; 4.*; 5.3/5.6/5.7