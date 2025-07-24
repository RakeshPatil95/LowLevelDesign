package decoratorDesignPattern.pizza;

public class PaneerChilli extends BasePizza {
    BasePizza basePizza;

    public PaneerChilli(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 120;
    }
}
