import pizza.PizzaBase;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final int orderNumber;
    private final List<PizzaBase> pizzas;
    private boolean isReady = false;

    public Order(int orderNumber, List<PizzaBase> pizzas) {
        this.orderNumber = orderNumber;
        this.pizzas = pizzas;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<PizzaBase> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean isReady() {
        return isReady;
    }
}
