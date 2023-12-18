public class Hausaufgabe {
    private String fach;
    private String aufgabe;
    
    public Hausaufgabe(String fach, String aufgabe) {
        this.fach = fach;
        this.aufgabe = aufgabe;
    }

    @Override
    public String toString() {
        return "Hausaufgabe [" + fach + ": " + aufgabe + "]";
    }
}
