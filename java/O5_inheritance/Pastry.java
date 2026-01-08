package O5_inheritance;

public class Pastry extends MenuItem {
    protected String type;

    public Pastry(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: " + type);
    }
}
