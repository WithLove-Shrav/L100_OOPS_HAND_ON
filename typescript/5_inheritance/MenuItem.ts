class MenuItem {
    constructor(protected name: string, protected price: number) {}

    display(): void {
        console.log(`${this.name} - $${this.price}`);
    }}
class Pastry extends MenuItem {
    constructor(name: string, price: number, protected type: string) {
        super(name, price);
    }

    override display(): void {
        super.display();
        console.log(`Type: ${this.type}`);
    }}
class Croissant extends Pastry {
    constructor(name: string, price: number, private butterLayers: number) {
        super(name, price, "Flaky");
    }
    override display(): void {
        super.display();
        console.log(`Butter layers: ${this.butterLayers}`);
    }}
class Drink extends MenuItem {
    constructor(name: string, price: number, private hot: boolean) {
        super(name, price);
    }
    override display(): void {
        super.display();
        console.log(`Served ${this.hot ? "hot" : "cold"}`);
    }}
// Demo
const menu: MenuItem[] = [
    new Croissant("Butter Croissant", 4.5, 27),
    new Drink("Latte", 5.0, true)
];
menu.forEach(item => item.display());