-- 1. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el cliente, 
-- el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han realizado mas de 5 pedidos
SELECT customers.ContactName, count(*), orderdetails.UnitPrice*orderdetails.Quantity
FROM customers, orders, orderdetails
WHERE customers.CustomerID = orders.CustomerID
and orders.OrderID = orderdetails.OrderID
and customers.Country = "USA"
GROUP BY customers.ContactName;

-- 2. Mostrar una consulta que muestre el nombre del producto, el número de unidades totales vendidas, de aquel producto 
-- del que mas unidades haya vendido la empresa

SELECT ProductName, sum(Quantity)
FROM products
WHERE sum(Quantity) >
(SELECT max(sum(b.Quantity)) FROM products AS b); 

-- 3. Clientes que han realizado pedidos en más de un país
SELECT CustomerID 
from customers
WHERE CustomerID IN
(SELECT CustomerID FROM orders wHERE ShipCity>1);


-- 4. Empleados que han manejado pedidos de más de un cliente

SELECT EmployeeID
FROM orders
WHERE (CustomerID) > 1;
(SELECT count(CustomerID) FROM orders);  

-- 5. Pedidos que se realizaron después de la fecha límite???
SELECT OrderID
from orders
where OrderID in
(Select OrderID from orders where RequiredDate< ShippedDate);

-- 6. Clientes que han realizado pedidos en mas de una region
SELECT CustomerID 
from customers
WHERE CustomerID IN
(SELECT CustomerID FROM orders wHERE Region>1);

-- 7. Mostrar que clientes tenemos registrados, que estén en las mismas ciudades de nuestros proveedores
SELECT CustomerID
FROM customers, suppliers
where customers.


-- 8. Mostrar el nombre de producto, precio unitario, precio promedio y la diferencia que hay entre el precio promedio y el
-- precio del producto, para los productos que pertenecen a la categoria 6.

SELECT ProductName, UnitPrice, avg(UnitPrice), (avg(UnitPrice)-UnitPrice) as diferencia
FROM products
GROUP BY ProductName
having ProductID =
(SELECT ProductID from products where CategoryID = 6);
