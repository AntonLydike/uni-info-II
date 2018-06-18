package aufgabe35b;

public class BuchContainer {
	private static BuchContainer unique;
	private java.util.ArrayList<Buch> alleBücher = new java.util.ArrayList<Buch>();
	
	private BuchContainer() {}
	
	public static BuchContainer instance() {
		return unique != null ? unique : (unique = new BuchContainer());
	}
}

class Buch {}