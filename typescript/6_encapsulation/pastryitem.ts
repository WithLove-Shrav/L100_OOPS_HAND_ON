class PastryItem {
    private stockLevel: number;
    private secretIngredients: string[];
    constructor(private name: string, private price: number, initialStock: number, ingredients: string[]) {
        this.stockLevel = initialStock;
        this.secretIngredients = ingredients;
    }
    getStockLevel(): number {
        return this.stockLevel;
    }
    addStock(quantity: number): void {
        if (quantity > 0) {
            this.stockLevel += quantity;
            console.log(`Added ${quantity} to stock.`);
        } else {
            console.log("Invalid quantity!");
        }
    }
    order(quantity: number): boolean {
        if (quantity > 0 && quantity <= this.stockLevel) {
            this.stockLevel -= quantity;
            console.log(`Ordered ${quantity} ${this.name}(s). Remaining: ${this.stockLevel}`);
            return true;
        } else {
            console.log("Not enough stock!");
            return false;
        }
    }
}
// Demo
const croissant = new PastryItem("Croissant", 4.5, 20, ["butter", "secret"]);
console.log("Stock:", croissant.getStockLevel());
croissant.order(5);
croissant.addStock(10);
// Can't access croissant.stockLevel directly