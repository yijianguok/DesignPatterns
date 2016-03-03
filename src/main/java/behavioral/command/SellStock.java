package behavioral.command;

/**
 * Created by tianhai on 03/03/16 for the project DesignPatterns.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
