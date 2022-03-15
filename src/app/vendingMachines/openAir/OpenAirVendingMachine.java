package app.vendingMachines.openAir;

import app.AbstractItem;
import app.vendingMachines.AbstractVendingMachine;

import java.util.ArrayList;
/**
 * Класс торгового автомата который может стоять на улице
 */
public class OpenAirVendingMachine extends AbstractVendingMachine {
    ArrayList<AbstractItem> items = new ArrayList<>();

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