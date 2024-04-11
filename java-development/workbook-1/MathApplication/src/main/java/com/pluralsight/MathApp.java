package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        System.out.println();
        double bobSalary = 50000.0;
        double garySalary = 70000.0;
        double highestSalary  = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Find the smallest price between carPrice and truckPrice
        int carPrice = 60000;
        int truckPrice = 55000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + smallestPrice);

        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);




