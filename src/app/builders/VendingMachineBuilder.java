package app.builders;

import app.AbstractItem;
import app.vendingMachines.AbstractVendingMachine;

public class VendingMachineBuilder extends Builder {
    /**
     * Метод наполнения торгового автомата каким-либо предметом.
     * @param machine торговый автомат
     * @param item предмет
     */
    @Override
    public void fillMachine(AbstractVendingMachine machine, AbstractItem item) {
        machine.additem(item);
    }
}
