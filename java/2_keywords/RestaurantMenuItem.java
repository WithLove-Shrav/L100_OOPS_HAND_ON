public abstract class RestaurantMenuItem {
    protected String name;
    protected final double BASE_PRICE = 2.0; // constant

    public RestaurantMenuItem(String name) {
        this.name = name;
    }

    public abstract double getPrice(); // must override

    public void display() {
        System.out.println(this.name + " - $" + this.getPrice()); // 'this' usage
    }
}
