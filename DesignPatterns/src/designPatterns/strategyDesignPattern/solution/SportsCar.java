package designPatterns.strategyDesignPattern.solution;

import designPatterns.strategyDesignPattern.solution.strategy.SportsDriveStrategy;

public class SportsCar extends Car {

    public SportsCar() {
        super(new SportsDriveStrategy());
    }

}
