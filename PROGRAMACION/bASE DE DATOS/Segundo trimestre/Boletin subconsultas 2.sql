-- 1. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el cliente, 
-- el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han realizado mas de 5 pedidos
SELECT customers.ContactName, count(orders.OrderID) as Pedidos, sum(orderdetails.UnitPrice*orderdetails.Quantity) as CantidadGastada
FROM customers, orders, orderdetails
WHERE customers.CustomerID = orders.CustomerID
and orders.OrderID = orderdetails.OrderID
and customers.Country = "USA"
GROUP BY customers.ContactName
HAVING COUNT(orders.OrderID) > 5;

-- 2. Mostrar una consulta que muestre el nombre del producto, el número de unidades totales vendidas, de aquel producto 
-- del que mas unidades haya vendido la empresa

SELECT p.ProductName, sum(o.Quantity) as "UnidadesTotalesVendidas"
FROM products p, orderdetails o
WHERE p.ProductID = o.ProductID
group by p.ProductName
order by UnidadesTotalesVendidas desc Limit 1;

-- 3. Clientes que han realizado pedidos en más de un país
SELECT CustomerID 
from customers
WHERE CustomerID IN
(SELECT CustomerID from orders group by CustomerID having count(distinct orders.Shipcountry)>1);



-- 4. Empleados que han manejado pedidos de más de un cliente

SELECT EmployeeID
FROM orders
group by EmployeeID
Having count(distinct CustomerID) > 1; 

SELECT DISTINCT EmployeeID
FROM orders
WHERE EmployeeID IN (SELECT EmployeeID FROM orders GROUP BY EmployeeID HAVING COUNT(DISTINCT CustomerID) > 1);


-- 5. Pedidos que se realizaron después de la fecha límite
SELECT OrderID
from orders
where OrderID in
(Select OrderID from orders where RequiredDate< ShippedDate);


-- 6. Clientes que han realizado pedidos en mas de una region
SELECT CustomerID 
from customers
WHERE CustomerID IN
(SELECT CustomerID FROM orders Group by CustomerID having count(Distinct Region)>1);

-- 7. Mostrar que clientes tenemos registrados, que estén en las mismas ciudades de nuestros proveedores
SELECT CustomerID
FROM customers
where customers.City =
(Select suppliers.City from suppliers where suppliers.City = customers.City);


-- 8. Mostrar el nombre de producto, precio unitario, precio promedio y la diferencia que hay entre el precio promedio y el
-- precio del producto, para los productos que pertenecen a la categoria 6.


SELECT ProductName, UnitPrice, (select avg(UnitPrice) from products where CategoryID = 6) as PrecioPromedio, ((select avg(UnitPrice) from products where CategoryID = 6) - UnitPrice) AS Diferencia
FROM products
WHERE CategoryID = 6
GROUP BY ProductName, UnitPrice;






