package O5_inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new Croissant("Butter Croissant", 4.5, 27));
        menu.add(new Drink("Latte", 5.0, true));

        for (MenuItem item : menu) {
            item.display(); // Reusability + polymorphism
        }
    }
}
