# Lekcija 11 — Kod higijena i mini‑optimizacije (A.IV.2.2)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–10

Ishodi učenja
- Primjenjuje prakse čitljivog koda i malih optimizacija.
- Identifikuje “vruće” putanje i nudi male, mjerljive popravke.

Pojmovi i objašnjenja
- Kod higijena: imenovanje, kratke funkcije, uklanjanje dupliranog koda, komentari svrhe (ne “šta”).
- Gradle osnove: zavisnosti, min/target SDK, veličina builda.
- I/O i mreža: smanjenje payload‑a, keširanje, batch, izbjegavanje rada na UI niti.
- Liste: RecyclerView (koncept), zašto je efikasniji od linearnih layouta.

Primjeri i ideje za optimizacije
- Zamjena sinhronih I/O operacija sa asinhronim (withContext(Dispatchers.IO)).
- Keširanje rezultata čitanja male datoteke u memoriji dok je ekran aktivan.
- Kompaktne slike (WEBP), manji dimenzioni resursi.

Aktivnosti
- Aktivnost A: Refaktor 10–15 linija (imenovanje, izdvajanje metoda, uklanjanje duplikata).
- Aktivnost B: Izmjeri prije/poslije vrijeme trajanja dijela koda (nanoTime/ms) i uporedi.

Mini‑kviz
1) Dvije brze “pobjede” u optimizaciji?
2) Kako smanjiti mrežni saobraćaj?
3) Šta najčešće dotaknemo u app Gradle?

Domaći
- Napiši kratku listu 5 “pravila koda” za tim (naming, dužina funkcija, logging).

Rubrika (0–10)
- Kvalitet refaktora (0–4)
- Mjerljiv efekt (0–3)
- Pravila koda (0–3)

Reference (Priručnik)
- 3.3.5 Gradle — str. 70
- 4.1–4.4 (pohrana, datoteke, web servisi) — str. 80–110
- 5.3 RecyclerView — str. 130–141
- 5.6 Mobilna baza podataka — str. 154–168
- 5.7 Web servisi — str. 169–179

---