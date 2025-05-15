package strategyDesignPattern.solution;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Drive normal vehicle");
    }
}
