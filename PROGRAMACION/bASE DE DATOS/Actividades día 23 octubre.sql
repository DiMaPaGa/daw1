-- Encuentra todos los productos que tienen un precio unitario mayor a 20 y ordénalos por nombre de producto en orden ascendente.
SELECT * FROM northwind.products where UnitPrice > 20  order by ProductName asc;
-- Encuentra todas las categorías que tienen más de 5 productos con un precio unitario mayor a 20.Agrupa los resultados por categoría.
select CategoryID, count(*) as "recuentoPedidos" from products  where UnitPrice>20 group by CategoryID having recuentoPedidos>5;
-- Encuentra todos los clientes que han realizado más de 10 pedidos. Agrupa los resultados por cliente y ordénalos por nombre en orden ascendente.
SELECT CustomerID, Count(*) as "recuentoPedidos" FROM northwind.orders group by CustomerID having recuentoPedidos>10 order by CustomerID Asc;
-- Encuentra todas las categorías en las que el precio promedio de los productos es mayor a 20. Agrupa los resultados por categoría, utiliza HAVING para filtrar los grupos y ordénalos por nombre de categoría en orden ascendente.
select CategoryID, count(*) from products group by CategoryID having avg(UnitPrice)>20 order by CategoryID asc;
-- Encuentra todos los empleados que han realizado más de 20 pedidos con un valor de transporte (freight) total mayor a 5000. Agrupa los resultados por empleado, utiliza HAVING para filtrar los grupos y ordénalos por apellido del empleado en orden ascendente.
SELECT LastName, count(*) as "Total de pedidos", sum(Freight) as "Total Freight" FROM northwind.orders JOIN employees ON EmployeeID = EmployeeID group by EmployeeID, LastName Having "Total de pedidos">20 and "Total Freight" > 5000 order by LastName Asc;
SELECT CustomerID, count(*) from orders where Freight>50 group by CustomerID having count(*)>20 order CustomerID Asc;