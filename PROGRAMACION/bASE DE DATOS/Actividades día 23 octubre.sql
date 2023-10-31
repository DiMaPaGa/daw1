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
SELECT CustomerID, count(*) from orders orderdetails where Freight>50 group by CustomerID having count(*)>20 order by CustomerID Asc;
-- Querys inventadas
-- Interesa conocer cuántos productos hay en cada pedido, con una columna que se denomine "recuentoProductos". Queremos que se considere aquellos productos que cuenten con algún descuento, agrupado todo por el identificador de pedido, y solo mostrando los pedidos que cuenten con más de dos productos. Ordena la tabla resultante por el recuento de pedidos, poniendo los recuentos más numerosos en primer lugar.
SELECT OrderID, count(*) as "recuentoProductos" FROM northwind.orderdetails where Discount>0.0 group by OrderID having recuentoProductos>2 order by recuentoProductos desc;
-- Haz el recuento de clientes agrupados por ciudad y pais, mostrando únicamente aquellos casos en los que se cuente con más de dos clientes. Ordénalos por países en orden alfabético.
SELECT City, Country, Count(*) FROM northwind.customers group by City, Country having Count(*)>2 order by Country asc;
-- continuación actividades boletín 5 de josé carlos:
-- 23.Por cada producto muestre el nombre de producto, longitud en caracteres del nombre de producto, precio unitario redondeado al entero inferior más cercano,
-- número de unidades en stock y ganancia. La ganancia de cada producto se calcula utilizando el número de unidades del producto y el precio unitario redondeado de
-- dicho producto.
SELECT ProductName, char_length(ProductName) as longitud_nombre, floor(UnitPrice) as "Precio redondeado", UnitsInStock, floor(UnitPrice) * floor(UnitsInStock) as "Ganancia" FROM northwind.products;
-- 24. Cuente la cantidad de productos que pertenecen a la categoría “Bebidas”.
SELECT CategoryID, count(*) FROM northwind.products group by CategoryID having CategoryID=1;
SELECT CategoryID, count(*) FROM northwind.products where CategoryID=1;
-- 25. Por cada producto muestre el nombre de producto, nombre de la compañía proveedora y ciudad de la compañía proveedora, para aquellos productos sin stock. (JOIN)

-- 26. Muestre los proveedores con algún valor visible en el campo Homepage.
SELECT * FROM northwind.suppliers where HomePage is not null and HomePage<>(" ");
-- 27. Halle el total de unidades en stock para aquellos productos cuya descripción de categoría es “Carnes preparadas”.
SELECT sum(UnitsInStock) as "NÚMERO CARNES PREPARADAS EN STOCK" FROM northwind.products where CategoryID=6;
-- 28. Por cada cliente halle la cantidad total de pedidos, sólo para aquellos clientes de Alemania, Canada o Venezuela que tienen algún valor visible en el campo Region.
-- Este no: SELECT CustomerID, count(*) FROM northwind.orders WHERE ShipRegion<>(" ") and ShipRegion IS NOT NULL and ShipCountry="Germany" or ShipCountry="Venezuela" or ShipCountry="Canada" group by CustomerID;
SELECT CustomerID, count(*) FROM northwind.orders WHERE ShipCountry IN ("Germany","Venezuela","Canada") and ShipRegion<>" " and ShipRegion IS NOT NULL group by CustomerID;
-- 29. Por cada cliente, pedido realizado y empleado asociado, muestre los distintos productos (id de producto). (JOIN)

-- 30. Halle la edad media de los representantes de ventas de Londres y Redmond que sean mujeres.
SELECT avg(timestampdiff(year,BirthDate, Curdate())) as "media de edad" FROM northwind.employees where City in ("London", "Redmon") and Title="Sales Representative" and TitleOfCourtesy in ("Ms.","Mrs.");