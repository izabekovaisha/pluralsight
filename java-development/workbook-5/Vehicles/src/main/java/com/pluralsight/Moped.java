package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    public Moped(String model, String color, int topSpeed, int numberOfPassengers, int fuelCapacity, int cargoCapacity, int maxWeight) {
        super(model, color, topSpeed, numberOfPassengers, fuelCapacity, cargoCapacity);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride() {
        System.out.println("Riding the moped.");
    }
}