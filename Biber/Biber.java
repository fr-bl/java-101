public class Biber{
	private String name;
	private String groesse;

	public Biber(String pName, String pGroesse){
		name = pName;
		groesse = pGroesse;
	}

	public String getName(){
		return name;
	}

	public String getGroesse(){
		return groesse;
	}

	public String toString(){
		return name + " (" + groesse + ")"; 
	}
}