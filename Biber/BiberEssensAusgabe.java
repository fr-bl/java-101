import java.util.*;

public class BiberEssensAusgabe {

	// Instanzvariablen: Biber-Schlange und Teller-Stapel
	Queue<Biber> biberQueue;
	Stack<Teller> tellerStack;

	// Konstruktor
	public BiberEssensAusgabe() {
		// Teller-Stack initialisieren
		tellerStack = new Stack<Teller>();

		// Biber-Queue generieren
		generateBiberQueue();
	}

	// Analysiert die Biber-Schlange und erstellt dabei zunaechst einen temporaeren
	// Teller-Stapel.
	// Am Ende muss der temporaere Teller-Stapel auf den eigentlichen Ausgabe-Stapel
	// umgedreht werden.
	public void tellerStapeln() {
		Stack<Teller> temporaryTellerStack = new Stack<Teller>();

		for (Biber biber : biberQueue) {
			temporaryTellerStack.push(new Teller(biber.getGroesse()));
		}
		for (Teller teller : temporaryTellerStack) {
			tellerStack.push(teller);
		}
	}

	// Nimmt fuer jeden Biber in der Schlange einen Teller vom Stapel.
	public void essenAusgeben() {
		while (!biberQueue.isEmpty()) {
			biberQueue.dequeue();
			tellerStack.pop();
		}
	}

	private void generateBiberQueue() {
		Random random = new Random();

		biberQueue = new Queue<Biber>();
		for (int i = 0; i < random.nextInt(5) + 5; i++) {
			String biberGroesse = random.nextBoolean() ? "gross" : "klein";
			Biber biber = new Biber("Biber " + i, biberGroesse);

			biberQueue.enqueue(biber);
		}
	}

	public static void main(String[] args) {
		BiberEssensAusgabe biberEssensAusgabe = new BiberEssensAusgabe();

		biberEssensAusgabe.tellerStapeln();
		for (Biber biber : biberEssensAusgabe.biberQueue) {
			System.out.println(biber);
		}
		for (Teller teller : biberEssensAusgabe.tellerStack) {
			System.out.println(teller);
		}
		biberEssensAusgabe.essenAusgeben();
	}

}