package strategyDesignPattern.solution;

import strategyDesignPattern.solution.strategy.SportsDriveStrategy;

public class SportsCar extends Car {

    public SportsCar() {
        super(new SportsDriveStrategy());
    }

}
