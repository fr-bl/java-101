public class Bike extends Fahrzeug {
	private double rahmenGroesse;

	public Bike(int id, double rahmenGroesse) {
		super(id);
		this.rahmenGroesse = rahmenGroesse;
	}

	public String toString() {
		return "Bike{" + id + "}";
	}
}
