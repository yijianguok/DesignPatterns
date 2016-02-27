package structural.compositeEntityPattern;

/**
 * Created by tianhai on 27/02/16 for the project DesignPatterns.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test 1", "Data 1");
        client.printData();
        client.setData("Test 2", "Data 2");
        client.printData();
    }
}
