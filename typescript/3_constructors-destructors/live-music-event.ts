// live-music-event.ts
class LiveMusicEvent {
    private artist: string;
    private startTime: Date;

    constructor(artist: string, hour: number) {
        this.artist = artist;
        this.startTime = new Date();
        this.startTime.setHours(hour, 0, 0);
        console.log(`Event constructed: ${artist} starting at ${this.startTime.toLocaleTimeString()}`);
        // Setup: reserve seats, etc.
    }

    endEvent(): void { // Manual cleanup
        console.log(`Event ended: Stage cleared for ${this.artist}`);
    }
}

// Demo
const tonight = new LiveMusicEvent("Indie Band", 21);
tonight.endEvent(); // Call manually or in finally block