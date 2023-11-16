-- 1.Selecciona todos los pedidos gestionados por el empleado con ID = 5 y agrúpalos por ID de Cliente, teniendo en cuenta que el país al que pertenece sea Francia.
-- No PUEDE RESOLVERSE con consulta simple.

-- 2.Contar los pedidos que han sido realizados por clientes Franceses.
-- No PUEDE RESOLVERSE con consulta simple.

-- 3.Selecciona los nombres de los productos que que empiecen desde la C hasta la L, los cuales tengan unidades disponibles.
SELECT ProductName FROM northwind.products where ProductName BETWEEN 'C'and 'M' and UnitsOnOrder > 0;

-- 4.Cantidad de pedidos totales realizados en Enero de 1997.
SELECT count(*) FROM northwind.orders where month(OrderDate)=1 and year(OrderDate)=1997;

-- 5.Sumar el total de unidades en stock de todos los productos cuyo campo UnitsInOrder no sea cero.
SELECT sum(UnitsInStock) FROM northwind.products where UnitsOnOrder > 0;

-- 6.Mostrar la cantidad de pedidos realizados por cada empleado, solo aquellos que han realizado mas de 100 pedidos.
SELECT EmployeeID, count(*) FROM northwind.orders group by EmployeeID having count(*)>100;

-- 7.Por cada empleado, imprimir su nombre y apellidos y el número de años que ha pasado desde su contratación hasta la fecha actual.
SELECT FirstName as "Nombre", LastName as "Apellido", timestampdiff(year, HireDate, Curdate()) as "Años contratados" FROM northwind.employees;

-- 8.Muestra los productos mas vendidos en orden descendente y agrupalos por su SupplierID.
SELECT SupplierID, count(*) FROM northwind.products GROUP BY SupplierID order By count(*) desc;

-- 9.Obtener el nombre de los empleados que sean de Estados Unidos y selecciona los años que lleve trabajando.
SELECT FirstName, timestampdiff(year, HireDate, Curdate()) as "Años trabajando" FROM northwind.employees where Country =("USA");

-- 10.Lista de empleados que no sean de la ciudad Tacoma.
SELECT * FROM northwind.employees where City !="Tacoma";

-- 11.Agrupa las categorías.Ordena las categorías en orden ascendente y que sean mayores a 10.
SELECT CategoryID, count(*) FROM northwind.products group by CategoryID HAVING count(*)<10 order by CategoryID asc;

-- 12.Muéstrame a los empleados que su apellido empiece por D o que su nombre empiece por M.
SELECT * FROM northwind.employees where LastName like "D%" or FirstName like "M%";

-- 13.Muestra los empleados que tienen más de 65 años.
SELECT FirstName, LastName, timestampdiff(year, BirthDate, curdate()) as "edad"  FROM northwind.employees where timestampdiff(year, BirthDate, curdate()) > 65;

-- 14.Dime el nombre y apellido de los empleados que sean de Murcia.
SELECT FirstName, LastName FROM northwind.employees where City="Murcia";

-- 15.Muestrame el cumpleaños de los empleados que sean de Francia.
SELECT FirstName, BirthDate FROM northwind.employees where City="France";

-- 16.Dime cuantos empleados tienen el titulo 'Sales Representative'.
SELECT count(*) FROM northwind.employees WHERE Title="Sales Representative";

-- 17.Mostrar los paises y cantidad de empleados que tiene cada país.
SELECT Country, Count(*) as "Cantidad de empleados" FROM northwind.employees group by Country;

-- 18.Mostrar los 3 productos más vendidos y la cantidad de productos vendidos.
SELECT ProductName, UnitsOnOrder FROM northwind.products order by UnitsOnOrder desc limit 3;

-- 19.Muestre el nombre de cada producto, el longitud de caracteres de este y calcular media del precio del producto(UnitPrice).
SELECT ProductName, length(ProductName), avg(UnitPrice) FROM northwind.products GROUP BY ProductName;

/* 20.Interesa conocer cuántos productos hay en cada pedido, con una columna que se denomine "recuentoProductos".
Queremos que se considere aquellos productos que cuenten con algún descuento, agrupado todo por el identificador de pedido, y solo mostrando los pedidos que cuenten con más de dos productos.
Ordena la tabla resultante por el recuento de pedidos, poniendo los recuentos más numerosos en primer lugar. */
SELECT OrderID, Count(*) as "recuentoProductos" FROM northwind.orderdetails where Discount > 0 Group by OrderID having recuentoProductos>2 order by recuentoProductos desc;

-- 21.Cuantos contactos de shippers hay por país.
-- ??

-- 22.Mostrar los clientes en los que su nombre (ContactName) empiece desde la F hasta la M, ambas incluidas.


-- 23.Cuenta los Productos que empiecen por Letra G,H ó I y cuya categoria sea 2,3,4 o 5).


-- 24.Contactos de alemania cuya ciudad comience por 'F'.


-- 25.Muestra todos los pedidos que hayan realizado por cada empleado en el año 1996 y cuyo “freight” medio sea mayor a 20 e inferior a 50.


-- 26.Calcula el precio promedio de cada categoría.


-- 27.Muestra por pantalla el nombre de los productos, el precio unitario y un descuento del 20%, poniéndole un alias.


-- 28.Cantidad de pedidos realizados desde Mexico.


-- 29.Muestrame los pedidos que fueron pedidos en el 1997 y por via 3.


-- 30.Lista de empleados donde aparezcan los que son solos ellos de ese país.


-- 31.Mostrar las ciudades que tienen más clientes que la ciudad de Barcelona.


-- 32.Imprimir el nombre, apellidos y fecha de nacimiento de todos los empleados. La fecha de nacimiento debe estar en el formato europeo (DD—MM--AAAA).


-- 33.Muestra el ID del empleado y el numero de pedidos del año 1997.


-- 34.Seleciona el valor maximo de OrderID y haz la suma total del preio x su cantidad.


/* 35.Muestra aquellas categorias, cuantos productos tienen que tengan un precio unitario mayor que 15€ y cual sería el beneficio que obtendriamos de los productos 
que tenemos en stock (PrecioUnitario*Unidades en Stock). Muestra solo aquellas que tengan más de 5 productos que cumplan esa condición. */


-- 36.Muestra el numero de empleados que tengan mas de 65 años.


-- 37.Contar los clientes que viven en Suecia y Suiza y mostrar cómo se llaman esos clientes. Traduce las columnas.


-- 38.Por cada producto,muestrame su precio por unidad y su stock, solo aquellos que tengan más de 20 unidades.


-- 39.Mostrar la jerarquía de todos los empleados.


-- 40.Muestra la cantidad de productos en el que su Freigth sea mayor que 50 y en el que el pais de envio(ShipCountry) sea ESPAÑA.


-- 41.Cantidad de pedidos realizados por cada cliente, solo aquellos que han realizado mas de 20 (agrupar por CustomerID);


-- 42.Haz el recuento de clientes agrupados por ciudad y país, mostrando únicamente aquellos casos en los que se cuente con más de dos clientes.
-- Ordénalos por países en orden alfabético.
SELECT City, Country, Count(*) FROM northwind.customers group by City, Country having Count(*)>2 order by Country asc;


-- 43.Muestra los nombres de la compañía que tengan en título de contacto "Owner" y la ciudad  sea "Madrid", además de que el nombre de la comañía empiece por 'B'.


-- 44.Imprimir el nombre de los empleados en mayusculas junto a los años que lleva en la empresa de manera ascendente.


-- 45.Cuenta los pedidos que se han hecho desde Francia.


-- 46.Selecciona todos los empleados cuyos nombres comiencen por la letra D y pertenezcan a Londres.


-- 47.Por cada pedido muestra el número de pedidos que se ha realizado para clientes que hayan realizado más de 2 pedidos en orden ascendente.


-- 48.Mostrar el país, la fecha y el ID de los pedidos enviados a paises que comiencen por la F en el año 1997.


-- 49.Muestra los precio más alto y más bajo de todos los productos.


/* 50.Indica cuales son los 3 empleados cuyos pedidos sean los que más tiempo de entrega tengan en aquellos pedidos en los que la suma del valor de los productos 
sea mayor a 1000€ ordenado de mayor a menor tiempo de entrega. Queremos ver la ID del Empleado, el valor total del pedido y el tiempo que ha tardado en entregarse. */


-- 51.Calcular el precio en stock medio de los productos. 


-- 52.Cuenta los empleados que tengan más de 60 años.


-- 53.Ordena los productos que tengan un precio unitario mayor de 10 y menor de 100 de forma descendente.


-- 54.Encuentra la cantidad de precios repetidos por los pedidos. Ordenar los precios en orden ascendente y que sean mayores a 100.


-- 55.Cuenta todos los productos salidos de la ShipCity. Haz un top 10 de los mas vendidos (Pon los nombres en español).


-- 56.Muestra los nombres de los productos con precio unico mayor a 12 y menor a 50, además del precio de los productos. 


-- 57.Muestrame los empleados , cuya edad se encuentre entre 23 y 40 años.


-- 58.Por cada país, muestra todos los clientes que empiecen por la letra A y cuyo país de procedencia sea México o Alemania.
