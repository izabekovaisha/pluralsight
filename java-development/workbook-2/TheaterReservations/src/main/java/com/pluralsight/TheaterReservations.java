package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        // Prompt the user for the date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateStr = scanner.nextLine();

        // Parse the date using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        // Prompt the user for the number of tickets
        System.out.print("How many tickets would you like? ");
        int numTickets = scanner.nextInt();

        // Display the confirmation message
        String ticketString = numTickets == 1 ? " ticket" : " tickets";
        String confirmationMessage = numTickets + ticketString + " reserved for " + date + " under " + lastName + ", " + firstName;
        System.out.println(confirmationMessage);

        scanner.close();
    }
}