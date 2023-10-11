-- 1. Contar el número de empleados de Francia. Renombrar el nombre de la columna resultante.
SELECT count(*) FROM northwind.employees where Country in ("Francia") ;
-- 2. Contar el numero de empleados de Estados Unidos o Reino Unido.
SELECT count(*) FROM northwind.employees where Country in ("USA","UK") ;
-- 3. Contar el número de clientes de Madrid.
SELECT count(*) FROM northwind.customers where City in ("Madrid");  
-- 4. Contar el número de clientes cuyo nombre de compañía empieza por F o B.
SELECT count(*) FROM northwind.customers where CompanyName like ("F%") or CompanyName like ("B%"); 
-- 5. Calcular el precio unitario medio de los productos.
SELECT avg(UnitPrice) FROM northwind.products;
-- 6. Calcular el total de unidades en stock.
SELECT sum(UnitsInStock) FROM northwind.products;
-- 7. Calcular el total de unidades en pedido.
SELECT sum(UnitsOnOrder) FROM northwind.products;