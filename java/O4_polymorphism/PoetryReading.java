package java.O4_polymorphism;
public class PoetryReading extends CafeEvent {
    private String poet;

    public PoetryReading(String name, String poet) {
        super(name);
        this.poet = poet;
    }

    @Override
    public void perform() {
        System.out.println(poet + " is reciting meaningful verses.");
    }

    @Override
    public double getTicketPrice() {
        return 5.0;
    }
}
