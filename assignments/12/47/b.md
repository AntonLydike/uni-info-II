Es wird immer nur `11` ausgegeben, da int ein primitiver Datentyp ist
und bei der Erstellung der Threads übergeben wird.
Dadurch arbeitet jeder Thread sozusagen mit seiner eigenen Variable und startet damit immer mit einer 0.
