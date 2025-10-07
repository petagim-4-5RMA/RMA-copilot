# Kviz 1 — Ključ odgovora

1) SDK daje alate, API-je i build chain; emulator omogućava pokretanje/test bez fizičkog uređaja.
2) Manifest dozvola je deklarativna i nužna za instalaciju; runtime dozvola traži pristanak korisnika tokom rada.
3) Komponente (activity, service), dozvole, intent-filter-i, min/target SDK, theme, provider-i.
4) Skup callback-ova toka aktivnosti, npr. onCreate (inicijalizacija), onStart (vidljivo), onResume (u fokusu), onPause/onStop (gubi fokus/vidljivost), onDestroy (čišćenje).
5) Logcat prikazuje sistemske i aplikacijske logove; filter po tagu npr. upisom tag:PermCheck ili odabirom “Edit Filter”.
6) Res/values (strings.xml), res/drawable (ikone); pristup preko R.string.ime ili painterResource itd.
7) Svaka app radi izolovano s vlastitim podacima i dozvolama — smanjuje rizik od curenja i zloupotrebe.
8) CPU/RAM/baterija — ublažiti optimizacijom (keširanje, lazy učitavanje, izbjegavati rad na glavnoj niti), mreža — kompresija/paginacija/offline cache.
9) BuildConfig sadrži compile-time konstante (npr. DEBUG) za feature flagove, log nivoe, URL-ove po varijanti.
10) Composable su deklarativne funkcije koje opisuju UI i recompose se po stanju; View pristup je imperativan s XML-om i mutacijama.
