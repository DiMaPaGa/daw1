-- Entregar un documento de texto con las preguntas comentadas con las respuestas en la siguiente linea.



-- 1. Mostrar los pedidos y el nombre del empleado que realizó el pedido, para aquellos pedidos que se hicieron en el mes de enero.
-- bien
Select orders.OrderID, employees.FirstName from orders, orderdetails, employees
where orders.OrderID= orderdetails.OrderID
and orders.EmployeeID=employees.EmployeeID
and orders.OrderID in (Select orders.OrderID from orders where month(OrderDate) =1)
GROUP BY orders.OrderID;

-- 2. Mostrar los empleados que tienen como jefe a Andrew Fuller.
-- bien
SELECT *
FROM employees
Where ReportsTo =
(Select EmployeeID FROM employees WHERE FirstName = "Andrew" and LastName="Fuller");

-- 3. Mostrar el nombre de contacto y la cantidad de pedidos para aquellos clientes que hayan realizado más pedidos que la media de los precios de los productos pedidos.
-- mal.
Select customers.ContactName, count(*) "recuento pedidos" from customers group by CustomerID having  CustomerID in
(Select CustomerID from orders where OrderID in
(Select OrderID from orderdetails where ProductID in
(Select ProductID from products where UnitPrice >
(Select avg(UnitPrice) from products))));

-- 
Select customers.ContactName, r.cantidadPedidos 
from (Select count(*) as "cantidadPedidos", customerID from orders group by customerID) as r, customers 
where r.customerID = customers.CustomerID and r.cantidadPedidos > 
(Select avg(unitPrice) from products where productID in (Select productID from orderdetails));

-- la siguiente es la correcta
SELECT customers.ContactName, count(orders.OrderID) "Cantidad de pedidos" 
FROM customers, orders WHERE (customers.CustomerID = orders.CustomerID)
GROUP BY customers.CustomerID HAVING count(orders.OrderID) > (SELECT avg(UnitPrice) FROM orderdetails);

-- 4. Mostrar todos los pedidos realizados por el empleado "Janet Fuller"
-- fallito
SELECT orders.OrderID, employees.FirstName 
FROM orders, employees WHERE orders.EmployeeID = employees.EmployeeID 
AND (employees.LastName = "Fuller" and employees.FirstName = "Janet");

-- 5. Mostrar el nombre de los productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock de los productos de la categoría 9
-- bien
Select products.ProductName 
from products
where products.UnitsInStock >
(Select max(products.UnitsInStock) from products where products.CategoryID=9);


-- 6. Mostrar todos los datos del producto del pedido 11077.

-- bien
Select products.* from products where products.ProductID IN
(Select orderdetails.ProductID from orderdetails where OrderID in
(Select OrderID from orders where orders.OrderID = 11077));

-- 7. Mostrar los ID de aquellos empleados que tienen un número de pedidos superior a la media de pedidos más 15.
-- bien
Select EmployeeID from orders 
GROUP BY EmployeeID 
having count(*) >
(Select avg(recuento) +15 from (Select employeeID, count(*) as recuento from orders group by EmployeeID)  as tabla );

-- 8. Mostrar el nombre y la cantidad de productos para los 10 productos más vendidos.

-- bien
SELECT products.ProductName, sum(orderdetails.Quantity) AS "Cantidad completa"
FROM products, orderdetails
WHERE products.ProductID=orderdetails.ProductID
GROUP BY products.ProductID 
ORDER BY sum(orderdetails.Quantity) DESC
LIMIT 10;

-- 9. Mostrar los nombres de los clientes que han realizado un pedido de un producto con un precio superior a 150.

-- bien
Select customers.CompanyName 
from customers 
where CustomerID in
(Select orders.CustomerID from orders where orders.OrderID in
(Select orderdetails.OrderID from orderdetails where orderdetails.UnitPrice > 150));

-- 10. Mostrar el total de unidades en stock para aquellos productos que tienen como nombre de la categoría "Dairy Products".
-- mal
Select products.ProductID, products.UnitsInStock
from products
where products.CategoryID in 
(Select categories.CategoryID from categories where categories.CategoryName= 'Dairy Products');

-- bien
Select sum(UnitsInStock) as "TOTAL UNIDADES" from products where CategoryID IN
(Select CategoryID from categories where CategoryName= 'Dairy Products');


-- 11. Mostrar las ciudades que tienen más clientes que la suma de clientes de Torino y Leipzig pero menos clientes que la suma de clientes de Sao Paulo y London.
SELECT City FROM customers GROUP by City having count(*) > 
(SELECT SUM(recuento) FROM (SELECT count(*) as recuento FROM customers Where City IN ('Torino', 'Leipzig')GROUP BY City) AS a)
and count(*) <
(SELECT SUM(recuento) FROM (SELECT count(*) as recuento FROM customers Where City IN ('Sao Paulo', 'London')GROUP BY City) AS b);


-- 12. Mostrar los nombres de los clientes y la cantidad de pedidos que han realizado para aquellos que hayan realizado más de 15 pedidos.
SELECT customers.ContactName, count(orders.OrderID) as Pedidos
FROM customers, orders, orderdetails
WHERE customers.CustomerID = orders.CustomerID
and orders.OrderID = orderdetails.OrderID
GROUP BY customers.ContactName
HAVING COUNT(distinct orders.OrderID) > 15;

-- Este es el correcto
select customers.contactname, count(orders.orderid) from customers,orders 
where (customers.customerid = orders.customerid) group by customers.contactname having count(orders.orderid) > 15;

-- 13. Mostrar por cada empleado, el nombre del empleado y el nombre de su jefe.
Select employees.FirstName as "Nombre de empleado", jefe.FirstName as 'Jefe'
from employees, employees as jefe
where employees.ReportsTo= jefe.EmployeeID;

-- esta mejor
SELECT employees.FirstName, (SELECT jefes.FirstName FROM employees AS jefes WHERE employees.ReportsTo = jefes.EmployeeID) "Nombre Jefe" FROM employees;


-- 14. Mostrar el total de ventas(Quantity * UnitPrice) por cada mes y año de los pedidos. ¿¿mirar!!
-- Esta estaba mal
SELECT month(orderdate) "Mes", year(orderdate) "Anyo", sum(Quantity * UnitPrice) as "NumVentas" from
orderdetails, orders
Where orderdetails.OrderID= orders.OrderID group by year(OrderDate), month(OrderDate);

-- 15. Mostrar los empleados que son más jóvenes que Andrew o Steven.
-- bien
SELECT employees.FirstName
FROM employees
WHERE timestampdiff(year, BirthDate, curdate()) <
(SELECT min(timestampdiff(year, BirthDate, curdate())) FROM employees Where Firstname IN ('Andrew', 'Steven'));


-- 16. Mostrar por cada cliente, su nombre de contacto, el pedido, el nombre del producto y el precio para el pedido que tenga el producto con el precio más bajo
-- mia mal
Select customers.ContactName, orderdetails.OrderID, products.ProductName, orderdetails.UnitPrice
from customers, orders, orderdetails, products
where customers.CustomerID= orders.CustomerID
and orderdetails.OrderID=orders.OrderID
and products.ProductID=orderdetails.ProductID
and products.ProductID IN
(select orderdetails.ProductID from orderdetails GROUP BY orderdetails.ProductID having min(orderdetails.UnitPrice));

-- esta es la buena:
select customers.ContactName, orders.OrderID,
(select min(UnitPrice) from orderdetails where orderdetails.OrderID = orders.OrderID) "Precio minimo",
(select products.ProductName from products, orderdetails where products.ProductID = orderdetails.ProductID and orders.OrderID = orderdetails.OrderID order by orderdetails.UnitPrice asc limit 1) "Nombre producto"
from orders, customers where customers.CustomerID = orders.CustomerID;

-- otra slucion: 
Select customers.contactname, orders.orderID, products.productname, products.UnitPrice from customers, orders, orderdetails, products where customers.CustomerID = orders.CustomerID and orders.orderID = orderdetails.OrderID and orderdetails.ProductID = products.ProductID and products.ProductID = (Select productID from products where unitprice = (Select min(unitprice) from products));

-- 17. Mostrar los distintos empleados con la descripción de su region.
-- bien
Select DISTINCT employees.FirstName, region.RegionDescription
from employees, employeeterritories, territories, region
where employees.EmployeeID= employeeterritories.EmployeeID 
and employeeterritories.TerritoryID = territories.TerritoryID
and territories.RegionID= region.RegionID;

-- 18. Mostrar los productos con existencia superior al promedio en su categoría.
-- bien
SELECT *
FROM Products
WHERE UnitsInStock > 
(SELECT AVG(UnitsInStock) FROM Products AS a
WHERE products.CategoryID = a.CategoryID);


-- 19. Mostrar el nombre del cliente, nombre del proveedor, nombre del empleado y nombre de los productos para aquellos pedidos que solo tienen un producto
-- mal al final
Select customers.CompanyName, suppliers.CompanyName, employees.FirstName, products.ProductName
FROM customers, suppliers, employees, products, orders, orderdetails
WHERE customers.CustomerID= orders.CustomerID
AND suppliers.SupplierID = products.SupplierID
AND employees.EmployeeID = orders.EmployeeID
AND products.ProductID = orderdetails.ProductID
AND orders.OrderID =orderdetails.OrderID
AND orders.OrderID in (select  orders.OrderID from orders GROUP BY orders.OrderID having count(*)=1);

-- 20. Mostrar el nombre del producto más caro de cada categoría, junto con el nombre de la categoría.
-- fallo
SELECT products.ProductName, products.ProductName
FROM products
WHERE UnitPrice in
(Select max(UnitPrice) from products p2 Where products.CategoryID = p2.CategoryID);

-- esta es la buena
Select b.ProductName, c.CategoryName
from products b 
join categories c
on(b.categoryID = c.categoryID)
where unitprice in (Select max(UnitPrice) from products a where a.CategoryID = b.CategoryID);
