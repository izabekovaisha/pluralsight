package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // the key is the product id, the value is a product object
    public static HashMap<Integer, Product> inventory =
            new HashMap<>();


    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {
        String line;
        try {
            BufferedReader buff = new BufferedReader(new FileReader("inventory.csv"));
            while ((line = buff.readLine()) != null) {
                String[] proc = line.split("\\|");
                if (proc.length == 3) {
                    int id = Integer.parseInt(proc[0]);
                    String meas = proc[1];
                    double price = Double.parseDouble(proc[2]);
                    Product product = new Product(id, meas, price);
                    inventory.put(id, new Product(id, meas, price));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
