package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = myScanner.nextLine().trim();

        System.out.println("Enter your street: ");
        String street = myScanner.nextLine().trim();

        System.out.println("Enter your city: ");
        String city = myScanner.nextLine().trim();

        System.out.println("Enter your state: ");
        String state = myScanner.nextLine().trim();

        System.out.println("Enter your zip: ");
        String zip = myScanner.nextLine().trim();

        StringBuilder potatoBuild = new StringBuilder();
        potatoBuild.append(userName).append("\n\n");
        potatoBuild.append("Billing Address: ").append("\n");
        potatoBuild.append(billSt).append("\n");
        potatoBuild.append(billCt).append(", ").append("");
        potatoBuild.append(billState).append("");
        potatoBuild.append(billZip).append("\n\n");

