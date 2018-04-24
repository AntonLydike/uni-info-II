package aufgabe5;

public class A {
	public static void main(String[] args) {
		if (args.length != 2 
		  || !args[0].equals("-o") 
		  || !Character.isDigit(args[1].charAt(0))
		 ) {
			System.out.println("nicht ok");
		} else {
			System.out.println("ok");
		}
	}
}
