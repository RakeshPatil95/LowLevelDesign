package designPatterns.decoratorDesignPattern.pizza;

public class Farmhouse extends BasePizza {

    BasePizza basePizza;

    public Farmhouse(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 150;
    }
}
