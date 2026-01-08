package O7_abstraction;

public class Coffee extends Beverage {
    public Coffee() {
        super("Latte");
    }

    @Override
    public void prepare() {
        System.out.println("Grinding beans...");
        System.out.println("Pulling espresso shot...");
        System.out.println("Steaming milk & pouring latte art ");
        // Complex details hidden!
    }
}
