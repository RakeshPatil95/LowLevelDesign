package strategyDesignPattern.solution;

import strategyDesignPattern.solution.strategy.SportsDriveStrategy;

public class RacingCar extends Car {
    public RacingCar(){
        super(new SportsDriveStrategy());
    }
}
