-- 1.Mostrar todos los empleados y todos sus atributos.
-- SELECT * FROM northwind.employees;

-- 2.Mostrar todos los productos y todos sus atributos.
-- SELECT * FROM northwind.products;

-- 3.Mostrar los productos que pertenecen a la categoría 2.
-- SELECT * FROM northwind.products WHERE CategoryID=2;

-- 4.Productos que pertenece a la categoría 2 y 4.
-- SELECT * FROM northwind.products WHERE CategoryID=2 and CategoryID=4;

-- 5.Productos que pertenece a la categoría 2 o 4.
-- SELECT * FROM northwind.products WHERE CategoryID=2 or CategoryID=4;

-- 6.Mostrar id de producto, nombre de producto y precio unitario para todos aquellos
-- productos cuyo precio unitario sea superior a 100.
-- SELECT ProductID, ProductName, UnitPrice FROM products WHERE UnitPrice>100;

-- 7.Mostrar el producto con nombre “tofu”.
-- SELECT * FROM northwind.products WHERE ProductName = "tofu";

-- 8.Mostrar los productos cuyo ID se encuentra en la categoría, 2, 3 o 4. Hacer de dos formas distintas.
-- SELECT * FROM northwind.products WHERE CategoryID=2 or CategoryID=3 or CategoryID=4;
-- SELECT * FROM northwind.products WHERE  CategoryID IN (2,3,4);

-- 9.Mostrar los productos cuyo ID de proveedor se encuentra en la categoría 3,5 u 8.
-- SELECT * FROM northwind.products WHERE  SupplierID IN (3,5,8);

-- 10. Mostrar los productos cuyo precio oscilan entre 30 y 60 dólares.
-- SELECT * FROM northwind.products WHERE  UnitPrice BETWEEN 30 AND 60;

-- 11. Mostrar los productos cuyo stock está entre 0 y 10.
-- SELECT * FROM northwind.products WHERE UnitsInStock BETWEEN 0 AND 10;

-- 12. Mostrar todos los productos que empiezan con ‘c’.
-- SELECT * FROM northwind.products WHERE ProductName LIKE"c%";

-- 13. Ordenar todos los productos por nombre, en orden ascendente.
-- SELECT * FROM northwind.products ORDER BY ProductName ASC;

-- 14. Ordenar todos los productos por ID, en orden descendente.
-- SELECT * FROM northwind.products ORDER BY ProductID desc;

-- 15. Seleccione todos los campos de la tabla cliente, ordenado por nombre del contacto de la compañía, alfabéticamente.
-- SELECT * FROM northwind.customers ORDER BY ContactName ASC;

-- 16. Seleccione todos los campos de la tabla órdenes, ordenados por fecha de la orden,descendentemente.
-- SELECT * FROM northwind.orders ORDER BY OrderDate desc;

-- 17. Seleccione todos los campos de la tabla detalle de la orden, ordenada por cantidad pedida, ascendentemente.
-- SELECT * FROM northwind.orderdetails ORDER BY Quantity desc;

-- 18. Obtener todos los productos, cuyo nombre comienzan con la letra P y tienen un precio unitario comprendido entre 10 y 120.
-- SELECT * FROM northwind.products WHERE ProductName LIKE "P%" AND UnitPrice BETWEEN 10 AND 120;

-- 19. Obtener todos los clientes de los países de: USA, Francia o UK. Hacer de dos formas.
-- SELECT * FROM northwind.customers WHERE Country IN ("USA", "Francia","UK");
-- SELECT * FROM northwind.customers WHERE Country="USA" or Country="Francia" or Country="UK";

-- 20. Obtener todos los productos descontinuados (Discontinued=1) o sin stock, que pertenecen a la categoría 1, 3, 4 o 7.
-- SELECT * FROM northwind.products WHERE Discontinued=1 AND CategoryID IN (1,3,4,7);

-- 21. Obtener todas las órdenes hechas por el empleado con código: 2, 5 o 7 en el año 1996.
-- SELECT * FROM northwind.orders WHERE EmployeeID IN (2,5,7) AND OrderDate LIKE ("1996%");

-- 22. Seleccionar todos los clientes que cuenten con Fax (valor distinto de null).
-- SELECT * FROM northwind.customers WHERE Fax IS NOT NULL; PERO COMO NO SALE, INTUYO QUE TENDRÁ ALGUN CARACTER, POR LO QUE PRUEBO CON:
-- SELECT * FROM northwind.customers WHERE Fax <> "";

-- 23. Seleccionar todos los empleados que cuentan con un jefe (campo ReportsTo).
-- SELECT * FROM northwind.employees WHERE ReportsTo IS NOT NULL;

-- 24. Seleccionar todos los campos del cliente, cuya compañía empiecen con letra A hasta la D y pertenezcan al país de USA, ordenarlos por la dirección.
-- SELECT * FROM northwind.customers  WHERE Country ="USA" AND CompanyName LIKE ('a%')OR('B%')OR('C%')OR('D%') ORDER BY Address;
-- SELECT * FROM northwind.customers  WHERE Country ="USA" AND CompanyName between 'a%'and 'd%' ORDER BY Address;

-- 25. Seleccionar todos los campos del cliente, cuya compañía empiecen con las letras de la B a la G, y pertenezcan al país de UK, ordenarlos por nombre de la compañía
-- SELECT * FROM northwind.customers where CompanyName between "B%" AND "G%" AND Country ="UK" order by CompanyName;

-- 26. Seleccionar los productos vigentes cuyos precios unitarios están entre 35 y 250, sin stock en almacén, pertenecientes a las categorías 1, 3, 4, 7 u 8, que son
-- distribuidos por los proveedores, 2, 4, 6, 7, 8 o 9
-- SELECT * FROM northwind.products WHERE Discontinued=0 and UnitPrice between 35 and 250 and UnitsInStock=0 and CategoryID in (1,3,4,7,8) and SupplierID in (2,4,6,7,8,9);

-- 27. Seleccionar todos los campos de los productos descontinuados, que pertenezcan a los proveedores con códigos: 1, 3, 7, 8 y 9, que tengan stock en almacén, y al
-- mismo tiempo que sus precios unitarios estén entre 39 y 190, ordenados por código de proveedores y precio unitario de manera ascendente.
-- SELECT * FROM northwind.products WHERE Discontinued=0 and SupplierID in (1,3,7,8,9) and UnitsInStock<>0 and UnitPrice between 39 and 190 order by SupplierID, UnitPrice asc; 