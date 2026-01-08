package O5_inheritance;

public class Croissant extends Pastry {
    private int butterLayers;

    public Croissant(String name, double price, int butterLayers) {
        super(name, price, "Flaky");
        this.butterLayers = butterLayers;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Butter layers: " + butterLayers);
    }
}
