package problems.ParkingLotDesign.ParkingStrategy;

import problems.ParkingLotDesign.Managers.ParkingManager;
import problems.ParkingLotDesign.Vehicles.ParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

public class DefaultParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager) {
        return manager.findParkingSpot(vehicle);
    }
}
