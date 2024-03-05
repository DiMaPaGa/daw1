-- 1. Mostrar el nombre del producto, el precio, el stock y el nombre de la categoría a la que pertenece.
-- Producto cartesiano
SELECT products.ProductName, products.UnitPrice, products.UnitsInStock, categories.CategoryName 
FROM products, categories
WHERE products.CategoryID=categories.CategoryID; 

-- JOIN: Estoy probando con USING que hasta ahora únicamente había empleado ON, aunque compruebo que los resultados salen idénticos. Solo pondré ON en el caso de que el resultado sea distinto.
SELECT products.ProductName, products.UnitPrice, products.UnitsInStock, categories.CategoryName 
FROM products
JOIN categories USING (CategoryID); 

-- 2. Mostrar el nombre del producto, el precio producto, el código del proveedor y el nombre de la compañía proveedora.
-- Producto cartesiano
SELECT products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName 
FROM products, suppliers
WHERE products.SupplierID=suppliers.SupplierID; 

-- JOIN
SELECT products.ProductName, products.UnitPrice, suppliers.SupplierID, suppliers.CompanyName 
FROM products
JOIN suppliers USING (SupplierID); 

<<<<<<< HEAD
-- 3. Mostrar el número de la orden, fecha, código del producto, precio, código del empleado y su nombre completo (no ponerlo en una columna salvo que lo diga).
=======
-- 3. Mostrar el número de la orden, fecha, código del producto, precio, código del empleado y su nombre completo.
>>>>>>> 19a615eb5d122e992394614160647e7287014a8e
-- Producto cartesiano
SELECT orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID, concat_ws(" ", employees.Firstname, employees.LastName) as "Nombre empleado"
FROM orders, products, employees, orderdetails
WHERE orders.EmployeeID = employees.EmployeeID and products.ProductID = orderdetails.ProductID and orderdetails.OrderID = orders.OrderID;

-- JOIN
SELECT orders.OrderID, orders.OrderDate, products.ProductID, products.UnitPrice, employees.EmployeeID, concat_ws(" ", employees.Firstname, employees.LastName) as "Nombre empleado"
FROM orders
JOIN employees USING (EmployeeID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID); 

<<<<<<< HEAD
-- 4. Visualizar el nombre y el id de la compania del cliente,fecha,precio unitario y producto de la orden (él añadiría el OrderID).
=======
-- 4. Visualizar el nombre y el id de la compania del cliente,fecha,precio unitario y producto de la orden.
>>>>>>> 19a615eb5d122e992394614160647e7287014a8e
-- Producto cartesiano
SELECT customers.CompanyName, customers.CustomerID, orders.OrderDate, products.UnitPrice, products.ProductName 
FROM customers, orders, products, orderdetails
WHERE customers.CustomerID=orders.CustomerID AND orders.OrderID=orderdetails.OrderID AND orderdetails.ProductID =products.ProductID;

-- JOIN
SELECT customers.CompanyName, customers.CustomerID, orders.OrderDate, products.UnitPrice, products.ProductName 
FROM customers
JOIN orders USING (CustomerID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID);

-- 5. Visualizar el nombre de la categoria y el numero de productos que hay por cada categoria.
-- Producto cartesiano
SELECT categories.CategoryName, count(*) AS "Número de productos"
FROM categories, products
WHERE categories.CategoryID=products.CategoryID
GROUP BY categories.CategoryID;

-- JOIN
SELECT categories.CategoryName, count(*) AS "Número de productos"
FROM categories 
JOIN products USING (CategoryID)
GROUP BY categories.CategoryID;

-- 6. Seleccionar el nombre y la cantidad completa de los 5 productos mas vendidos.
-- Producto cartesiano: Lo he agrupado por ProductID por considerar lo comentado en clase de controlar que no se encuentren dos productos denominados igual. El ID es único.
SELECT products.ProductName, sum(orderdetails.Quantity) AS "Cantidad completa"
FROM products, orderdetails
WHERE products.ProductID=orderdetails.ProductID
GROUP BY products.ProductID -- Pero se podría por ProductName
ORDER BY sum(orderdetails.Quantity) DESC
LIMIT 5;

-- JOIN
SELECT products.ProductName, sum(orderdetails.Quantity) AS "Cantidad completa"
FROM products
JOIN orderdetails USING (ProductID)
GROUP BY products.ProductID
ORDER BY sum(orderdetails.Quantity) DESC
LIMIT 5;

-- 7. Obtener todas las ordenes hechas por el empleado King Robert.
-- Producto cartesiano
SELECT orders.* -- O si se interpreta OrderID, pues solo con OrderID
FROM orders, employees
WHERE orders.EmployeeID = employees.EmployeeID and concat_ws(" ", employees.LastName, employees.FirstName)= "King Robert";

-- JOIN
SELECT orders.*
FROM orders
JOIN employees USING (EmployeeID)
WHERE concat_ws(" ", employees.LastName, employees.FirstName)= "King Robert";

-- 8. Obtener todas las ordenes por el cliente cuya compania es "Que delicia".
-- Producto cartesiano= ¡Ojo! si se escribe "Que delicia" tal y como sale en el enunciado, el resultado real es 0, ya que al parecer hay un carácter especial en la primera i del nombre. 
SELECT orders.* -- u OrderID
FROM orders, customers
WHERE orders.CustomerID=customers.CustomerID and customers.CompanyName="Que Delicia";

-- Sin embargo, si queremos realmente averiguar cuántas órdenes hay por esta compañía considerando el caracter especial, la consulta daría 9 resultados
SELECT orders.*
FROM orders, customers
WHERE orders.CustomerID=customers.CustomerID and customers.CompanyName="Que Del?cia";

-- y con JOIN sería

SELECT orders.*
FROM orders
JOIN customers USING (CustomerID)
WHERE customers.CompanyName="Que Del?cia";

-- 9. Obtener todas las ordenes hechas por el empleado King Robert,Davolio Nancy y Fuller Andrew.
-- ¡OJO! A diferencia de las consultas anteriores, aquí entiendo que sí interesa incluir en la tabla el nombre de los empleados para que se pueda conocer al detalle quiénes de ellos realizaron cada orden.
-- Producto cartesiano
SELECT concat_ws(" ", employees.LastName, employees.FirstName) as "Nombre de empleado", orders.* 
FROM orders, employees
WHERE orders.EmployeeID = employees.EmployeeID and concat_ws(" ", employees.LastName, employees.FirstName) IN  ('King Robert', 'Davolio Nancy', 'Fuller Andrew');
-- solucion clase
SELECT orders.OrderID, employees.FirstName FROM orders, employees WHERE orders.EmployeeID = employees.EmployeeID 
AND ((employees.LastName = "King" and employees.FirstName = "Robert")
OR (employees.LastName = "Davolio" and employees.FirstName = "Nancy")
OR (employees.LastName = "Fuller" and employees.FirstName = "Andrew"));
-- JOIN
SELECT CONCAT_WS(" ", employees.LastName, employees.FirstName) AS "Nombre de empleado", orders.*
FROM orders
JOIN employees USING (EmployeeID)
WHERE employees.LastName IN ('King', 'Davolio', 'Fuller') AND employees.FirstName IN ('Robert', 'Nancy', 'Andrew'); -- Aquí incluyo otra forma de hacer la misma criba sin emplear concat, por si resulta más clara.

-- 10. Obtener todos los productos(codigo,nombre,precio,stock) de la orden 10257.
-- Producto cartesiano -- mirar en casa de nuevo que al parecer solo se necesitan dos tablas

SELECT products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock
FROM products, orderdetails
WHERE products.ProductID = orderdetails.ProductID 
AND orderdetails.OrderID=10257;
-- JOIN
SELECT products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock
FROM products
JOIN orderdetails USING (ProductID) 
WHERE orderdetails.OrderID=10257;