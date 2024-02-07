-- Ciudad que tienen menos cliente que la ciudad de buenos aires
Select City
from customers
Group by City
having count(*) < (Select count(*) from customers where City = 'Buenos Aires' );
-- bien

-- pedidos cuyo valor de carga (Freight) está por encima de la media
SELECT OrderID
from orders
where Freight > (Select avg(Freight) from orders);
-- bien

-- 4. Productos cuya categoría empieza por la letra C. HAZLO MÁS VECES
SELECT ProductName
from products
where CategoryID in
(Select CategoryID from categories where CategoryName in
(SELECT CategoryName FROM categories wHERE CategoryName LIKE 'C%')); -- nooo, porque se pede simplificar como abajo

SELECT ProductName
FROM products
WHERE CategoryID IN
(SELECT CategoryID From categories WHERE CategoryName LIKE "C%");

-- 5.Productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock de los productos 
-- de la categoría 4.
SELECT ProductID, ProductName
from products
WHERE UnitsInStock >
(Select  max(UnitsInStock) FROM products WHERE CategoryID =4); -- bien

-- 6. Escribir una consulta para recuperar el nombre de la compañía e ID de proveedor de aquellos proveedores que viven en un país que tiene más proveedores que Alemania.
-- vale, pero HAZLO MÁS VECES

SELECT CompanyName, SupplierID
FROM suppliers
Where Country in
(select Country FROM suppliers group by Country having count(*)>
(Select count(*) from suppliers where Country ='Germany')); 

-- 7. Escribir una consulta para imprimir el nombre, apellidos, y edad de aquellos empleados que tienen una edad superior a la edad media.
SELECT FirstName, LastName, timestampdiff(year, Birthdate, curdate()) as edad 
FROM employees
where timestampdiff(year, Birthdate, curdate()) >
(select avg(timestampdiff(year, Birthdate, curdate())) from employees);

-- 8. Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados que tienen una edad superior a la edad media de aquellos empleados con el título de 'Sales Representative'.alter
-- bien
SELECT FirstName, LastName, timestampdiff(year, Birthdate, curdate()) as edad
FROM employees
where timestampdiff(year, Birthdate, curdate()) >
(select avg(timestampdiff(year, Birthdate, curdate())) from employees where Title = 'Sales Representative');

-- 9. Escribir una consulta para recuperar todos los datos de los empleados que tienen una edad superior a la edad de Margaret Peacock.
-- BIEN
Select *
FROM employees
WHERE timestampdiff(year, Birthdate, curdate()) >
(SELECT timestampdiff(year, Birthdate, curdate()) FROM employees WHERE FirstName='Margaret' AND LastName='Peacock');

-- 10. Escribir una consulta para recuperar el ID de pedido, ID de cliente y nombre de compañía. Trabaje sin hacer joins entre orders y customers.
-- aqui me superoooo
SELECT OrderID, CustomerID, (Select CompanyName From customers where orders.CustomerID = customers.CustomerID) as CompanyName
FROM orders;

SELECT OrderID, a.CustomerID, CompanyName
FROM orders, (select CustomerID, CompanyName FROM customers) as a
WHERE a.CustomerID = orders.CustomerID;

-- 11.  Nombre de compañías de clientes que no han hecho pedidos en el 1996. No usar JOIN.
-- bien
Select CompanyName
from customers
where CustomerID not in
(select CustomerID from orders where year(OrderDate)=1996);

-- 12. Nombre de productos suministrados por proveedores de Japón. No usar JOIN.
-- bien
Select ProductName
From products
where SupplierID in 
(Select SupplierID from suppliers where Country = 'Japan');


-- 13. Hacer una subconsulta para obtener los empleados que tienen como jefe a Andrew Fuller.
-- bien
SELECT FirstName, LastName
From employees
where ReportsTo =
(Select EmployeeID FROM employees where FirstName='Andrew' and LastName= 'Fuller');

-- 14. Repetir para mostrar los que no tienen como jefe a Andrew.
-- bien, lo de or report to is null da mal, por lo que esta es la mejor opción

SELECT *
From employees
where ReportsTo not in 
(Select EmployeeID FROM employees where FirstName='Andrew' and LastName= 'Fuller');

-- 15. Recuperar los ID de productos con un
-- precio unitario superior al precio unitario medio.
-- bien
Select ProductID
FROM products
Where UnitPrice >
(Select AVG(UnitPrice) from products);


-- 16. Subconsulta para obtener los nombres de categorias
-- con un número de productos superior al número de
-- productos que pertenecen a la categoría 'condiments'.
-- te cuesta, otra vez

Select CategoryName
From categories
where (Select count(*) from products where categories.CategoryID = products.CategoryID) >
(Select count(*) from products where CategoryID = (Select CategoryID from categories where CategoryName='condiments'));


-- 17. Subconsulta para obtener los ID de aquellos
-- empleados que tienen un número de pedidos superior
-- a la media de pedidos por empleado.

    
-- 18: productos cuyo valor de unidades en stock sea superior al valor máximo de unidades en stock
-- de los productos de la categoría 1 y 3.


-- 19: escribir una consulta para recuperar todos los datos de los empleados que tienen una edad inferior
-- a la edad de Anne Dodsworth o Janet Leverling. INFERIOR A LA MAS JOVEN.


-- 20: escribir una consulta para recuperar los paises que tiene mas proveedores que la suma
-- de proveedores que tienen Brasil y España.

-- 21: escribir una consulta para recuperar el nombre de la compañía e ID de proveedor
-- de aquellos proveedores que viven en un país que tiene mas proveedores que la suma
-- de proveedores que tienen Brasil y España.


-- intenta sacarlo con count unicamente en lugar de con sum-




-- 22: ciudades que tienen más clientes que Madrid.


-- 23: ciudades que tienen más clientes que Madrid o SevillA. Hacer con MAX.



-- 24: ciudades que tienen más clientes que Madrid y Sevilla o Seville. Hacer con la SUMA


-- 25: ciudades que tienen más clientes que la suma de clientes de Madrid, Sevilla o Seville y Lisboa.

-- 26: Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados
-- que tienen una edad igual o superior a la edad media.


-- 27: Escribir una consulta para imprimir el nombre, apellidos y edad de aquellos empleados
-- que tienen una edad igual o superior a la edad media de los empleados con el cargo Sales Representative.


-- 28: Productos cuyo valor de unidades en stock sea superior al valor mínimo de unidades en stock de los productos
-- de la categoría 4 o superior al valor mínimo de unidades en stock de los productos
-- de la categoría 6.


-- 29: Productos cuya categoría empieza por la letra C o D.


-- 30: Ciudades que tienen menos clientes (customers)
-- que la ciudad de Buenos Aires y Munich.

-- 31: empleados que son más jóvenes que Margaret, Laura y Michael.

-- 1. Mostrar los clientes de la tabla orders que realizaron pedidos en el día registrado más reciente.



-- 2. Mostrar el nombre de las empresas que realizaron compras despues de la fecha '01/01/1995'.
 

-- 3. Mostrar el nombre y apellidos de los empleados que tienen como territorio 'New York'.



-- 4. Mostrar los clientes y sus pedidos que tengan un valor de peso (Freight) superior al promedio. LO ENTIENDO COMO EL IDENTIFICADOR DE CRIENTE Y


-- 5. Mostrar los pedidos realizados por clientes de Alemania.



-- 6. Mostrar los clientes que han realizado pedidos de productos con un valor UnitsInStock inferior a 10.



-- 7. Mostrar los productos que han sido pedidos más de una vez.PRODUCTID Y NOMBRE DEL PRODUCTO

-- 8. Mostrar los pedidos que contienen productos que nunca han sido pedidos antes.
-- Entiendo que se refiere a aquellos pedidos que contienen algun artículo que solo se haya pedido en una ocasión.



-- 9. Mostrar los clientes que han realizado pedidos de productos con existencia (UnitsInStock) inferior al promedio.



-- 10. Mostrar los productos con existencia inferior al promedio en su categoría.

-- 1. Crear una consulta que muestre el nombre del cliente, el número de pedidos que nos ha realizado el cliente, 
-- el dinero que nos ha dejado en la empresa, de todos los clientes que sean de USA y que nos han realizado mas de 5 pedidos

-- 2. Mostrar una consulta que muestre el nombre del producto, el número de unidades totales vendidas, de aquel producto 
-- del que mas unidades haya vendido la empresa

-- 3. Clientes que han realizado pedidos en más de un país


-- 4. Empleados que han manejado pedidos de más de un cliente


-- 5. Pedidos que se realizaron después de la fecha límite


-- 6. Clientes que han realizado pedidos en mas de una region

-- 7. Mostrar que clientes tenemos registrados, que estén en las mismas ciudades de nuestros proveedores


-- 8. Mostrar el nombre de producto, precio unitario, precio promedio y la diferencia que hay entre el precio promedio y el
-- precio del producto, para los productos que pertenecen a la categoria 6.
Select ProductName, UnitPrice, (select AVG(UnitPrice) FROM products where CategoryID=6) as promedio, ((select AVG(UnitPrice) FROM products where CategoryID=6) - UnitPrice) as diferencia
from products
where CategoryID= 6;

Select ProductName, UnitPrice, 
round((select AVG(UnitPrice) FROM products where CategoryID=6),2) as promedio, 
ROUND((SELECT AVG(UnitPrice) FROM products WHERE CategoryID = 6) - UnitPrice, 2) AS diferencia
from products
where CategoryID= 6;




