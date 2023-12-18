public class Scooter {
    private int scooterID;
    private boolean gemietet;

    public Scooter(int pScooterID) {
        scooterID = pScooterID;
        gemietet = false;
    }

    public boolean getGemietet() {
        return gemietet;
    }

    public void setGemietet(boolean pGemietet) {
        gemietet = pGemietet;
    }
    
    public String toString() {
    	return "Scooter{" + scooterID + "}";
    }
}
