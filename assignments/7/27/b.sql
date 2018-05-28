CREATE TABLE Point (
  x FLOAT NOT NULL,
  y FLOAT NOT NULL
)

CREATE TABLE Circle (
  position Point not null,
  radius FLOAT NOT NULL,
  check (radius > 0)
)

CREATE TABLE Rectangle (
  position Point not null,
  length FLOAT NOT NULL,
  width FLOAT NOT NULL,
  CHECK ( length > 0 ),
  CHECK ( width > 0 )
)

-- PRO: Operationen auf der Datenbank sind recht einfach

-- CON: Erweitern der oberklasse GeometricObject wird komplex wenn mehr
--      unterklassen hinzugefügt werden.
