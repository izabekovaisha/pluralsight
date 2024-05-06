package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        // Set price based on room type
        if (roomType.equals("king")) {
            this.price = 139.00;
        } else if (roomType.equals("double")) {
            this.price = 124.00;
        }

        // Increase price if stay is over a weekend
        if (isWeekend) {
            this.price *= 1.10; // Increase by 10%
            // 1.10 represents a 10% increase over the original value because it includes
            // the original value (1) and an additional 10% (0.10) of the original value
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Method to calculate total reservation price
    public double getReservationTotal() {
        return price * numberOfNights;
    }
}