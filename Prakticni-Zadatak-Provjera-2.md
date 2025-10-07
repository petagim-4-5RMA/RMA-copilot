# Praktični zadatak — Provjera 2 (Debugging i optimizacija)

Zadatak A (Android):
1) U datom ekranu lista trzucka pri skrolanju. Koriste se velike slike bez keširanja.
2) Koristeći Android Profiler identifikujte uzrok i implementirajte rješenje (npr. Glide/Coil s keširanjem, placeholder, smanjenje rezolucije).
3) Uključite StrictMode u debug modu i otklonite barem jednu prijavljenu prekomjernu operaciju na glavnoj niti.
4) Prikažite izvještaj prije/poslije (fps ili vrijeme kadrova) i promjene u kodu.

Zadatak B (Flutter):
1) Lista (ListView) rebuild-a previše widgeta pri skrolanju.
2) Optimizujte korištenjem `ListView.builder`, memoizacijom podataka, `const` widgeta i eventualno `CachedNetworkImage`.
3) Pomoću DevTools Performance tab-a prikažite timeline prije/poslije (frame budget).
4) Predajte screenshotove i izmjene koda.

Kriteriji (10 poena): dijagnostika (3), implementirana optimizacija (4), mjerni dokazi (2), jasnoća izvještaja (1).