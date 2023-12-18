public class App {
    private String kundenName;
    private double mietZeit;
    private double mietZeitStart;
    private double gesamtMietZeit;
    //Instanzvariable:  Referenz auf den aktuellen Scooter
    private Scooter aktuellerScooter;

    public App(String pKundenName) {
        kundenName = pKundenName;
        mietZeit = 0.0;
        gesamtMietZeit = 0.0;
        //Variable aktuellerScooter initialisieren
        aktuellerScooter = null;
    }


    public void mieteStarten(Scooter scooter) {
    	if (aktuellerScooter != null) {
			System.out.println("Es wird bereits " + scooter + " gemietet");
    	} else if (scooter.getGemietet()) {
			System.out.println(scooter + " ist bereits vermietet");
    	} else {
			aktuellerScooter = scooter;
			aktuellerScooter.setGemietet(true);
			mietZeitStart = System.currentTimeMillis();
			
			System.out.println("Miete für " + aktuellerScooter + " wurde gestartet");
    	}
    }


    public void mieteBeenden() {
    	aktuellerScooter.setGemietet(false);
    	mietZeit = System.currentTimeMillis() - mietZeitStart;
    	gesamtMietZeit += mietZeit;
    	System.out.println("Miete für " + aktuellerScooter + " von " + mietZeit / 1000 + " S		ekunden wurde beendet");
    	aktuellerScooter = null;
    }


    public static void main(String[] args) throws InterruptedException {
        App app = new App("Herr Kleinert");
        Scooter scooter = new Scooter(12345);
        Scooter scooter2 = new Scooter(23456);

        //Testfall: Miete fuer Scooter soll hier gestartet und beendet werden.
        app.mieteStarten(scooter);
        Thread.sleep(1000);
        app.mieteStarten(scooter2);
        app.mieteBeenden();
    }
}
