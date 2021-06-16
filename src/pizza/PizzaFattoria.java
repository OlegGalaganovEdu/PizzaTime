package pizza;

public class PizzaFattoria extends PizzaBase{

    private static final String PIZZA_NAME = "Fattoria";

    @Override
    public String getPizzaName() {
        return PIZZA_NAME;
    }
}
