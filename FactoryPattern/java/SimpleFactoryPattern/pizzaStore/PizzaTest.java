package pizzaStore;


public class PizzaTest {

    public static void main(String[] args) {

        PizzaStore pizzaStore;

        pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggi");
    }
    
}
