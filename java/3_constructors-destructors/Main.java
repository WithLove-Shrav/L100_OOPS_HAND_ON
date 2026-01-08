import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        try (LiveMusicEvent event = new LiveMusicEvent("Jazz Trio", LocalTime.of(20, 0), 80)) { // try-with-resources for auto-close if Closeable
            // Event happens...
        } // Auto calls close() if implemented – simulates destructor
    }
}