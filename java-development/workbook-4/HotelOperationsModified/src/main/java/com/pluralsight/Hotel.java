package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuits;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel(String name, int numberOfSuits, int numberOfRooms) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuits, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuits = numberOfSuits;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuits() {
        return numberOfSuits;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedRooms() {
        return bookedRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= numberOfSuits) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (bookedRooms + numberOfRooms <= numberOfRooms) {
                bookedRooms += numberOfRooms;
                return true;
            } else {
                return false;
            }
            }
    }
    public int getAvailableSuites() {
        return numberOfSuits -bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfSuits -bookedRooms;
    }
    }
