package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d\n %s\n - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            while ((line = buff.readLine())!=null) {
                String[] name = line.split("\\|");
                int id = Integer.parseInt(name[0]);
                String meas = name[1];
                double price = Double.parseDouble(name[2]);
                inventory.add(new Product(id, meas, price));
                }



        /*inventory.add(new Product(1, "Product 1", 10.99));
        inventory.add(new Product(2, "Product 2", 8.99));
        inventory.add(new Product(3, "Product 3", 7.99));
        inventory.add(new Product(4, "Product 4", 6.75));
        inventory.add(new Product(5, "Product 5", 9.99));

         */


            return inventory;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }


