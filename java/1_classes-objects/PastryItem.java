public class PastryItem {
    public String name; // public: anyone can see
    private double price; // private: only this class
    private String[] ingredients; // private

    // Constructor
    public PastryItem(String name, double price, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    // Member function (inner)
    public void displayInfo() {
        System.out.println("Pastry: " + name + " | Price: $" + price);
        // ingredients hidden outside
    }

    // Getter for private field
    public double getPrice() {
        return price;
    }
}
