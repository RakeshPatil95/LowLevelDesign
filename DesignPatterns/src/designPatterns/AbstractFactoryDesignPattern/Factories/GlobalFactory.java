package designPatterns.AbstractFactoryDesignPattern.Factories;

import designPatterns.AbstractFactoryDesignPattern.CarTypes.Sedan;
import designPatterns.AbstractFactoryDesignPattern.CarTypes.Shift;

public interface GlobalFactory {
    Sedan createSedan();

    Shift createShift();
}
