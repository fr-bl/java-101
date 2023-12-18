public class Roller extends Fahrzeug {
	private String kennzeichen;
	private double maxGeschwindigkeit;

	public Roller(int id, String kennzeichen, double maxGeschwindigkeit) {
		super(id);
		this.kennzeichen = kennzeichen;
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}


	public String toString() {
		return "Roller{" + id + ", " + kennzeichen + "}";
	}
}
