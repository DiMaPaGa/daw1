-- Muestra los nombres de los productos y los precios unitarios de aquellos productos suministrados por proveedores con números de teléfono que contienen '555';
select ProductName, UnitPrice
from products
Where SupplierID in (Select SupplierID from suppliers where Phone like '%555%');

-- Muestra el nombre y apellidos de aquellos empleados cuya región de actuación sea 'Southern'.

SELECT Firstname, LastName
FROM employees
where EmployeeID in 
(Select EmployeeID from employeeterritories where TerritoryID in
(select TerritoryID from territories where RegionID in
(SELECT RegionID from region where RegionDescription = 'Southern')));




