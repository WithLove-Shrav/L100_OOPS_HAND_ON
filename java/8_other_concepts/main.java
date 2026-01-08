

public // Beverage.java (for dynamic binding)
abstract class Beverage {
    abstract void prepare();
}

// Coffee.java
class Coffee extends Beverage {
    @Override void prepare() { System.out.println("Preparing coffee..."); }
}

// Barista.java (message passing)
class Barista {
    void takeOrder(Beverage drink, Integer quantity) {  // Wrapper Integer
        System.out.println("Barista receives order for " + quantity + " drinks");
        drink.prepare();  // Dynamic binding
    }
}

// Order.java (cloneable)
class Order implements Cloneable {
    Beverage drink;
    Integer quantity;

    Order(Beverage drink, Integer quantity) {
        this.drink = drink;
        this.quantity = quantity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow – fine here
    }
}

// Main.java
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Barista barista = new Barista();
        Beverage coffee = new Coffee();

        Order original = new Order(coffee, 2);  // Autoboxing int → Integer

        barista.takeOrder(coffee, 2);  // Message passing + dynamic

        Order cloned = (Order) original.clone();  // Cloning
        System.out.println("Cloned order ready for loyalty duplicate!");
    }
}
