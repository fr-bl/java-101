public class Spielelogik {

    Spieler[] spieler;
    Spielfeld spielfeld;

    int amZug;
    int gewinner;

    public Spielelogik(Spieler... spieler) {
        spielfeld = new Spielfeld();
        this.spieler = spieler;

        amZug = 0;
        gewinner = -1;
    }

    public int pruefeGewinner() {
        int gewinner = -1;
        for (int i = 0; i < 8; i++) {
            String reihe = spielfeld.getReihe(i);
            if (reihe.equals("XXX")) {
                gewinner = 0;
            } else if (reihe.equals("OOO")) {
                gewinner = 1;
            }
        }
        return gewinner;
    }

    public void spielStarten() {
        while (gewinner < 0) {
            spielfeld.printSpielfeld();
            int naechsterZug;
            do {
                naechsterZug = spieler[amZug].naechsterZug();
            } while (!spielfeld.istFeldLeer(naechsterZug));
            System.out.println(spieler[amZug].getName() + " spielt " + naechsterZug + ".");
            String spielerZeichen = spieler[amZug].getZeichen();
            spielfeld.setZeichen(naechsterZug, spielerZeichen);

            amZug = (amZug + 1) % 2;
            gewinner = pruefeGewinner();
        }
        System.out.println("Spieler " + spieler[gewinner].getName() + " hat gewonnen.");
    }

    public static void main(String[] args) {
        Spielelogik logik = new Spielelogik(new Spieler("X", "Spieler 1"),
                new Bot("O", "Bot"));
        logik.spielStarten();

    }
}