package strategyDesignPattern.solution.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Drive Sports Vehicle");
    }
}
