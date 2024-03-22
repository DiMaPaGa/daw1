-- Crear una base de datos llamada PIECES, destinada a almacenar productos de varios
-- proveedores. La base de datos debe tener tres tablas:
-- Pieces: 
	-- con un campo CodeID de tipo entero como clave primaria no nula.
	-- con un campo Name de tipo texto no nulo.
-- Providers:
	-- con un campo CodeID de tipo cadena variable de tamaño maximo 40, como clave primaria no nula.
	-- con un campo Name de tipo texto no nulo.
-- Provides:
	-- con un campo Piece de tipo entero, clave ajena hacia la tabla Pieces.
	-- con un campo Provider de tipo cadena variable de tamaño maximo 40, como clave ajena hacia la tabla Providers.
	-- con un campo Price de tipo entero no nulo.
	-- la clave primaria la conforman los campos Piece y Provider.



DROP DATABASE IF EXISTS PIECES;
CREATE DATABASE PIECES;
USE PIECES;

CREATE TABLE IF NOT EXISTS Pieces(
CodeID INT NOT NULL,
Name TEXT NOT NULL,
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

-- Traducimos

ALTER TABLE Pieces
RENAME TO Piezas;

ALTER TABLE Providers
RENAME TO Proveedores;

ALTER TABLE Provides
RENAME TO Provee;

ALTER TABLE Piezas
CHANGE COLUMN CodeID CodigoID INT NOT NULL;

ALTER TABLE Piezas
CHANGE COLUMN Name Nombre TEXT NOT NULL;

ALTER TABLE Proveedores
CHANGE COLUMN CodeID CodigoID VARCHAR(40) NOT NULL;

ALTER TABLE Proveedores
CHANGE COLUMN Name Nombre TEXT NOT NULL;

ALTER TABLE Provee
CHANGE COLUMN Piece Pieza INT;

ALTER TABLE Provee
CHANGE COLUMN Provider Proveedor VARCHAR(40) NOT NULL;

ALTER TABLE Provee
CHANGE COLUMN Price Precio INT NOT NULL;


-- Continuamos con la inserción de datos:
-- Proveedores:
-- ‘Hal’, ‘Empresas Clarke’
-- ‘RBT’, ‘Corporación Susan Calvin’
-- ‘TNBC’, ‘Suministros Skellington’

INSERT INTO proveedores SET CodigoID="Hal", Nombre= "Empresas Clarke";
INSERT INTO proveedores SET CodigoID="RBT", Nombre= "Corporación Susan Calvin";
INSERT INTO proveedores SET CodigoID="TNBC", Nombre= "Suministros Skellington";

-- Piezas:
-- 1, ‘Piñones’
-- 2, ‘Tornillos’
-- 3, ‘Tuercas’
-- 4, ‘Clavos’

INSERT INTO Piezas SET CodigoID=1, Nombre= "Piñones";
INSERT INTO Piezas SET CodigoID=2, Nombre= "Tornillos";
INSERT INTO Piezas SET CodigoID=3, Nombre= "Tuercas";
INSERT INTO Piezas SET CodigoID=4, Nombre= "Clavos";


-- La empresa ‘Empresas Clarke’ provee:
-- Piñones a un precio de 10.
-- Tornillos a un precio de 20.
-- Clavos a un precio de 5.

INSERT INTO provee SET Pieza=1, Proveedor= "Hal", Precio=10;
INSERT INTO provee SET Pieza=2, Proveedor= "Hal", Precio=20;
INSERT INTO provee SET Pieza=4, Proveedor= "Hal", Precio=5;

-- La empresa ‘Corporacion Susan Calvin’ provee:
-- Piñones a un precio de 15.
-- Tornillos a un precio de 15.
-- Tuercas a un precio de 50.
-- Clavos a un precio de 7.

INSERT INTO provee SET Pieza=1, Proveedor= "RBT", Precio=15;
INSERT INTO provee SET Pieza=2, Proveedor= "RBT", Precio=15;
INSERT INTO provee SET Pieza=3, Proveedor= "RBT", Precio=50;
INSERT INTO provee SET Pieza=4, Proveedor= "RBT", Precio=7;

-- La empresa ‘Suministros Skellington’ provee:
-- Tornillos a un precio de 14.
-- Tuercas a un precio de 45.

INSERT INTO provee SET Pieza=2, Proveedor= "TNBC", Precio=14;
INSERT INTO provee SET Pieza=3, Proveedor= "TNBC", Precio=45;

-- Finalmente, modificamos los datos:
-- Añadir una entrada a la base de datos para indicar que "Suministros Skellington"
-- (code "TNBC") proveerá piñones (code "1") por 7 céntimos cada uno.
INSERT INTO provee SET Pieza=1, Proveedor= "TNBC", Precio=7;

--  Incrementa todos los precios por un céntimo.
UPDATE provee
SET Precio = Precio + 1;

-- Actualiza la base de datos para reflejar que "Corporacion Susan Calvin" (code
-- "RBT") no proveerá clavos (code 4).

DELETE FROM Provee
WHERE Proveedor = 'RBT' AND Pieza = 4;

-- Actualiza la base de datos para reflejar que "Corporacion Susan Calvin" (code
-- "RBT") no proveerá ninguna pieza (el proveedor debe permanecer en la base de
-- datos).

DELETE FROM Provee
WHERE Proveedor = 'RBT';
