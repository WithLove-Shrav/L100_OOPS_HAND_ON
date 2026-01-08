
public class Main {
    public static void main(String[] args) {
        PastryItem croissant = new PastryItem("Croissant", 4.50, new String[] { "flour", "butter", "secret" });
        PastryItem muffin = new PastryItem("Blueberry Muffin", 3.75, new String[] { "blueberries", "sugar" });

        Customer alice = new Customer("Alice");

        croissant.displayInfo();
        alice.orderPastry(croissant);
    }
}