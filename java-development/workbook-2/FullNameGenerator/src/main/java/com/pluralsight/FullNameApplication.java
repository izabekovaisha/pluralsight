package com.pluralsight;

import java.util.Scanner;

            public class FullNameApplication {
                public static void main(String[] args) {
                }

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name: ");

            System.out.println("First name: ");
            String firstName = scanner.nextLine().trim();

            System.out.println("Middle name: ");
            String middleName = scanner.nextLine().trim();

            System.out.println("Last name: ");
            String lastName = scanner.nextLine().trim();

            System.out.println("Suffix: ");
            String suffixName = scanner.nextLine().trim();

            String fullName = firstName;

            if (!middleName.isEmpty()) {
                fullName += " " + middleName.charAt(0) + ".";

                fullName += " " + lastName;
            }

            if (!suffixName.isEmpty()) {
                fullName += ", " + suffixName;
            }

                System.out.println("\nfullName: " + fullName);

            }





    }
}