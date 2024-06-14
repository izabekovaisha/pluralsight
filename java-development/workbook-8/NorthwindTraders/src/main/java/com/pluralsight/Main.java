package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Check for command line arguments for username and password
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        // Load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 1. Open a connection to the database
        // Use the database URL to point to the correct database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                username,
                password);

        // Create statement
        // The statement is tied to the open connection
        Statement statement = connection.createStatement();

        // Define your query
        String query = "SELECT ProductName FROM products";

        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);

        // Process the results
        while (results.next()) {
            String productName = results.getString("ProductName");
            System.out.println(productName);
        }

        // 3. Close the connection
        connection.close();


    }
}