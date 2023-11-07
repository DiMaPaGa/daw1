-- 22. Muestre el ID de categoría, nombre de categoría y descripción (en este mismo orden) para todas las categorías existentes. La cabecera de las columnas del grid de
-- resultado deben mostrarse exactamente como ID de categoría, Nombre de categoría y Descripcion, respetando los espacios. Los nombres de las distintas categorías deben aparecer completamente en mayúsculas.
SELECT CategoryID as "ID de categoría", upper(CategoryName) as "Nombre de categoría" , Description as "Descripcion" FROM northwind.categories;
-- 23.Por cada producto muestre el nombre de producto, longitud en caracteres del nombre de producto, precio unitario redondeado al entero inferior más cercano,
-- número de unidades en stock y ganancia. La ganancia de cada producto se calcula utilizando el número de unidades del producto y el precio unitario redondeado de
-- dicho producto.
SELECT ProductName, char_length(ProductName) as longitud_nombre, floor(UnitPrice) as "Precio redondeado", UnitsInStock, floor(UnitPrice) * UnitsInStock as "Ganancia" FROM northwind.products;
-- 24. Cuente la cantidad de productos que pertenecen a la categoría “Bebidas”.
SELECT CategoryID, count(*) FROM northwind.products group by CategoryID having CategoryID=1;
SELECT CategoryID, count(*) FROM northwind.products where CategoryID=1;
SELECT CategoryID, count(*) FROM northwind.products group by CategoryID having CategoryID = (SELECT CategoryID FROM northwind.categories where CategoryName= "Beverages");
-- 25. Por cada producto muestre el nombre de producto, nombre de la compañía proveedora y ciudad de la compañía proveedora, para aquellos productos sin stock. (JOIN)

-- 26. Muestre los proveedores con algún valor visible en el campo Homepage.
SELECT * FROM northwind.suppliers where HomePage is not null and HomePage<>(" ");
-- 27. Halle el total de unidades en stock para aquellos productos cuya descripción de categoría es “Carnes preparadas”.
SELECT sum(UnitsInStock) as "NÚMERO CARNES PREPARADAS EN STOCK" FROM northwind.products where CategoryID=6;
SELECT sum(UnitsInStock) as "NÚMERO CARNES PREPARADAS EN STOCK" FROM northwind.products where CategoryID= (SELECT CategoryID FROM northwind.categories where CategoryName = "Meat/Poultry");
-- 28. Por cada cliente halle la cantidad total de pedidos, sólo para aquellos clientes de Alemania, Canada o Venezuela que tienen algún valor visible en el campo Region.
-- Este no: SELECT CustomerID, count(*) FROM northwind.orders WHERE ShipRegion<>(" ") and ShipRegion IS NOT NULL and ShipCountry="Germany" or ShipCountry="Venezuela" or ShipCountry="Canada" group by CustomerID;
SELECT CustomerID, count(*) FROM northwind.orders WHERE ShipCountry IN ("Germany","Venezuela","Canada") and ShipRegion<>" " and ShipRegion IS NOT NULL group by CustomerID;
-- 29. Por cada cliente, pedido realizado y empleado asociado, muestre los distintos productos (id de producto). (JOIN)

-- 30. Halle la edad media de los representantes de ventas de Londres y Redmond que sean mujeres.
SELECT avg(timestampdiff(year, BirthDate, Curdate())) AS "EDAD MEDIA MUJERES" FROM employees where City in ("London", "Redmon") and Title in ("Sales Representative") and TitleOfCourtesy in ("Ms.", "Mrs.");

SELECT avg(timestampdiff(year,BirthDate, Curdate())) as "media de edad" FROM northwind.employees where City in ("London", "Redmon") and Title="Sales Representative" and TitleOfCourtesy in ("Ms.","Mrs.");