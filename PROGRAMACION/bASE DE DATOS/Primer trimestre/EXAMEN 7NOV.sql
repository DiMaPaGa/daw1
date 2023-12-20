-- 1. Mostrar el producto más vendido y la cantidad de productos vendidos (UnitsOnOrder). 
SELECT ProductName, UnitsOnOrder FROM northwind.products order by UnitsOnOrder desc limit 1;
-- 2. Contar los productos que pertenecen a la categoría 3.
SELECT Count(*) FROM northwind.products where CategoryID= "3";
-- 3. Mostrar los pedidos realizados por el cliente 'ALFKI'.
SELECT * FROM northwind.orders where CustomerID IN ("ALFKI");
-- 4. Mostrar los primeros 10 pedidos con un precio unitario (UnitPrice) más alto y su cantidad (Quantity) sea superior a 10.
SELECT * FROM northwind.orderdetails where Quantity > 10 order by UnitPrice Desc  limit 10;
-- 5. Mostrar los datos de la tabla categories con los titulos traducidos al castellano y separando con espacios aquellos que esten compuestos de varias palabras.
SELECT CategoryID as "Identificador Categoría", CategoryName as "Nombre de la Categoría", Description as "Descripción", Picture as "Foto" FROM northwind.categories;
-- 6. Mostrar los nombres de los empleados ordenados de manera descendente (de Z a A).
SELECT FirstName FROM northwind.employees order by FirstName desc;
-- 7. Mostrar el número de clientes por cada ciudad para aquellas ciudades que tienen más de un cliente.
SELECT Count(*) as "numeroClientes", City FROM northwind.customers group by City having numeroClientes>1;
-- 8. Por cada cliente, mostrar el número de pedidos sólo para los clientes con más de 5 pedidos y menos de 10 pedidos.
SELECT CustomerID, count(*) as "numeroPedidos" FROM northwind.orders group by CustomerID having numeroPedidos between 6 and 9;
-- 9. Imprimir el nombre de los empleados en minúsculas y el apellido en mayúsculas, excluyendo la primera y última letra.
SELECT lower(substr(FirstName,2,length(FirstName)-2)) as "nombre", upper(substr(LastName,2,length(LastName)-2)) as "APELLIDO" FROM northwind.employees;
-- 10. Mostrar el número de clientes por cada pais para aquellos paises que tienen al menos 2 clientes, ordenados en orden descendente por la cantidad de clientes.
SELECT Country, count(*) as "numeroClientes" FROM northwind.customers group by Country having numeroClientes>=2 order by numeroClientes desc;

-- -- -- -- -- 
-- 1 Pedidos atendidos por empleados de Londres
SELECT OrderID FROM northwind.orders Where EmployeeID in (SELECT EmployeeID FROM northwind.employees where City = "London");
-- 2 Productos cuya descripcion de categoria tiene menos de diez caracteres de longitud
Select ProductName From northwind.products where CategoryID = (SELECT CategoryID FROM northwind.categories where length(Description)<10); 
-- 3 Clientes con mas de diez pedidos
SELECT CustomerID, count(*) FROM northwind.orders group by CustomerID having count(*)>10;
-- 4 Cantidad de productos de cada proveedor, para proveedores sin region
SELECT SupplierID, Count(*) FROM northwind.products group by SupplierID having SupplierID = (Select SupplierID FROM northwind.suppliers Where region=" ");
-- -- -- -- -- 
-- 1. Selecciona todos los campos de la tabla orderdetails, ordenada por cantidad (Quantity) ascendentemente.

-- 2. Obtener todos los productos, cuyo nombre comienzan por P y tienen un precio unitario comprendido entre 10 y 120.

-- 3. Obtener todos los clientes de los países de USA, Francia y UK.

-- 4. Obtener todos los productos descontinuados (Discontinued) y sin stock (UnitsInStock) que pertenecen a la categoria 1, 3, 4 y 7.

-- 5. Obtener todas las ordenes hechas por el empleado con ID 2, 5 y 7 en el año 1996.

-- 6. Seleccionar todos los campos del cliente cuya compañia empieza con la letra A hasta la D y pertenecen al pais de USA. Ordenalos por la direccion.

-- 7. Seleccionar todos los campos de los productos descontinuados, que pertenezcam a los proveedores con ID 1, 3, 7, 8 y 9, que tengan stock y al mismo 
-- tiempo que sus precios unitarios esten entre 39 y 190. Ordenaos por ID de proveedor y precio unitario de manera ascendente.

-- 8. Seleccionar los productos cuyo precio unitario esta entre 35 y 250, sin stocken almacen que pertenecen a las categorias 1, 3, 4, 7 y 8 y que son
-- distribuidos por los proveedores 2, 4, 6, 7, 8 y 9.

