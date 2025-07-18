package strategyDesignPattern.solution;

import strategyDesignPattern.solution.strategy.DriveStrategy;

// To avoid above problem I will divide the drive capabilities in another hierarchy using strategy pattern
public class Car {

    private DriveStrategy driveStrategy;

    public Car(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
