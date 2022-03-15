package app.vendingMachines.inside;

import app.AbstractItem;
import app.vendingMachines.AbstractVendingMachine;

import java.util.ArrayList;
/**
 * Класс торгового автомата который может стоять в закрытых помещениях
 */
abstract class InsideVendingMachine extends AbstractVendingMachine {
    ArrayList<AbstractItem> items;

    /**
     * Добавляет товар в автомат
     */
    @Override
    public void additem(AbstractItem item) {
        this.items.add(item);
    }

    @Override
    public ArrayList<AbstractItem> getItems() {
        return this.items;
    }
}