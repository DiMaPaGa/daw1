-- 1. Contar la cantidad de pedidos que han sido realizados por un cliente de Mexico.
SELECT count(*) FROM northwind.orders where ShipCountry like ("Mexico"); 
-- 2. Por cada pedido adjuntar, además de su información, el nombre de la compañía que lo ha enviado (ShipVia).

-- 3. Imprimir toda la información de los clientes, con los nombres de las columnas traducidos al castellano y separando con espacios aquellos nombres compuestos de varias palabras.
SELECT CustomerID AS "IDENTIFICADOR", CompanyName AS "NOMBRE DE COMPAÑÍA", ContactName AS "NOMBRE DEL CONTACTO", ContactTitle AS "Título del contacto", Address as "Dirección", City as "Ciudad", Region as "Región", PostalCode as "Código Postal", Country as "País", Phone as "Teléfono" FROM northwind.customers;
-- 4. Por cada producto, mostrar su nombre y la descripción de la categoría a la que pertenece.
SELECT ProductName, CategoryID FROM northwind.products;
-- 5. Mostrar los paises y cantidad de empleados que tiene cada país.
SELECT Country, count(*) FROM northwind.employees group by Country;
-- 6. Contar los pedidos que han sido realizados por clientes de España.
Select count(*) from customers where Country like "Spain";
-- 7. Mostrar los pedidos realizados por clientes de Suecia y Argentina.
Select * from customers where Country like "Sweden" or Country like "Argentina";
-- 8. Por cada pedido, mostrar el descuento medio.
SELECT OrderID, avg(Discount) FROM northwind.orderdetails group by OrderID;
-- 9. Por cada pedido, contar los productos que incluye, solo para aquellos pedidos que cuentan con más de tres productos y han sido atendidos por un empleado estadounidense.

-- 10. Mostrar los nombres y apellidos de todos los empleados utilizando una única columna, ordenándolos por edad, de mayor a menor.
SELECT concat_ws(" ", FirstName, LastName) AS "Nombre y Apellidos", timestampdiff(year, BirthDate, Curdate()) AS "edad" FROM northwind.employees order by edad desc;
-- 11. Por cada compañía de envíos, mostrar su nombre y contar el número de pedidos que ha enviado.

-- 12. Mostrar el nombre de los países a los que pertenecen los distintos clientes y empleados, de forma que no se repitan.

-- 13. Contar los distintos ID de territorios.
SELECT RegionID, count(*) FROM northwind.territories group by RegionID;
-- 14. Contar el número de categorías cuyo nombre empieza por C y termina por S, dando un alias a la columna.
SELECT count(*) as "Compañías" FROM northwind.categories where CategoryName like "C%" and CategoryName like "%s";
-- 15. Mostrar los distintos territorios, adjuntando también la descripción de región (RegionDescription).

-- 16. Contar el número de filas de la tabla customerdemographics.
SELECT Count(*) FROM northwind.customerdemographics;
-- 17. Mostrar los nombres de ciudades de los proveedores en orden alfabetico inverso, pero solo para aquellas cuyo nombre de ciudad comienza de la A a la C incluidas ambas letras.
SELECT CompanyName FROM northwind.suppliers Where City like "A%" or City like "B%" or City like "C%"  order by CompanyName desc;
-- 18. Por cada nombre de compañía de envíos contar el número de distintos producto enviados. Es decir, que si una compañía de envíos envía una bata, tres bicis y siete jerseys de cuello de pico
-- estampados a un cliente zamorano y luego la misma compañía de envíos envía una bata a un cliente jienense, esa compañía de envíos (que Dios la guarde en su alma) habría enviado tres productos distintos.
