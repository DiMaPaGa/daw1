-- Ciudad que tienen menos cliente que la ciudad de buenos aires
SELECT City, count(*) 
FROM customers  
GROUP BY city 
HAVING count(*) < 
(SELECT count(*) from customers Where City = "Buenos Aires");

-- pedidos cuyo valor de carga (Freight) está por encima de la media
SELECT OrderID from orders where Freight > (select avg(Freight) from orders);

-- 4. Productos cuya categoría empieza por la letra C.

SELECT ProductName
FROM products
WHERE CategoryID IN
(SELECT CategoryID From categories WHERE CategoryName LIKE "C%");


-- 5.Productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock de los productos 
-- de la categoría 4.

SELECT ProductName, UnitsInStock FROM products Where UnitsInStock > (select UnitsInStock FROM products where CategoryID = 4 ORDER BY UnitsInStock DESC LIMIT 1);
SELECT ProductName, UnitsInStock FROM products Where UnitsInStock > (select max(UnitsInStock) FROM products where CategoryID = 4);
SELECT ProductName FROM products Where UnitsInStock > (select max(UnitsInStock) FROM products where CategoryID = 4);

 
 -- 6. Escribir una consulta para recuperar el nombre de la compañía e ID de proveedor de aquellos proveedores que viven en un país que tiene más proveedores que Alemania.
SELECT CompanyName, SupplierID 
FROM suppliers
WHERE Country IN 
(SELECT Country 
FROM suppliers 
group by Country 
having count(SupplierID) > 
		(select count(SupplierID) 
        from suppliers 
        where Country = "Germany"));

-- 7. Escribir una consulta para imprimir el nombre, apellidos, y edad de aquellos empleados que tienen una edad superior a la edad media.
SELECT FirstName, LastName, timestampdiff(year, BirthDate, curdate()) as "edad"
FROM employees
Where timestampdiff(year, BirthDate, curdate()) >
(Select avg(timestampdiff(year, BirthDate, curdate())) from employees);

-- 8. Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados que tienen una edad superior a la edad media de aquellos empleados con el título de 'Sales Representative'.alter
SELECT FirstName, LastName, timestampdiff(year, BirthDate, curdate()) as edad
FROM employees
WHERE timestampdiff(year, BirthDate, curdate()) >
	(Select avg(timestampdiff(year, BirthDate, curdate())) 
	from employees 
	WHERE Title = 'Sales Representative');
-- 9. Escribir una consulta para recuperar todos los datos de los empleados que tienen una edad superior a la edad de Margaret Peacock.
SELECT *
FROM employees
WHERE timestampdiff(year, BirthDate, curdate()) >
	(SELECT timestampdiff(year, BirthDate, curdate()) 
    FROM employees 
    WHERE FirstName = 'Margaret'
    and LastName = 'Peacock');
