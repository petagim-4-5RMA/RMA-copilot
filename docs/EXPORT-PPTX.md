# Izvoz .pptx iz Marp deck-ova

Opcija A — VS Code + Marp ekstenzija
1) Instaliraj VS Code i “Marp for VS Code”.
2) Otvori željeni fajl, npr. `slides/Cas-01-OS-i-alati.marp.md`.
3) Command Palette → “Marp: Export slide deck…” → PowerPoint (.pptx).

Opcija B — Marp CLI
- Zahtijeva Node.js 18+:
```bash
npm i -g @marp-team/marp-cli
marp slides/Cas-01-OS-i-alati.marp.md --pptx --allow-local-files -o slides/Cas-01-OS-i-alati.pptx
marp slides/Cas-02-Lifecycle-i-dozvole.marp.md --pptx --allow-local-files -o slides/Cas-02-Lifecycle-i-dozvole.pptx
# … ponovi za ostale fajlove (Cas-03 … Cas-12)
```

Opcija C — GitHub Actions (automatski)
Dodaj workflow `.github/workflows/export-marp-pptx.yml`:
```yaml
name: Export Marp slides to PPTX
on:
  workflow_dispatch:
  push:
    paths: ['slides/*.marp.md']
  pull_request:
    paths: ['slides/*.marp.md']
jobs:
  export:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - name: Export Marp deck to PPTX
        uses: marp-team/marp-cli-action@v2
        with:
          from: slides/Cas-01-OS-i-alati.marp.md
          to: slides/Cas-01-OS-i-alati.pptx
          allowLocalFiles: true
      - name: Upload PPTX artifact
        uses: actions/upload-artifact@v4
        with:
          name: slides-pptx
          path: slides/*.pptx
```
Napomena: Ako želiš auto‑izvoz svih 12 deck-ova, koristi matrix strategiju ili pokreni `marp` u petlji.