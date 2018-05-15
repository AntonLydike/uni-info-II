package aufgabe19b;

public class Quader extends Körper {
	private int länge;
	private int breite;
	private int höhe;	

	public Quader(int länge, int breite, int höhe) {
		super();
		this.länge = länge;
		this.breite = breite;
		this.höhe = höhe;
	}
	
	public double getVolumen() {
		return länge * breite * höhe;
	}

	public int getLänge() {
		return länge;
	}

	public int getBreite() {
		return breite;
	}

	public int getHöhe() {
		return höhe;
	}

	public boolean equals(Object o) {
		return (o instanceof Quader 
				&& ((Quader) o).getLänge() == länge 
				&& ((Quader) o).getBreite() == breite 
				&& ((Quader) o).getHöhe() == höhe);
	}
	
}
