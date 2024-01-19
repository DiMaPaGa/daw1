-- 1.Obtener el nombre de todas las categorias y los nombres de sus productos, precio, y stock cuyo nombre empiece con la letra 'J'
SELECT categories.CategoryName, products.ProductName, products.UnitPrice, products.UnitsInStock
FROM categories, products
WHERE categories.CategoryID=products.CategoryID
AND products.ProductName LIKE "J%";

-- 2.Muestra el nombre, la edad de los empleados,el nombre de producto,su precio y stock de las ordenes mayores de 10250
SELECT employees.FirstName, timestampdiff(year,employees.BirthDate, curdate()) as "Edad_empleados", products.ProductName, products.UnitPrice, products.UnitsInStock
FROM employees, products, orders, orderdetails
WHERE employees.EmployeeID = orders.EmployeeID
AND orders.OrderID = orderdetails.OrderID
AND orderdetails.ProductID = products.ProductID
AND orders.OrderID > 10250;

-- 3.Seleccionar cuantos proveedores hay en cada pais, considerando solo a los nombres de los proveedores que comienzan con la letra 'E' hasta la 'P'
SELECT suppliers.Country, count(*) as "Numero de proveedores"
FROM suppliers
WHERE suppliers.CompanyName between 'E%' and 'Pz%'
GROUP BY Country;

-- 4.Selecciona el codigo de producto, el nombre del producto, el nombre de categoria del pedido 10654
SELECT products.ProductID, products.ProductName, categories.CategoryName
FROM products, categories, orders, orderdetails
WHERE products.CategoryID = categories.CategoryID
AND orders.OrderID= orderdetails.OrderID
AND orderdetails.ProductID = products.ProductID
AND orders.OrderID= 10654;

-- 5.Obtener el ID del pedido, la fecha del pedido, el ID del cliente, el nombre de la compañía del cliente, el ID del productoy la cantidad
SELECT orders.OrderID, orders.OrderDate, customers.CustomerID, customers.CompanyName, products.ProductID, orderdetails.Quantity
FROM orders, customers, products, orderdetails
WHERE orders.CustomerID= customers.CustomerID
AND products.ProductID=orderdetails.ProductID
AND orders.OrderID=orderdetails.OrderID;

-- 6.Listar las ordenes de pedido,clientes, la cuantia por unidad y los articulos de aquellos pedidos realizados por clientes brasileños y selecciona de aquellos los productos que la cuantia por unidad se mida en 'ml'
SELECT orders.OrderID, customers.CustomerID, products.QuantityPerUnit, products.ProductName
FROM orders, customers, products, orderdetails
WHERE orders.CustomerID = customers.CustomerID
AND orders.OrderID=orderdetails.OrderID
AND orderdetails.ProductID = products.ProductID
AND customers.Country="Brazil" and products.QuantityPerUnit like "%ml%";

-- 7.Dime cuantos pedidos Ha Hecho cada empleado, muestarme el nombre de cliente, la ID de categoria, el nombre y ciudad del provedor asi como el titulo del empleado
SELECT count(*), employees.EmployeeID, customers.ContactName, categories.CategoryID, suppliers.ContactName, suppliers.City, employees.Title
FROM employees, customers, categories, suppliers, orders
WHERE employees.EmployeeID = orders.EmployeeID
AND customers.CustomerID= orders.OrderID
AND categories.CategoryID= products.CategoryID



-- 8.Por cada cliente muestra el ID de cliente, el nombre de contacto y los pedidos que han realizado.


-- 9.Muestrame el id del order,la fecha requerida,la via,la discontinuidad,el reorderlevel,la quantity y la quantity por unidad.Usa join y las tablas: orders,orderdetails y products.


-- 10.Listar las ordenes de pedido,clientes, fecha de pedido y los articulos de aquellos pedidos realizados por clientes brasileños en el mes de septiembre de cualquier año


-- 11.Selecciona el ID del cliente, el nombre de contacto del cliente, el nombre del producto, el ID del pedido, la cantidad de los detalles del pedido y su precio unitario
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

-- 12.Obtener el ID del empleado, el nombre y apellido del empleado en una sola columna, el ID del pedido, la fecha del pedido, el ID del cliente,el nombre de la compañía del cliente de las órdenes hechas en 1996 en Estados Unidos


-- 13.Mostrar la descripcion de territorio, el codigo de territorio y el nombre completo + su codigo de empleado (en una sola columna separado con espacio ' ')
-- del empleado con nombre 'Nancy'.


-- 14.Selecciona el nombre y apellido del empleado (misma columna como "Nombre_Completo"), el nombre de contacto del cliente, el ID del pedido y la fecha del pedido
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


-- 15.Selecciona el codigo de empleado, la cantidad de productos y la fecha de venta de cada pedido ordenado de más reciente a más antiguo


-- 16.Mostrar el nombre de categoria, su longitud en caracteres, el nombre de producto, su longitud de caracteres y el precio unitario de estos (Redondeado abajo)
-- de los productos cuya categoria tenga mas de 12 caracteres .Muestra solo los productos cuyo nombre de producto empiecen por 'F' y NO ACABEN en 'x'


-- 17.Muestrame el id del customer,la fecha, el precio, el id del producto,el quantity,el id de la categoria,las unidades en orden. Usa join


-- 18.Muestra el nombre de empleado, y los pedidos que han realiazado aquellos empleados que han realizado mas de 9 pedidos