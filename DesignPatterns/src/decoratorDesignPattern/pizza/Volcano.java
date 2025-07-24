package decoratorDesignPattern.pizza;

public class Volcano extends BasePizza {

    BasePizza basePizza;

    public Volcano(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return 200;
    }
}
