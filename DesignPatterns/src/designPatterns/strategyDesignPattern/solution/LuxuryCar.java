package designPatterns.strategyDesignPattern.solution;

import designPatterns.strategyDesignPattern.solution.strategy.NormalDriveStrategy;

public class LuxuryCar extends Car {

    public LuxuryCar(){
        super(new NormalDriveStrategy());
    }

}
