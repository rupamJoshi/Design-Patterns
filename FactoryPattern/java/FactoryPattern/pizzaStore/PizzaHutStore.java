package pizzaStore;

import pizzaStore.PizzaHutVeggiPizza;

public class PizzaHutStore extends PizzaStore {

    public Pizza createPizza(String type) {

        if(type.equals("cheese")) {
            return new PizzaHutCheesePizza();
        }

        if(type.equals("veggi")) {
           return new PizzaHutVeggiPizza();
        }

        return new PizzaHutCheesePizza();

    }
    
}
