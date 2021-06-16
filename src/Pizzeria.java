import pizza.PizzaBase;
import pizza.PizzaCarbonara;
import pizza.PizzaFattoria;
import pizza.PizzaMargherita;

import java.util.*;

public class Pizzeria {

    private static final String MENU = """
            1: Margherita
            2: Fattoria
            3: Carbonara \s""";

    private static final Map<Integer, PizzaBase> ALL_PIZZAS = new HashMap<>();
    private static int orderCounter = 0;

    public Pizzeria() {
        ALL_PIZZAS.put(1, new PizzaMargherita());
        ALL_PIZZAS.put(2, new PizzaFattoria());
        ALL_PIZZAS.put(3, new PizzaCarbonara());
    }

    public String getMENU() {
        return MENU;
    }

    public static synchronized Order createOrder(List<Integer> list) {
        orderCounter++;
        List<PizzaBase> pizzasForOrder = new ArrayList<>();
        for (int item : list) {
            if (item > 0 && item < ALL_PIZZAS.size()) {
                pizzasForOrder.add(ALL_PIZZAS.get(item));
            }
        }
        Order order = new Order(orderCounter, pizzasForOrder);
        System.out.println("Order " + order.getOrderNumber() + " in queue");
        Cook cook = new Cook(order);
        cook.start();
        return order;
    }
}
