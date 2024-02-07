-- 1. Clientes con pedidos superiores al promedio de la cantidad de productos por pedido


-- 2. Productos que tienen un precio superior al promedio de precios en su categoría
SELECT ProductName
FROM products
WHERE UnitPrice >
(Select AVG(UnitPrice) from products p2 Where products.CategoryID = p2.CategoryID);

-- 3. Empleados que tienen un salario superior al promedio de salarios en su departamento(no puede hacerse)


-- 4. Clientes que han realizado pedidos en todas las regiones


-- 5. Productos que nunca han sido pedidos

select ProductID
From products
Where ProductID not in
(Select ProductID from orderdetails);

-- 6. Clientes que han realizado pedidos de productos con un precio superior al promedio de todos los productos

SELECT CustomerID
FROM orders
where OrderID IN
(Select OrderID from orderdetails group by OrderID having sum(UnitPrice)) >
(Select AVG(UnitPrice) from products);


-- 7. Empleados que han atendido a clientes de más de un país

SELECT FirstName, LastName
from employees
where EmployeeID IN
(Select EmployeeID From orders GROUP BY employeeID having count(DISTINCT CustomerID)>1);

-- 8. Productos que se han vendido más de 100 veces

SELECT ProductID
From orderdetails
where sum()

-- 9. Clientes que han realizado pedidos en más de una categoría de productos
SELECT CustomerID
From orders

-- 10. Empleados que han gestionado pedidos en más de un año