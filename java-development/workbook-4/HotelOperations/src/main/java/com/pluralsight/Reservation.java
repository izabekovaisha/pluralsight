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
            this.price *= 1.10;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }
}
}
