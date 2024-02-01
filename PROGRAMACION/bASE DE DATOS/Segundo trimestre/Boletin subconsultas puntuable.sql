-- 1. Mostrar los clientes de la tabla orders que realizaron pedidos en el día registrado más reciente.

SELECT CustomerID
FROM orders
WHERE OrderDate = (Select OrderDate FROM orders Order By OrderDate desc Limit 1);

-- 2. Mostrar el nombre de las empresas que realizaron compras despues de la fecha '01/01/1995'.
SELECT CompanyName
FROM customers
Where CustomerID = 
(SELECT CustomerID From orders Where OrderDate > '1995-01-01 00:00:00');   

-- 3. Mostrar el nombre y apellidos de los empleados que tienen como territorio 'New York'.

SELECT FirstName, LastName FROM employees 
WHERE employees.EmployeeID =
(SELECT employeeterritories.EmployeeID From employeeterritories Where TerritoryID =
(SELECT TerritoryID FROM territories WHERE TerritoryDescription ='New York');


-- 4. Mostrar los clientes y sus pedidos que tengan un valor de peso (Freight) superior al promedio.

-- 5. Mostrar los pedidos realizados por clientes de Alemania.

-- 6. Mostrar los clientes que han realizado pedidos de productos con un valor UnitsInStock inferior a 10.

-- 7. Mostrar los productos que han sido pedidos más de una vez.PRODUCTID Y NOMBRE DEL PRODUCTO

-- 8. Mostrar los pedidos que contienen productos que nunca han sido pedidos antes.

-- 9. Mostrar los clientes que han realizado pedidos de productos con existencia (UnitsInStock) inferior al promedio.

-- 10. Mostrar los productos con existencia inferior al promedio en su categoría