package problems.ParkingLotDesign.Managers;

import problems.ParkingLotDesign.VehicleType;
import problems.ParkingLotDesign.Vehicles.ParkingSpot;
import problems.ParkingLotDesign.Vehicles.TwoWheelerParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingManager implements ParkingManager {

   private List<ParkingSpot> parkingSpots;

    public TwoWheelerParkingManager(){
        parkingSpots = new ArrayList<>();
    }
    @Override
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        // do some business here;
        return parkingSpots.stream().filter(parkingSpot -> parkingSpot.getSpotType() == VehicleType.TWO_WHEELER).findFirst().orElse(null);
    }

    @Override
    public void addParkingSpot(TwoWheelerParkingSpot parkingSpot) {
        if(parkingSpot.getSpotType().equals(VehicleType.TWO_WHEELER)) {
            parkingSpots.add(parkingSpot);
        }
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        if(parkingSpot.getSpotType().equals(VehicleType.TWO_WHEELER)) {
            parkingSpots.remove(parkingSpot);
        }
    }

    @Override
    public List<ParkingSpot> getAvailableParkingSpot() {
        return parkingSpots.stream()
                .filter(ParkingSpot::isAvailable)
                .toList();
    }
}
