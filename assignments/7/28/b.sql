-- insert placeholder customer (do this only once)
INSERT INTO Kunde (id) VALUES (-1);

-- make sure the cutsomer isn't mentioned in a foreign key
UPDATE Ausleihe SET kundeID = -1 WHERE kundeID = 123;

-- delete customer
DELETE FROM Kunde WHERE id = 123;

---
SELECT DISTINCT kundeID FROM Ausleihe WHERE begin = '2017-12-20';
