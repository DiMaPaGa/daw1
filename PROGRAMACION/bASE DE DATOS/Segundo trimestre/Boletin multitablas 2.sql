-- Boletin 2 multitablas. Actividad puntuable.
-- 10. Por cada pedido, obtener el ID de pedido, ID de producto, ID de proveedor y el nombre de la compañía.
SELECT northwind.orderdetails.OrderID, northwind.orderdetails.ProductID, northwind.suppliers.SupplierID, northwind.suppliers.CompanyName FROM northwind.orderdetails, northwind.products, northwind.suppliers where orderdetails.ProductID= products.ProductID and products.SupplierID= suppliers.SupplierID; 
-- 11. Por cada pedido, obtener el ID de pedido, ID de empleado y el nombre de empleado.
SELECT northwind.orders.OrderID, northwind.employees.EmployeeID, northwind.employees.FirstName FROM northwind.orders, northwind.employees where orders.EmployeeID= employees.EmployeeID;
-- 12. Por cada producto, obtener el ID de producto, ID de categoría y el nombre de categoría.
SELECT products.ProductID, products.CategoryID, categories.CategoryName FROM northwind.products, northwind.categories where products.CategoryID = categories.CategoryID;
-- 13. Por cada empleado, imprimir el ID de empleado, nombre, apellido e ID de territorio.
SELECT northwind.employees.EmployeeID, northwind.employees.FirstName, northwind.employees.LastName, northwind.employeeterritories.TerritoryID FROM northwind.employees, northwind.employeeterritories WHERE employees.EmployeeID = employeeterritories.EmployeeID;
-- 14. Por cada cliente, mostrar el ID de cliente, nombre de contacto y pedidos que ha hecho.
SELECT northwind.customers.CustomerID, northwind.customers.ContactName, northwind.orders.OrderID  FROM northwind.customers, northwind.orders WHERE customers.CustomerID = orders.CustomerID;
-- 15. Por cada cliente, mostrar el ID de cliente, nombre de contacto y numero total pedidos.
SELECT northwind.customers.CustomerID, northwind.customers.ContactName, count(northwind.orders.OrderID) as "TotalPedidos" FROM northwind.customers, northwind.orders WHERE customers.CustomerID = orders.CustomerID group by customers.CustomerID, customers.ContactName; -- Se puede dejar únicamente agrupado por CustomerID ya que cada cliente tiene un nombre vinculado a su ID.
-- 16. Por cada pedido presente en orderdetails, imprimir toda su información y además, el nombre de la categoría a la que pertenece.
SELECT northwind.orderdetails.*, northwind.categories.CategoryName FROM northwind.orderdetails, northwind.products ,northwind.categories WHERE orderdetails.ProductID = products.ProductID and categories.CategoryID= products.CategoryID; 
-- 17. Por cada pedido, mostrar el ID de pedido, dirección del cliente y dirección del empleado.
SELECT northwind.orders.OrderID, northwind.customers.Address as "Dirección Cliente", northwind.employees.Address as "Dirección Empleado" FROM northwind.orders, northwind.customers, northwind.employees WHERE orders.CustomerID = customers.CustomerID and orders.EmployeeID = employees.EmployeeID;
-- 18. Por cada producto, mostrar el ID de producto, nombre de producto y dirección del proveedor.
SELECT northwind.products.ProductID, northwind.products.ProductName, northwind.suppliers.Address AS "Dirección proveedor" FROM northwind.products, northwind.suppliers WHERE products.SupplierID= suppliers.SupplierID;
-- 19. Visualizar el nombre de la compañía y el id del cliente, fecha, precio unitario y producto del pedido.
SELECT northwind.customers.CompanyName, northwind.orders.CustomerID, northwind.orders.OrderDate, northwind.orderdetails.UnitPrice, northwind.products.ProductName FROM northwind.customers, northwind.orders, northwind.orderdetails, northwind.products WHERE customers.CustomerID = orders.CustomerID and orders.OrderID = orderDetails.OrderID and orderdetails.ProductID = products.ProductID;
-- 20. Mostrar el nombre del producto, el precio, el stock y el nombre de la categoría a la que pertenece.
SELECT northwind.products.ProductName, northwind.products.UnitPrice, northwind.products.UnitsInStock, northwind.categories.CategoryName FROM northwind.products, northwind.categories WHERE products.CategoryID = categories.CategoryID;







