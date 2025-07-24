package designPatterns.strategyDesignPattern.solution;

import designPatterns.strategyDesignPattern.solution.strategy.NormalDriveStrategy;

public class CruiserCar extends Car {

    public CruiserCar() {
        super(new NormalDriveStrategy());
    }

}
