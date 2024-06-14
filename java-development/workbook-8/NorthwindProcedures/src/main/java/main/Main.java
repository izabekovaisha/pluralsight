package main;

import db.DataManager;
import models.CustomerOrderHistory;
import models.SalesByCategory;
import models.SalesByYear;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("User and password are needed to connect to the database");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        // Set up the BasicDataSource
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        // Set up the DataManager
        DataManager dataManager = new DataManager(dataSource);

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their actions
        System.out.println("Select an option:");
        System.out.println("1. Search for customer order history");
        System.out.println("2. Search for sales by year");
        System.out.println("3. Search for sales by category");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter customer ID: ");
                String customerId = scanner.nextLine();

                // Search for customer order history
                List<CustomerOrderHistory> orderHistoryList = dataManager.searchCustomerOrderHistory(customerId);

                // Display the results
                System.out.println("Customer Order History:");
                for (CustomerOrderHistory orderHistory : orderHistoryList) {
                    System.out.println("Product Name: " + orderHistory.getProductName()
                            + ", Total Quantity: " + orderHistory.getTotalQuantity());
                }
                break;
            case 2:
                System.out.print("Enter beginning date (YYYY-MM-DD): ");
                String beginningDate = scanner.nextLine();

                System.out.print("Enter ending date (YYYY-MM-DD): ");
                String endingDate = scanner.nextLine();

                // Search for sales by year
                List<SalesByYear> salesByYearList = dataManager.searchSalesByYear(beginningDate, endingDate);

                // Display the results
                System.out.println("Sales by Year:");
                for (SalesByYear salesByYear : salesByYearList) {
                    System.out.println("Shipped Date: " + salesByYear.getShippedDate()
                            + ", Order ID: " + salesByYear.getOrderID()
                            + ", Subtotal: " + salesByYear.getSubtotal()
                            + ", Year: " + salesByYear.getYear());
                }
                break;
            case 3:
                System.out.print("Enter category name: ");
                String categoryName = scanner.nextLine();
                System.out.print("Enter year: ");
                String year = scanner.nextLine();

                // Search for sales by category
                List<SalesByCategory> salesByCategoryList = dataManager.searchSalesByCategory(categoryName, year);

                // Display the results
                System.out.println("Sales by Category:");
                for (SalesByCategory salesByCategory : salesByCategoryList) {
                    System.out.println("Product Name: " + salesByCategory.getProductName()
                            + ", Total Purchase: " + salesByCategory.getTotalPurchase());
                }
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }
}