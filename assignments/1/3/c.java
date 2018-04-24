package aufgabe3;

public class C {
	public static void main (String args[]) {
		int len = 0;
		for (int i = 0; i < args.length; i++) {
			len += args[i].length();
		}
		
		System.out.println(len);
	}
}
