# Lekcija 06 — Ograničenja HW/SW II: Baza, mreža i debug alati (A.IV.1.3)

Ishodi učenja
- Procjenjuje uticaj rada s lokalnom bazom i mrežom na performanse.
- Primjenjuje osnovne debug alate i mjerne prakse.

Ključne tačke
- Mobilna baza podataka: nativni pristup, ORM; schema i upiti.
- Web servisi: SOAP vs. REST; Retrofit + GSON; parsing i latencija.
- Debug alati: Logcat, debugger; ostali alati u Android Studiju.

Scenarij predavanja
- Šta poskupljuje mrežne pozive (latencija, format, payload).
- Zašto ne blokirati glavnu nit (UI) — osnovne asinkrone tehnike.

Demo/Praktikum
- Simulirati “loading” bez blokiranja UI (asinkrono kašnjenje).
- Napraviti minimalni Retrofit poziv (mock ili realan) i logovati rezultate.

Pitanja za provjeru
1) Koji su trade-offovi nativne baze vs. ORM pristupa?
2) Šta utiče na trajanje mrežnog poziva?
3) Koji su osnovni koraci prilikom debug-ovanja koda?

Reference u priručniku
- 4.3 Rad s mobilnom bazom — str. 92–105
- 4.4 Web servisi (REST/Retrofit/GSON) — str. 106–110
- 3.4.2 Alati za otkrivanje pogrešaka — str. 74–75
- 3.4.3 Ostali važni alati — str. 75–76