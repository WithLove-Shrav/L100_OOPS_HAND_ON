package java.O4_polymorphism;
public class MusicEvent extends CafeEvent {
    private String artist;

    public MusicEvent(String name, String artist) {
        super(name);
        this.artist = artist;
    }

    @Override
    public void perform() {
        System.out.println(artist + " is rocking the stage with live music!");
    }

    @Override
    public double getTicketPrice() {
        return 15.0;
    }
}
