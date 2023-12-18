public class Laeufer implements Comparable<Laeufer> {
    private String name;
    private double zeit;
    private boolean qualifiziert;

    public Laeufer(String name) {
        this.name = name;
        this.zeit = 0.0;
        this.qualifiziert = false;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }

    public void setQualifiziert(boolean qualifiziert) {
        this.qualifiziert = qualifiziert;
    }

    public String getName() {
        return name;
    }

    public double getZeit() {
        return zeit;
    }

    public boolean isQualifiziert() {
        return qualifiziert;
    }

    public String formatQualifiziert() {
        if (isQualifiziert())
            return "qualifiziert";
        else
            return "nicht qualifiziert";
    }

    public int compareTo(Laeufer o) {
        return Double.compare(getZeit(), o.getZeit());
    }

    public String toString() {
        return "Laeufer{" + getName() + ", " + Math.round(getZeit()) + "s, " + formatQualifiziert() + "}";
    }
}