package com.pluralsight;

import java.io.*;
import java.util.Scanner;


public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                String outputLine = "";

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());

                writer.write(outputLine);
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + inputFileName);
            System.out.println("Error writing file: " + outputFileName);
        }

    }
}


