# Lekcija 11 — Kod higijena i mini-optimizacije (A.IV.2.2)

Ishodi učenja
- Primjenjuje osnovne prakse čitljivog i održivog koda.
- Provodi male optimizacije u I/O, mreži i prikazu lista.

Ključne tačke
- Gradle build: zavisnosti, min/target SDK, uticaj na veličinu/kompatibilnost.
- I/O i mreža: keširanje, smanjenje payload-a, batched pozivi.
- Učinkovit prikaz lista: RecyclerView osnove (viewholder, diff).
- Lokalna baza i performanse: upiti, indeksiranje, lazy učitavanje.

Scenarij predavanja
- Kako smanjiti “troškove” na vrućim putanjama koda.
- Male promjene s najvećim efektom (pareto pristup).

Aktivnost
- Refaktor 10–15 linija (imenovanje, ekstrakcija metoda).
- Uvesti keširanje jednostavnog rezultata (memorijski ili disk).

Pitanja za provjeru
1) Koje “brze pobjede” u optimizaciji biste prvo primijenili?
2) Kako učiniti listu efikasnijom?
3) Šta u Gradle-u najčešće dotaknete u početnom projektu?

Reference u priručniku
- 3.3.5 Gradle — str. 70
- 4.1–4.4 (pohrana, datoteke, web servisi) — str. 80–110
- 5.3 RecyclerView — str. 130–141
- 5.6 Mobilna baza podataka — str. 154–168
- 5.7 Web servisi — str. 169–179