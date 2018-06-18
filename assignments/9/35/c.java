package aufgabe35c;

import java.util.*;

public class MitarbeiterContainer implements Iterable<Mitarbeiter> {
	private static MitarbeiterContainer unique = null;
	
	private ArrayList<Mitarbeiter> alleMitarbeiter;
	
	private MitarbeiterContainer () {
		alleMitarbeiter = new ArrayList<Mitarbeiter>();
	}
	
	public static MitarbeiterContainer instance() {
		return unique != null ? unique : (unique = new MitarbeiterContainer());
	}
	
	public void linkMitabreiter(Mitarbeiter m) {
		if (alleMitarbeiter.contains(m))
		alleMitarbeiter.add(m);
	}
	
	public void unlinkMitarbeiter(Mitarbeiter m) {
		alleMitarbeiter.remove(m);
	}
	
	@Override
	public Iterator<Mitarbeiter> iterator() {
		return alleMitarbeiter.iterator();
	}
}

class Mitarbeiter {}
