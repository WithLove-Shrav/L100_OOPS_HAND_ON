import java.time.LocalTime;

public class LiveMusicEvent implements AutoCloseable {
    private String artist;
    private LocalTime startTime;
    private int reservedSeats;

    // Parameterized constructor
    public LiveMusicEvent(String artist, LocalTime startTime, int seats) {
        this.artist = artist;
        this.startTime = startTime;
        this.reservedSeats = seats;
        System.out.println("Event constructed: " + artist + " at " + startTime);
        // Other tasks: "Setup stage lights"
    }

    // Default constructor
    public LiveMusicEvent() {
        this("Open Mic Night", LocalTime.of(19, 0), 50);
    }

    @Override
    public void close() { // Renamed from endEvent to satisfy AutoCloseable
        System.out.println("Event ended: Clearing stage for " + artist);
        // Release resources
    }
}