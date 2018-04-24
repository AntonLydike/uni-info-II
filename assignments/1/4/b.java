package aufgabe4;

public class B {
	public static void main(String[] args) {
		System.out.println("Ergebnis: " + isPrime(9176861));
	}
	
	private static boolean isPrime (int x) {
		if (x < 0) {
			System.err.println("Can't check negative numbers");
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
