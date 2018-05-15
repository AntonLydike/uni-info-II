package aufgabe19a;

public abstract class Immobilie {
	private double preis;
	
	protected Immobilie (double preis) {
		this.preis = preis;
	}
	
	public double getPreis() {
		return preis;
	}
}
