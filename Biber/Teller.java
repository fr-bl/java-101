public class Teller{
    private static int anzahl;

    private int number;
	private String groesse;

	public Teller(String pGroesse){
        number = anzahl;
        anzahl = anzahl + 1; 

		groesse = pGroesse;
	}

	public String getGroesse(){
		return groesse;
	}

	public String toString(){
		return "Teller " + number +  " (" + groesse + ")"; 
	}
}