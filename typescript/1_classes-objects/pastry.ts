
class Pastry {
    public name: string;              // public (default anyway)
    private price: number;
    private ingredients: string[];

    constructor(name: string, price: number, ingredients: string[]) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public displayInfo(): void {
        console.log(`Pastry: ${this.name} | Price: $${this.price}`);
    }

    public getPrice(): number {
        return this.price;
    }
}

class Customer {
    constructor(public customerName: string) {}

    orderPastry(pastry: Pastry): void {
        console.log(`${this.customerName} orders a ${pastry.name}`);
        console.log(`That will be $${pastry.getPrice()}`);
    }
}

// Demo
const croissant = new Pastry("Croissant", 4.50, ["flour", "butter"]);
const alice = new Customer("Alice");
croissant.displayInfo();
alice.orderPastry(croissant);