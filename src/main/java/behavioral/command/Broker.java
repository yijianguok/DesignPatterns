package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianhai on 03/03/16 for the project DesignPatterns.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
