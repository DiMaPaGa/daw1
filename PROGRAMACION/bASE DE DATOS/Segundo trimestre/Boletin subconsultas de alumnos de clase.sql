-- 1. Seleccionar el nombre de los empleados que hayan atendido pedidos para Francia
SELECT Firstname
FROM employees
WHERE EmployeeID IN
(Select EmployeeID from orders where ShipCountry = 'France');

-- 2. Muestra los nombres de las categorías que tengan productos cuyos nombres comiencen por la letra C o S.
Select CategoryName
from categories
where CategoryID in
(Select CategoryID from products where ProductName Like 'C%' or ProductName like 'S%');

-- 3. Seleccionar los proveedores cuyos productos se envían a USA
Select * from suppliers where SupplierID in
(Select SupplierID from products where ProductID in
(Select ProductID from orderdetails where OrderID in
(SELECT OrderID from orders where ShipCountry = 'USA')));


-- 4. Selecciona el nombre de las compañias cuyo pedido lo atendio un empleado con ID 1 al 4
SELECT CompanyName 
from customers
where CustomerID IN
(Select CustomerID from orders where EmployeeID BETWEEN 1 and 4);

-- 5. Muestra los 3 productos con las unidades más altas usando subconsulta

Select ProductName
from products
ORDER BY UnitsInStock desc limit 3;

Select ProductID, Quantity
from orderdetails
ORDER BY quantity desc limit 3;

Select ProductName
from products
where ProductID in
(Select ProductID from products) ORDER BY UnitsInStock desc limit 3;

Select ProductName, ProductID from products where ProductID IN
(Select ProductID from (Select ProductID from orderdetails group by ProductID order By sum(Quantity) desc limit 3) as top);



-- 6. Ciudades que tienen menos (customers) que la ciudad de Barcelona
Select City
from customers
group by city
having count(*)<
(Select count(*) as recuento from customers where City = 'Barcelona');

-- 7. Mostrar el apellido, rango y número de departamento (address) de los trabajadores que no tengan empleados a su cargo.
SELECT LastName, Title, Address
from employees
where EmployeeID not IN
(Select ReportsTo from employees o where employees.EmployeeID = o.ReportsTo); 


-- 8. Muestra el ID, el nombre y el precio de los productos cuyo precio sea inferior al precio promedio.
Select ProductID, ProductName, UnitPrice
from products
where UnitPrice <
(Select AVG(UnitPrice) from products);

-- 9. Productos  que no han sido nunca comprados que solo tenga 4 letras y empiece por 'R'
Select ProductName
from products
where char_length(ProductName)=4 and ProductName like 'R%'
and ProductID not in
(Select ProductID from orderdetails);

-- 10. Seleccionar el nombre de los productos que hayan tenido un descuento en algún pedido
Select ProductName 
from products 
where ProductID in
(Select ProductID from orderdetails where Discount >0);


-- 11. Selecciona los productos en el que la media de la cantidad pedida sea menor a la del producto propio y el id del producto este entre 8 y 20
Select ProductID, ProductName
From products
where ProductID between 8 and 20
and ProductID in
(Select ProductID from orderdetails Where Quantity < (Select avg(Quantity) from orderdetails));


Select products.productID, a.ProductID, avg(a.Quantity), products.UnitsInStock from products, 
(Select quantity, orderdetails.productID from orderdetails) as a where a.productID = products.productID and products.productID between 8 and 20 group by products.productID having products.UnitsInStock <  avg(a.Quantity);

-- 12 . Mostrar el id de territorio cuando la descripcion de region no sea "Eastern"

SELECT TerritoryID from territories where RegionID in
(Select RegionID from region where RegionDescription !='Eastern');

-- 13 . Mostrar los clientes de la tabla orders que realizaron pedidos en el día registrado menos reciente

select CustomerID from orders where OrderDate in (select min(OrderDate) from orders);

-- 14. Obtener el nombre y la cantidad de productos de la categoría "Condiments" que tienen un precio superior al precio promedio de todos los productos

SELECT ProductName, UnitsInStock FROM products WHERE CategoryID IN(
SELECT CategoryID FROM categories WHERE CategoryName = "Condiments") AND UnitPrice > (SELECT avg(UnitPrice) FROM products);


-- 15. Selecciona los nombres de los productos que han sido pedidos por clientes que tienen un historial de compras 
-- superior al promedio de compras de todos los clientes

select ProductName from products where ProductID in
(select distinct(ProductID) from orderdetails where OrderID in
(select OrderID from orders where CustomerID in 
(Select CustomerID from orders group by CustomerID having count(*)>
(select avg(compras) from (select CustomerID, count(*) as compras from orders group by CustomerID) as ClientesCompras))));

-- 16.  Seleccionar los nombres de los productos que se han vendido en más de 5 pedidos
Select ProductName
from products
where ProductID IN
(Select ProductID from orderdetails group by ProductID HAVING count(*)>5);

-- 17. Mostrar los empleados que no han realizado ninguna venta
Select EmployeeID
from employees
where EmployeeID not in 
(Select EmployeeID from orders where employees.EmployeeID = orders.EmployeeID);

-- 18. Mostrar el nombre de los productos y sus cantidades disponibles en la categoría 'Seafood'
SELECT ProductName, UnitsInStock FROM products WHERE CategoryID IN(
SELECT CategoryID FROM categories WHERE CategoryName = "Seafood");


-- 19. Muestra el ID de los empleados que han manejado pedidos con productos que tienen un precio unitario superior a 50
SELECT distinct(EmployeeID)
FROM orders
WHERE OrderID in
(Select OrderID from orderdetails where ProductID in
(SELECT ProductID from products where UnitPrice>50));

-- 20. Muestra el nombre y el apellido de los empleados que fueron contratados el mismo mes que la fecha en la que se pidio el pedido más reciente.
 Select FirstName, LastName
 from employees
 where month(HireDate) in
 (Select month(OrderDate) from orders Where OrderDate = 
 (Select max(OrderDate) from orders));
 
 Select FirstName, LastName
 from employees
 where month(HireDate) in
 (Select month(max(OrderDate)) from orders); -- mas simple y mismo resultado

-- 21. Nombre de contacto del cliente de aquellos clientes que hayan hecho hecho pedidos con un "freight" mayor a 80
Select ContactName
from customers
where CustomerID in
(Select distinct(CustomerID) from orders where Freight>80);

-- 22. Obten el producto más caro de cada categoría

SELECT ProductName, UnitPrice, CategoryID FROM Products WHERE (CategoryID, UnitPrice) IN 
(SELECT CategoryID, MAX(UnitPrice) FROM Products GROUP BY CategoryID);

-- 23. Recupera el nombre de los empleados que hayan realizado ventas por encima del promedio de ventas totales, junto con el monto total de sus ventas
Select FirstName, (Select count(*) from orders where orders.EmployeeID = e.EmployeeID) as TotalVentas
from employees e
Where (Select count(*) from orders where orders.EmployeeID = e.EmployeeID ) >
(Select avg(recuento) from (select count(*) as recuento from orders group by EmployeeID) as recuento);
 
-- 24. Obtén los nombres de los productos y la cantidad en stock de aquellos productos que son suministrados por proveedores del Reino Unido
Select ProductName, UnitsInStock
from products
where SupplierID in
(Select SupplierID from suppliers where Country= 'UK');

-- 25. Encuentra productos cuyo nivel de stock sea inferior al valor máximo de unidades en  stock de los productos de la categoría 3 o al valor 
-- máximo de unidades en  stock de los productos de la categoría 5

Select ProductName, UnitsInStock
from products
where UnitsInStock < (Select max(UnitsInStock) from products where CategoryID =3 or CategoryID=5);

Select ProductName, UnitsInStock
from products
where UnitsInStock < (Select max(UnitsInStock) from products where CategoryID =3) 
and UnitsInStock< (Select max(UnitsInStock) from products where CategoryID=5);

-- 26. Selecciona los pedidos cuyos empleados pertenecen al territorio de Orlando
Select OrderID
from orders
where EmployeeID in
(Select EmployeeID from employeeterritories where TerritoryID in
(Select TerritoryID from territories where TerritoryDescription = 'Orlando'));

-- 27. Mostrar los nombres de los clientes y la cantidad de pedidos que han realizado

Select c.CompanyName, (Select count(*) from orders o where o.CustomerID= c.CustomerID) as CantidadPedidos
from customers c;

-- 28. Pedidos que superen los empleados de nacionalidad Francés. Lo he entendido como Pedidos cuyo recuento de artículos sea superado por el recuento de articulos de los pedidos realizados por empleados franceses.
SELECT * FROM Orders WHERE 
(SELECT COUNT(*) FROM OrderDetails WHERE orderdetails.OrderID = Orders.OrderID
) < ( SELECT COUNT(*) FROM OrderDetails WHERE OrderID IN 
(SELECT OrderID FROM Orders WHERE EmployeeID IN 
(SELECT EmployeeID FROM Employees WHERE Country = 'France')));

-- 29. Obten la cantidad de productos con existencia menor a 10 en cada categoría

SELECT (SELECT CategoryName FROM Categories WHERE CategoryID = p.CategoryID) AS CategoryName, COUNT(*) AS CantidadProductos
FROM Products p
WHERE UnitsInStock < 10
GROUP BY p.CategoryID;

-- 30. Seleccionar los nombres de los clientes que han realizado un pedido de un producto con un precio superior a 100
Select CompanyName
FROM customers
WHERE CustomerID in
(Select CustomerID from orders o where OrderID in
(Select OrderID from orderdetails Where UnitPrice > 100));


-- 31. Productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock de los productos de la categoría 2
Select ProductName
from products
where UnitsInStock >
(Select max(UnitsInStock) from products where CategoryID=2);

-- 32. Obtén el nombre de los clientes que hayan realizado pedidos con un valor total superior al promedio de los valores totales de todos los pedidos, 
-- junto con la cantidad total de pedidos realizados por cada cliente

Select c.CompanyName, (SELECT COUNT(*) FROM orders where orders.CustomerID= c.CustomerID) as pedidosXcliente
From customers c
Where CustomerID in
(Select CustomerID from orders where OrderID in
(Select OrderID from orderdetails Group by OrderID having sum(Quantity*UnitPrice) >
(Select avg(sumatorio) from (Select SUM(Quantity*UnitPrice) AS sumatorio FROM orderdetails group by OrderID) as suma)));


-- 33. Listado de idclientes y la cantidad de pedidos de aquellos clientes que realizaron mas de 2 pedidos y fueron atendidos por empleados de San Francisco (TerritoryDescription).

Select CustomerID, COUNT(*) from orders where CustomerID in
(Select CustomerID from orders group by CustomerID having count(*) > 2) and
EmployeeID in (Select EmployeeID from employeeterritories where TerritoryID in
(Select TerritoryID from territories where TerritoryDescription= 'San Francisco'))
group by CustomerID;

-- 34. Mostrar los nombres de todos los productos que pertenecen a la categoría 'Beverages' 

SELECT ProductName
from products
where CategoryID in
(Select CategoryID from categories where CategoryName = 'Beverages');

-- 35. Encuentra los clientes que han realizado pedidos sólo en el año 1997

Select CompanyName from customers where CustomerID in
(Select CustomerID from orders where year(OrderDate)=1997)
and CustomerID not in 
(Select CustomerID from orders where year(OrderDate) !=1997);

-- 36. Mostrar los productos con el precio más alto en cada categoría
SELECT ProductName, CategoryID, UnitPrice FROM products a WHERE UnitPrice in
(Select max(UnitPrice) from products b where a.CategoryID= b.CategoryID);

-- 37. Mostrar los productos que tienen un precio superior al promedio de todos los productos
SELECT ProductName FROM products WHERE UnitPrice >
(Select AVG(UnitPrice) from products);

-- 38. Muestra el nombre y apellidos de aquellos empleados cuya región de actuación sea 'Southern';
SELECT Firstname, LastName
FROM employees
where EmployeeID in 
(Select EmployeeID from employeeterritories where TerritoryID in
(select TerritoryID from territories where RegionID in
(SELECT RegionID from region where RegionDescription = 'Southern')));


-- 39. Obtén los nombres de contacto de los clientes que han realizado pedidos atendidos por empleados de Estados Unidos

SELECT ContactName from customers where CustomerID in
(Select CustomerID from orders where EmployeeID in
(Select EmployeeID from employees where Country = 'USA'));

-- 40. Listado de las ordenes de pedido y clientes de aquellos pedidos realizados en el mes de Agosto, enviados por transportistas 
-- (shipper) estadounidenses y atendidos por clientes no jubilados aun, es decir, menor de 65 años

Select o.OrderID, (Select c.CompanyName from customers c where c.CustomerID= o.CustomerID) as CompanyName
from orders o
where month(OrderDate)=8
and ShipCountry ='USA'
and EmployeeID in
(Select EmployeeID from employees where timestampdiff(year, Birthdate, curdate())< 65);

Select o.OrderID, (Select c.CompanyName from customers c where c.CustomerID= o.CustomerID) as CompanyName
from orders o
where month(OrderDate)=8
and ShipCountry ='USA'
and EmployeeID in
(Select EmployeeID from employees where timestampdiff(year, Birthdate, o.Orderdate)< 65);

-- 41. Mostrar el nombre de todos los productos cuyo descuento sea menor o nulo a la media
Select ProductName
from products
where ProductID in
(Select ProductID from orderdetails where Discount is null or Discount <
(Select AVG(Discount) from orderdetails));

-- 42. Dame los nombres de los productos cuyo stock sea superior a la edad media de los empleados
Select ProductName, UnitsInStock 
from products
where UnitsInStock >
(Select avg(edad) from (Select timestampdiff(year, BirthDate, curdate()) as edad from employees) as edades);

-- 43. Muestra el producto con el precio unitario más alto usando subconsulta
Select ProductID, ProductName, UnitPrice
From products
where UnitPrice =
(Select max(UnitPrice) from products);


-- 44. Mostrar los productos que tienen un UnitPrice superior al precio promedio los productos de la categoría 'Produce'
Select ProductID, ProductName, Unitprice
from products
where Unitprice >
(Select avg(UnitPrice) from products where CategoryID in
(Select CategoryID from categories where CategoryName='Produce'));

-- 45. Muestra los nombres de los empleados que han realizado ventas a clientes ubicados en diferentes regiones a la del empleado con el mayor número de ventas

SELECT FirstName FROM employees WHERE EmployeeID != 
(SELECT EmployeeID FROM (SELECT EmployeeID, COUNT(*) AS num_ventas FROM orders GROUP BY EmployeeID ORDER BY COUNT(*) DESC LIMIT 1) AS empleadoTopVentas)
AND EmployeeID IN (SELECT EmployeeID FROM orders WHERE ShipCountry NOT IN 
(SELECT ShipCountry FROM (SELECT ShipCountry, COUNT(*) AS num_ventas FROM orders GROUP BY ShipCountry ORDER BY COUNT(*) DESC LIMIT 1) AS empleadoTopVentas));


-- 46. Dime el nombre de contacto de aquellos clientes que hayan ordenado productos con un unitprice mayor a la media
Select ContactName from customers where CustomerID in
(Select CustomerID from orders where OrderID in
(Select OrderID from orderdetails where ProductID in
(Select ProductID from products where UnitPrice >
(Select avg(UnitPrice) from products))));


-- 47. Muestra los nombres de los productos y los precios unitarios de aquellos productos suministrados por proveedores con números de teléfono que contienen '555'

select ProductName, UnitPrice
from products
Where SupplierID in (Select SupplierID from suppliers where Phone like '%555%');