package app.vendingMachines.openAir;

import app.AbstractItem;
import app.juices.RichJuice;
import app.vendingMachines.AbstractVendingMachine;
import app.vendingMachines.VendingMachineFactory;
/**
 * Factory для уличного торгового автомата который продаёт только сок Rich.
 */
public class OpenAirVendingMachineFactory extends VendingMachineFactory {
    /**
     * @return Уличный торговый автомат
     */
    @Override
    public AbstractVendingMachine createMachine() {
        return new OpenAirVendingMachine();
    }

    /**
     * @return сок Rich
     */
    @Override
    public AbstractItem createItem() {
        return new RichJuice();
    }
}
