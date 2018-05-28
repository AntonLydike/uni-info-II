
CREATE TABLE Arzt (
  isbn CHAR(10) NOT NULL UNIQUE,
  jahr INT,
  autor VARCHAR(20),
  PRIMARY KEY(isbn)
);
