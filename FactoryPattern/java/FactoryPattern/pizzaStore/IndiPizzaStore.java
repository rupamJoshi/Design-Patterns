package pizzaStore;

public class IndiPizzaStore extends PizzaStore {
    
    public Pizza createPizza(String type) {

        if(type.equals("cheese")) {
            return new IndiCheesePizza();
        }

        if(type.equals("veggi")) {
           return new IndiVeggiPizza();
        }

        return null;

    }

}
