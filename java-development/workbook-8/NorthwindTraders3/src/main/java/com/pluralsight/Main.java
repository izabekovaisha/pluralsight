package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Check for command line arguments for username and password
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("3) Enter category ID to display all products in that category");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllProducts(username, password);
                    break;
                case 2:
                    displayAllCustomers(username, password);
                    break;
                case 3:
                    displayAllCategories(username, password);
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayAllProducts(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                int productId = results.getInt("ProductID");
                String productName = results.getString("ProductName");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsInStock = results.getInt("UnitsInStock");

                System.out.println("Product ID: " + productId);
                System.out.println("Product Name: " + productName);
                System.out.println("Unit Price: " + unitPrice);
                System.out.println("Units In Stock: " + unitsInStock);
                System.out.println("-----------------------------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void displayAllCustomers(String username, String password) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = "SELECT ContactName, CompanyName, City, Country, Phone FROM Customers ORDER BY Country";
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                String contactName = results.getString("ContactName");
                String companyName = results.getString("CompanyName");
                String city = results.getString("City");
                String country = results.getString("Country");
                String phone = results.getString("Phone");

                System.out.println("Contact Name: " + contactName);
                System.out.println("Company Name: " + companyName);
                System.out.println("City: " + city);
                System.out.println("Country: " + country);
                System.out.println("Phone: " + phone);
                System.out.println("-----------------------------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private static void displayAllCategories(String username, String password) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet results = null;

        Scanner scanner = new Scanner(System.in);
        connection = null;
        PreparedStatement statement2 = null;
        ResultSet results2 = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind", username, password);

            String query = "SELECT CategoryID, CategoryName FROM categories ORDER BY CategoryID";
            statement = connection.prepareStatement(query);
            results = statement.executeQuery();

            while (results.next()) {
                String categoryID = results.getString("CategoryID");
                String categoryName = results.getString("CategoryName");

                System.out.println("CategoryID: " + categoryID);
                System.out.println("CategoryName: " + categoryName);
                System.out.println("-----------------------------------------");
            }

            System.out.println("Please enter the Category ID: ");
            int choice = scanner.nextInt();

            String query2 = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                    FROM products
                    WHERE CategoryID = ?
                    ORDER BY CategoryID
                    """;

            statement2 = connection.prepareStatement(query2);
            statement2.setInt(1, choice);
            results2 = statement2.executeQuery();

            while (results2.next()) {
                int productId = results2.getInt("ProductID");
                String productName = results2.getString("ProductName");
                double unitPrice = results2.getDouble("UnitPrice");
                int unitsInStock = results2.getInt("UnitsInStock");

                System.out.println("Product ID: " + productId);
                System.out.println("Product Name: " + productName);
                System.out.println("Unit Price: " + unitPrice);
                System.out.println("Units In Stock: " + unitsInStock);
                System.out.println("-----------------------------------------");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (results2 != null) {
                try {
                    results2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement2 != null) {
                try {
                    statement2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}