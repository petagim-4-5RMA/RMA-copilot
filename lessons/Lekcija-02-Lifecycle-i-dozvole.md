# Lekcija 02 — Operativni sistemi: Activity lifecycle i dozvole (A.IV.1.1)

Ishodi učenja
- Objašnjava osnovni lifecycle Android aktivnosti.
- Razlikuje dozvole u Manifestu od runtime dozvola.
- Konfiguriše i testira dozvole u jednostavnoj aplikaciji.

Ključne tačke
- Aplikacijski stog (visoko): gdje su aplikacije, framework i kernel.
- Activity i lifecycle: onCreate, onStart, onResume, onPause, onStop, onDestroy.
- Manifest: applicationId, activity deklaracije, uses-permission.
- Runtime dozvole (od Marshmallow): zašto su uvedene i kako ih tražimo u kodu.

Scenarij predavanja
- Prelaz s koncepata OS-a na aplikacijsku logiku: Activity kao ulazna tačka.
- Lifecycle callback-ovi i scenariji (rotacija, poziv, prelazak u background).
- Dozvole: definicija u Manifestu vs. traženje u runtime-u.
- Kratko: gdje vidjeti rezultat u Logcat-u.

Demo/Praktikum
- Dodati uses-permission CAMERA u Manifest.
- U UI dodati dugme koje traži kameru kroz ActivityResult API.
- Posmatrati grant/deny u Logcat-u.

Pitanja za provjeru
1) Navedite redoslijed barem 4 lifecycle callback-a.
2) Koja je razlika između manifestne i runtime dozvole?
3) Zašto OS uvodi runtime dozvole i kako utiču na UX?

Reference u priručniku
- 3.2.1 Aplikacijski stog — str. 61–62
- 3.3 Programska logika Android aplikacije — str. 64–65
- 3.3.1 Android aktivnosti — str. 65–66
- 3.3.4 Android Manifest — str. 69–70