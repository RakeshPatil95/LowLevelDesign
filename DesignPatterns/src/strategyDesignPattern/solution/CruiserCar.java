package strategyDesignPattern.solution;

public class CruiserCar extends Car {

    public CruiserCar() {
        super(new NormalDriveStrategy());
    }

}
