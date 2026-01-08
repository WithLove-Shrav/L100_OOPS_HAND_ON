// menu-item.ts
abstract class MenuItem {
    protected readonly basePrice: number = 2.0; // constant-like

    constructor(protected name: string) { }

    abstract getPrice(): number;

    display(): void {
        console.log(`${this.name} - $${this.getPrice()}`); // 'this'
    }
}

class Pastry extends MenuItem {
    constructor(name: string, private type: string) {
        super(name); // super ctor
    }

    getPrice(): number {
        return this.basePrice + 2.5;
    }
}

class Cafe {
    static totalItemsSold: number = 0;

    static sell(item: MenuItem) {
        item.display();
        Cafe.totalItemsSold++;
    }
}

// Demo
const croissant = new Pastry("Croissant", "Butter");
Cafe.sell(croissant);
console.log("Total sold:", Cafe.totalItemsSold);

export { }; // Make this a module
