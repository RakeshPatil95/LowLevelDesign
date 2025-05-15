package strategyDesignPattern.solution;

public class LuxuryCar extends Car {

    public LuxuryCar(){
        super(new NormalDriveStrategy());
    }

}
