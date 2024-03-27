-- Crear una base de datos llamada Manufacturers. La base de datos debe tener dos tablas:
-- Manufacturers:
	-- con un campo Code de tipo entero, clave primaria.
	-- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
-- Products:
	-- con un campo Code de tipo entero, clave primaria.
	-- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	-- con un campo Price de tipo decimal, no nulo.
	-- con un campo Manufacturer de tipo entero no nulo, clave ajena hacia la tabla Manufacturers.

DROP DATABASE IF EXISTS MANUFACTURERS;
CREATE DATABASE MANUFACTURERS;
USE MANUFACTURERS;

CREATE TABLE IF NOT EXISTS Manufacturers(
Code INT, -- al ser clave primaria, no lo indica el ejercicio pero podria ponerse Not Null
Name VARCHAR(255) NOT NULL,
PRIMARY KEY(Code)
);

CREATE TABLE IF NOT EXISTS Products(
Code INT, -- Podria ponerse Code Int Not Null PRIMARY KEY.
Name VARCHAR(255) NOT NULL,
Price Real NOT NULL, -- Tambien puede poner Decimal y float, así como real
Manufacturer INT NOT NULL,
PRIMARY KEY(Code),
FOREIGN KEY(Manufacturer) REFERENCES Manufacturers(Code)
);


RENAME TABLE Manufacturers TO Fabricantes;
ALTER TABLE Fabricantes CHANGE COLUMN Code Codigo INT;
ALTER TABLE Fabricantes CHANGE COLUMN Name Nombre VARCHAR(255) NOT NULL;


RENAME TABLE Products TO Productos;
ALTER TABLE Productos CHANGE COLUMN Code Codigo INT;
ALTER TABLE Productos CHANGE COLUMN Name Nombre VARCHAR(255) NOT NULL;
ALTER TABLE Productos CHANGE COLUMN Price Precio REAL NOT NULL;
ALTER TABLE Productos CHANGE COLUMN  Manufacturer Fabricante INT NOT NULL;

