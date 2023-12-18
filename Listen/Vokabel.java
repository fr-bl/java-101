public class Vokabel{
	private String wort;
	private String uebersetzung; 

	public Vokabel(String wort, String uebersetzung){
		this.wort = wort;
		this.uebersetzung = uebersetzung;

	}

	public String getWort(){
		return wort;
	}

	public String getUebersetzung(){
		return uebersetzung;
	}


	public String toString(){
		return wort + " : " + uebersetzung;
	}


}