package designPatterns.AbstractFactoryDesignPattern.Factories;

import designPatterns.AbstractFactoryDesignPattern.CarTypes.IndianSedan;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.IndianShift;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;

public class IndianFactory implements GlobalFactory{


    @Override
    public Sedan createSedan() {
        return new IndianSedan();
    }

    @Override
    public Shift createShift() {
        return new IndianShift();
    }
}
