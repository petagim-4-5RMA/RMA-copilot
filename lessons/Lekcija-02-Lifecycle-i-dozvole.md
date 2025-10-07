# Lekcija 02 — Activity lifecycle i dozvole (A.IV.1.1)

Trajanje: 45–90 min
Preduslovi: Lekcija 01; osnovni projekat pokrenut

Ishodi učenja
- Objašnjava i prati Activity lifecycle (onCreate … onDestroy).
- Razlikuje deklarativne (Manifest) i runtime dozvole i demonstrira traženje dozvole.
- Prati promjene u Logcatu i objašnjava tranzicije stanja.

Ključni pojmovi
- Aplikacijski stog: OS slojevi i gdje živi Activity.
- Lifecycle: onCreate → onStart → onResume → (onPause → onStop) → onDestroy.
- Manifest dozvole vs. runtime dozvole (od Android 6.0).
- Rationale, “don’t ask again”, postavke aplikacije.

Detaljna objašnjenja
- Zašto lifecycle? OS upravlja resursima: obustava, obnova, promjena konfiguracije (rotacija).
- Manifest dozvola je deklaracija namjere. Runtime je stvarno traženje od korisnika.
- Dobre prakse: tražiti dozvolu “u kontekstu” (tačno kad treba), objasniti zašto.

Demo (koraci)
1) Lifecycle logovi:
   - U MainActivity dodati log u svaku callback metodu:
```kotlin
override fun onCreate(b: Bundle?) { super.onCreate(b); Log.d("Life","onCreate") }
override fun onStart() { super.onStart(); Log.d("Life","onStart") }
override fun onResume() { super.onResume(); Log.d("Life","onResume") }
override fun onPause() { super.onPause(); Log.d("Life","onPause") }
override fun onStop() { super.onStop(); Log.d("Life","onStop") }
override fun onDestroy() { super.onDestroy(); Log.d("Life","onDestroy") }
```
   - Pokreni app; zatim Home; zatim vrati se; rotiraj ekran; posmatraj Logcat.
2) Dozvole:
   - Manifest: `<uses-permission android:name="android.permission.CAMERA" />`
   - UI dugme “Traži kameru”; uz `rememberLauncherForActivityResult` traži dozvolu i loguj ishod.

Zamke i savjeti
- “Don’t ask again” — objasni da u tom slučaju treba u Postavke aplikacije.
- Ne tražiti više dozvola odjednom ako nije neophodno; utječe na UX i odobravanje u store‑u.

Aktivnosti
- Aktivnost A (10 min): Nacrtaj dijagram lifecycle tranzicija na tabli (ulaz/izlaz iz appa, rotacija).
- Aktivnost B (15 min): Implementiraj traženje CAMERA, ispiši Toast i Log ishod.

Mini‑kviz (5 pitanja)
1) Navedite 4 lifecycle callback-a i kada se javljaju.
2) Razlika: Manifest vs runtime dozvola?
3) Zašto je važno tražiti dozvolu “u trenutku potrebe”?
4) Kako saznati da je korisnik označio “don’t ask again”?
5) Gdje u Logcatu se vidi redoslijed lifecycle poziva?

Domaći (15–20 min)
- Dodaj dugme koje otvara postavke aplikacije kada je dozvola trajno odbijena (hint: `Settings.ACTION_APPLICATION_DETAILS_SETTINGS` sa `Uri.fromParts("package", packageName, null)`).

Rubrika (0–10)
- Ispravnost lifecycle logova (0–4)
- Ispravno traženje i obrada dozvole (0–4)
- Objašnjenje “don’t ask again” scenarija (0–2)

Reference (Priručnik)
- 3.2.1 Aplikacijski stog — str. 61–62
- 3.3 Programska logika — str. 64–65
- 3.3.1 Android aktivnosti — str. 65–66
- 3.3.4 Android Manifest — str. 69–70

Dodatno
- [Request App Permissions](https://developer.android.com/training/permissions/requesting)