import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Wettlauf {

    // Deklaration des Arrays
    Laeufer[] laeufer;

    public Wettlauf() {
        // Intialisierung eines Arrays mit der Groesse 6
        laeufer = new Laeufer[6];
    }

    private double generateRandomNumber() {
        Random random = new Random();
        double randomNumber = random.nextDouble() * 11 + 10;

        return randomNumber;
    }

    // Implmentierung der Methode anDenStart()
    public void anDenStart(Laeufer laeufer, int position) {
        this.laeufer[position - 1] = laeufer;
    }

    // Implementierung der Methode rennenLaufen()
    public void rennenLaufen() {
        for (Laeufer laeufer : laeufer) {
            if (laeufer == null)
                continue;
            laeufer.setZeit(generateRandomNumber());
            laeufer.setQualifiziert(false);
        }

        Arrays.sort(laeufer, Comparator.nullsLast(Comparator.naturalOrder()));
        laeufer[0].setQualifiziert(true);
    }

    // Implementierung der Methode ergebnisAusgeben()
    public void ergebnisAusgeben() {
        int position = 1;
        for (Laeufer laeufer : laeufer) {
            if (laeufer == null)
                break;
            System.out.println(position + ". " + laeufer.toString());
            position++;
        }
    }

    public static void main(String[] args) {
        Laeufer laeufer1 = new Laeufer("Usain Bolt");
        Laeufer laeufer2 = new Laeufer("John Cena");
        Laeufer laeufer3 = new Laeufer("Subway Surfer");
        Laeufer laeufer4 = new Laeufer("Sanik");
        Laeufer laeufer5 = new Laeufer("Blade Runner");
        Laeufer laeufer6 = new Laeufer("Steve");
        // weitere Lauefer

        Wettlauf wettlauf = new Wettlauf();
        wettlauf.anDenStart(laeufer1, 1);
        wettlauf.anDenStart(laeufer2, 2);
        wettlauf.anDenStart(laeufer3, 3);
        wettlauf.anDenStart(laeufer4, 4);
        wettlauf.anDenStart(laeufer5, 5);
        wettlauf.anDenStart(laeufer6, 6);
        // Laeufer an den Start schicken

        wettlauf.rennenLaufen();
        wettlauf.ergebnisAusgeben();
    }
}