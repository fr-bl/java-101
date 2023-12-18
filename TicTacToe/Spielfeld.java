public class Spielfeld {
    String[] spielfeld;

    public Spielfeld() {
        spielfeld = new String[9];
        for (int i = 0; i < 9; i++) {
            spielfeld[i] = "" + i;
        }
    }

    /* Eine Methode soll das Zeichen an einer bestimmten Position zurueckgeben, */
    public String getZeichen(int nummer) {
        return spielfeld[nummer];
    }

    /* Die Methode prueft, ob ein Feld leer ist */
    public boolean istFeldLeer(int nummer) {
        return spielfeld[nummer].equals("" + nummer);
    }

    /*
     * Die Methode setzt ein uebergebenes Zeichen an eine uebergebene Position im
     * Array.
     */
    public void setZeichen(int nummer, String zeichen) {
        spielfeld[nummer] = zeichen;
    }

    /*
     * Die Methode erzeugt für eine als Paramater uebergebene Zahl zwischen 0 und 8
     * einen String aus drei Zeichen.
     * Fuer die Zahl 0 wird z.B. die erste waagerechte Reiche zu einem String
     * zusammengefasst.
     */
    public String getReihe(int reihenNummer) {
        int[][] reihen = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                { 0, 4, 8 }, { 2, 4, 6 }
        };
        String reihe = "";

        for (int field : reihen[reihenNummer]) {
            reihe += spielfeld[field];
        }

        return reihe;
    }

    /* Gibt das Spielfeld aus. */
    public void printSpielfeld() {
        System.out.println("|---|---|---|");
        System.out.println("|-" + spielfeld[0] + "-|-" + spielfeld[1] + "-|-" + spielfeld[2] + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + spielfeld[3] + "-|-" + spielfeld[4] + "-|-" + spielfeld[5] + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + spielfeld[6] + "-|-" + spielfeld[7] + "-|-" + spielfeld[8] + "-|");
        System.out.println("|---|---|---|");
    }
}