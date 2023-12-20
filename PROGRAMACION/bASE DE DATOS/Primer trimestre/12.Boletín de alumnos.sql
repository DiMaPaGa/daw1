-- 1.Selecciona todos los pedidos gestionados por el empleado con ID = 5 y agrúpalos por ID de Cliente, teniendo en cuenta que el país al que pertenece sea Francia.
-- No PUEDE RESOLVERSE con consulta simple.

-- 2.Contar los pedidos que han sido realizados por clientes Franceses.
-- No PUEDE RESOLVERSE con consulta simple.

-- 3.Selecciona los nombres de los productos que que empiecen desde la C hasta la L, los cuales tengan unidades disponibles. (son unidades en stock)
SELECT ProductName FROM northwind.products where ProductName BETWEEN 'C'and 'M' and UnitsInStock > 0;
SELECT ProductName FROM northwind.products where ProductName BETWEEN 'C%'and 'Lz%' and UnitsInStock > 0;
-- 4.Cantidad de pedidos totales realizados en Enero de 1997.
SELECT count(*) FROM northwind.orders where month(OrderDate)=1 and year(OrderDate)=1997;
select count(*) "Pedidos" from orders where year(OrderDate) = "1997" and monthname(OrderDate) = "January";

-- 5.Sumar el total de unidades en stock de todos los productos cuyo campo UnitsOnOrder no sea cero.
SELECT sum(UnitsInStock) FROM northwind.products where UnitsOnOrder > 0;

-- 6.Mostrar la cantidad de pedidos realizados por cada empleado, solo aquellos que han realizado mas de 100 pedidos.
SELECT EmployeeID, count(*) FROM northwind.orders group by EmployeeID having count(*)>100;

-- 7.Por cada empleado, imprimir su nombre y apellidos y el número de años que ha pasado desde su contratación hasta la fecha actual.
SELECT FirstName as "Nombre", LastName as "Apellido", timestampdiff(year, HireDate, Curdate()) as "Años contratados" FROM northwind.employees;

-- 8.Muestra los productos mas vendidos en orden descendente y agrupalos por su SupplierID.¡¡¡¡¡ojo!!!!!
select SupplierID"ID proveedor",max(UnitsOnOrder)"Productos más vendidos" from northwind.products group by SupplierID order by max(UnitsOnOrder) desc;

-- 9.Obtener el nombre de los empleados que sean de Estados Unidos y selecciona los años que lleve trabajando.
SELECT FirstName, timestampdiff(year, HireDate, Curdate()) as "Años trabajando" FROM northwind.employees where Country =("USA");

-- 10.Lista de empleados que no sean de la ciudad Tacoma.
SELECT * FROM northwind.employees where City !="Tacoma";
SELECT * FROM northwind.employees where City not like 'Tacoma';

-- 11.Agrupa las categorías.Ordena las categorías en orden ascendente y que sean mayores a 10.
SELECT CategoryID, count(*) FROM northwind.products group by CategoryID HAVING count(*)>10 order by CategoryID asc;

-- 12.Muéstrame a los empleados que su apellido empiece por D o que su nombre empiece por M.
SELECT * FROM northwind.employees where LastName like "D%" or FirstName like "M%";

-- 13.Muestra los empleados que tienen más de 65 años.
SELECT FirstName, LastName, timestampdiff(year, BirthDate, curdate()) as "edad"  FROM northwind.employees where timestampdiff(year, BirthDate, curdate()) > 65;
SELECT * FROM EMPLOYEES WHERE timestampdiff (YEAR, BIRTHDATE, CURDATE()) > 65; -- Como no especifica, mejor poner todo.
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
-- ?? select ShipCountry, count(*) "Contactos" from northwind.orders group by ShipCountry;

-- 22.Mostrar los clientes en los que su nombre (ContactName) empiece desde la F hasta la M, ambas incluidas.
SELECT ContactName FROM northwind.customers where ContactName BETWEEN "F" and "N";

-- 23.Cuenta los Productos que empiecen por Letra G,H ó I y cuya categoria sea 2,3,4 o 5.
SELECT count(*) FROM northwind.products Where ProductName between "G" and "J" and CategoryID BETWEEN 2 and 5;
SELECT count(*) FROM northwind.products Where ProductName between "G%" and "J%" and CategoryID BETWEEN 2 and 5;
SELECT count(*) "Productos" FROM products where ((ProductName like "G%") or (ProductName like "H%") or (ProductName LIKE "I%")) AND CategoryID in (2,3,4,5); -- Otra forma.
-- 24.Contactos de alemania cuya ciudad comience por 'F'.
SELECT ContactName FROM northwind.customers where Country =("Germany") and City like ("F%") group by CustomerID; -- Lo interpreto como listado de contactos ¡¡Es asiiii!!.
SELECT ContactName, Count(*) FROM northwind.customers where Country =("Germany") and City like ("F%") group by CustomerID;-- Esto sería el numero de contactos. Pero no pide contar.
SELECT * FROM customers WHERE Country="Germany" AND City LIKE "F%";

-- 25.Muestra todos los pedidos que hayan realizado por cada empleado en el año 1996 y cuyo “freight” medio sea mayor a 20 e inferior a 50.
SELECT EmployeeID, count(*), avg(Freight) FROM northwind.orders where year(OrderDate)=1996 group by EmployeeID having avg(Freight) between 21 and 49; -- NO SE PONE LA COLUMNA DE AVG(FREIGHT), PORQUE ESTA MEDIA DE FREIGHT SERIA SOLO DE LOS PEDIDOS DE 1996.
SELECT EmployeeID, count(*), avg(Freight) FROM northwind.orders where year(OrderDate)=1996  group by EmployeeID having avg(Freight) between 21 and 49;
-- 26.Calcula el precio promedio de cada categoría.
SELECT CategoryID, avg(UnitPrice) FROM northwind.products group by CategoryID;

-- 27.Muestra por pantalla el nombre de los productos, el precio unitario y un descuento del 20%, poniéndole un alias.
SELECT ProductName as "Nombre Productos", UnitPrice as "Precio Unitario", (UnitPrice*0.80) as "Descuento 20%" FROM northwind.products;

-- 28.Cantidad de pedidos realizados desde Mexico.
SELECT count(*) FROM northwind.orders Where ShipCountry = "Mexico";

-- 29.Muestrame los pedidos que fueron pedidos en el 1997 y por via 3.
SELECT OrderID FROM northwind.orders where year(OrderDate)=1997 and ShipVia=3;

-- 30.Lista de empleados donde aparezcan los que son solos ellos de ese país.
-- Es una subconsulta!!
SELECT FirstName, LastName, Country FROM northwind.employees where Country not in (SELECT Country FROM northwind.employees group by Country having count(*)>1);

-- 31.Mostrar las ciudades que tienen más clientes que la ciudad de Barcelona.
-- Es una subconsulta!!

-- 32.Imprimir el nombre, apellidos y fecha de nacimiento de todos los empleados. La fecha de nacimiento debe estar en el formato europeo (DD—MM--AAAA).
select FirstName, LastName, date_format(BirthDate, "%d-%m-%Y") as "Fecha Europea" from northwind.employees;

-- 33.Muestra el ID del empleado y el numero de pedidos del año 1997.
select EmployeeID, count(*) as "Pedidos1997" from northwind.orders where year(OrderDate)= 1997 group by EmployeeID;

-- 34.Seleciona el valor maximo de OrderID y haz la suma total del precio x su cantidad.
-- subconsulta?

/* 35.Muestra aquellas categorias, cuantos productos tienen que tengan un precio unitario mayor que 15€ y cual sería el beneficio que obtendriamos de los productos 
que tenemos en stock (PrecioUnitario*Unidades en Stock). Muestra solo aquellas que tengan más de 5 productos que cumplan esa condición. */
select CategoryID, Count(*) as "Total Productos", (sum(UnitPrice * UnitsInStock)) as "Beneficio" from northwind.products where UnitPrice > 15 group by CategoryID having count(*)>5;

-- 36.Muestra el numero de empleados que tengan mas de 65 años.
select Count(*) from northwind.employees where timestampdiff(year, BirthDate, curdate()) > 65;

-- 37.Contar --- los clientes que viven en Suecia y Suiza y mostrar cómo se llaman esos clientes. Traduce las columnas.
SELECT ContactName AS "Nombre Contacto", Country as "Pais" FROM northwind.customers where Country in ("Sweden", "Switzerland");

-- 38.Por cada producto,muestrame su precio por unidad y su stock, solo aquellos que tengan más de 20 unidades.
select ProductName, UnitPrice, UnitsInStock from northwind.products where UnitsInStock >20;

-- 39.Mostrar la jerarquía de todos los empleados.
select FirstName, LastName, ReportsTo from northwind.employees order by ReportsTo;

-- 40.Muestra la cantidad de productos en el que su Freigth sea mayor que 50 y en el que el pais de envio(ShipCountry) sea ESPAÑA.
SELECT count(*) FROM northwind.orders where Freight>50 and ShipCountry="Spain";

-- 41.Cantidad de pedidos realizados por cada cliente, solo aquellos que han realizado mas de 20 (agrupar por CustomerID);
SELECT CustomerID, Count(*) FROM northwind.orders group by CustomerID having count(*) > 20;

-- 42.Haz el recuento de clientes agrupados por ciudad y país, mostrando únicamente aquellos casos en los que se cuente con más de dos clientes.
-- Ordénalos por países en orden alfabético.
SELECT City, Country, Count(*) FROM northwind.customers group by City, Country having Count(*)>2 order by Country asc;

-- 43.Muestra los nombres de la compañía que tengan en título de contacto "Owner" y la ciudad  sea "Madrid", además de que el nombre de la comañía empiece por 'B'.
SELECT CompanyName FROM northwind.customers where ContactTitle = "Owner" and City="Madrid" and CompanyName like "B%";

-- 44.Imprimir el nombre de los empleados en mayusculas junto a los años que lleva en la empresa de manera ascendente.
select upper(Firstname), timestampdiff(year, HireDate, Curdate()) as "años en la empresa" from northwind.employees order by "años en la empresa" asc ;

-- 45.Cuenta los pedidos que se han hecho desde Francia.
SELECT count(*) FROM northwind.orders where ShipCountry="France";

-- 46.Selecciona todos los empleados cuyos nombres comiencen por la letra D y pertenezcan a Londres.
SELECT * FROM northwind.employees WHERE LastName like 'D%' AND City = "London";

-- 47.Por cada pedido muestra el número de pedidos que se ha realizado para clientes que hayan realizado más de 2 pedidos en orden ascendente.
SELECT CustomerID, Count(*) FROM northwind.orders group by CustomerID having count(*)>2 order by Count(*) asc;

-- 48.Mostrar el país, la fecha y el ID de los pedidos enviados a paises que comiencen por la F en el año 1997.
SELECT ShipCountry, OrderDate, OrderID FROM northwind.orders where ShipCountry like ('F%') and year(OrderDate)=1997;

-- 49.Muestra los precio más alto y más bajo de todos los productos.
select max(UnitPrice), min(UnitPrice) from northwind.products;

/* 50.Indica cuales son los 3 empleados cuyos pedidos sean los que más tiempo de entrega tengan en aquellos pedidos en los que la suma del valor de los productos 
sea mayor a 1000€ ordenado de mayor a menor tiempo de entrega. Queremos ver la ID del Empleado, el valor total del pedido y el tiempo que ha tardado en entregarse. */
-- subconsulta?

-- 51.Calcular el precio en stock medio de los productos. 
select avg(UnitPrice) from northwind.products where UnitsInStock>0;

-- 52.Cuenta los empleados que tengan más de 60 años.
SELECT count(*) FROM northwind.employees where timestampdiff(year, BirthDate, Curdate())>60;

-- 53.Ordena los productos que tengan un precio unitario mayor de 10 y menor de 100 de forma descendente.
select ProductName, UnitPrice from northwind.products where UnitPrice between 11 and 99 order by UnitPrice desc;

-- 54.Encuentra la cantidad de precios repetidos por los pedidos. Ordenar los precios en orden ascendente y que sean mayores a 100.
SELECT UnitPrice, Count(*) FROM northwind.orderdetails where UnitPrice>100 group by UnitPrice having count(*)>1 order by UnitPrice asc;

-- 55.Cuenta todos los productos salidos de la ShipCity. Haz un top 10 de los mas vendidos (Pon los nombres en español).
-- subconsulta?

-- 56.Muestra los nombres de los productos con precio unico mayor a 12 y menor a 50, además del precio de los productos. 
select ProductName, UnitPrice from northwind.products where UnitPrice between 13 and 49;

-- 57.Muestrame los empleados , cuya edad se encuentre entre 23 y 40 años.
select FirstName, LastName, timestampdiff(year, BirthDate, curdate()) as "edad" from northwind.employees where "edad" between 23 and 40;

-- 58.Por cada país, muestra todos los clientes que empiecen por la letra A y cuyo país de procedencia sea México o Alemania.
SELECT Country, CustomerID FROM northwind.customers Where CustomerID like 'A%' and Country in ("Mexico", "Germany");