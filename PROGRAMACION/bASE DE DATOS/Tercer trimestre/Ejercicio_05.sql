-- Crear una base de datos llamada Departments. La base de datos debe tener dos tablas:
-- Departments:
	-- con un campo Code de tipo entero, clave primaria.
	-- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	-- con un campo Budget de tipo decimal, no nulo
-- Employees:
	-- con un campo SSN de tipo entero, clave primaria.
	-- con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
	-- con un campo LastName de tipo cadena variable de tamaño maximo 255, no nulo.
	-- con un campo Department de tipo entero no nulo, clave ajena hacia la tabla Departments.
    
    
DROP DATABASE IF EXISTS DEPARTMENTS;
CREATE DATABASE DEPARTMENTS;
USE DEPARTMENTS;

CREATE TABLE IF NOT EXISTS Departments(
Code INT,
Name VARCHAR(255) NOT NULL,
Budget Real NOT NULL,
PRIMARY KEY(Code)
);

CREATE TABLE IF NOT EXISTS Employees(
SSN INT,
Name VARCHAR(255) NOT NULL,
LastName VARCHAR(255) NOT NULL,
Department INT NOT NULL,
PRIMARY KEY(SSN),
FOREIGN KEY(Department) REFERENCES Departments(Code)
);