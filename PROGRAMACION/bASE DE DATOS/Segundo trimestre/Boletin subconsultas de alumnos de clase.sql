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
where UnitsInStock in
(Select UnitsInStock from products) ORDER BY UnitsInStock desc limit 3;

Select ProductName
from products
where ProductID in
(Select ProductID from products) ORDER BY UnitsInStock desc limit 3;

Select ProductName from products where ProductID IN
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
where ProductID not in
(Select DISTINCT(ProductID) from orderdetails)
and length(ProductName)=4 and ProductName like 'R%';

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
-- 12 . Mostrar el id de territorio cuando la descripcion de region no sea "Eastern"

SELECT TerritoryID from territories where RegionID in
(Select RegionID from region where RegionDescription !='Eastern');

-- 13 . Mostrar los clientes de la tabla orders que realizaron pedidos en el día registrado menos reciente

Select CustomerID
from orders
where OrderDate in
(Select OrderDate from orders) order by OrderDate asc limit 1;

-- 1. Obtener el nombre y la cantidad de productos de la categoría "Condiments" que tienen un precio superior al precio promedio de todos los productos

Select ProductName, count(*)
from products
group by ProductName
having CategoryID in (Select CategoryID from categories where CategoryName like 'Condiments')
and UnitPrice> (Select avg(UnitPrice) from products);


-- 2. Selecciona los nombres de los productos que han sido pedidos por clientes que tienen un historial de compras 
-- superior al promedio de compras de todos los clientes


-- 3.  Seleccionar los nombres de los productos que se han vendido en más de 5 pedidos


-- 4. Mostrar los empleados que no han realizado ninguna venta


-- 5. Mostrar el nombre de los productos y sus cantidades disponibles en la categoría 'Seafood'


-- 6. Muestra el ID de los empleados que han manejado pedidos con productos que tienen un precio unitario superior a 50


-- 7. Muestra el nombre y el apellido de los empleados que fueron contratados el mismo mes que la fecha en la que se pidio el pedido más reciente.


-- 8. Nombre de contacto del cliente de aquellos clientes que hayan hecho hecho pedidos con un "freight" mayor a 80


-- 9. Obten el producto más caro de cada categoría


-- 10. Recupera el nombre de los empleados que hayan realizado ventas por encima del promedio de ventas totales, junto con el monto total de sus ventas


-- 11. Obtén los nombres de los productos y la cantidad en stock de aquellos productos que son suministrados por proveedores del Reino Unido


-- 12. Encuentra productos cuyo nivel de stock sea inferior al valor máximo de unidades en  stock de los productos de la categoría 3 o al valor 
-- máximo de unidades en  stock de los productos de la categoría 5


-- 13. Selecciona los pedidos cuyos empleados pertenecen al territorio de Orlando


-- 14. Mostrar los nombres de los clientes y la cantidad de pedidos que han realizado


-- 15. Pedidos que superen los empleados de nacionalidad Francés.


-- 16. Obten la cantidad de productos con existencia menor a 10 en cada categoría


-- 17. Seleccionar los nombres de los clientes que han realizado un pedido de un producto con un precio superior a 100


-- 18. Productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock de los productos de la categoría 2


-- 19. Obtén el nombre de los clientes que hayan realizado pedidos con un valor total superior al promedio de los valores totales de todos los pedidos, 
-- junto con la cantidad total de pedidos realizados por cada cliente


-- 20. Listado de idclientes y la cantidad de pedidos de aquellos clientes que realizaron mas de 2 pedidos y fueron atendidos por empleados de San Francisco (TerritoryDescription).


-- 21. Mostrar los nombres de todos los productos que pertenecen a la categoría 'Beverages' 


-- 22. Encuentra los clientes que han realizado pedidos sólo en el año 1997


-- 23. Mostrar los productos con el precio más alto en cada categoría


-- 24. Mostrar los productos que tienen un precio superior al promedio de todos los productos


-- 25. Muestra el nombre y apellidos de aquellos empleados cuya región de actuación sea 'Southern';
SELECT Firstname, LastName
FROM employees
where EmployeeID in 
(Select EmployeeID from employeeterritories where TerritoryID in
(select TerritoryID from territories where RegionID in
(SELECT RegionID from region where RegionDescription = 'Southern')));


-- 26. Obtén los nombres de contacto de los clientes que han realizado pedidos atendidos por empleados de Estados Unidos


-- 27. Listado de las ordenes de pedido y clientes de aquellos pedidos realizados en el mes de Agosto, enviados por transportistas 
-- (shipper) estadounidenses y atendidos por clientes no jubilados aun, es decir, menor de 65 años


-- 28. Mostrar el nombre de todos los productos cuyo descuento sea menor o nulo a la media


-- 29. Dame los nombres de los productos cuyo stock sea superior a la edad media de los empleados


-- 30. Muestra el producto con el precio unitario más alto usando subconsulta


-- 31. Mostrar los productos que tienen un UnitPrice superior al precio promedio los productos de la categoría 'Produce'


-- 32. Muestra los nombres de los empleados que han realizado ventas a clientes ubicados en diferentes regiones a la del empleado con el mayor número de ventas


-- 33. Dime el nombre de contacto de aquellos clientes que hayan ordenado productos con un unitprice mayor a la media


-- 34. Muestra los nombres de los productos y los precios unitarios de aquellos productos suministrados por proveedores con números de teléfono que contienen '555'

select ProductName, UnitPrice
from products
Where SupplierID in (Select SupplierID from suppliers where Phone like '%555%');