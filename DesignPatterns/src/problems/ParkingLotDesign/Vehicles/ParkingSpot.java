package problems.ParkingLotDesign.Vehicles;

import problems.ParkingLotDesign.VehicleType;

// Interface for parking spot
public interface ParkingSpot {
    int getDistanceFromLift();
    boolean isAvailable();
    void parkVehicle(Vehicle vehicle);
    void vacateSpot();
    VehicleType getSpotType();
}
