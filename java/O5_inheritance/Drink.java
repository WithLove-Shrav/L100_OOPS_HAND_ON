package O5_inheritance;

public class Drink extends MenuItem {
    private boolean hot;

    public Drink(String name, double price, boolean hot) {
        super(name, price);
        this.hot = hot;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Served " + (hot ? "hot" : "cold"));
    }
}
