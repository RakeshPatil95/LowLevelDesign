package problems.ParkingLotDesign.ParkingStrategy;

import problems.ParkingLotDesign.Managers.ParkingManager;
import problems.ParkingLotDesign.Vehicles.ParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

public interface ParkingStrategy {
    ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager);
}