package designPatterns.AbstractFactoryDesignPattern.Factories;

import designPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.USASedan;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.USAShift;

public class USAFactory implements GlobalFactory {


    @Override
    public Sedan createSedan() {
        return new USASedan();
    }

    @Override
    public Shift createShift() {
        return new USAShift();
    }
}
