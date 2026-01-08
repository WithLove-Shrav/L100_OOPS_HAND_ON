public final class Pastry extends RestaurantMenuItem { // final class - no further extend
    private String type;

    public Pastry(String name, String type) {
        super(name); // call parent ctor
        this.type = type;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE + 2.5;
    }
}
