-- 22. Muestre el ID de categoría, nombre de categoría y descripción (en este mismo orden) para todas las categorías existentes. La cabecera de las columnas del grid de
-- resultado deben mostrarse exactamente como ID de categoría, Nombre de categoría y Descripcion, respetando los espacios. Los nombres de las distintas categorías deben aparecer completamente en mayúsculas.
SELECT CategoryID as "ID de categoría", upper(CategoryName) as "Nombre de categoría" , Description as "Descripcion" FROM northwind.categories;
-- 23. Por cada producto muestre el nombre de producto, longitud en caracteres del nombre de producto, precio unitario redondeado al entero inferior más cercano, número de unidades en stock y ganancia. 
-- La ganancia de cada producto se calcula utilizando el número de unidades del producto y el precio unitario redondeado de dicho producto.
SELECT ProductName, char_length(ProductName), floor(UnitPrice), UnitsInStock, round(UnitsInStock*UnitPrice) as "Ganancia" FROM northwind.products; -- tengo que revisarlo
-- 24. Cuente la cantidad de productos que pertenecen a la categoría “Bebidas”.

-- 25. Por cada producto muestre el nombre de producto, nombre de la compañía proveedora y ciudad de la compañía proveedora, para aquellos productos sin stock.

-- 26. Muestre los proveedores con algún valor visible en el campo Homepage.

-- 27. Halle el total de unidades en stock para aquellos productos cuya descripción de categoría es “Carnes preparadas”.

-- 28. Por cada cliente halle la cantidad total de pedidos, sólo para aquellos clientes de Alemania, Canada o Venezuela que tienen algún valor visible en el campo Region.

-- 29. Por cada cliente, pedido realizado y empleado asociado, muestre los distintos productos (id de producto).

-- 30. Halle la edad media de los representantes de ventas de Londres y Redmond que sean mujeres.