package aufgabe6;

public class A {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Not enogh numbers!");
			return;
		}
		
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			
			System.out.println("Ergebnis: " + (a * b));
		} catch (NumberFormatException e) {
			System.err.println("Couldn't convert!");
		}
	}

}
