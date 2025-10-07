# Lekcija 03 — Struktura projekta I: resursi i organizacija (A.IV.1.2)

Trajanje: 45–90 min
Preduslovi: Lekcije 01–02

Ishodi učenja
- Raščlanjuje strukturu modula (app), direktorije i ključne fajlove.
- Upravlja resursima (strings, colors, drawable/mipmap) i razumije kvalifikatore.
- Mijenja naziv aplikacije i vidi efekte u UI‑u/launcheru.

Pojmovi i objašnjenja
- app modul: manifests/, java/ (ili kotlin/), res/, Gradle build skripte.
- res/values: strings.xml, colors.xml; res/drawable vs. res/mipmap (launcher ikone).
- Kvalifikatori (npr. values-hr, layout-land, mipmap-anydpi-v26) — selekcija po uređaju/jeziku/konfiguraciji.

Primjeri
- Promjena naziva:
  - strings.xml: <string name="app_name">MojaAplikacija</string>
  - Manifest label referiše na @string/app_name.
- Dodavanje boje i upotreba u Compose:
// colors.xml: <color name="primary_blue">#2E5AAC</color>
@Composable fun Title() { Text("Pozdrav", color = Color(0xFF2E5AAC)) }
- Kvalifikatori:
  - Napravi values-hr/strings.xml i prevede app_name → “Moja Aplikacija”.

Demo (koraci)
1) Pregled Project prikaza: gdje su koji fajlovi i čemu služe.
2) Kreiraj values-hr/strings.xml (New > Android Resource File > qualifiers: Locale=hr).
3) Promijeni naziv aplikacije i pokreni app; promijeni jezik emulatora na hrvatski i provjeri.

Aktivnosti
- Aktivnost A: Dodaj novu boju i primijeni je na naslov.
- Aktivnost B: Napravi drawable shape (zaokruženi pravougaonici) i koristi u pozadini.

Mini‑kviz
1) Razlika drawable vs mipmap?
2) Gdje se mijenja naziv aplikacije?
3) Šta rade kvalifikatori resursa?

Domaći
- Dodaj values-night/colors.xml sa tamnijim varijantama i uporedi izgled u “Night Mode”.

Rubrika (0–10)
- Tačna promjena naziva (0–3)
- Ispravna upotreba kvalifikatora (0–4)
- Primjena boje/drawable (0–3)

Reference (Priručnik)
- 3.1.3 Kreiranje novog projekta (struktura) — str. 59–60
- 3.3 Programska logika — str. 64–65
- Resursi — str. 67
- Kvalifikatori resursa — str. 68

---