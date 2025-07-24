package problems.VendingMachineStateDesignPattern.States;

import problems.VendingMachineStateDesignPattern.Interface.VendingMachineState;
import problems.VendingMachineStateDesignPattern.Product;
import problems.VendingMachineStateDesignPattern.VendingMachine;

public class Dispense implements VendingMachineState {

    int id;
    public Dispense(int id){
        this.id = id;
    }
    @Override
    public void insertMoney(VendingMachine vendingMachine, double money) {

    }
    @Override
    public void selectProduct(VendingMachine vendingMachine, int id) {

    }

    @Override
    public Product dispense(VendingMachine vendingMachine) {
        if (!vendingMachine.isProductAvailable(id)) {
            System.out.println("product is not available , please select another product");
            return null;
        } else if ((vendingMachine.getBalance() >= vendingMachine.getProductPrice(id))) {
            vendingMachine.deductBalance(vendingMachine.getProductPrice(id));
            vendingMachine.setCurrentState(new Idle());
            return vendingMachine.getProduct(id);
        } else {
            System.out.println("no money , please add enough money");
            return null;
        }
    }
}
