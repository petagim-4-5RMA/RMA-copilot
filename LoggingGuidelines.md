# Smjernice za logovanje

- Koristiti dosljedne tagove: `LifecycleDemo`, `PermCheck`, `Network`, `DB`.
- Nivoi: `Log.v` (verbose), `Log.d` (debug), `Log.i` (info), `Log.w` (warn), `Log.e` (error).
- Ne logovati osjetljive podatke (tokeni, lični podaci).
- U produkciji smanjiti logove; koristite `BuildConfig.DEBUG` za kontrolu.