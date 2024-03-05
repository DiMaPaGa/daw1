-- 1. selecciona los clientes que han realizado pedidos enviados por la compañia 'United Package'
SELECT * from customers where CustomerID in
(Select CustomerID from orders where ShipVia =
(Select ShipperID from shippers where CompanyName='United Package'));

-- 2. Visualizar el nombre de la compañía y el id del cliente, fecha, precio unitario y producto del pedido.

Select customers.CompanyName, customers.CustomerID, orders.OrderDate, orderdetails.UnitPrice, orderdetails.ProductID
from customers, orders, orderdetails
where customers.CustomerID = orders.CustomerID and
orders.OrderID= orderdetails.OrderID;

-- 3. Muestra los empleados que tienen el mismo jefe que Michael Suyama sin mostrar a Michael

Select * from employees where ReportsTo =
(select ReportsTo from employees where FirstName='Michael' and LastName='Suyama')
and FirstName!='Michael' and LastName!='Suyama' and ReportsTo is not null;


-- 4. Por cada empleado, imprimir el ID de empleado, nombre, apellido e ID de territorio.
Select employees.EmployeeID, employees.FirstName, employees.LastName, employeeterritories.TerritoryID
from employees, employeeterritories
where employees.EmployeeID = employeeterritories.EmployeeID;



-- 5. Mostrar los clientes que fueron  atendidos  por  el  mismo  transportista  que  atendió  al cliente de código ‘ANTON’ en el año 1998
Select * from customers where CustomerID in
(Select CustomerID from orders where Shipvia =
(Select ShipVia from orders where CustomerID='ANTON' and year(OrderDate)=1998));

-- 6. Por cada pedido, obtener el ID de pedido, ID de producto, ID de proveedor y el nombre de la compañía, en este orden.

Select orders.OrderID, products.ProductID, products.SupplierID, customers.CompanyName
from orders, orderdetails, products, customers
where orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and customers.CustomerID = orders.CustomerID;


-- 7. Mostrar las 3 categorias que tienen mas productos.

Select CategoryName from categories where CategoryID in
(Select CategoryID from products group by CategoryID order by count(*) desc) limit 3; -- sí, pero no ordenada

SELECT CategoryName FROM categories WHERE CategoryID IN 
(SELECT CategoryID FROM (SELECT CategoryID, COUNT(*) AS TotalProductos FROM products GROUP BY CategoryID ORDER BY COUNT(*) DESC LIMIT 3) AS categorias_altas); -- en el orden correcto

-- 8. Mostrar la información de todos los jefes y los productos que han vendido.

Select Distinct employees.*, products.*
from employees, orders, orderdetails, products
where employees.EmployeeID = orders.EmployeeID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and employees.EmployeeID IN
(Select ReportsTo from employees o where employees.EmployeeID = o.ReportsTo);

Select Distinct employees.*, products.*
from employees, orders, orderdetails, products
where employees.EmployeeID = orders.EmployeeID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID = products.ProductID
and employees.EmployeeID IN
(Select ReportsTo from employees o group by ReportsTo);

-- 9. Por cada empleado, imprimir toda su información, el nombre y apellidos de su jefe concatenados, y los pedidos que ha realizado el empleado. Mostrar en ese orden.
Select employees.*, concat_ws(" ", jefe.FirstName, jefe.LastName) as 'Jefe', orders.OrderID
from employees, orders, employees as jefe
where employees.EmployeeID = orders.EmployeeID
and employees.ReportsTo= jefe.EmployeeID; -- sin pillar a los jefes, sería así

Select employees.*, (select concat_ws(" ", jefe.FirstName, jefe.LastName) from employees as jefe where employees.ReportsTo=jefe.EmployeeID) as Jefe , orders.OrderID
from employees, orders
where employees.EmployeeID = orders.EmployeeID; -- pillando al jefe y mostrando su columna vacia.


-- 10. Repetir el anterior, pero en lugar de mostrar todos los pedidos, contarlos.
Select Distinct employees.*, (select concat_ws(" ", jefe.FirstName, jefe.LastName) from employees as jefe where employees.ReportsTo=jefe.EmployeeID) as Jefe , (Select count(*) from orders where orders.EmployeeID= employees.EmployeeID)
from employees, orders
where employees.EmployeeID = orders.EmployeeID;

-- 11. Obtén los nombres de contacto de los clientes que han realizado pedidos atendidos por empleados de Seattle
Select customers.ContactName
from customers
where CustomerID in 
(Select CustomerID from orders where employeeID in
(Select EmployeeID from employees where City ='Seattle'));

-- 12. Por cada jefe, contar el número de empleados.
Select concat_ws(" ", FirstName, LastName) as 'Jefe', (Select count(*) from employees as e where e.reportsTo=employees.EmployeeID) as "num_empleados"
from employees
where (Select count(*) from employees as e where e.reportsTo=employees.EmployeeID)>0;


-- 13. Mostrar los productos con el precio más alto de cada vendedor
Select employees.EmployeeID, 
(Select products.ProductName from products, orders, orderdetails where products.ProductID= orderdetails.ProductID and orderdetails.OrderID=orders.OrderID and orders.EmployeeID= employees.EmployeeID order by products.UnitPrice desc limit 1) as 'precioMasAlto'
from employees;



-- 14. Por cada cliente, pedido realizado y empleado asociado, muestre los distintos productos (id de producto).
Select customers.CustomerID, orders.OrderID, employees.EmployeeID, products.ProductID
from customers, orders, orderdetails, employees, products
where customers.CustomerID= orders.CustomerID
and orders.OrderID = orderdetails.OrderID
and orderdetails.ProductID= products.ProductID
and employees.EmployeeID= orders.EmployeeID;

-- 15. Muestra el nombre y el apellido de los empleados que fueron contratados el mismo mes que la fecha en la que se pidio el pedido más antiguo
Select FirstName, LastName
from employees 
where month(HireDate) in
(Select month(Min(OrderDate)) from orders);


-- 16. Obtener el nombre y la cantidad de productos de la categoría "Confections" que tienen un precio inferior al precio promedio de todos los productos de las categorias 4 y 5 
Select products.ProductName, count(*)
from products
where products.CategoryID =
(Select CategoryID from categories where CategoryName='Confections')
and products.UnitPrice <
(Select avg(UnitPrice) from products where products.CategoryID between 4 and 5)
group by ProductName;

Select products.ProductName, count(*)
from products
where products.CategoryID =
(Select CategoryID from categories where CategoryName='Confections')
and products.UnitPrice <
(Select avg(UnitPrice) from products where products.CategoryID in (4,5))
group by ProductName;

-- 17. Mostrar las ciudades que tienen más clientes que Bélgica

Select City
from customers
group by city
having count(*) >
(Select count(*) from customers where Country ='Belgium');

-- 18. Mostrar el nombre de compañia de los proveedores y el número de productos para los proveedores con mas de cuatro productos.

SELECT suppliers.CompanyName, COUNT(products.ProductID) AS NumeroProductos
FROM suppliers, products
WHERE suppliers.SupplierID = products.SupplierID
GROUP BY suppliers.CompanyName
HAVING COUNT(products.ProductID) > 4;

-- 19. Escribir una consulta para recuperar el ID de pedido, ID de cliente y nombre de compañía. Realice esta consulta sin usar multitablas
Select OrderID, customerID, (Select CompanyName from customers where customers.CustomerID=orders.CustomerID) as CompanyName
from orders;


-- 20.Por cada producto, mostrar su nombre y la descripción de la categoría a la que pertenece.
Select products.ProductName, categories.Description
from products, categories
where products.CategoryID=categories.CategoryID;

-- 21.Por cada pedido, imprimir el id de pedido, nombre del producto y beneficio (precio unitario x unidades del pedido).
Select orderdetails.OrderID, products.ProductName, (orderdetails.UnitPrice*orderdetails.Quantity) as "Beneficio"
from orderdetails, products
where orderdetails.ProductID=products.ProductID;

-- 22.Mostrar los nombres de empleados y el numero de pedidos para aquellos empleados que tienen mas de tres pedidos atendidos en el 1996.
Select employees.FirstName, count(orders.OrderID) as "NumeroPedidos"
from employees, orders
where employees.EmployeeID=orders.EmployeeID
and year(OrderDate) =1996
group by employees.FirstName
having count(orders.OrderID)>3;

-- 23.Escribir una consulta para recuperar todos los datos de los empleados que tienen una edad superior a la edad de Margaret Peacock.
Select employees.*
from employees
where timestampdiff(year, BirthDate, curdate()) >
(Select timestampdiff(year, BirthDate, curdate()) from employees where concat_ws(" ",FirstName, LastName) ='Margaret Peacock');


-- 24.Seleccionar cuantos proveedores tengo en cada país, 
-- considerando solo a los nombres de los proveedores que comienzan con la letra C hasta la letra M, además de mostrar solo los países donde tenga más de 3 proveedores. 

Select Country, count(*) as "NumeroProveedores"
from suppliers
where CompanyName BETWEEN "C%" and "Mz%"
group by Country
having count(*)>3; -- ES UNA CONSULTA SIMPLE

-- la convierto en subconsulta por adaptarme a lo que estamos "repasando" aunque sin mucho sentido
Select Country, count(*) as "NumeroProveedores" 
from suppliers
where CompanyName in
(sELECT CompanyName from suppliers where CompanyName BETWEEN "C%" and "Mz%")
group by Country
having count(*)>3;


-- 25.Por cada compañía de envíos contar la cantidad de pedidos y mostrar sólo aquellos nombres de compañías de envío que tengan un número de pedidos por encima de la media de dichas compañías.
Select orders.ShipName, count(orders.OrderID) as "Número de pedidos"
from orders
group by orders.ShipName 
having count(orders.OrderID) >
(Select avg(pedidos) from (Select count(orders.OrderID) as pedidos from orders group by ShipName) as tabla);