package pizzaLand;


public class KAStyleIngridientFactory implements IngridientFactory{

    @Override
    public Dough createDough() {
        return new CheesyCurstDough();
    }

    @Override
    public Sauce createSauce() {
        return new WhiteSauce();
    }

    @Override
    public Cheese createCheese() {
        return new JerryCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Gralic() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new RostedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new SteamedClams();
    }
    
}
