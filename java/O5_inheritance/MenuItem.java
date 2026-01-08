package O5_inheritance;

public class MenuItem {
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - $" + price);
    }
}
