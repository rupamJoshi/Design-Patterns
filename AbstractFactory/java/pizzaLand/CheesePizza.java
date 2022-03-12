package pizzaLand;

public class CheesePizza extends Pizza {

    IngridientFactory factory;

    public CheesePizza(IngridientFactory factory ) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Name "+ name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
    
}
