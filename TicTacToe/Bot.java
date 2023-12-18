import java.util.Random;

public class Bot extends Spieler {

    // Konstruktor
    public Bot(String zeichen, String name) {
        super(zeichen, name);
    }

    // Fragt nach einer zahl zwischen 1 und 9
    public int naechsterZug() {

        int naechsterZug = new Random().nextInt(9);
        return naechsterZug;
    }
}