-- 21. Mostrar el nombre del producto, el precio producto, el código del proveedor y el nombre de la compañía proveedora.
SELECT products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName 
FROM products, suppliers Where products.SupplierID = suppliers.SupplierID;

SELECT products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName 
FROM products
JOIN suppliers ON products.SupplierID = suppliers.SupplierID;

-- 22. Mostrar el id del pedido, fecha, código del producto, precio, código del empleado y su nombre completo.
SELECT orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID, concat_ws(" ", employees.FirstName, employees.LastName) as "Nombre empleado" 
FROM orders, orderdetails, products, employees 
Where orders.EmployeeID = employees.EmployeeID and products.ProductID = orderdetails.ProductID and orders.OrderID = orderdetails.OrderID;

SELECT orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID, CONCAT_WS(" ", employees.FirstName, employees.LastName) AS "Nombre empleado"
FROM orders
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
JOIN products ON products.ProductID = orderdetails.ProductID
JOIN employees ON orders.EmployeeID = employees.EmployeeID;

-- correccion clase
SELECT orders.OrderID,OrderDate,orderdetails.ProductID,orderdetails.UnitPrice,employees.EmployeeID,concat(employees.firstName," ",employees.lastname) "NOMBRE DEL EMPLEADO" FROM northwind.orders,employees,orderdetails where orders.EmployeeID=employees.EmployeeID and orders.OrderID=orderdetails.OrderID;
select ProductID, OrderDate, orders.OrderID, UnitPrice, employees.EmployeeID, FirstName
from orders 
join orderdetails on (orderdetails.OrderID = orders.OrderID)
join employees on (orders.EmployeeID = employees.EmployeeID);


-- 23. Calcular el stock de productos por cada categoria. Mostrar el nombre de la categoria y el stock por categoria.
SELECT categories.CategoryName, sum(products.UnitsInStock) as "Stock por categoría" 
FROM categories, products 
Where categories.CategoryID = products.CategoryID GROUP BY categories.CategoryID; 

SELECT categories.CategoryName, sum(products.UnitsInStock) as "Stock por categoría" 
FROM categories
JOIN products ON categories.CategoryID = products.CategoryID 
GROUP BY categories.CategoryID; 
-- Podria agrupar el anterior por CategoryName, como ya lo tenía, pero CategoryID me aseguro de que no se van a repetir porque en categoryName 
-- 24. Obtener el nombre del cliente, nombre del proveedor, nombre del empleado y el nombre de los productos que estan en el pedido 10794.
SELECT customers.ContactName, suppliers.ContactName, employees.FirstName, products.ProductName 
FROM customers, suppliers, employees, products, orders, orderdetails 
where customers.CustomerID = orders.CustomerID 
and orders.EmployeeID = employees.EmployeeID 
and suppliers.SupplierID = products.SupplierID 
and products.ProductID = orderdetails.ProductID 
and orderdetails.OrderID = orders.OrderID 
and orders.OrderID = 10794;

SELECT customers.ContactName, suppliers.ContactName, employees.FirstName, products.ProductName 
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
JOIN employees ON orders.EmployeeID = employees.EmployeeID 
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
JOIN products ON orderdetails.ProductID = products.ProductID
JOIN suppliers ON products.SupplierID = suppliers.SupplierID 
Where orders.OrderID = 10794;

-- 25. Seleccionar el nombre de la compañía del cliente, el código de la orden de compra, la fecha de la orden de compra, código del producto, cantidad pedida del producto, nombre del producto, el nombre de la compañía proveedora y la ciudad del proveedor, usar Join.
SELECT customers.CompanyName, orders.OrderID, orders.OrderDate, products.ProductID, orderdetails.Quantity, products.ProductName, suppliers.CompanyName, suppliers.City
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
JOIN products ON orderdetails.ProductID = products.ProductID
JOIN suppliers ON products.SupplierID = suppliers.SupplierID;

SELECT customers.CompanyName, orders.OrderID, orders.OrderDate, products.ProductID, orderdetails.Quantity, products.ProductName, suppliers.CompanyName, suppliers.City
FROM customers, orders, orderdetails, products, suppliers 
where customers.CustomerID = orders.CustomerID and orders.OrderID = orderdetails.OrderID and orderdetails.ProductID = products.ProductID and products.SupplierID = suppliers.SupplierID;

-- 26. Seleccionar cuantos proveedores tengo en cada país, considerando solo a los nombres de los proveedores que comienzan con la letra E hasta la letra P, además de mostrar solo los países donde tenga más de 2 proveedores.

SELECT Country, COUNT(*) AS "Número de proveedores"
FROM suppliers
WHERE ContactName BETWEEN "E%" AND "Pz%"
GROUP BY Country
HAVING COUNT(*) > 2;


-- 27. Crear una consulta que muestre el nombre de empleado y el número de empleados que cada uno de los empleados tiene a su cargo, pero solo para aquellos empleados que tienen gente a su cargo.
SELECT e.FirstName, COUNT(sub.EmployeeID) AS "Número de subordinados"
FROM employees AS e
LEFT JOIN employees AS sub ON e.EmployeeID = sub.ReportsTo
GROUP BY e.FirstName
HAVING COUNT(sub.EmployeeID) > 0;

SELECT e.FirstName, COUNT(sub.EmployeeID) AS "Número de subordinados"
FROM employees AS e, employees AS sub
WHERE e.EmployeeID = sub.ReportsTo
GROUP BY e.FirstName
HAVING COUNT(sub.EmployeeID) > 0;

-- 28. Crear una consulta que muestre el nombre de empleado, el número de pedidos tramitado por cada empleado, de aquellos empleados que han tramitado mas de 15 pedidos.
SELECT employees.FirstName, COUNT(*) AS "NÚMERO DE PEDIDOS"
FROM employees
JOIN orders ON employees.EmployeeID = orders.EmployeeID
GROUP BY employees.FirstName 
HAVING COUNT(*) > 15;
-- mejor agrupar por employeeID
SELECT employees.FirstName, COUNT(orders.OrderID) AS "NÚMERO DE PEDIDOS"
FROM employees, orders
WHERE employees.EmployeeID = orders.EmployeeID
GROUP BY employees.FirstName HAVING COUNT(orders.OrderID) > 15;


-- 29. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el cliente, el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han realizado mas de 5 pedidos.
SELECT customers.CompanyName, COUNT(orders.OrderID) AS "NÚMERO DE PEDIDOS", sum(orderdetails.UnitPrice * orderdetails.Quantity) as "DINERO GASTADO"
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
WHERE customers.Country = 'USA'
GROUP BY customers.CompanyName
HAVING COUNT(orders.OrderID) > 5;

SELECT customers.CompanyName, COUNT(*) AS "NÚMERO DE PEDIDOS", sum(orderdetails.UnitPrice * orderdetails.Quantity) as "DINERO GASTADO"
FROM customers, orders, orderdetails
WHERE customers.CustomerID = orders.CustomerID AND orders.OrderID = orderdetails.OrderID
AND customers.Country = 'USA'
GROUP BY customers.CompanyName
HAVING COUNT(*) > 5;

-- 30. Crear una consulta que muestre el nombre del jefe y el número de empleados a su cargo de aquel jefe que mas empleados tenga a su cargo.

SELECT e1.FirstName AS Jefe, COUNT(*) AS "NUM DE SUBORDINADOS"
FROM employees e1
LEFT JOIN employees e2 ON e1.EmployeeID = e2.ReportsTo
GROUP BY e1.FirstName
ORDER BY COUNT(*) DESC
LIMIT 1;

SELECT e1.FirstName AS Jefe, COUNT(*) AS "NUM DE SUBORDINADOS"
FROM employees e1, employees e2 
WHERE e1.EmployeeID = e2.ReportsTo
GROUP BY e1.FirstName
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 31. Obtener el nombre del cliente y el número de pedidos del cliente que mas pedidos ha realizado en la empresa.
SELECT customers.ContactName, COUNT(*) as "Número de pedidos"
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
GROUP BY customers.ContactName
ORDER BY COUNT(*) DESC
LIMIT 1;

SELECT customers.ContactName, COUNT(*) as "Número de pedidos"
FROM customers, orders
WHERE customers.CustomerID = orders.CustomerID
GROUP BY customers.ContactName
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 32. Obtener el nombre del cliente y el volumen de negocio del cliente que mas volumen de negocio nos ha dejado en la empresa.
SELECT customers.ContactName, COUNT(*) AS NumeroPedidos, sum(orderdetails.UnitPrice * orderdetails.Quantity) as DineroGastado
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
GROUP BY customers.ContactName
ORDER BY DineroGastado DESC
LIMIT 1;

SELECT customers.CompanyName, COUNT(*) AS NumeroPedidos, sum(orderdetails.UnitPrice * orderdetails.Quantity) as DineroGastado
FROM customers, orders, orderdetails
WHERE customers.CustomerID = orders.CustomerID and orders.OrderID = orderdetails.OrderID
GROUP BY customers.CompanyName
ORDER BY DineroGastado DESC
LIMIT 1;
