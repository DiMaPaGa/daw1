-- SELECT char_length(FirstName) FROM employees;
-- select curdate();
-- SELECT year(Birthdate)from employees; 
-- lo mismo day o month
-- SELECT SUM(UnitsInStock) FROM northwind.products;
-- select count(*) from northwind.products; //conteo de filas
-- SELECT min(UnitsInStock) FROM northwind.products;
-- SELECT max(UnitsInStock) FROM northwind.products;
-- SELECT avg (UnitsInStock) FROM northwind.products; //media
-- 1. Seleccionar los pedidos realizados por el empleado con código entre el 2 y 5 con fecha de pedido del 31 de julio de cualquier año. Buscar información sobre la función EXTRACT.
-- SELECT OrderID FROM northwind.orders where extract(month from OrderDate)=7 and extract(day from OrderDate)=31 and EmployeeID in (2,5);
-- 2. Seleccionar los pedidos realizados por el empleado con código 3, de cualquier año, pero solo de los últimos 5 meses (agosto-diciembre). Buscar información sobre la función MONTH.
-- SELECT OrderID FROM northwind.orders where month(OrderDate)>=8 and EmployeeID in (3);
-- 3. Seleccionar los detalles de los pedidos (tabla OrderDetails) que tengan cantidades entre 10 y 250.
-- SELECT * FROM northwind.orderdetails WHERE Quantity BETWEEN 10 AND 250;
-- 4. Seleccionar los detalles de los pedidos cuyo coste (precio unitario x unidades) se encuentre entre 10 y 330. Mostrar el coste como TOTAL.
-- SELECT *,(UnitPrice*Quantity) as "TOTAL"  FROM northwind.orderdetails WHERE (UnitPrice*Quantity) BETWEEN 10 AND 330;
-- 5. Hacer un listado de todos los países a los que pertenecen los distintos clientes (buscar información sobre el operador DISCTINCT).
-- SELECT DISTINCT (Country)AS "PAISES" FROM northwind.customers;
-- 6. Mostrar los 15 productos más vendidos.
-- SELECT ProductName,(UnitsOnOrder+ReorderLevel)AS VENTAS FROM northwind.products order by VENTAS desc LIMIT 15;
-- 7. Imprimir el nombre de todos los empleados, así como la longitud en caracteres del mismo (en dos columnas).
-- SELECT FirstName, char_length(FirstName) AS "Numero de caracteres" FROM northwind.employees;
-- 8. Imprimir en una única columna el nombre y apellidos de todos los empleados, concatenados.
-- SELECT concat_ws(" ",FirstName, LastName) AS "NOMBRE Y APELLIDOS" FROM northwind.employees;
-- 9. Imprimir el nombre de los empleados en minúsculas y el apellido en mayúsculas.

-- 10. Imprimir el nombre de los empleados, excluyendo la primera y última letra.

-- 11. Imprimir el nombre, apellidos y fecha de nacimiento de todos los empleados. La fecha de nacimiento debe estar en el formato europeo (DD—MM--AAAA).

-- 12. Por cada empleado, imprimir junto a su nombre y apellidos, el número de años que han transcurrido desde su nacimiento hasta su contratación.

-- 13. Por cada empleado, imprimir el número de años que han transcurrido desde su contratación hasta la fecha actual.

-- 14. Repetir el ejercicio anterior expresando el resultado en meses.

-- 15. Repetir el ejercicio anterior expresando el resultado en días.

-- 16. Imprimir el nombre del día de la semana en el que nació cada empleado, junto con su nombre y apellidos.

-- 17. Imprimir el nombre del mes en el que fue contratado cada empleado, junto con su nombre y apellidos.

-- 18. Por cada empleado, imprimir nombre, apellidos, fecha de contratación y antigüedad en días (días que lleva contratado).

-- 19. Repetir el ejercicio anterior añadiendo una nueva columna con la edad a la que fue contratado.

-- 20. Seleccionar los 7 productos con precio más caro, que cuenten con stock en almacén. Buscar información sobre la palabra reservada LIMIT.

-- 21. Seleccionar los 9 productos con menos stock en almacén, que pertenezcan a la categoría 3, 5 u 8.