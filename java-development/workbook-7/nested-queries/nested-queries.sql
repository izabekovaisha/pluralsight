USE northwind;

-- Question 1:
SELECT ProductName
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
				   FROM products);
                   
-- Question 2:
SELECT OrderID, ShipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID 
				 FROM shippers
				 WHERE CompanyName = `Federal Shipping`);
                
-- Question 3:
SELECT OrderID
FROM `order details`
WHERE ProductID = (SELECT ProductID
					FROM products
					WHERE ProductName = "Sasquatch Ale");
          
-- Question 4:
SELECT LastName, FirstName
FROM employees
WHERE EmployeeID = (SELECT EmployeeID
				    FROM Orders
				    WHERE OrderID = 10266);

-- Question 5:
SELECT CompanyName AS CustomerName
FROM customers
WHERE CustomerID =  (SELECT CustomerID
				    FROM orders
				    WHERE OrderID = 10266);


                   