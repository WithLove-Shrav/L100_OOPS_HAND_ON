package O7_abstraction;

public class Tea extends Beverage {
    public Tea() {
        super("Herbal Tea");
    }

    @Override
    public void prepare() {
        System.out.println("Heating water...");
        System.out.println("Steeping tea bag...");
        System.out.println("Adding honey if requested");
    }
}
