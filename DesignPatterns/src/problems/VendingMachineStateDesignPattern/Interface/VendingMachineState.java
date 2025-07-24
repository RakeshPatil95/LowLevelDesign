package problems.VendingMachineStateDesignPattern.Interface;

import problems.VendingMachineStateDesignPattern.Product;
import problems.VendingMachineStateDesignPattern.VendingMachine;

public interface VendingMachineState {
    void insertMoney(VendingMachine vendingMachine , double money);
    void selectProduct(VendingMachine vendingMachine , int id);
    Product dispense(VendingMachine vendingMachine);
}
