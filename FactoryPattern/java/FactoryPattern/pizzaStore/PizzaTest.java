package pizzaStore;


public class PizzaTest {

    public static void main(String[] args) {

        PizzaStore pizzaStore;

        pizzaStore = new IndiPizzaStore();

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggi");

        pizzaStore = new PizzaHutStore();

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggi");
    }
    
}
