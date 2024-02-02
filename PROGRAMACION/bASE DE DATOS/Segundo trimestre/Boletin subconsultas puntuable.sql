-- 1. Mostrar los clientes de la tabla orders que realizaron pedidos en el día registrado más reciente.

SELECT CustomerID
FROM orders
WHERE date(OrderDate) = (Select date(OrderDate) FROM orders Order By OrderDate desc Limit 1);

SELECT CustomerID
FROM orders
WHERE OrderDate = (Select OrderDate FROM orders Order By OrderDate desc Limit 1);

-- SOLUCION DE CLASE
SELECT CustomerID
FROM orders
WHERE orderdate =
(select max(orderdate) FROM orders);


-- 2. Mostrar el nombre de las empresas que realizaron compras despues de la fecha '01/01/1995'.
SELECT CompanyName
FROM customers
Where CustomerID IN 
(SELECT CustomerID From orders Where OrderDate > '1995-01-01');   

-- 3. Mostrar el nombre y apellidos de los empleados que tienen como territorio 'New York'.

SELECT FirstName, LastName 
FROM employees 
WHERE EmployeeID IN
(SELECT EmployeeID From employeeterritories Where TerritoryID IN
(SELECT TerritoryID FROM territories WHERE TerritoryDescription ='New York'));

-- 4. Mostrar los clientes y sus pedidos que tengan un valor de peso (Freight) superior al promedio. LO ENTIENDO COMO EL IDENTIFICADOR DE CRIENTE Y
SELECT CustomerID, OrderID
FROM orders
WHERE Freight > 
(select AVG(Freight) from orders); 

-- 5. Mostrar los pedidos realizados por clientes de Alemania.

SELECT *
FROM orders
WHERE CustomerID IN
(SELECT CustomerID FROM customers Where Country ='Germany');

-- 6. Mostrar los clientes que han realizado pedidos de productos con un valor UnitsInStock inferior a 10.

SELECT DISTINCT CustomerID
FROM orders
Where OrderID in
(select OrderID From orderdetails Where ProductID in
(SELECT ProductID FROM products where UnitsInStock < 10));

-- 7. Mostrar los productos que han sido pedidos más de una vez.PRODUCTID Y NOMBRE DEL PRODUCTO
SELECT ProductID, ProductName
from products
Where ProductID in
(SELECT ProductID From orderdetails WHERE OrderID in 
(SELECT OrderID FROM orderdetails group by OrderID having count(*)>1));

SELECT ProductID, ProductName from products Where ProductID in
(SELECT ProductID From orderdetails group by ProductID having count(*)>1);

-- 8. Mostrar los pedidos que contienen productos que nunca han sido pedidos antes.
-- Entiendo que se refiere a aquellos pedidos que contienen algun artículo que solo se haya pedido en una ocasión.

SELECT OrderID
FROM orderdetails
WHERE ProductID IN 
(SELECT ProductID FROM orderdetails GROUP BY ProductID HAVING COUNT(*) = 1);


-- 9. Mostrar los clientes que han realizado pedidos de productos con existencia (UnitsInStock) inferior al promedio.

SELECT DISTINCT CustomerID
FROM orders
Where OrderID in
(select OrderID From orderdetails Where ProductID in
(SELECT ProductID FROM products where UnitsInStock < 
(SELECT AVG(UnitsInStock) From products)));

-- 10. Mostrar los productos con existencia inferior al promedio en su categoría.

SELECT *
FROM Products
WHERE UnitsInStock < 
(SELECT AVG(UnitsInStock) FROM Products AS a
WHERE products.CategoryID = a.CategoryID);

