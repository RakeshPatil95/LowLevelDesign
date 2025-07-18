package strategyDesignPattern.solution;

import strategyDesignPattern.solution.strategy.NormalDriveStrategy;

public class LuxuryCar extends Car {

    public LuxuryCar(){
        super(new NormalDriveStrategy());
    }

}
