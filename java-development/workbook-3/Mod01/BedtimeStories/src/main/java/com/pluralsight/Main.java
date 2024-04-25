package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            FileInputStream fis = new FileInputStream("");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
