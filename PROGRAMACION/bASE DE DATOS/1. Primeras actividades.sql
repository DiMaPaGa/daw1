-- SELECT * FROM employees;
-- SELECT * FROM products;
-- SELECT ProductID, ProductName, CategoryID FROM PRODUCTS;
-- SELECT * FROM PRODUCTS where CategoryID=2;
-- SELECT * FROM PRODUCTS where CategoryID IN(2);
-- SELECT * FROM PRODUCTS where CategoryID=2 AND CategoryID=4;
-- SELECT * FROM PRODUCTS where CategoryID=2 OR CategoryID=4;
-- SELECT * FROM PRODUCTS where CategoryID IN(2,4);
SELECT ProductID, ProductName, UnitPrice FROM products WHERE UnitPrice>100;