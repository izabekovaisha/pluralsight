package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String fullName = scanner.nextLine().trim();
        int indexofSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexofSpace);
        String lastName = fullName.substring(indexofSpace +1);

        System.out.print("Date of the show (MM/dd/yyyy: ");
        String showDate = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(showDate, formatter);
        System.out.println("How many tickets would you like? ");
        int numtickets = scanner.nextInt();

        System.out.println(numtickets + "tickets reserved for " + date + " under " + lastName + ", " + firstName);

}       scanner.close();
