USE northwind;

-- Question 1
SELECT ProductName
FROM products
WHERE UnitPrice = (SELECT MAX(UnitPrice)
				   FROM products);
                   
-- Question 2
SELECT OrderID, ShipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID 
				 FROM shippers
				 WHERE CompanyName = "Federal Shipping");
                
-- Question 3
SELECT OrderID
FROM orders
WHERE ShipVia = (SELECT ShipperID 
				 FROM shippers
				 WHERE CompanyName = "Sasquatch Ale");


                   