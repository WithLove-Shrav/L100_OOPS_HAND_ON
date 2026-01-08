package com.mycafe.inventory;
public class PastryItem {
    private String name;
    private double price;
    private int stockLevel; // Private: hidden
    private String[] secretIngredients; // Private: recipe protected

    public PastryItem(String name, double price, int initialStock, String[] ingredients) {
        this.name = name;
        this.price = price;
        this.stockLevel = initialStock;
        this.secretIngredients = ingredients;
    }
    // Public getter
    public String getName() {
        return name;
    }

    public int getStockLevel() {
        return stockLevel;
    }
    // Controlled setter with validation
    public void addStock(int quantity) {
        if (quantity > 0) {
            stockLevel += quantity;
            System.out.println("Added " + quantity + " to stock.");
        } else {
            System.out.println("Invalid quantity!");
        }
    }
    // Public method using private data
    public boolean order(int quantity) {
        if (quantity > 0 && quantity <= stockLevel) {
            stockLevel -= quantity;
            System.out.println("Ordered " + quantity + " " + name + "(s). Remaining: " + stockLevel);
            return true;
        } else {
            System.out.println("Not enough stock or invalid order!");
            return false;
        }
    }
    // No direct access to secretIngredients!
}
