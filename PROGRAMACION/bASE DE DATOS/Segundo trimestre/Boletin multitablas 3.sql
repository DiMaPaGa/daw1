-- 21. Mostrar el nombre del producto, el precio producto, el código del proveedor y el nombre de la compañía proveedora.
SELECT products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName FROM products, suppliers Where products.SupplierID = suppliers.SupplierID;
-- 22. Mostrar el id del pedido, fecha, código del producto, precio, código del empleado y su nombre completo.
SELECT orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID, employees.FirstName, employees.LastName FROM orders, orderdetails, products, employees Where orders.EmployeeID = employees.EmployeeID and products.ProductID = orderdetails.ProductID and orders.OrderID = orderdetails.OrderID;
-- 23. Calcular el stock de productos por cada categoria. Mostrar el nombre de la categoria y el stock por categoria.
SELECT categories.CategoryName, sum(products.UnitsInStock) as "Stock por categoría" FROM categories, products Where categories.CategoryID = products. CategoryID GROUP BY categories.CategoryName; 
-- 24. Obtener el nombre del cliente, nombre del proveedor, nombre del empleado y el nombre de los productos que estan en el pedido 10794.
SELECT customers.ContactName, suppliers.ContactName, concat(employees.FirstName, employees.LastName) AS "NOMBRE COMPLETO EMPLEADO", products.ProductName FROM customers, suppliers, employees, products, orders, orderdetails where customers.CustomerID = orders.CustomerID and orders.EmployeeID = employees.EmployeeID and suppliers.SupplierID = products.SupplierID and products.ProductID = orderdetails.ProductID and orderdetails.OrderID = orders.OrderID and orders.OrderID = 10794;
-- 25. Seleccionar el nombre de la compañía del cliente, el código de la orden de compra, la fecha de la orden de compra, código del producto, cantidad pedida del producto, nombre del producto, el nombre de la compañía proveedora y la ciudad del proveedor, usar Join.
SELECT customers.CompanyName, orders.OrderID, orders.OrderDate, products.ProductID, orderdetails.Quantity, products.ProductName, suppliers.CompanyName, suppliers.City
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
JOIN orderdetails ON orders.OrderID = orderdetails.OrderID
JOIN products ON orderdetails.ProductID = products.ProductID
JOIN suppliers ON products.SupplierID = suppliers.SupplierID;

-- 26. Seleccionar cuantos proveedores tengo en cada país, considerando solo a los nombres de los proveedores que comienzan con la letra E hasta la letra P, además de mostrar solo los países donde tenga más de 2 proveedores.
SELECT suppliers.Country, COUNT(*) AS NumOfSuppliers
FROM suppliers
WHERE suppliers.SupplierName BETWEEN 'E' AND 'P'
GROUP BY suppliers.Country
HAVING COUNT(*) > 2;
-- 27. Crear una consulta que muestre el nombre de empleado y el número de empleados que cada uno de los empleados tiene a su cargo, pero solo para aquellos empleados que tienen gente a su cargo.
SELECT e.EmployeeID, e.FirstName, e.LastName, COUNT(sub.EmployeeID) AS NumOfSubordinates
FROM employees e
LEFT JOIN employees sub ON e.EmployeeID = sub.ReportsTo
GROUP BY e.EmployeeID, e.FirstName, e.LastName
HAVING COUNT(sub.EmployeeID) > 0;
-- 28. Crear una consulta que muestre el nombre de empleado, el número de pedidos tramitado por cada empleado, de aquellos empleados que han tramitado mas de 15 pedidos.
SELECT employees.EmployeeID, employees.FirstName, employees.LastName, COUNT(orders.OrderID)
FROM employees
JOIN orders ON employees.EmployeeID = orders.EmployeeID
GROUP BY employees.EmployeeID, employees.FirstName, employees.LastName
HAVING COUNT(orders.OrderID) > 15;
-- 29. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el cliente, el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han realizado mas de 5 pedidos.
SELECT customers.CompanyName, COUNT(orders.OrderID) AS NumOfOrders, SUM(orders.TotalAmount) AS TotalAmount
FROM customers
JOIN orders ON customers.CustomerID = orders.CustomerID
WHERE customers.Country = 'USA'
GROUP BY customers.CompanyName
HAVING COUNT(orders.OrderID) > 5;
-- 30. Crear una consulta que muestre el nombre del jefe y el número de empleados a su cargo de aquel jefe que mas empleados tenga a su cargo.
SELECT e1.FirstName AS Jefe, COUNT(e2.EmployeeID) AS NumOfSubordinates
FROM employees e1
LEFT JOIN employees e2 ON e1.EmployeeID = e2.ReportsTo
GROUP BY e1.EmployeeID, e1.FirstName
ORDER BY NumOfSubordinates DESC
LIMIT 1;
-- 31. Obtener el nombre del cliente y el número de pedidos del cliente que mas pedidos ha realizado en la empresa.
SELECT c.ContactName AS NombreCliente, COUNT(o.OrderID) AS NumOfOrders
FROM customers c
JOIN orders o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID, c.ContactName
ORDER BY NumOfOrders DESC
LIMIT 1;
-- 32. Obtener el nombre del cliente y el volumen de negocio del cliente que mas volumen de negocio nos ha dejado en la empresa.
SELECT c.ContactName AS NombreCliente, COUNT(o.OrderID) AS NumOfOrders, SUM(o.TotalAmount) AS VolumenNegocio
FROM customers c
JOIN orders o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID, c.ContactName
ORDER BY VolumenNegocio DESC
LIMIT 1;
