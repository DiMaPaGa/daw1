-- Dos métodos : Por producto cartesiano o por JOIN
-- POR PRODUCTO CARTESIANO
-- SELECT* FROM EMPLEADOS, ESTUDIOS; rESULTADO, LAS DOS TABLAS CONCATENANDO TODOS LOS RESULTADOS
-- ¿Cuantas filas tendrá el producto cartesiano de las tablas Region y Territories?
SELECT * FROM region, territories; -- 212 FILAS Y 5 COLUMNAS REGION 4 Y TERRITORIES 53, POR CADA FILA DE UNA TABLA TE SALEN TODAS LAS OTRAS comparaciones
-- ¿Cuantas filas tendrá el producto cartesiano de las tablas Customers, Employees y Orders?
SELECT * FROM customers, employees, orders;-- 679770 Y 43 COLUMNAS
-- ¿Cuantas filas tendrá el producto cartesiano de las tablas Categories, Products, Shippers y Suppliers?
SELECT * FROM categories, products, shippers, suppliers;-- 53592 Y 29 COLUMNAS
SELECT * FROM orders, employees where orders.EmployeeID = employees.EmployeeID; -- pasan de 7470 filas a 830, no se repiten datos.
SELECT employees.EmployeeID FROM orders, employees where orders.EmployeeID = employees.EmployeeID; -- iNDICAR EL DATO DE QUE TABLA LO QUEREMOS
SELECT OrderID, LastName, FirstName FROM orders, employees where orders.EmployeeID= employees.EmployeeID;-- Como OrderID sólo está en una tabla, no se especifica. Pero el profesor recomienda siempre ponerlo.
-- EJERCICIO 1: realizar una consulta donde obtengamos el ID de los pedidos asociados a la empleada Nancy Davolio.
SELECT OrderID FROM orders, employees where orders.EmployeeID = employees.EmployeeID and FirstName= "Nancy" and LastName= "Davolio"; -- podemos comprobarlo con select OrderID from orders where EmployeeID =1;

-- EJERCICIO 2: recuperar todos los campos de la tabla Orders, imprimiendo además la compañía del cliente.
SELECT orders.*, customers.CompanyName FROM orders, customers where orders.CustomerID = customers.CustomerID; -- resultado da 830

-- EJERCICIO 3: por cada producto, mostrar el nombre del producto y el nombre de la compañía que lo provee.
SELECT p.ProductName, s.CompanyName  FROM products as p, suppliers as s where p.SupplierID = s.SupplierID; -- da 77. Buscar siempre el nombre de columna igual o en su defecto datos llamados "diferentes" que se refieran a lo mismo. Si se renombran las columnas, cambiar también al inicio y al final.

SELECT OrderID, LastName, FirstName FROM orders, employees 
WHERE orders.EmployeeID = employees.EmployeeID;

-- JOIN

SELECT OrderId, LastName, FirstName FROM orders JOIN employees ON (orders.EmployeeID = employees.EmployeeID);
SELECT OrderID, LastName, FirstName FROM orders JOIN employees using (EmployeeID); -- FORMA MÁS SENCILLA AL USAR USING, SOLO PONGO EL NOMBRE DE LA COLUMNA QUE SE LLAMA IGUAL.