-- Selecciona el ID del cliente, el nombre de contacto del cliente, el nombre del producto, el ID del pedido, la cantidad de los detalles del pedido y su precio unitario.
-- Muestra únicamente aquellos pedidos cuyo total (cantidad * precio unitario) sea superior a 5000.
SELECT Customers.CustomerID, Customers.ContactName, Products.ProductName, Orders.OrderID, OrderDetails.Quantity, OrderDetails.UnitPrice
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID
JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
JOIN Products ON OrderDetails.ProductID = Products.ProductID
WHERE (OrderDetails.Quantity * OrderDetails.UnitPrice) > 5000;

SELECT Customers.CustomerID, Customers.ContactName, Products.ProductName, Orders.OrderID, OrderDetails.Quantity, OrderDetails.UnitPrice
FROM customers, orders, orderdetails, products
WHERE customers.CustomerID = orders.CustomerID
AND orders.OrderID = orderDetails.OrderID
AND orderDetails.ProductID = products.ProductID
AND (OrderDetails.Quantity * OrderDetails.UnitPrice) > 5000;


-- Selecciona el nombre y apellido del empleado (misma columna como "Nombre_Completo"), el nombre de contacto del cliente, el ID del pedido y la fecha del pedido. 
-- Los resultados se ordenan por el Nombre_completo del empleado y la fecha del pedido.

SELECT concat_ws(" ", employees.FirstName, Employees.LastName) as "Nombre_Completo", Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM Employees
JOIN Orders ON Employees.EmployeeID = Orders.EmployeeID
JOIN Customers ON Orders.CustomerID = Customers.CustomerID
ORDER BY Nombre_Completo, Orders.OrderDate;

SELECT concat_ws(" ", employees.FirstName, Employees.LastName) as "Nombre_Completo", Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM employees, orders, customers
WHERE employees.EmployeeID = orders.EmployeeID
AND orders.CustomerID = customers.CustomerID
ORDER BY Nombre_Completo, Orders.OrderDate;
