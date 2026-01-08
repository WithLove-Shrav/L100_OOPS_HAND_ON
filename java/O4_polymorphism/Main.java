package java.O4_polymorphism;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CafeEvent> events = new ArrayList<>();
        events.add(new MusicEvent("Jazz Night", "Local Trio"));
        events.add(new PoetryReading("Open Mic Poetry", "Various"));

        for (CafeEvent event : events) {
            event.schedule(); // Overloaded possible
            event.perform(); // Runtime polymorphism!
            System.out.println("Price: $" + event.getTicketPrice());

            if (event instanceof MusicEvent) { // instanceof
                System.out.println("Turn up the volume!");
            }
        }
    }
}
