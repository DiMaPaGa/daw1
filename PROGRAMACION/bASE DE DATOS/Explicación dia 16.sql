-- Select que cuente el total de empleados.
-- SELECT count(*) FROM northwind.employees;
-- Ojo, nunca se pone nombre de columna dentro de count porque si hay null, no las cuentan.
-- Conteo total de pedidos
-- SELECT count(*) FROM northwind.orders;
-- Conteo total de pedidos que ha realizado cada empleado (por subgrupos)
-- SELECT EmployeeID, count(*)  FROM northwind.orders group by EmployeeID;
-- Conteo total de pedidos que ha realizado cada empleado (por subgrupos) pero solo si el conteo es menor de 100
-- SELECT EmployeeID, count(*)  FROM northwind.orders group by EmployeeID HAVING COUNT(*) <=100;
-- QUIERO QUE ME CUENTE LOS QUE TIENE ID PAR, y a partir de ahí lo demas...sería:
-- SELECT count(*), EmployeeID FROM northwind.orders WHERE mod(orderid,2)=0 group by employeeID;
-- Imprimir de cada empleado el número de pedidos, id como id del empleado y número de pedidos como num_pedidos
-- SELECT EmployeeID as "ID del empleado", count(*) as NUM_PEDIDOS  FROM northwind.orders group by EmployeeID;
-- DE LA TABLA ORDERdETAILS, POR CADA PEDIDO, IMPRIMIR EL id DE PEDIDO Y EL TOTAL DE UNIDADES.
-- SELECT OrderID, sum(Quantity) "total unidades" FROM northwind.orderdetails group by OrderID 
-- LO MISMO DE ANTES PERO CON CANTIDADES MENORES DE 50
-- SELECT OrderID, sum(Quantity) "total unidades" FROM northwind.orderdetails group by OrderID having sum(Quantity)<50;
SELECT Country as "País", count(*) as "Número" FROM northwind.employees Where Title="Sales Representative" group by Country;
-- Por cada pais imprimir el número de empleados que NO ostentan el cargo de Sales Representative"
SELECT Country as "País", count(*) as "Número" FROM northwind.employees Where Title!="Sales Representative" group by Country;
-- 1. Por cada pedido, mostrar el número de filas/registros/tuplas (tabla OrderDetails).
SELECT OrderID, count(*) FROM northwind.orderdetails group by OrderID;
-- 2. Por cada producto, mostrar el número de filas/registros/tuplas (tabla OrderDetails).
SELECT ProductID, count(*) as "Numero de registros" FROM northwind.orderdetails group by ProductID;
-- 3. Por cada cliente, mostrar el número de pedidos.
SELECT CustomerID, count(*) as "Número de pedidos" FROM northwind.orders group by CustomerID;
-- 4. Repetir el anterior sólo con envíos desde/hacia Londres (ShipCity).
SELECT CustomerID, count(*) as "Número de pedidos" FROM northwind.orders where ShipCity="London" group by CustomerID;
-- 5. Repetir el ejercicio 1 mostrando sólo aquellos que tienen más de 4 líneas.
SELECT OrderID, count(*) FROM northwind.orderdetails group by OrderID having count(*)>4;
-- 6. Por cada cliente, mostrar el número de pedidos sólo para los clientes con más de 10 pedidos.
SELECT CustomerID, count(*) FROM northwind.orders group by CustomerID having count(*)>10;
-- 7. Mostrar el número de empleados en cada ciudad.
SELECT City, count(*) FROM northwind.employees group by City;
-- 8. Mostrar el número de empleados en cada ciudad que tenga al menos dos empleados.
SELECT City, count(*) FROM northwind.employees group by City having count(*)>=2;
-- 9. Mostrar el número de empleados en cada ciudad que tengan el cargo de ‘Sales representative’, para aquellas ciudades con al menos dos empleados de este cargo. Ordenar por el número de empleados.
SELECT City, count(*) as "Número de empleados" FROM northwind.employees where Title="Sales Representative" group by City having count(*)>=2 order by count(*) asc;
-- 10. Muestra las distintas ciudades en las que hay empleados.
SELECT City FROM northwind.employees group by City;
-- 11. Cuenta las ciudades en las que hay empleados.
