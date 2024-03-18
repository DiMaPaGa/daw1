
-- Crear una base de datos llamada WAREHOUSES,
-- destinada a almacenar información sobre unos almacenes. La base de datos debe tener
-- dos tablas:

-- Warehouses:
-- - con un campo Code de tipo entero no nulo, clave primaria.
-- - con un campo Location de tipo cadena variable de tamaño maximo 255, no nulo.
-- - con un campo Capacity de tipo entero no nulo.

-- Boxes:
-- - con un campo Code de tipo cadena variable de tamaño maximo 255, no nulo, clave primaria.
-- - con un campo Contents de tipo cadena variable de tamaño maximo 255, no nulo.
-- - con un campo Value de tipo real no nulo.
-- - con un campo Warehouse de tipo entero no nulo, clave ajena hacia la tabla Warehouses.

DROP DATABASE IF EXISTS WAREHOUSES;
CREATE DATABASE WAREHOUSES;
USE WAREHOUSES;

CREATE TABLE IF NOT EXISTS Warehouses(
Code INT NOT NULL,
Location VARCHAR(255) NOT NULL,
Capacity INT NOT NULL,
PRIMARY KEY(Code)
);

CREATE TABLE IF NOT EXISTS Boxes(
Code VARCHAR(255) NOT NULL,
Contents VARCHAR(255) NOT NULL,
Value REAL NOT NULL,
Warehouse INT NOT NULL,
PRIMARY KEY(Code),
FOREIGN KEY (Warehouse) REFERENCES Warehouses(Code)
);