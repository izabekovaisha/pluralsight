package com.pluralsight;

public class Hovercraft extends Vehicle {

        private int airCushionPressure;

        public Hovercraft(String model, String color, int topSpeed, int numberOfPassengers, int fuelCapacity, int cargoCapacity, int airCushionPressure) {
            super(model, color, topSpeed, numberOfPassengers, fuelCapacity, cargoCapacity);
            this.airCushionPressure = airCushionPressure;
        }

        public int getAirCushionPressure() {
            return airCushionPressure;
        }

        public void setAirCushionPressure(int airCushionPressure) {
            this.airCushionPressure = airCushionPressure;
        }

        public void hover() {
            System.out.println("Hovercraft is hovering.");
        }
    }


}
