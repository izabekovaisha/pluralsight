package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner potatoScanner = new Scanner (System.in);

        System.out.println("Enter your name: ");
        String name = potatoScanner.nextLine();

        System.out.println("Enter hours worked");
        double hours = potatoScanner.nextDouble();

        System.out.println("Enter pay rate: ");
        double rate = potatoScanner.nextDouble();

        double grossPay = hours * rate;
        System.out.println("Name: " + name + " Gross Pay:" + grossPay );
    }
}
