import java.util.Scanner;

public class Ticketautomat {
	public double preis;
	public double betrag;
	public double gesamt;
	
	public Ticketautomat(double preis, double betrag, double gesamt) {
		this.preis = preis;
		this.betrag = betrag;
		this.gesamt = gesamt;
	}
	
	public Ticketautomat(double preis, double betrag) {
		new Ticketautomat(preis, betrag, 0);
	}
	
	public Ticketautomat(double preis) {
		new Ticketautomat(preis, 0);
	}
	
	public void geldEinzahlen(double betrag) {
		this.betrag += betrag;
		gesamt += betrag;
		
		System.out.println("Es wurden " + betrag + " eingeworfen.");
	}
	
	public boolean sollTicketAusgeben() {
		return this.betrag >= preis;
	}
	
	public void betragAnzeigen() {
		System.out.println("Der derzeitige Betrag ist " + betrag + " von " + preis);
		System.out.println("Es fehlen noch " + (preis - betrag));
	}
	
	public void ticketAusgeben() {
		System.out.println("Sie erhalten ein Ticket für " + preis);
	}
	
	public void wechselgeldGeben() {
		double change = betrag - preis;
		betrag = 0;
		gesamt -= change;
	
		if (change > 0) {
			System.out.println("Sie erhalten außerdem ein Wechselgeld von " + change);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Geben Sie den Ticketpreis an: ");
			double preis = scanner.nextDouble();
			Ticketautomat automat = new Ticketautomat(preis);
			
			boolean zahlen = true;
			while (zahlen) {
				System.out.print("\nWerfen sie einen Betrag ein: ");
				double betrag = scanner.nextDouble();
				automat.geldEinzahlen(betrag);
				automat.betragAnzeigen();
				
				if (automat.sollTicketAusgeben()) {
					zahlen = false;
					automat.ticketAusgeben();
					automat.wechselgeldGeben();
				}
			}
			System.out.println();
		}
	}
}
