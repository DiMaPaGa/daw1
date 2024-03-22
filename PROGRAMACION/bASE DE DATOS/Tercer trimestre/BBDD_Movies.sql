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

-- Traducimos

ALTER TABLE Movies
RENAME TO Peliculas;

ALTER TABLE MovieTheaters
RENAME TO SalasDeCine;

ALTER TABLE Peliculas
CHANGE COLUMN Code Codigo INT;

ALTER TABLE Peliculas
CHANGE COLUMN Title Titulo VARCHAR(255) NOT NULL;

ALTER TABLE Peliculas
CHANGE COLUMN Rating Calificacion VARCHAR(255);

ALTER TABLE SalasDeCine
CHANGE COLUMN Code Codigo INT;

ALTER TABLE SalasDeCine
CHANGE COLUMN Name Nombre VARCHAR(255) NOT NULL;

ALTER TABLE SalasDeCine
CHANGE COLUMN Movie Pelicula INT;

-- Continuamos con la inserción de datos:

-- Las películas existentes son:
-- Citizen Kane, con una calificación de ‘PG’.
-- Singing in the Rain, con una calificación de ‘G’.
-- The Wizard of Oz, con una calificación de ‘G’.
-- The Quiet Man, sin calificación.
-- North by Northwest, sin calificación.
-- The Last Tango in Paris, con una calificación de ‘NC-17’.
-- Some Like it Hot, con una calificación de ‘PG-13’.
-- A Night at the Opera, sin calificación.
-- Citizen King, con una calificación de ‘G’.

INSERT INTO peliculas (Codigo, Titulo, Calificacion) VALUES
(1,"Citizen Kane","PG"),
(2,"Singing in the Rain","G"),
(3,"The Wizard of Oz","G"),
(4,"The Quiet Man",NULL),
(5,"North by Northwest",NULL),
(6,"The Last Tango in Paris","NC-17"),
(7,"Some Like it Hot","PG-13"),
(8,"A Night at the Opera",NULL),
(9,"Citizen King","G");


-- Los datos de las salas de cine son:
-- La sala de cine ‘Odeon’ proyecta la película ‘North by Northwest'.
-- La sala de cine ‘Imperial’ proyecta la película ‘Citizen Kane’.
-- La sala ‘Majestic’ no proyecta ninguna película.
-- La sala ‘Royale’ proyecta la película ‘The Last Tango in Paris’.
-- La sala ‘Paraiso’ proyecta la película ‘The Wizard of Oz’.
-- La sala ‘Nickelodeon’ no proyecta ninguna película.

INSERT INTO SalasDeCine (Codigo, Nombre, Pelicula) VALUES
(1,"Odeon", 5),
(2,"Imperial",1),
(3,"Majestic",NULL),
(4,"Royale",6),
(5,"Paraiso",3),
(6,"Nickelodeon",NULL);


-- Y para terminar, modificamos los datos:
-- Añadir la película ‘One, Two, Three’ sin calificación

INSERT INTO peliculas (Codigo, Titulo, Calificacion) values
(10,"One, Two, Three",NULL);
 
-- Configura la calificación de todas las películas sin calificar a ‘G’.

UPDATE Peliculas
SET Calificacion="G"
WHERE Calificacion IS NULL;

-- Elimina los cines que proyecten películas calificadas con ‘NC-17’.

DELETE FROM SalasDeCine
WHERE Pelicula IN (Select Codigo from Peliculas where Calificacion= "NC-17");


