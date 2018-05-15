package aufgabe19a;

public class Grundstück extends Immobilie {
	private int größe;
	
	public Grundstück (double preis, int größe) {
		super(preis);
		
		this.größe = größe;
	}
	
	public int getGröße() {
		return größe;
	}
	
	public String toString() {
		return "Wohnung: {" 
				+ "\n\tpreis: " + getPreis()
				+ "\n\tgröße: " + getGröße() 
				+ "\n}"; 
	}
}
