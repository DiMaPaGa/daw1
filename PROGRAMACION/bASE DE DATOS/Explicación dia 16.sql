-- Select que cuente el total de empleados.
-- SELECT count(*) FROM northwind.employees;
-- Ojo, nunca se pone nombre de columna dentro de count porque si hay null, no las cuentan.
-- Conteo total de pedidos
-- SELECT count(*) FROM northwind.orders;
-- Conteo total de pedidos que ha realizado cada empleado (por subgrupos)
-- SELECT EmployeeID, count(*)  FROM northwind.orders group by EmployeeID;
-- Conteo total de pedidos que ha realizado cada empleado (por subgrupos) pero solo si el conteo es menor de 100
-- SELECT EmployeeID, count(*)  FROM northwind.orders group by EmployeeID HAVING COUNT(*) <=100;
-- QUIERO QUE ME CUENTE LOS QUE TIENE ID PAR, y a partir de ahí lo demas...sería:
SELECT count(*), EmployeeID FROM northwind.orders WHERE mod(orderid,2)=0 group by employeeID;