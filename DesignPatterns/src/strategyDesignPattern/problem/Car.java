package strategyDesignPattern.problem;

public class Car {

    // All inherited classes is overriding drive method. But SportsCar and RacingCar has same implementation.
    // This is the problem
    public void drive(){
        System.out.println("Drive the vehicle");
    }

}
