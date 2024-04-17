package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name in one of the following formats: ");
        System.out.println("Option 1: Enter your first and last name. ");
        System.out.println("Option 2. Enter your first, middle and last name. ");
        String fullName = scanner.nextLine().trim();

        int spacePosition1 = fullName.indexOf(" ");

        String firstName = fullName.substring(0,spacePosition1);
        String middleName = fullName.substring(spacePosition1 + 1);
        System.out.println("\nfullName:" + fullName);



    }
}
