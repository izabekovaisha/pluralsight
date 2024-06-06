USE northwind;

-- Question 1:
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName
FROM products p
INNER JOIN categories c ON p.CategoryID = c.CategoryID
ORDER BY c.CategoryName, p.ProductName;

-- Question 2:
SELECT p.ProductID, p.ProductName, p.UnitPrice, s.CompanyName AS SupplierName
FROM products p
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
WHERE UnitPrice > 75
ORDER BY p.ProductName;

-- Question 3:
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName, s.CompanyName AS SupplierName
FROM products p
INNER JOIN categories c ON p.CategoryID = c.CategoryID
INNER JOIN suppliers s ON p.SupplierID = s.SupplierID
ORDER BY p.ProductName;

-- Question 4:
SELECT p.ProductName, c.Categoryname
FROM products p
INNER JOIN categories c ON p.CategoryID = c.CategoryID
WHERE p.UnitPrice = (SELECT MAX(UnitPrice)
					FROM products);
                    
-- Question 5:
SELECT o.OrderID, o.ShipName, o.ShipAddress, s.CompanyName AS ShipingCompany
FROM orders
INNER JOIN shippers s ON o.ShipVia = s.ShipperID
WHERE o.ShipCountry ="Germany";

-- Question 6:
SELECT o.OrderID, o.OrderDate, o.ShipName, o.ShipAddress
FROM orders o
INNER JOIN `order details` od ON o.OrderID = od.OrderID
INNER JOIN products p ON p.ProductID = od.ProductID
WHERE ProductName = "Sasquatch Ale";