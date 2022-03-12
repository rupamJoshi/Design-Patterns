package pizzaLand;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("Baking done!!");
    }

    public void cut(){
        System.out.println("Done cutting");
    }

    public void box() {
        System.out.println("Boxed it");
    }

    public void setName(String name) {
        this.name = name;
    }

}
