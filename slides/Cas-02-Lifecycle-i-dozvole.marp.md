---
marp: true
title: Čas 2 — Lifecycle i dozvole (A.IV.1.1)
paginate: true
theme: default
---

# Čas 2 — Lifecycle i dozvole
Activity lifecycle i razlika Manifest vs. runtime dozvole.

---

## Ishodi učenja
- Praćenje lifecycle-a (onCreate … onDestroy)
- Razlikovanje manifestnih i runtime dozvola
- Traženje dozvole u aplikaciji

---

## Pojmovi
- Aplikacijski stog: gdje živi Activity
- Lifecycle: onCreate → onStart → onResume → … → onDestroy
- Manifest: uses-permission; Activity deklaracije
- Runtime dozvole (od Android 6.0)

---

## Demo (lifecycle logovi)
Dodaj Log.d u sve callback-ove i posmatraj:
- start aplikacije
- Home → povratak
- rotacija

---

## Dozvole (koraci)
1) Manifest: CAMERA
2) Dugme: traži dozvolu (ActivityResult API)
3) Loguj grant/deny; prikaži poruku

---

## Aktivnosti
- A: Nacrtaj dijagram stanja za tipične tranzicije
- B: Implementiraj CAMERA runtime traženje i loguj ishod

---

## Mini‑kviz
1) 4 lifecycle callback-a po redu?
2) Manifest vs runtime dozvola?
3) “Don’t ask again” — gdje u Postavkama?

---

## Reference (priručnik)
- 3.2.1 Aplikacijski stog — str. 61–62
- 3.3 Programska logika — str. 64–65
- 3.3.1 Aktivnosti — str. 65–66
- 3.3.4 Manifest — str. 69–70