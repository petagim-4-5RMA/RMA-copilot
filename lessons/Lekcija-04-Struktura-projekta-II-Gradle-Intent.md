# Lekcija 04 — Struktura mobilne aplikacije II: Manifest, Gradle, Intent (A.IV.1.2)

Ishodi učenja
- Tumači ključne deklaracije u Manifestu.
- Objašnjava ulogu Gradle-a u build procesu.
- Primjenjuje intent-e (osnovni scenariji).

Ključne tačke
- Manifest: activity, permission, intent-filter, application.
- Gradle (app-level): applicationId, minSdk/targetSdk, dependencies.
- Intent: eksplicitni i implicitni; startActivity i prenos podataka (extras).

Scenarij predavanja
- Kako se build konfiguriše (u jednoj datoteci) i šta može poći po zlu.
- Kada i kako koristiti implicitne intente (npr. otvoriti web, podijeliti tekst).
- Veza intent-filtera u Manifestu s implicitnim intentima.

Demo/Praktikum
- Dodati dependency i objasniti zašto je u dependencies bloku.
- Napraviti implicitni intent za otvaranje URL-a i poslati share.

Pitanja za provjeru
1) Šta je intent-filter i zašto je važan?
2) Razlika eksplicitni vs. implicitni intent?
3) Koje su dvije najvažnije stvari u app-level Gradle-u za početak?

Reference u priručniku
- 3.3.4 Android Manifest — str. 69–70
- 3.3.5 Gradle — str. 70
- 3.3.6 Namjera (Intent) — str. 71