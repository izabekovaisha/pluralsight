package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test Room class
        Room room = new Room(2, 100.00); // Creating a room with 2 beds and $100 price
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());
        System.out.println();

        // Test Reservation class
        Reservation reservation = new Reservation("king", 3, true); // Creating a reservation for a king room for 3 nights, over a weekend
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend Stay: " + reservation.isWeekend());
        System.out.printf("Reservation Total: $%.2f\n", reservation.getReservationTotal());
        System.out.println();

        // Test Employee class
        Employee employee = new Employee(1, "Steve Jobs", "IT", 20.00, 45.0); // Creating an employee with ID 1, name John Doe, working in IT department, with a pay rate of $20.00 per hour, worked 45 hours
        System.out.println("Total Pay: $" + employee.getTotalPay());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
    }
}


