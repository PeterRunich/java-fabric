package app.vendingMachines;

import app.AbstractItem;

public abstract class VendingMachineFactory {
    public abstract AbstractVendingMachine createMachine();
    public abstract AbstractItem createItem();
}