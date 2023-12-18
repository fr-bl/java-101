import java.util.Random;
import java.util.Scanner;

public class NoRiskNoMoney {

    int currentProfit;

    // Deklaration des Arrays, in dem fuer jede Augenzahl gespeichert wird, ob sie
    // schon gewuerfelt wurde
    boolean[] gewuerfelt;

    public NoRiskNoMoney() {
        currentProfit = 0;
        // Initalisierung des Arrays: Erzeuge ein Array und weise jedem Feld den
        // Initialwert false zu
        gewuerfelt = new boolean[6];
    }

    private int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;

        return randomNumber;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willst du das Spiel starten?  [true/false] ");
        boolean proceed = scanner.nextBoolean();

        while (proceed) {
            int randomNumber = generateRandomNumber();
            System.out.println("Du hast " + randomNumber + " gewürfelt.");
            if (/* Bedingungm, dass das Spiel weitergeht */
            !gewuerfelt[randomNumber - 1]) {
                // Die Zahl wurde noch nicht gewuerfelt: Was soll dann passieren?
                gewuerfelt[randomNumber - 1] = true;
                currentProfit += 1;
                System.out.println("Du hast nun " + currentProfit
                        + " auf dem Spiel.");
            } else {
                System.out.println("Das Spiel ist verloren und du gewinnst nichts.");
                break;
            }
            System.out.println("Willst du weiterspielen?  [true/false] ");
            proceed = scanner.nextBoolean();
        }
        if (!proceed) {
            System.out.println("Du hast " + currentProfit + " gewonnen!");
        }
    }

    public static void main(String[] args) {
        NoRiskNoMoney game = new NoRiskNoMoney();
        game.play();
    }
}