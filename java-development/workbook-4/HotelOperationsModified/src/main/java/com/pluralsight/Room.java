package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    // Method to check in to the room
    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }

    // Method to check out of the room
    public void checkOut() {
            isOccupied = false; // Mark the room as not occupied
    }

    // Method to clean the room
    public void cleanRoom() {
            isDirty = false; // Mark the room as clean
        }
    }

