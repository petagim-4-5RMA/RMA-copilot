# Lekcija 05 — Ograničenja HW/SW i performanse I (A.IV.1.3)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–04

Ishodi učenja
- Procjenjuje uticaj CPU/RAM/baterije i I/O na rad aplikacije.
- Odabire osnovnu strategiju pohrane podataka (preferences, datoteke).

Pojmovi i objašnjenja
- Aplikacijski stog: slojevi (app/framework/HAL/kernel) i implikacije.
- Pohrana:
  - SharedPreferences (ključ‑vrijednost, male postavke).
  - Interna memorija (`openFileOutput`), eksterni storage (oprez dozvole).
- I/O i resursi: veličina slika, format (PNG/JPG/WEBP), keš.

Primjeri koda
- SharedPreferences:
```kotlin
val prefs = getSharedPreferences("app", MODE_PRIVATE)
prefs.edit().putString("username", "Ana").apply()
val name = prefs.getString("username", "")
```
- Pisanje datoteke (interna memorija):
```kotlin
openFileOutput("data.txt", MODE_PRIVATE).use { it.write("Pozdrav".toByteArray()) }
```

Demo (koraci)
1) Sačuvaj i pročitaj jednostavnu postavku u prefs.
2) Zapiši i pročitaj mali tekst u internu memoriju.
3) Uporedi prikaz slike 2 MB vs. optimizovane 200 KB i posmatraj odziv.

Aktivnosti
- Aktivnost A: Osmisli pravila za veličinu i format slika u aplikaciji (3 pravila).
- Aktivnost B: Napravi “postavke” (npr. tema: light/dark) i sačuvaj izbor u prefs.

Mini‑kviz
1) Kada koristiš SharedPreferences?
2) Kako pisati u internu memoriju?
3) Koji formati slika su tipični i šta preporučiti?

Domaći
- Napravi util funkciju za čitanje datoteke i prikaži sadržaj u Text.

Rubrika (0–10)
- Ispravno korištenje prefs (0–3)
- Pisanje/čitanje datoteke (0–4)
- Preporuke za resurse (0–3)

Reference (Priručnik)
- 3.2.1 Aplikacijski stog — str. 61–62
- 4.1 Pohrana podataka — str. 80–85
- 4.2 Zapis u datoteke — str. 85–91