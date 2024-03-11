-- 1. selecciona los clientes que han realizado pedidos enviados por la compañia 'United Package'-- No dice nada, puedo poner ContactName nada más.
SELECT * from customers where CustomerID in
(Select CustomerID from orders where ShipVia =
(Select ShipperID from shippers where CompanyName='United Package'));

select ContactName from customers where CustomerID in
(select CustomerID from orders where Shipvia in
(select ShipperID from shippers where CompanyName like 'United Package'));

-- 2. Visualizar el nombre de la compañía y el id del cliente, fecha, precio unitario y producto del pedido.
-- Lo interpreto como solo mostrar el ProductID
Select customers.CompanyName, customers.CustomerID, orders.OrderDate, orderdetails.UnitPrice, orderdetails.ProductID
from customers, orders, orderdetails
where customers.CustomerID = orders.CustomerID and
orders.OrderID= orderdetails.OrderID;

-- Si fuera a mostrar el nombre del producto sería:
select customers.CompanyName, customers.CustomerID, orders.OrderDate, orderdetails.UnitPrice, products.ProductName 
from customers, orders, orderdetails, products 
where customers.CustomerID = orders.CustomerID and 
orders.OrderID = orderdetails.OrderID 
and orderdetails.ProductID = products.ProductID;

-- 3. Muestra los empleados que tienen el mismo jefe que Michael Suyama sin mostrar a Michael

Select * from employees where ReportsTo =
(select ReportsTo from employees where FirstName='Michael' and LastName='Suyama')
and FirstName!='Michael' and LastName!='Suyama' and ReportsTo is not null;

-- Como no especifica lo que se quiere que se muestre de los empleados, se puede elegir únicamente nombre y apellidos. Más correcta la subconsulta final.
select FirstName, LastName from employees where ReportsTo =
(select ReportsTo from employees where concat(FirstName, ' ', LastName) = 'Michael Suyama') and EmployeeID != 
(select EmployeeID from employees where concat(FirstName, ' ', LastName) = 'Michael Suyama');


-- 4. Por cada empleado, imprimir el ID de empleado, nombre, apellido e ID de territorio.
Select employees.EmployeeID, employees.FirstName, employees.LastName, employeeterritories.TerritoryID
from employees, employeeterritories
where employees.EmployeeID = employeeterritories.EmployeeID;


-- 5. Mostrar los clientes que fueron  atendidos  por  el  mismo  transportista  que  atendió  al cliente de código ‘ANTON’ en el año 1998
Select * from customers where CustomerID in
(Select CustomerID from orders where Shipvia =
(Select ShipVia from orders where CustomerID='ANTON' and year(OrderDate)=1998));

-- De nuevo, como no especifica, puedo seleccionar únicamente el ContactName del cliente.
select ContactName from customers where CustomerID in
(select CustomerID from orders where ShipVia =
(select ShipVia from orders where CustomerID like 'ANTON' and year(OrderDate) = 1998));

-- 6. Por cada pedido, obtener el ID de pedido, ID de producto, ID de proveedor y el nombre de la compañía-- pero del proveedor!!!, en este orden.

-- pero del proveedor!!! Aunque de lo mismo, te quedas con el de abajo.
Select orders.OrderID, products.ProductID, products.SupplierID, customers.CompanyName
from orders, orderdetails, products, customers
where orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and customers.CustomerID = orders.CustomerID;

-- esta, porque nos referimos a la compañía del suppliers, no del cliente.
select orderdetails.OrderID, orderdetails.ProductID, products.SupplierID, suppliers.CompanyName 
from orderdetails, products, suppliers 
where orderdetails.ProductID = products.ProductID 
and products.SupplierID = suppliers.SupplierID;


-- 7. Mostrar las 3 categorias que tienen mas productos. ¡¡OJO!! lo hago bien, pero más sencillo SUBCONSULTAAAAA

SELECT CategoryID FROM categories WHERE CategoryID IN 
(SELECT CategoryID FROM (SELECT CategoryID, COUNT(*) AS TotalProductos FROM products GROUP BY CategoryID ORDER BY COUNT(*) DESC LIMIT 3) AS categorias_altas); -- en el orden correcto

-- respuesta del profesor
select CategoryID from (select CategoryID, count(*) "productos" from products group by CategoryID) as productosPorCategoria 
order by productos desc limit 3;


-- 8. Mostrar la información de todos los jefes y los productos que han vendido.

Select Distinct employees.*, products.*
from employees, orders, orderdetails, products
where employees.EmployeeID = orders.EmployeeID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and employees.EmployeeID IN
(Select ReportsTo from employees o where employees.EmployeeID = o.ReportsTo); -- OJO, NO HACE FALTA LA IGUALACION FINAL

-- LA MÁS CORRECTA!!!
select distinct employees.*, products.ProductName from employees, orders, orderdetails, products where 
employees.EmployeeID = orders.EmployeeID and orders.OrderID = orderdetails.OrderID and orderdetails.ProductID = products.ProductID 
and employees.EmployeeID in (select ReportsTo from employees);

Select Distinct employees.*, products.*
from employees, orders, orderdetails, products
where employees.EmployeeID = orders.EmployeeID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and employees.EmployeeID IN
(Select ReportsTo from employees o group by ReportsTo); -- y AQUÍ NO HACE FALTA AGRUPAR



-- 9. Por cada empleado, imprimir toda su información, el nombre y apellidos de su jefe concatenados, y los pedidos que ha realizado el empleado. Mostrar en ese orden. MULTITABLA!!!!
Select employees.*, concat_ws(" ", jefe.FirstName, jefe.LastName) as 'Jefe', orders.OrderID
from employees, orders, employees as jefe
where employees.EmployeeID = orders.EmployeeID
and employees.ReportsTo= jefe.EmployeeID; -- sin pillar a los jefes, sería así Y ASÍ LO ENTIENDE EL PROFESOR TB

select empleados.*, concat(jefes.FirstName," ", jefes.LastName) "Jefe", orders.OrderID from employees as empleados, employees as jefes, orders where
empleados.ReportsTo = jefes.EmployeeID and empleados.EmployeeID = orders.EmployeeID;


Select employees.*, (select concat_ws(" ", jefe.FirstName, jefe.LastName) from employees as jefe where employees.ReportsTo=jefe.EmployeeID) as Jefe , orders.OrderID
from employees, orders
where employees.EmployeeID = orders.EmployeeID; -- pillando al jefe y mostrando su columna vacia. LO DEJO POR SI PIDIERA ESTO




-- 10. Repetir el anterior, pero en lugar de mostrar todos los pedidos, contarlos. mULTITABLA!!
Select Distinct employees.*, (select concat_ws(" ", jefe.FirstName, jefe.LastName) from employees as jefe where employees.ReportsTo=jefe.EmployeeID) as Jefe , (Select count(*) from orders where orders.EmployeeID= employees.EmployeeID)
from employees, orders
where employees.EmployeeID = orders.EmployeeID; -- ESTO SOLO SI PIDIERA TODOS LOS EMPLEADOS, NO LOS QUE NO SEAN JEFES

-- Esta es la solucion que da Juan Carlos
select empleados.*, concat(jefes.FirstName," ", jefes.LastName) "Jefe", count(*) from employees as empleados, employees as jefes, orders where
empleados.ReportsTo = jefes.EmployeeID and empleados.EmployeeID = orders.EmployeeID group by empleados.EmployeeID;

-- 11. Obtén los nombres de contacto de los clientes que han realizado pedidos atendidos por empleados de Seattle
Select customers.ContactName
from customers
where CustomerID in 
(Select CustomerID from orders where employeeID in
(Select EmployeeID from employees where City ='Seattle'));

-- 12. Por cada jefe, contar el número de empleados. ES MULTITABLAAAAA!!
Select concat_ws(" ", FirstName, LastName) as 'Jefe', (Select count(*) from employees as e where e.reportsTo=employees.EmployeeID) as "num_empleados"
from employees
where (Select count(*) from employees as e where e.reportsTo=employees.EmployeeID)>0; -- eSTO POR SI PIDE HACERLO COMO SUBCONSULTA

-- PERO LA SOLUCIÓN VÁLIDAD PARA ÉL ES ESTAAAAAA
select jefes.FirstName, count(*) "Numero de empleados" 
from employees as jefes, employees as empleados 
where jefes.EmployeeID = empleados.ReportsTo group by jefes.FirstName;


-- 13. Mostrar los productos con el precio más alto de cada vendedor¡¡OJO!! Vendedor=Supplier, no employee.

select SupplierID, ProductName  from products where UnitPrice in
(select max(UnitPrice) from products pr where products.SupplierID = pr.SupplierID);



-- 14. Por cada cliente, pedido realizado y empleado asociado, muestre los distintos productos (id de producto).
-- ¿¿oJO!! DA EL PROFESOR UNA SOLUCIÓN CON MENOS TABLAS
Select customers.CustomerID, orders.OrderID, employees.EmployeeID, products.ProductID
from customers, orders, orderdetails, employees, products
where customers.CustomerID= orders.CustomerID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID= products.ProductID
and employees.EmployeeID= orders.EmployeeID;

-- eSTA ES LA SOLUCIÓN MÁS ÓPTIMA
select orders.CustomerID, orders.OrderID, orders.EmployeeID, orderdetails.ProductID 
from orders, orderdetails where
orders.OrderID = orderdetails.OrderID;

-- 15. Muestra el nombre y el apellido de los empleados que fueron contratados el mismo mes que la fecha en la que se pidio el pedido más antiguo:
-- lAS DOS SOLUCIONES IGUAL DE VÁLIDAS, PERO POR SI CONCRETA QUE LO PREFIERE DE UNA DE LAS MANERAS.
Select FirstName, LastName
from employees 
where month(HireDate) in
(Select month(Min(OrderDate)) from orders);

select FirstName, LastName from employees where month(HireDate) =
(select month(OrderDate) from orders order by OrderDate asc limit 1);


-- 16. Obtener el nombre y la cantidad de productos de la categoría "Confections" que tienen un precio inferior al precio promedio de todos los productos de las categorias 4 y 5 
-- En esta, mi solución es la más correcta!!!
SELECT products.ProductName, (SELECT SUM(orderdetails.Quantity) FROM orderdetails WHERE products.ProductID = orderdetails.ProductID) AS Quantity
FROM products
WHERE products.CategoryID = (SELECT CategoryID FROM categories WHERE CategoryName = 'Confections')
AND products.UnitPrice < (SELECT AVG(UnitPrice) FROM products WHERE CategoryID IN (4, 5));


-- Esta es la del profesor, pero le falta que sean productos únicamente de la categoría pertinente.
select ProductName, productos.Quantity from products,
(select ProductID, Quantity from orderdetails where UnitPrice >
(select avg(UnitPrice) from products where CategoryID in (4, 5))) as productos;



-- 17. Mostrar las ciudades que tienen más clientes que Bélgica
-- Mi solución muy correcta
Select City
from customers
group by city
having count(*) >
(Select count(*) from customers where Country ='Belgium');

-- solución de Juan Carlos. En este caso no hace falta agrupar en la subconsulta
select City from customers group by City having count(*) >
(select count(*) from customers where Country like "Belgium" group by Country);

-- 18. Mostrar el nombre de compañia de los proveedores y el número de productos para los proveedores con mas de cuatro productos.

SELECT suppliers.CompanyName, COUNT(products.ProductID) AS NumeroProductos
FROM suppliers, products
WHERE suppliers.SupplierID = products.SupplierID
GROUP BY suppliers.CompanyName
HAVING COUNT(products.ProductID) > 4;

-- 19. Escribir una consulta para recuperar el ID de pedido, ID de cliente y nombre de compañía. Realice esta consulta sin usar multitablas

-- La mia requiere de una subconsulta menos, pero es igual de correcta
Select OrderID, customerID, (Select CompanyName from customers where customers.CustomerID=orders.CustomerID) as CompanyName
from orders;

-- Solución de Juan Carlos, pero defiendo la mía
select OrderID, 
(select CustomerID from orders as pedidos where pedidos.OrderID = orders.OrderID) "Clientes", 
(select CompanyName from customers where orders.CustomerID = customers.CustomerID) "Compañias" from orders;


-- 20.Por cada producto, mostrar su nombre y la descripción de la categoría a la que pertenece.
Select products.ProductName, categories.Description
from products, categories
where products.CategoryID=categories.CategoryID;

-- 21.Por cada pedido, imprimir el id de pedido, nombre del producto y beneficio (precio unitario x unidades del pedido).
Select orderdetails.OrderID, products.ProductName, (orderdetails.UnitPrice*orderdetails.Quantity) as "Beneficio"
from orderdetails, products
where orderdetails.ProductID=products.ProductID;

-- 22.Mostrar los nombres de empleados y el numero de pedidos para aquellos empleados que tienen mas de tres pedidos atendidos en el 1996.
-- Mi solución es una de las propuestas correctas de Juan Carlos
Select employees.FirstName, count(orders.OrderID) as "NumeroPedidos"
from employees, orders
where employees.EmployeeID=orders.EmployeeID
and year(OrderDate) =1996
group by employees.FirstName
having count(orders.OrderID)>3;

-- Pero propone otra igual de correcta
select FirstName, (select count(*) from orders where orders.EmployeeID = employees.EmployeeID and year(orders.OrderDate) = 1996) as numPedidos 
from employees 
having numPedidos > 3;

-- 23.Escribir una consulta para recuperar todos los datos de los empleados que tienen una edad superior a la edad de Margaret Peacock.
Select employees.*
from employees
where timestampdiff(year, BirthDate, curdate()) >
(Select timestampdiff(year, BirthDate, curdate()) from employees where concat_ws(" ",FirstName, LastName) ='Margaret Peacock');


-- 24.Seleccionar cuantos proveedores tengo en cada país, 
-- considerando solo a los nombres de los proveedores que comienzan con la letra C hasta la letra M, además de mostrar solo los países donde tenga más de 3 proveedores. 

Select Country, count(*) as "NumeroProveedores"
from suppliers
where suppliers.CompanyName BETWEEN "C%" and "Mz%"
group by Country
having count(*)>3; -- ES UNA CONSULTA SIMPLE

-- la convierto en subconsulta por adaptarme a lo que estamos "repasando" aunque sin mucho sentido
Select Country, count(*) as "NumeroProveedores" 
from suppliers
where ContactName in
(sELECT ContactName from suppliers where CompanyName BETWEEN "C%" and "Mz%")
group by Country
having count(*)>3;


-- 25.Por cada compañía de envíos contar la cantidad de pedidos y mostrar sólo aquellos nombres de compañías de envío que tengan un número de pedidos por encima de la media de dichas compañías.

Select shippers.CompanyName, count(*) as pedidos 
from orders, shippers 
where orders.ShipVia = shippers.ShipperID 
group by ShipVia 
having pedidos > 
(select avg(pedidos) from (select count(*) as pedidos from orders group by ShipVia) as numPedidos);


