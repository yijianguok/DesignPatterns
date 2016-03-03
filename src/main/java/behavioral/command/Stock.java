package behavioral.command;

/**
 * Created by tianhai on 03/03/16 for the project DesignPatterns.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + "," +
                "Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + "," +
                "Quantity: " + quantity + " ] sold");
    }
}
