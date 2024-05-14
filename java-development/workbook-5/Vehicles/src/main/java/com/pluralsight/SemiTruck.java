package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfTrailers;

    public SemiTruck(String model, String color, int topSpeed, int numberOfPassengers, int fuelCapacity, int cargoCapacity, int numberOfTrailers) {
        super(model, color, topSpeed, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.numberOfTrailers = numberOfTrailers;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo() {
        System.out.println("Cargo loaded onto the truck.");
    }

    public void unloadCargo() {
        System.out.println("Cargo unloaded from the truck.");
    }
}