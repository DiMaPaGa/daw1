-- 1. Contar el número de empleados de Francia. Renombrar el nombre de la columna resultante.
SELECT count(*) AS "EMPLEADOS FRANCESES" FROM northwind.employees where Country in ("France") ;
-- también estaría bien SELECT count(*) AS "EMPLEADOS FRANCESES" FROM northwind.employees where Country="France" ;
-- 2. Contar el numero de empleados de Estados Unidos o Reino Unido.
SELECT count(*) FROM northwind.employees where Country in("USA","UK") ;
SELECT count(*) FROM northwind.employees where (Country="USA")or (Country="UK") ;
SELECT count(*) FROM northwind.employees where (Country like "USA")or (Country like "UK") ;
-- 3. Contar el número de clientes de Madrid.
SELECT count(*) FROM northwind.customers where City in ("Madrid");  
-- También sirve city=Madrid
-- 4. Contar el número de clientes cuyo nombre de compañía empieza por F o B.
SELECT count(*) FROM northwind.customers where CompanyName like ("F%") or CompanyName like ("B%"); 
-- Aquí tambien puedo quitar los () tras like.
-- 5. Calcular el precio unitario medio de los productos.
SELECT avg(UnitPrice) as "Precio medio" FROM northwind.products;
-- select sum(UnitPrice)/count(*), pero es muy complicado
-- SELECT truncate(AVG(UnitPrice),2) as "precio medio" FROM products;
-- 6. Calcular el total de unidades en stock.
SELECT sum(UnitsInStock) FROM northwind.products;
-- 7. Calcular el total de unidades en pedido.
SELECT sum(UnitsOnOrder) FROM northwind.products;