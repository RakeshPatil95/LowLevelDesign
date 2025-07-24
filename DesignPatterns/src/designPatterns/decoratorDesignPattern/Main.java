package designPatterns.decoratorDesignPattern;

import designPatterns.decoratorDesignPattern.decorator.ExtraCheese;
import designPatterns.decoratorDesignPattern.decorator.ExtraSpicy;
import designPatterns.decoratorDesignPattern.pizza.BasePizza;
import designPatterns.decoratorDesignPattern.pizza.Farmhouse;
import designPatterns.decoratorDesignPattern.pizza.PaneerChilli;
import designPatterns.decoratorDesignPattern.pizza.Volcano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new BasePizza();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Dominos");
        System.out.println("*** Select Your Pizza ***");
        System.out.println("1. PaneerChilli");
        System.out.println("2. Farmhouse");
        System.out.println("3. Volcano");
        System.out.print("Enter your choice (1-3): ");
        boolean repeat = true;
        while (repeat) {
            int no = scanner.nextInt();
            switch (no) {
                case 1:
                    basePizza = new PaneerChilli(basePizza);
                    break;
                case 2:
                    basePizza = new Farmhouse(basePizza);
                    break;
                case 3:
                    basePizza = new Volcano(basePizza);
                    break;
                case 4:
                    repeat = false;
                    break;
            }
        }

        System.out.println("*** Select Your Topings ***");
        System.out.println("1. Extra Cheese");
        System.out.println("2. Extra Spicy");
        System.out.print("Enter your choice (1-2): and 3 to exit");
        boolean repeat1 = true;

        while (repeat1) {
            int no2 = scanner.nextInt();
            switch (no2) {
                case 1:
                    basePizza = new ExtraCheese(basePizza);
                    break;
                case 2:
                    basePizza = new ExtraSpicy(basePizza);
                    break;
                case 3:
                    repeat1 = false;
                    break;
            }
        }
        System.out.println("Please pay: " + basePizza.cost());
    }
}
