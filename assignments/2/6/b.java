package aufgabe6;

import java.util.ArrayList;

public class B {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		int n = randomIntRange(1, 100000);
		double sum = 0;
		
		while (n-- > 0) {
			list.add(Math.random());
		}
		
		n = list.size();
		
		while (n-- > 0) {
			sum += list.get(n);
		}
		
		System.out.println("Average: " + (sum / list.size()));
	}
	
	private static int randomIntRange (int min, int max) {
		max++;
		return (int) Math.floor(Math.random() * (max - min)) + min;
	}
	

}
