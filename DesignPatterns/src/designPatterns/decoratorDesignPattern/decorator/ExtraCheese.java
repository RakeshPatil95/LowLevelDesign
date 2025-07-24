package designPatterns.decoratorDesignPattern.decorator;

import designPatterns.decoratorDesignPattern.pizza.BasePizza;

public class ExtraCheese extends Toping {
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
