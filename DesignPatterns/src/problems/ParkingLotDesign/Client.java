package problems.ParkingLotDesign;

import problems.ParkingLotDesign.EntranceGate.EntranceGate;
import problems.ParkingLotDesign.ExitGate.ExitGate;
import problems.ParkingLotDesign.Managers.ParkingManager;
import problems.ParkingLotDesign.Managers.ParkingManagerFactory;
import problems.ParkingLotDesign.ParkingStrategy.NearToLiftParkingStrategy;
import problems.ParkingLotDesign.ParkingStrategy.ParkingStrategy;
import problems.ParkingLotDesign.Vehicles.TwoWheelerParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

// Requirements
// How many Entrances - 1 Entry and 1 Exit
// vehicle Types
// Payment Strategy - hrly or minly - both
//
// Objects:
// Vehicle, Ticket, EntranceGate, ExitGate ParkingSpot

// We can modify it for multiple floors and multiple entry, exit gates

public class Client {
    public static void main(String[] args) {
        // Create parking manager factory and strategy
        ParkingManagerFactory factory = new ParkingManagerFactory();
        ParkingStrategy strategy = new NearToLiftParkingStrategy();

        // Create entrance
        EntranceGate entranceGate = new EntranceGate(strategy);

        // Set up parking managers and add parking spots
        ParkingManager twoWheelerManager = factory.getParkingManager(VehicleType.TWO_WHEELER);

        // Add parking spots
        for (int i = 0; i < 5; i++) {
            twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot(3));
            twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot(40));
            twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot(50));
            twoWheelerManager.addParkingSpot(new TwoWheelerParkingSpot(05));
        }

        // Simulate vehicle entry
        System.out.println("=== Vehicle Entry ===");
        Vehicle bike = new Vehicle("BIKE123", VehicleType.TWO_WHEELER);

        Ticket bikeTicket = entranceGate.generateTicket(bike, twoWheelerManager);

        System.out.println("Parking Spot Allocated is from lift:  " +bikeTicket.getSpot().getDistanceFromLift());

        if (bikeTicket != null) {
            System.out.println("Bike parked with Ticket ID: " + bikeTicket.getTicketId());
            System.out.println("vehicle number is "+bikeTicket.getVehicle().getLicensePlate());
            System.out.println("vehicle name is "+bikeTicket.getVehicle().getType());
        }

        // Wait to simulate parking duration
        try {
            Thread.sleep(3000); // Simulate 3 seconds (or adjust to hours in real-world scenarios)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Simulate vehicle exit
        ExitGate exitGate = new ExitGate();

        System.out.println("\n=== Vehicle Exit ===");
        if (bikeTicket != null) {
            System.out.println("Bike exiting...");
            exitGate.processExit(bikeTicket, 10.0); // $10 per hour rate for bikes
        }
    }
}

