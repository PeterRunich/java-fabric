package app.juices;
/**
 * Сок Rich
 */
public class RichJuice extends AbstractJuice {
    public int price = 10;

    /**
     * @return имя сока
     */
    @Override
    public String name() {
        return "Rich apple";
    }
}