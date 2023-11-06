-- Ciudades que tienen menos clientes (customers) que la ciudad de Buenos Aires
SELECT City FROM northwind.customers group by City having count(*) < (Select Count(*) from northwind.customers where City="Buenos Aires");
-- Productos cuya categoria empieza por la letra C.
SELECT * FROM northwind.products WHERE CategoryID in (Select CategoryID FROM northwind.categories where CategoryName like "C%");
-- Nombre de los empleados que son jefes. 
SELECT FirstName From employees where ReportsTo = (Select ReportsTo From employees where ReportsTo=2);
-- Pedidos cuyo valor de carga (Freight) está por encima de la media.
Select * from orders where Freight > (select avg(freight) from orders)