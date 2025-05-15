package strategyDesignPattern.solution;

public class SportsCar extends Car {

    public SportsCar() {
        super(new SportsDriveStrategy());
    }

}
