package strategyDesignPattern.solution;

public class RacingCar extends Car {
    public RacingCar(){
        super(new SportsDriveStrategy());
    }
}
