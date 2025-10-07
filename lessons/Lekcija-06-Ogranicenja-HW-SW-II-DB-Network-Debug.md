# Lekcija 06 — Ograničenja HW/SW II: Baza, mreža i debug (A.IV.1.3)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–05

Ishodi učenja
- Procjenjuje troškove lokalne baze i mrežnih poziva (latencija, obrada).
- Primjenjuje osnovne debug prakse (Logcat, breakpoint, mjerenja).

Pojmovi i objašnjenja
- Lokalna baza: kada je potrebna; nativno (SQLite) vs. ORM (konceptualno).
- Mreža: REST/JSON; latencija, payload, retry, timeout; izbjegavanje blokiranja UI niti.
- Debug alati: Logcat filteri; breakpoints; osnovna mjerenja trajanja.

Primjeri (konceptualno, bez dodatnih biblioteka)
- Simulacija mreže:
```kotlin
// Ne blokirati UI – koristiti coroutine na Dispatchers.IO
CoroutineScope(Dispatchers.Main).launch {
  val start = System.currentTimeMillis()
  val data = withContext(Dispatchers.IO) { fakeNetworkCall() }
  Log.d("Perf", "Trajanje: ${System.currentTimeMillis()-start}ms")
}
suspend fun fakeNetworkCall(): String { delay(500); return "OK" }
```
- Mjerenje čitanja iz fajla (I/O):
```kotlin
val t0 = System.nanoTime()
// ... čitanje
val dtMs = (System.nanoTime() - t0) / 1_000_000
Log.d("Perf", "I/O trajanje: ${dtMs}ms")
```

Demo (koraci)
1) Simuliraj “loading” 0.5–1.0 s bez blokiranja UI; prikaži indikator (tekst “Učitavam…”).
2) Postavi breakpoint u dio koda i prikaži “step over/into/out”.
3) Dodaj Log.d sa mjeranjem vremena za I/O.

Aktivnosti
- Aktivnost A: Kreiraj plan keširanja (kada i šta keširati, invalidacija).
- Aktivnost B: Testiraj različita kašnjenja (200/500/1000 ms) i prikaži uticaj na UX.

Mini‑kviz
1) Zašto ne blokirati glavnu nit?
2) Šta utiče na trajanje mrežnog poziva?
3) Kako filtrirati Logcat po tagu?

Domaći
- Dodaj mjerenje trajanja “loading” i prikaži ga u UI (npr. “Gotovo za 523 ms”).

Rubrika (0–10)
- Ne‑blokirajuća simulacija (0–4)
- Breakpoint i mjerenje (0–4)
- Diskusija trade‑off (0–2)

Reference (Priručnik)
- 4.3 Mobilna baza — str. 92–105
- 4.4 Web servisi — str. 106–110
- 3.4.2 Alati za otkrivanje grešaka — str. 74–75
- 3.4.3 Ostali važni alati — str. 75–76