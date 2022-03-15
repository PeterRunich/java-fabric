package app.builders;

import app.AbstractItem;
import app.vendingMachines.AbstractVendingMachine;
/**
 * Абстрактный builder для VendingMachine
 */
public abstract class Builder {
    abstract void fillMachine(AbstractVendingMachine machine, AbstractItem item);
}
