import java.util.Scanner;

public class Spieler {
    private Scanner scanner;

    // Instanzvariablen der Klasse
    private String name;
    private String zeichen;

    // Konstruktor
    public Spieler(String zeichen, String name) {
        scanner = new Scanner(System.in);
        this.name = name;
        this.zeichen = zeichen;
    }

    // Getter-Methoden
    public String getName() {
        return name;
    }

    public String getZeichen() {
        return zeichen;
    }

    // Fragt nach einer zahl zwischen 1 und 9
    public int naechsterZug() {
        System.out.print(name + " naechster Zug (Zahl 0-8): ");
        int naechsterZug = scanner.nextInt();
        return naechsterZug;
    }
}