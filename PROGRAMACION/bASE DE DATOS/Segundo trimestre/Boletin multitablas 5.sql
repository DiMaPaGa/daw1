-- 11. Obtener todos los productos(codigo,nombre,precio,stock) de las ordenes hechas desde 1997 hasta la fecha de hoy.
SELECT products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock
FROM products, orderdetails, orders
WHERE products.ProductID = orderdetails.ProductID AND orderdetails.OrderID = orders.OrderID 
AND year(orders.OrderDate)>= 1997 and orders.OrderDate<=curdate(); 


-- 12. Obtener el nombre de todas las categorias y los nombres de sus productos,precio y stock.
SELECT categories.CategoryName, products.ProductName, products.UnitPrice, products.UnitsInStock
FROM categories, products 
WHERE categories.CategoryID = products.CategoryID;

-- 13. Obtener el nombre de todas las categorias y los nombres de sus productos,solo los productos que su nombre no comience con la letra P.
SELECT categories.CategoryName, products.ProductName 
FROM categories, products 
WHERE categories.CategoryID = products.CategoryID 
AND products.ProductName NOT LIKE 'P%';

-- 14. Calcular el stock de productos por cada categoria.Mostrar el nombre de la categoria y el stock por categoria.
SELECT categories.CategoryName, sum(products.UnitsInStock) AS "STOCK DE PRODUCTOS"
FROM categories, products
WHERE categories.CategoryID = products.CategoryID
GROUP BY categories.CategoryName; 

-- 15. Obtener el Nombre del cliente,Nombre del Proveedor,Nombre del empleado y el nombre de los productos que estan en la orden 10794.

SELECT customers.ContactName, suppliers.ContactName, employees.FirstName, products.ProductName
FROM customers, suppliers, employees, products, orders, orderdetails
WHERE customers.CustomerID= orders.CustomerID
AND suppliers.SupplierID = products.SupplierID
AND employees.EmployeeID = orders.EmployeeID
AND products.ProductID = orderdetails.ProductID
AND orders.OrderID =orderdetails.OrderID
AND orders.OrderID = 10794;


-- 16. Seleccionar el nombre de la compañía del cliente,él código de la orden de compra,la fecha de la orden de compra, código del producto, 
-- cantidad pedida del producto,nombre del producto, el nombre de la compañía proveedora y la ciudad del proveedor.
SELECT customers.CompanyName, orders.OrderID, orders.OrderDate, products.ProductID, products.UnitsOnOrder, products.ProductName, suppliers.CompanyName, suppliers.City
FROM customers
JOIN orders USING (CustomerID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID)
JOIN suppliers USING (SupplierID);



-- 17. Seleccionar el nombre de la compañía del cliente, nombre del contacto, el código de la orden de compra, la fecha de la orden de compra, 
-- el código del producto,cantidad pedida del producto, nombre del producto y el nombre de la compañía proveedora, usas JOIN.Solamente las 
-- compañías proveedoras que comienzan con la letra de la A hasta la letra G,además la cantidad pedida del producto debe estar entre 23 y 187.
SELECT customers.CompanyName, customers.ContactName, orders.OrderID, orders.OrderDate, products.ProductID, products.UnitsOnOrder, products.ProductName, suppliers.CompanyName
FROM customers
JOIN orders USING (CustomerID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID)
JOIN suppliers USING (SupplierID)
WHERE suppliers.CompanyName BETWEEN ("A%") AND ("Gz%")
AND products.UnitsOnOrder BETWEEN 23 AND 187;

-- 18. Seleccionar el nombre de la compañía del cliente, nombre del contacto, el código de la orden de compra, la fecha de la orden decompra, 
-- el código del producto, cantidad pedida del producto, nombredel producto y el nombre de la compañía proveedora, usar JOIN. Solamente las 
-- compañías proveedoras que comienzan con laletra de la A hasta la letra G,además la cantidad pedida del productodebe estar entre 23 y 187.
SELECT customers.CompanyName, customers.ContactName, orders.OrderID, orders.OrderDate, products.ProductID, products.UnitsOnOrder, products.ProductName, suppliers.CompanyName
FROM customers
JOIN orders USING (CustomerID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID)
JOIN suppliers USING (SupplierID)
WHERE suppliers.CompanyName BETWEEN ("A%") AND ("Gz%")
AND products.UnitsOnOrder BETWEEN 23 AND 187;

-- 19. Seleccionar el nombre de la compañía del cliente, el código de la orden de compra, la fecha de la orden de compra, código del producto, 
-- cantidad pedida del producto, nombre del producto, el nombre de la compañía proveedora y la ciudad del proveedor.
SELECT customers.CompanyName, orders.OrderID, orders.OrderDate, products.ProductID, products.UnitsOnOrder, products.ProductName, suppliers.CompanyName, suppliers.City
FROM customers, orders, products, suppliers, orderdetails
WHERE customers.CustomerID = orders.CustomerID
AND products.SupplierID = suppliers.SupplierID
AND orders.OrderID = orderdetails.OrderID
AND orderdetails.ProductID =products.ProductID;

-- 20. Seleccionar el nombre de la compañía del cliente, nombre del contacto, el código de la orden de compra, la fecha de la orden de compra, 
-- código del producto, cantidad pedida del producto, nombre del producto y el nombre de la compañía proveedora, usar Join. Solamente las 
-- compañías proveedoras que comienzan con la letra de la A hasta la letra G, además la cantidad pedida del producto debe estar entre 18 y 190.
SELECT customers.CompanyName, customers.ContactName, orders.OrderID, orders.OrderDate, products.ProductID, products.UnitsOnOrder, products.ProductName, suppliers.CompanyName
FROM customers
JOIN orders USING (CustomerID)
JOIN orderdetails USING (OrderID)
JOIN products USING (ProductID)
JOIN suppliers USING (SupplierID)
WHERE suppliers.CompanyName BETWEEN ("A%") AND ("Gz%")
AND products.UnitsOnOrder BETWEEN 18 AND 190;




