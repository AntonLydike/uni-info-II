package aufgabe3;

public class D {
	public static void main (String args[]) {
		if (args.length != 1) {
			System.err.println("Fehler");
			return;
		}
		
		System.out.println(args[0].startsWith("Warnung"));
	}
}
