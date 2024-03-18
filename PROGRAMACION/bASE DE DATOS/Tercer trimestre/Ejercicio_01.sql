-- Crear una base de datos llamada MOVIES,
-- destinada a almacenar películas que se proyectan en varios
-- cines. La base de datos debe tener
-- dos tablas:
-- Movies:
-- - con un campo Code de tipo entero, clave primaria.
-- - con un campo Title de tipo cadena variable de tamaño maximo 255, no nulo.
-- - con un campo Rating de tipo cadena variable de tamaño maximo 255.
-- MovieTheaters:
-- - con un campo Code de tipo entero, clave primaria.
-- - con un campo Name de tipo cadena variable de tamaño maximo 255, no nulo.
-- - con un campo Movie de tipo entero, como clave ajena hacia la tabla Movies.

DROP DATABASE IF EXISTS MOVIES;
CREATE DATABASE MOVIES;
USE MOVIES;

CREATE TABLE IF NOT EXISTS Movies(
Code INT,
Title VARCHAR(255) NOT NULL,
Rating VARCHAR(255),
PRIMARY KEY(Code)
);

CREATE TABLE IF NOT EXISTS MovieTheaters(
Code INT,
Name VARCHAR(255) NOT NULL,
Movie INT,
PRIMARY KEY(Code),
FOREIGN KEY(Movie) REFERENCES MOVIES(Code)
);


