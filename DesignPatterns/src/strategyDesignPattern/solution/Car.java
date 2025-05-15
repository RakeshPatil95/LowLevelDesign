package strategyDesignPattern.solution;

public class Car {

    private DriveStrategy driveStrategy;

    public Car(DriveStrategy strategy) {
        this.driveStrategy = strategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
