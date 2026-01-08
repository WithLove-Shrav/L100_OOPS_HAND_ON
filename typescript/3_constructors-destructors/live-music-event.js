// live-music-event.ts
var LiveMusicEvent = /** @class */ (function () {
    function LiveMusicEvent(artist, hour) {
        this.artist = artist;
        this.startTime = new Date();
        this.startTime.setHours(hour, 0, 0);
        console.log("Event constructed: ".concat(artist, " starting at ").concat(this.startTime.toLocaleTimeString()));
        // Setup: reserve seats, etc.
    }
    LiveMusicEvent.prototype.endEvent = function () {
        console.log("Event ended: Stage cleared for ".concat(this.artist));
    };
    return LiveMusicEvent;
}());
// Demo
var tonight = new LiveMusicEvent("Indie Band", 21);
tonight.endEvent(); // Call manually or in finally block
