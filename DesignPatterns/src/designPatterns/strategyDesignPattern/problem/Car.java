package designPatterns.strategyDesignPattern.problem;

public class Car {

    // All inherited classes is overriding drive method. But SportsCar and RacingCar has same implementation.
    // This is the problem
    // Here I wanted func that I want multiple cars with diff drive Capabilities.
    public void drive(){
        System.out.println("Drive the vehicle");
    }

}
