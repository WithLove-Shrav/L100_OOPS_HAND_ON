package O7_abstraction;

public abstract class Beverage {
    protected String name;

    public Beverage(String name) {
        this.name = name;
    }

    // Abstract method – must implement
    public abstract void prepare();

    // Concrete method – shared
    public void serve() {
        System.out.println("Serving " + name + " in a cozy cup ☕");
    }
}
