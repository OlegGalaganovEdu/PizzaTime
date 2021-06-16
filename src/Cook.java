public class Cook extends Thread{

    private Order order;

    public Cook(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
            System.out.println("Order " + order.getOrderNumber() + " ready");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        order.setReady(true);
    }
}
