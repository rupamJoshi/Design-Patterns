package pizzaLand;


public class MPStyleIngridientFactory implements IngridientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new RedSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianCheese();
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