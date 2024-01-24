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
