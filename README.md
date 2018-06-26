# uni-info-II
Lösungen der Übungsaufgaben der Vorlesung Informatik II an der Uni Augsburg im SoSe 18

## Punkte:

|Übungsblatt: |1  |2  |3  |4  |5  |6  |7  |8  |9  |10 |11 |12 |
|-------------|---|---|---|---|---|---|---|---|---|---|---|---|
|A1           | 1 | 1 | 1 | 1 | 1 | 1 |1  |2  | 1 |1  |   |   |
|A2           |0,5| 1 | 1 | 1 | 1 | 1 |1  |1  |  1|0  |   |   |
|A3           | 1 | 1 |0,5| 1 | 1 | 1 |1  |0,5| 1 |0  |   |   |
|A4           | 1 | 1 | 1 | 1 | 1 | 1 |1  |-  |0,5|1  |   |   |

Extrapunkte (BP / Vorrechnen):

 - Tarik: 1
 - Dominic: 2
 - Anton: 3


**Gesamt: 36/40**


## concat-assignments script

bash script zum zusammenstellen der Abgabeblätter:

 - Kopiert alle Teilaufgaben aus dem Eclipse Workspace,
 - Erstellt Markdown Dokument,
 - Konvertiert Markdown Dokument mit GRIP zu HTML (im GitHub style),
 - "Drukt" HTML Datei als PDF mit chrome oder chromium
 - Hängt "turn-in-cover.pdf" vor das PDF


Einstellungen sind in der `.settings` datei gespeichert:

 - `PDFNAME` Name des ausgegebenen PDFs, `%n` wird durch die nummer des Übungsblattes ersetzt.
 - `COPY_PDF_IN_PROJECT` Ob die fertige PDF-Datei in den Ordner der Übung kopiert werden soll.
 - `REMOVE_MD` Ob die temporäre MarkDown datei gelöscht werden soll
 - `REMOVE_HTML` Ob die temporäre HTML-Datei gelöscht werden soll
 - `JAVADIR` Ordner in dem sich der Eclipse-Workspace befindet
 - `PROJECTNAME` Name des jeweiligen Projektes (`%n` wird ducrch die Nummer des aktuellen Übungsblattes ersetzt)
 - `PACKAGEPREFIX` Prefix der Packages (angenommen prefix ist "aufgabe", dann werden "aufagbe1", "aufgabe 23b" aber nicht "vorgaben" kopiert)
 - `CODE_TAG` Markdown Tag der Code-Blöcke beginnt und beendet
 - `LANGUAGE` Sprache des Syntax-Highlighting
