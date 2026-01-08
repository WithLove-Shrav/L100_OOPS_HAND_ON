abstract class Beverage {
    constructor(protected name: string) {}

    abstract prepare(): void;

    serve(): void {
        console.log(`Serving ${this.name} in a cozy cup ☕`);
    }
}

class Coffee extends Beverage {
    constructor() {
        super("Latte");
    }

    prepare(): void {
        console.log("Grinding beans...");
        console.log("Pulling espresso...");
        console.log("Steaming milk & art ❤️");
    }
}

class Tea extends Beverage {
    constructor() {
        super("Herbal Tea");
    }

    prepare(): void {
        console.log("Heating water...");
        console.log("Steeping...");
        console.log("Adding honey");
    }
}

// Demo
const latte = new Coffee();
latte.prepare();
latte.serve();