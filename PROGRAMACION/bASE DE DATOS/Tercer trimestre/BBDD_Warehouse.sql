
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
Code INT NOT NULL auto_increment,
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

RENAME TABLE Warehouses TO Almacenes;
ALTER TABLE Almacenes CHANGE COLUMN Code Codigo INT auto_increment;
ALTER TABLE Almacenes CHANGE COLUMN Location Localizacion VARCHAR(255) NOT NULL;
ALTER TABLE Almacenes CHANGE COLUMN Capacity Capacidad VARCHAR(255);

RENAME TABLE Boxes TO Cajas;
ALTER TABLE Cajas CHANGE COLUMN Code Codigo VARCHAR(255) NOT NULL;
ALTER TABLE Cajas CHANGE COLUMN Contents Contenidos VARCHAR(255) NOT NULL;
ALTER TABLE Cajas CHANGE COLUMN Value Valor REAL NOT NULL;
ALTER TABLE Cajas CHANGE COLUMN  Warehouse Almacen INT NOT NULL;

-- Inserción de datos: Insertar los valores en las tablas correspondientes:
-- Los almacenes existentes son:
-- Chicago, con una capacidad de 3.
-- Chicago, con una capacidad de 4.
-- Nueva York, con una capacidad de 7.
-- Los Ángeles, con una capacidad de 2.
-- San Francisco, con una capacidad de 8.

INSERT INTO Almacenes (Localizacion, Capacidad) VALUES
("Chicago",3),
("Chicago",4),
("Nueva York",7),
("Los Angeles",2),
("San Francisco",8);

-- Los datos de las cajas son:
-- 1.‘Piedra’, con el código ‘0MN7’ y un valor de 180. Se almacena en el almacén de Nueva York.
-- 2. ‘Piedra’, con el código ‘4H8P’ y un valor de 250. Se almacena en el almacén
-- de Chicago con menor capacidad.
-- 3. ‘Tijeras’, con el código ‘4RT3’ y un valor de 190. Se almacena en el almacén
-- de Los Ángeles.
-- 4. ‘Piedra’, con el código ‘7G3H’ y un valor de 200. Se almacena en el almacén
-- de Chicago con menor capacidad.
-- 5. ‘Papel’, con el código ‘8JN6’ y un valor de 75. Se almacena en el almacén de
-- Chicago con menor capacidad.
-- 6. ‘Papel’, con el código ‘8Y6U’ y un valor de 50. Se almacena en el almacén de
-- Nueva York.
-- 7. ‘Papel’, con el código ‘9J6F’ y un valor de 175. Se almacena en el almacén
-- de Chicago con mayor capacidad.
-- 8. ‘Piedra’, con el código ‘LL08’ y un valor de 140. Se almacena en el almacén
-- de Los Ángeles.
-- 9. ‘Tijeras’, con el código ‘P0H6’ y un valor de 125. Se almacena en el almacén
-- de Chicago con menor.
-- 10. ‘Tijeras’, con el código ‘P2T6’ y un valor de 150. Se almacena en el almacén
-- de Chicago con mayor capacidad.
-- 11. ‘Papel’, con el código ‘TU55’ y un valor de 90. Se almacena en el almacén de
-- San Francisco.

INSERT INTO Cajas (Codigo, Contenidos, Valor, Almacen) VALUES
("0MN7","Piedra", 180, 3),
("4H8P","Piedra", 250, 1),
("4RT3","Tijeras", 190, 4),
("7G3H","Piedra", 200, 1),
("8JN6","Papel", 75, 1),
("8Y6U","Papel", 50, 3),
("9J6F","Papel", 175, 1),
("LL08","Piedra", 140, 4),
("P0H6","Tijeras", 125, 1),
("P2T6","Tijeras", 150, 1),
("TU55","Papel", 90, 5);

-- Modificación de datos:
-- Crea un nuevo almacén en Nueva York con capacidad para 3 cajas.

INSERT INTO Almacenes SET Localizacion="Nueva York", Capacidad= 3;

-- Crea una nueva caja con código ‘H5RT’, que contenga ‘Papel’ con un valor de $200,
-- y situada en el almacén 2.

INSERT INTO Cajas SET Codigo= "H5RT", Contenidos="Papel", Valor=200, Almacen=2;

-- Reduce el valor de todas las cajas un 15%.

UPDATE Cajas SET Valor = Valor * 0.85;

-- Aplica un 20% de reducción a las cajas con un valor superior que el valor medio de
-- todas las cajas.

UPDATE Cajas SET Valor = Valor * 0.80 
WHERE Valor > (SELECT media FROM (SELECT AVG(Valor) as media FROM Cajas) as promedio);

-- Elimina todas las cajas con un valor inferior a $100.

DELETE FROM Cajas WHERE Valor < 100;

-- Elimina todas las cajas de los almacenes saturados.


DELETE FROM Cajas WHERE Almacen IN 
(SELECT Almacen FROM 
(SELECT Cajas.Almacen, COUNT(*) AS total_cajas FROM Cajas GROUP BY Cajas.Almacen) AS comparativa
WHERE comparativa.total_cajas > (SELECT Capacidad FROM Almacenes WHERE Almacenes.Codigo = comparativa.Almacen));


