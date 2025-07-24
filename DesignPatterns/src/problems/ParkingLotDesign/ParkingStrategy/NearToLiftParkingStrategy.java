package problems.ParkingLotDesign.ParkingStrategy;

import problems.ParkingLotDesign.Managers.ParkingManager;
import problems.ParkingLotDesign.Vehicles.ParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

import java.util.Comparator;

public class NearToLiftParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot allocateSpot(Vehicle vehicle, ParkingManager manager) {
        return manager.getAvailableParkingSpot()
                .stream()
                .min(Comparator.comparing(ParkingSpot::getDistanceFromLift))
                .orElse(null);
    }
}
