package pizzaStore;
public abstract class Pizza {

    abstract public void prepare();

    public void bake() {
        System.out.println("Baking done!!");
    }

    public void cut(){
        System.out.println("Done cutting");
    }

    public void box() {
        System.out.println("Boxed it");
    }
}