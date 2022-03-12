package pizzaLand;


public class MPPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza =null;

        IngridientFactory factory = new MPStyleIngridientFactory();

        if(type.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("MP Cheese Pizza");
            return pizza;

        }

        if(type.equals("veggi")) {
            pizza = new VeggiPizza(factory);
            pizza.setName("MP Veggi Pizza");
            return pizza;
        }

        return pizza;
    }
    
}
