package decoratorDesignPattern.decorator;

import decoratorDesignPattern.pizza.BasePizza;

public class ExtraSpicy extends BasePizza {
    BasePizza basePizza;

    public ExtraSpicy(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
