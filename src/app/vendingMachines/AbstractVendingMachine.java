package app.vendingMachines;

import app.AbstractItem;

import java.util.ArrayList;

public abstract class AbstractVendingMachine {
    public ArrayList<AbstractItem> items;

    public abstract void additem(AbstractItem item);

    public abstract ArrayList<AbstractItem> getItems();
}