package aufgabe33a;

public class A {
	private static A unique = null;
	
	private A() {
	}
	
	public static A instance() {
		return unique != null ? unique : (unique = new A());
	}
}
