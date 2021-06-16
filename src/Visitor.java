
import java.util.ArrayList;
import java.util.List;

public class Visitor extends Thread {

    private final String name;
    private Order order;

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            choosePizza();
            System.out.println(name + ": I choose!");
            order = Pizzeria.createOrder(choosePizza());
            while (!order.isReady()) {
                Thread.sleep(5000);
            }
            eatPizza();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eatPizza() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 5000));
        if (order != null) {
            System.out.println(name + ": "
                    + order.getPizzas().get((int)(Math.random() * order.getPizzas().size())).getPizzaName()
                    + " - best pizzas ever!");
        } else {
            System.out.println("Я не получил свой заказ!");
        }
    }

    private List<Integer> choosePizza() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 5000));
        List<Integer> myOrder = new ArrayList<>();
        int howMuchPizzas = (int) (Math.random() * 3 + 1);
        for (int i = 1; i <= howMuchPizzas; i++) {
            myOrder.add(i);
        }
        return myOrder;
    }
}
