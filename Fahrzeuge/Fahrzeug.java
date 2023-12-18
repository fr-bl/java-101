public abstract class Fahrzeug {
	private boolean gemietet;
	protected int id;
	
	public Fahrzeug(int id) {
		this.id = id;
		gemietet = false;
	}
	
	public boolean getGemietet() {
		return gemietet;
	}
	
	public void setGemietet(boolean gemietet) {
		this.gemietet = gemietet;
	}
	
	public String toString() {
		return "Fahrzeug{" + id + "}";
	}
}
