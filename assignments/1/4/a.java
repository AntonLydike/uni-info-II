package aufgabe4;

public class A {
	public static void main(String[] args) {
		int sum = sumTo(9999);

		System.out.println("Ergebnis: " + sum);
	}
	
	private static int sumTo (int x) {
		if (x < 0) {
			System.err.println("Can't sum negative numbers");
			return 0;
		}
		int sum = 0;
		
		while (x > 0) {
			sum += x--;
		}
		
		return sum;
	}
}
