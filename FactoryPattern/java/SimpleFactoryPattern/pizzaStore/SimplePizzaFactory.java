package pizzaStore;


public class SimplePizzaFactory {
    public Pizza createPizza(String type) {

        if(type.equals("cheese")) {
            return new CheesePizza();
        }

        if(type.equals("veggi")) {
           return new VeggiPizza();
        }

        return new VeggiPizza();
    }
}
