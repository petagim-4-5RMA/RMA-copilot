# Lekcija 10 — Alati za praćenje grešaka: Logcat, breakpoint, stack trace (A.IV.2.2)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–06

Ishodi učenja
- Koristi Logcat i breakpoints za otkrivanje uzroka grešaka.
- Čita stack trace i predlaže rješenje na osnovu simptoma.

Pojmovi i objašnjenja
- Log nivoi (V/D/I/W/E), tagovi i filtri.
- Debugger: breakpoint, step over/into/out, variables/watches.
- Stack trace: kako naći “prvi uzrok” (caused by/line broj), razlikovanje framework vs. naš kod.

Demo (koraci)
1) Uvesti namjernu grešku (npr. `val x = 1/0` ili NPE).
2) Postaviti breakpoint i korak‑po‑korak utvrditi gdje nastaje.
3) Pročitati stack trace u Logcatu i identifikovati liniju u našem kodu.
4) Popraviti i potvrditi.

Aktivnosti
- Aktivnost A: Grupno — svaka grupa dobija drugačiju grešku (NPE, IndexOutOfBounds, Arithmetic) da je pronađe i ispravi.
- Aktivnost B: Pisanje korisnih logova: smisliti tagove i poruke koje pomažu u produkciji.

Mini‑kviz
1) Razlika step over/into?
2) Kako filtrirati logove samo za naš proces i tag?
3) Na šta obratiti pažnju u stack trace-u?

Domaći
- Dodaj “sigurnosne provjere” na mjesta gdje može nastati NPE i loguj upozorenje umjesto pucanja.

Rubrika (0–10)
- Ispravna dijagnostika (0–4)
- Korištenje breakpoints i logova (0–4)
- Jasno objašnjenje uzroka (0–2)

Reference (Priručnik)
- 3.4.2 Alati za otkrivanje grešaka — str. 74–75
- 3.4.3 Ostali alati — str. 75–76