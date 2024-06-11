package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and a Password to run");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet results = preparedStatement.executeQuery(query);

            while (results.next()) {
                String productID = results.getString("ProductID");
                String productName = results.getString("ProductName");
                String unitPrice = results.getString("UnitPrice");
                String unitsInStock = results.getString("UnitsInStock");

                System.out.println("ProductID: " + productID);
                System.out.println("ProductName: " + productName);
                System.out.println("UnitPrice: " + unitPrice);
                System.out.println("UnitsInStock: " + unitsInStock);
                System.out.println("=========================");
            }
            results.close();
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error has occurred");
        }
    }
}


