-- 1. Obtener todos los pedidos hechos por el empleado King, Robert.
SELECT OrderID FROM orders, employees where orders.EmployeeID = employees.EmployeeID and FirstName= "Robert" and LastName= "King"; 
SELECT orders.* FROM orders, employees where orders.EmployeeID = employees.EmployeeID and FirstName= "Robert" and LastName= "King"; 
-- 2. Obtener todos los pedidos hechos por el empleado King, Robert Davolio, Nancy y Fuller, Andrew.
SELECT orders.OrderID FROM orders, employees where orders.EmployeeID = employees.EmployeeID and ((FirstName= "Robert" and LastName= "King") or (FirstName= "Nancy" and LastName= "Davolio") or (FirstName= "Andrew" and LastName= "Fuller")); -- Ojo, muy importante los dos paréntesis... esto es lo más correcto.
select orders.OrderID from orders, employees where employees.FirstName in ("Robert", "Nancy", "Andrew") and employees.LastName in ("King", "Davolio", "Fuller") and orders.EmployeeID = employees.EmployeeID;
-- 3. Obtener todos los pedidos del cliente cuyo nombre de contacto es "Bernardo Batista".
SELECT orders.* FROM orders, customers where orders.CustomerID = customers.CustomerID and ContactName="Bernardo Batista"; 
-- 4. Obtener todos los productos(codigo de poducto, nombre, precio, stock) del pedido 10257.
SELECT products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock FROM products, orderdetails where products.ProductID= orderdetails.ProductID and OrderID=10257; 
-- 5. Obtener todos los productos(codigo de producto, nombre, precio, stock) de los pedidos hechos desde 1997 hasta la fecha de hoy.
SELECT products.ProductID, products.ProductName, products.UnitPrice, products.UnitsInStock FROM products, orderdetails, orders where products.ProductID= orderdetails.ProductID and orderdetails.OrderID=orders.OrderID and (year(OrderDate)>=1997); 
-- 6. Mostar el ID del pedido, fecha del pedido y el total de productos de cada pedido.
SELECT orders.OrderID, orders.OrderDate, count(*) as "total de productos" FROM orders, orderdetails where orders.OrderID = orderdetails.OrderId Group by OrderID; 
Select orders.OrderID,orders.Orderdate,count(*)'Total de Productos por pedido' from orderdetails join orders using (OrderID) group by orders.OrderID;
-- 7. Obtener el nombre de todas las categorias y los nombres de sus productos, precio y stock.
SELECT categories.CategoryName, products.ProductName, products.UnitPrice, products.UnitsInStock  FROM categories, products  where categories.CategoryID=products.CategoryID; 
-- 8. Obtener el número de productos por cada categoría mostrando el nombre de la categoría, solamente para las categorías 3, 5 y 8. Ordenar por el nombre de la categoría.
SELECT count(*) as "Numero de productos", categories.CategoryName FROM categories, products  where categories.CategoryID = products.CategoryID and categories.CategoryID in ("3", "5", "8") group by categories.CategoryName ORDER BY categories.CategoryName; 
SELECT count(*) as "Numero de productos", categories.CategoryName FROM categories join products using (CategoryID) where categories.CategoryID in ("3", "5", "8") group by categories.CategoryName ORDER BY categories.CategoryName; 