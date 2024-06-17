package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            if (args.length != 2) {
                System.out.println("This application needs the username and password to run");
                System.exit(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        String username = args[0];
        String password = args[1];

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",
                username,
                password);

        Statement statement = connection.createStatement();

        String query = """
                SELECT
                FROM
                WHERE
                ORDER BY
                """;

        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String productName = results.getString("ProductName");
            System.out.println(productName);
        }

        connection.close();

    }
    }
}
