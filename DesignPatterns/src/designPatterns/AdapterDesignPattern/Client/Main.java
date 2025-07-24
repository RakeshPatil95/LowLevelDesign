package designPatterns.AdapterDesignPattern.Client;

import designPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import designPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import designPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
