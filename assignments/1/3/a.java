package aufgabe3;

public class A {

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Fehler");
			return;
		}

		System.out.println(args[0].charAt(args[0].length() - 1));
	}
}
