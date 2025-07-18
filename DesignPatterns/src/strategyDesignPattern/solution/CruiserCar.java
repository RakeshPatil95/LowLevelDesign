package strategyDesignPattern.solution;

import strategyDesignPattern.solution.strategy.NormalDriveStrategy;

public class CruiserCar extends Car {

    public CruiserCar() {
        super(new NormalDriveStrategy());
    }

}
