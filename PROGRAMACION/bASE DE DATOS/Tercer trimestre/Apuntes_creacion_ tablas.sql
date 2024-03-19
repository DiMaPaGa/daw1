DROP DATABASE IF EXISTS PIECES;
CREATE DATABASE PIECES;
USE PIECES;

CREATE TABLE IF NOT EXISTS Pieces(
CodeID INT NOT NULL,
Name VARCHAR(40) NOT NULL,
PRIMARY KEY(CodeID));

CREATE TABLE IF NOT EXISTS Providers(
CodeID VARCHAR(40) NOT NULL,
Name TEXT NOT NULL,
PRIMARY KEY(CodeID));

CREATE TABLE IF NOT EXISTS Provides(
Piece INT,
Provider VARCHAR(40) NOT NULL,
Price INT NOT NULL,
PRIMARY KEY(Piece, Provider),
FOREIGN KEY (Piece) REFERENCES Pieces(CodeID),
FOREIGN KEY (Provider) REFERENCES Providers(CodeID)
);

-- ALTER TABLE: Permite modificar e incluir columnas a las tablas, atributos, restricciones
-- add añade

DROP DATABASE IF EXISTS Movies;
CREATE DATABASE Movies;
USE Movies;

CREATE TABLE IF NOT EXISTS Movies(
	Code INT PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    Rating VARCHAR(255)
);

DROP TABLE IF EXISTS MovieTheaters;
CREATE TABLE MovieTheaters (
	Code INT,
    Name VARCHAR(255) NOT NULL,
    Movie INT,
  PRIMARY KEY (Code),
  FOREIGN KEY(Movie) REFERENCES Movies(Code) ON DELETE CASCADE ON UPDATE CASCADE
);

-- `Description` longtext,texto más largo que varchar
 -- `Picture` longblob, conjunto de bytes sobre tdo imágenes
 -- auto increment genera campo automáticamente
 -- insertin to: insertar valores
 
 INSERT INTO `Categories` (`CategoryName`,`Description`,`Picture`) VALUES 
 ('Beverages','Soft drinks, coffees, teas, beers, and ales',NULL),
 ('Condiments','Sweet and savory sauces, relishes, spreads, and seasonings',NULL),
 ('Confections','Desserts, candies, and sweet breads',NULL),
 ('Dairy Products','Cheeses',NULL),
 ('Grains/Cereals','Breads, crackers, pasta, and cereal',NULL),
 ('Meat/Poultry','Prepared meats',NULL),
 ('Produce','Dried fruit and bean curd',NULL),
 ('Seafood','Seaweed and fish',NULL);


