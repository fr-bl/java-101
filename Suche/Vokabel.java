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

	public boolean equals(Object o){
		if(!(o instanceof Vokabel)){
			return false;
		} else {
			return wort.equals(((Vokabel)o).getWort());
		}
	}


}