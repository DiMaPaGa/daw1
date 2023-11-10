
-- -- -- -- -- 
-- 1 Pedidos atendidos por empleados de Londres
SELECT OrderID FROM northwind.orders Where EmployeeID in (SELECT EmployeeID FROM northwind.employees where City = "London");
-- 2 Productos cuya descripcion de categoria tiene menos de diez caracteres de longitud
Select ProductName From northwind.products where CategoryID = (SELECT CategoryID FROM northwind.categories where length(Description)<10); 
-- 3 Clientes con mas de diez pedidos
SELECT CustomerID, count(*) FROM northwind.orders group by CustomerID having count(*)>10;
-- 4 Cantidad de productos de cada proveedor, para proveedores sin region
SELECT SupplierID, Count(*) FROM northwind.products group by SupplierID having SupplierID = (Select SupplierID FROM northwind.suppliers Where region=" ");
-- -- -- -- -- 
-- 1. Selecciona todos los campos de la tabla orderdetails, ordenada por cantidad (Quantity) ascendentemente.
SELECT * FROM northwind.orderdetails order by Quantity asc;
-- 2. Obtener todos los productos, cuyo nombre comienzan por P y tienen un precio unitario comprendido entre 10 y 120.
SELECT * FROM northwind.products where ProductName like "P%" and UnitPrice between 10 and 120;
-- 3. Obtener todos los clientes de los países de USA, Francia y UK.
SELECT CustomerID, Country FROM northwind.customers where Country in ("USA", "France", "UK");
-- 4. Obtener todos los productos sin stock (UnitsInStock) que pertenecen a la categoria 1, 3, 4 y 7.
SELECT * FROM northwind.products Where UnitsInStock = 0 and CategoryID in (1,3,4,7); 
-- 5. Obtener todas las ordenes hechas por el empleado con ID 2, 5 y 7 en el año 1996.
SELECT * FROM northwind.orders where EmployeeID in (2,5,7) and year(OrderDate)=1996;
-- 6. Seleccionar todos los campos del cliente cuya compañia empieza con la letra A hasta la D y pertenecen al pais de USA. Ordenalos por la direccion.
SELECT * FROM northwind.customers where CompanyName between ("A%") and ("DZ%") and Country = "USA" order by Address asc; -- Podria usarse "E%" para evitar que si hay una compañía que empiece por DZ no la deje fuera.
-- 7. Seleccionar todos los campos de los productos descontinuados, que pertenezcam a los proveedores con ID 1, 3, 7, 8 y 9, que tengan stock y al mismo 
-- tiempo que sus precios unitarios esten entre 39 y 190. Ordenaos por ID de proveedor y precio unitario de manera ascendente.
SELECT * FROM northwind.products where SupplierID in (1, 3, 7, 8, 9) and UnitsInStock > 0 and UnitPrice between 39 and 190 order by SupplierID, UnitPrice asc;
-- 8. Seleccionar los productos cuyo precio unitario esta entre 35 y 250, sin stocken almacen que pertenecen a las categorias 1, 3, 4, 7 y 8 y que son
-- distribuidos por los proveedores 2, 4, 6, 7, 8 y 9.
SELECT * FROM northwind.products where UnitPrice between 35 and 250 and UnitsInStock =0 and CategoryID in (1, 3, 4, 7, 8) and SupplierID in (2, 4, 6, 7, 8, 9);
-- 1. Mostrar la cantidad total de productos vendidos por cada empleado
SELECT EmployeeID, count(*) FROM northwind.orders GROUP BY EmployeeID ;
-- 2. Mostrar la cantidad de pedidos realizados por cada cliente, solo aquellos que han realizado mas de 5 pedidos
SELECT CustomerID, Count(*) as "Cantidad Pedidos" FROM northwind.orders GROUP BY CustomerID HAVING count(*)>5;
-- 3. Muestra los precios más alto y más bajo de todos los productos
SELECT MAX(UnitPrice), min(UnitPrice) FROM northwind.products;
-- 4. Por cada empleado, muestra su nombre y su edad
SELECT FirstName, timestampdiff(year, BirthDate, Curdate()) as "edad" FROM northwind.employees;