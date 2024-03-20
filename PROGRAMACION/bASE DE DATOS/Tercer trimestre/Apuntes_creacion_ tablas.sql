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
 
 ALTER TABLE nombre
 -- ADD -- añadir MODIFY (MODIFICA), rENAME TO (RENOMBRAR)
 -- new_column_name  column_definition
 -- [FIRST | AFTER COLUMN__NAME]
 
 
 -- Para insertar
INSERT INTO customers (CustomerID, CompanyName, City, Country)
VALUES ("DIA", "Vedruna", "Sevilla", "España");

INSERT INTO employees SET EmployeeID=0, FirstName= "Moises", LastName="Pastrana";

CREATE TABLE `CategoriesPrueba` (
  `CategoryID` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(15) NOT NULL,
  `Description` longtext,
  `Picture` longblob,
  PRIMARY KEY (`CategoryID`),
  KEY `Categories_CategoryName` (`CategoryName`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

INSERT INTO CategoriesPrueba 
Select * from categories
where CategoryID >=3 and CategoryID <=6;

Insert into customers (CustomerID, CompanyName, City, Country)
select SupplierID, CompanyName, City, Country from suppliers;

REPLACE INTO employees(eMPLOYEEid, lASTnAME, Firstname)
values (30, "Garcia", "Diana");

DELETE from northwindprueba.categoriesprueba where Description like 'Cheeses';

UPDATE northwindPrueba.products
SET unitsinStock= unitsinStock + 10
where CategoryID=2;

INSERT INTO employees (EmployeeID, LastName, FirstName)
VALUES (0, "Pascual", "Diana");

INSERT INTO employees SET EmployeeID=0, FirstName= "Moises", LastName="Pastrana";



