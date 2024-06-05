USE northwind;

-- Question 1
SELECT COUNT(*) AS SupplierCount
FROM suppliersID;

-- Question 2 
SELECT SUM(Salary) AS TotalSalary
FROM employees;

-- Question 3 
SELECT MIN(UnitPrice) AS CheapestPrice
FROM products;

-- Question 4
SELECT AVG(UnitPrice) AS AveragePrice
FROM products;

-- Question 5
SELECT MAX(UnitPrice) AS MostExpensivePrice
FROM products;

-- Question 6
SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID;


-- Question 7
SELECT CategoryID, AVG(UnitPrice) AS AveragePrice
FROM products
GROUP BY CategoryID;

-- Question 8
SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID
HAVING ItemCount >= 5;

-- Question 9
SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
FROM products
ORDER BY InventoryValue DESC, ProductName;

