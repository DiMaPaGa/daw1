-- 1. Clientes con pedidos superiores al promedio de la cantidad de productos por pedido
SELECT CustomerID, count(*)
FROM orders
group by CustomerID
having count(*) > 
(Select AVG(recuento) from (Select OrderID, count(*) as recuento from orderdetails group by OrderID) as o2);


-- 2. Productos que tienen un precio superior al promedio de precios en su categoría
SELECT ProductName, UnitPrice
FROM products
WHERE UnitPrice >
(Select AVG(UnitPrice) from products p2 Where products.CategoryID = p2.CategoryID);


-- 4. Clientes que han realizado pedidos en todas las regiones

SELECT DISTINCT(orders.CustomerID) FROM orders where CustomerID IN
(SELECT CustomerID FROM orders GROUP BY CustomerID HAVING COUNT(DISTINCT(ShipRegion)) in
(SELECT COUNT(DISTINCT(ShipRegion))FROM orders));

-- 5. Productos que nunca han sido pedidos

Select ProductID
From products
Where ProductID not in
(Select ProductID from orderdetails);

-- 6. Clientes que han realizado pedidos de productos con un precio superior al promedio de todos los productos

SELECT DISTINCT CustomerID
FROM orders
where OrderID IN
(Select OrderID from orderdetails WHERE ProductID in
(Select ProductID from products WHERE UnitPrice>
(Select AVG(UnitPrice) from products)));


-- 7. Empleados que han atendido a clientes de más de un país

SELECT FirstName, LastName
from employees
where EmployeeID IN
(Select EmployeeID From orders GROUP BY employeeID having count(DISTINCT CustomerID)>1);

-- 8. Productos que se han vendido más de 100 veces
Select ProductID
FROM (select ProductID, sum(Quantity) as totalVendido from orderdetails Group by ProductID) as od
where totalVendido> 100;

Select ProductID From orderdetails Group by ProductID having sum(Quantity)> 100;

-- 9. Clientes que han realizado pedidos en más de una categoría de productos

SELECT distinct CustomerID, CompanyName
from customers
where CustomerID in
(Select orders.CustomerID 
from orders
JOIN orderdetails using (orderID)
JOIN products USING (ProductID)
group by CustomerID
having count(DISTINCT products.CategoryID) > 1);

SELECT DISTINCT CustomerID, CompanyName
FROM Customers
WHERE CustomerID IN (
    SELECT Orders.CustomerID
    FROM Orders
    JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
    JOIN Products ON OrderDetails.ProductID = Products.ProductID
    GROUP BY Orders.CustomerID
    HAVING COUNT(DISTINCT Products.CategoryID) > 1);

-- 10. Empleados que han gestionado pedidos en más de un año

SELECT EmployeeID, LastName, FirstName
FROM Employees
WHERE EmployeeID IN (
    SELECT EmployeeID
    FROM (
        SELECT EmployeeID, YEAR(OrderDate) AS pedidoAnual
        FROM Orders
        GROUP BY EmployeeID, YEAR(OrderDate)
    ) AS subt
    GROUP BY EmployeeID
    HAVING COUNT(*) > 1);

