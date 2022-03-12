package pizzaLand;


public class VeggiPizza extends Pizza {


    IngridientFactory factory;

    public VeggiPizza(IngridientFactory factory ) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Name "+ name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        veggies = factory.createVeggies();
        pepperoni = factory.createPepperoni();
    }
    
}
