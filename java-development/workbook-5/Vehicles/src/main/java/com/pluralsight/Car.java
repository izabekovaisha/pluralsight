package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, String color, int topSpeed, int numberOfPassengers, int fuelCapacity, int cargoCapacity, int numberOfDoors) {
        super(model, color, topSpeed, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }

    public void closeTrunk() {
        System.out.println("Trunk closed.");
    }
}