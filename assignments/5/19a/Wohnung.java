package aufgabe19a;

public class Wohnung extends Immobilie {
	private int wohnfläche;
	
	public Wohnung(double preis, int wohnfläche) {
		super(preis);
		
		this.wohnfläche = wohnfläche;
	}
	
	public int getWohnfläche() {
		return wohnfläche;
	}
	
	public String toString() {
		return "Wohnung: {" 
				+ "\n\tpreis:  " + getPreis()
				+ "\n\tfläche: " + getWohnfläche() 
				+ "\n}"; 
	}
}
