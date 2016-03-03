package behavioral.command;

/**
 * Created by tianhai on 03/03/16 for the project DesignPatterns.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
