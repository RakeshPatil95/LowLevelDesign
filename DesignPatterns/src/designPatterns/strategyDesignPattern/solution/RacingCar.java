package designPatterns.strategyDesignPattern.solution;

import designPatterns.strategyDesignPattern.solution.strategy.SportsDriveStrategy;

public class RacingCar extends Car {
    public RacingCar(){
        super(new SportsDriveStrategy());
    }
}
