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
SELECT CustomerID, count(*) as "Número de pedidos" FROM northwind.orders group by CustomerID;-- se podria quitar el CustomerID primero, pero es preferible dejarlo
-- 4. Repetir el anterior sólo con envíos desde/hacia Londres (ShipCity).
SELECT CustomerID, count(*) as "Número de pedidos" FROM northwind.orders where ShipCity="London" group by CustomerID;-- también like "London"
-- 5. Repetir el ejercicio 1 mostrando sólo aquellos que tienen más de 4 líneas.
SELECT OrderID, count(*) as "total" FROM northwind.orderdetails group by OrderID having total>4; -- where filtra antes de obtener los resultados y having tras el filtrado
-- 6. Por cada cliente, mostrar el número de pedidos sólo para los clientes con más de 10 pedidos.
SELECT CustomerID, count(*) FROM northwind.orders group by CustomerID having count(*)>10; -- si lo denomino número de pedidos, tras el having lo menciono con el nuevo nombre, pero tiene que estar todo unido
-- 7. Mostrar el número de empleados en cada ciudad.
SELECT City, count(*) FROM northwind.employees group by City;
-- 8. Mostrar el número de empleados en cada ciudad que tenga al menos dos empleados.
SELECT City, count(*) FROM northwind.employees group by City having count(*)>=2;
-- 9. Mostrar el número de empleados en cada ciudad que tengan el cargo de ‘Sales representative’, para aquellas ciudades con al menos dos empleados de este cargo. Ordenar por el número de empleados.
SELECT City, count(*) as "Número de empleados" FROM northwind.employees where Title="Sales Representative" group by City having count(*)>=2 order by count(*) asc;
-- 10. Muestra las distintas ciudades en las que hay empleados.
SELECT City FROM northwind.employees group by City;-- Select distinct city from employees (este es más sencillo, aunque mi solución tb estaría bien)
-- 11. Cuenta las ciudades en las que hay empleados.
SELECT count(distinct City) FROM employees;
-- 12. Por cada país y ciudad de envío, mostrar el total de pedidos.
SELECT ShipCountry, ShipCity, count(*) FROM northwind.orders group by ShipCity, ShipCountry;
-- 13. Por cada país y ciudad, contar los empleados que tienen el cargo de ‘Sales representative’.
SELECT City, Country, count(*) FROM employees where Title=("Sales Representative") group by City, Country;
-- 14. Por cada país y ciudad, contar el número de clientes.
SELECT City, Country, Count(*) FROM northwind.customers group by City, Country;
-- 15. Repetir el anterior mostrando sólo aquellos que tienen más de un cliente.
SELECT City, Country, Count(*) FROM northwind.customers group by City, Country having count(*)>1;
-- 16. Por cada producto, hallar la cantidad de unidades vendidas y la media por pedido.
SELECT ProductID, OrderID, sum(Quantity) as "Total unidades vendidas", sum(Quantity)/count(distinct OrderID) as "Media por pedido" FROM northwind.orderdetails group by ProductID, OrderID; 
-- Select ProductID, sum (Quantity), Avg(quantity) from Orderdetails Group by ProductID ESTE ES ELQUE ESTÁ BIENN
-- 17. Por cada pedido, contar los distintos productos vendidos (no la cantidad).
SELECT OrderID, count(distinct ProductID) as "Productos vendidos" FROM northwind.orderdetails group by OrderID;
-- 18. Repetir el anterior mostrando solo los pedidos con un único producto.
SELECT OrderID, count(distinct ProductID) as "Productos vendidos" FROM northwind.orderdetails group by OrderID having count(*)=1;
-- 19. En la tabla de proveedores (Suppliers), contar el número de proveedores por cada título de contacto (ContactTitle).
SELECT ContactTitle, count(*) as "Número de poveedores" FROM northwind.suppliers group by ContactTitle;
-- 20. Contar el número de productos que empiezan por la letra C.
SELECT count(*) as "Número de productos" from northwind.products where ProductName like "C%";
-- 21. Contar el número de pedidos que fueron realizados en un mes de Julio (OrderDate).
SELECT count(*) as "Numero de pedidos en julio" FROM northwind.orders where extract(month from OrderDate)=7; 
-- Select count(*) from orders where month(orderdate)=7; 
-- 22. Contar el número de pedidos realizados por el cliente DUMON en el año 1997.
SELECT count(*) as "Número de pedidos" FROM northwind.orders where CustomerID="DUMON" and year(OrderDate)=1997;
-- 23. Contar el número de pedidos (Orders) en los que los años de sus campos de tipo fecha no son exactamente iguales entre si, es decir, los valores de esas tres columnas
-- no se repiten para una misma fila.
SELECT count(*) "Pedidos iniciados y finalizados en años distintos" FROM northwind.orders where YEAR(OrderDate) <> YEAR(RequiredDate) and year(RequiredDate) <> year(ShippedDate) and year(OrderDate) <> year(ShippedDate);