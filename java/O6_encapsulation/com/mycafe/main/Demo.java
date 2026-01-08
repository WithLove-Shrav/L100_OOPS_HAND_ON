package com.mycafe.main;

import com.mycafe.inventory.PastryItem;

public class Demo {
    public static void main(String[] args) {
        PastryItem croissant = new PastryItem("Croissant", 4.5, 20, new String[] { "butter", "secret yeast" });

        System.out.println("Stock: " + croissant.getStockLevel());
        croissant.order(5);
        croissant.addStock(10);
        croissant.order(30); // Denied!

        // Can't do: croissant.stockLevel = -10; // Compile error – private!
    }
}
