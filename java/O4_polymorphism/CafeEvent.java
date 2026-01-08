package java.O4_polymorphism;
public abstract class CafeEvent {
    protected String name;

    public CafeEvent(String name) {
        this.name = name;
    }

    public abstract void perform(); // Pure virtual-like

    public abstract double getTicketPrice();

    // Overloaded method (compile-time poly)
    public void schedule() {
        System.out.println("Scheduling event: " + name);
    }

    public void schedule(String promo) {
        System.out.println("Scheduling " + name + " with promo: " + promo);
    }
}
