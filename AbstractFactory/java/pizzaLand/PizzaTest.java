package pizzaLand;

public class PizzaTest {

    public static void main(String[] args) {

        PizzaStore pizzaStore;

        pizzaStore = new MPPizzaStore();

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggi");
    }
    
}
