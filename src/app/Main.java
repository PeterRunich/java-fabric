package app;

import app.builders.VendingMachineBuilder;
import app.vendingMachines.AbstractVendingMachine;
import app.vendingMachines.openAir.OpenAirVendingMachineFactory;

public class Main {
    public static void main(String[] args) {
        OpenAirVendingMachineFactory machineFactory = new OpenAirVendingMachineFactory();
        AbstractVendingMachine machine = machineFactory.createMachine();
        AbstractItem item = machineFactory.createItem();

        VendingMachineBuilder machineBuilder = new VendingMachineBuilder();
        machineBuilder.fillMachine(machine, item);

        System.out.println(machine.getItems());
    }
}



















