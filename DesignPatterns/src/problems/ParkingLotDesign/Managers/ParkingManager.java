package problems.ParkingLotDesign.Managers;

import problems.ParkingLotDesign.Vehicles.ParkingSpot;
import problems.ParkingLotDesign.Vehicles.TwoWheelerParkingSpot;
import problems.ParkingLotDesign.Vehicles.Vehicle;

import java.util.List;

public interface ParkingManager {

    ParkingSpot findParkingSpot(Vehicle vehicle);

    void addParkingSpot(TwoWheelerParkingSpot parkingSpot);

    void removeParkingSpot(ParkingSpot parkingSpot);

    List<ParkingSpot> getAvailableParkingSpot();
}
