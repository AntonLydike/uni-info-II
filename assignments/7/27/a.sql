CREATE TABLE Point (
  x FLOAT NOT NULL,
  y FLOAT NOT NULL
)

CREATE TABLE GeometricObject (
  position Point NOT NULL,
  type ENUM('circle', 'rectangle') NOT NULL
  -- circle
  radius FLOAT,
  check (
    type = 'circle' AND
    radius IS NOT NULL AND
    radius > 0
  ),
  -- rectangle
  length FLOAT,
  width FLOAT,
  check (
    type = 'rectangle' AND
    length IS NOT NULL AND
    width IS NOT NULL
    length > 0 AND
    width > 0
  ),
)


-- PRO: Erweitern der Oberklasse GeometricObject ist einfach

-- CON: Unterscheidung zwischen objekttypen ist schwer, besonders wenn
--      eine andere Klasse nur referenzen auf Kreise zulassen möchte

-- CON: Wenn eine weitere Klasse von GeometricObject erbt, können backups nicht
--      mehr eingelesen werden, da GeometricObjects struktur geändert wurde

-- CON: Die Constraints werden schnell unübersichtlich
