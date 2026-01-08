abstract class CafeEvent {
    protected name: string;

    constructor(name: string) {
        this.name = name;
    }
    abstract perform(): void;
    abstract getTicketPrice(): number;
    // Overloading simulation (TS supports via signatures)
    schedule(): void;
    schedule(promo: string): void;
    schedule(promo?: string): void {
        if (promo) {
            console.log(`Scheduling ${this.name} with ${promo}`);
        } else {
            console.log(`Scheduling ${this.name}`);
        }
    }
}
class MusicEvent extends CafeEvent {
    private artist: string;
    constructor(name: string, artist: string) {
        super(name);
        this.artist = artist;
    }
    perform(): void {
        console.log(`${this.artist} is rocking the stage with live music!`);
    }
    getTicketPrice(): number {
        return 15.0;
    }
}
class PoetryReading extends CafeEvent {
    private poet: string;
    constructor(name: string, poet: string) {
        super(name);
        this.poet = poet;
    }
    perform(): void {
        console.log(`${this.poet} is reciting meaningful verses.`);
    }
    getTicketPrice(): number {
        return 5.0;
    }
}

// Main execution
const events: CafeEvent[] = [];
events.push(new MusicEvent("Jazz Night", "Local Trio"));
events.push(new PoetryReading("Open Mic Poetry", "Various"));

for (const event of events) {
    event.schedule(); // Overloaded possible
    event.perform(); // Runtime polymorphism!
    console.log(`Price: $${event.getTicketPrice()}`);

    if (event instanceof MusicEvent) { // instanceof
        console.log("Turn up the volume!");
    }
}
