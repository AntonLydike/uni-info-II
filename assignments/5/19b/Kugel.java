package aufgabe19b;

public class Kugel extends Körper {
	private int radius;
	
	public Kugel (int radius) {
		super();
		this.radius = radius;
	}

	public double getVolumen() {
		return 4/3 * Math.PI * radius * radius * radius;
	}
	
	public int getRadius () {
		return radius;
	}
	
	public boolean equals(Object o) {
		return (o instanceof Kugel && ((Kugel) o).getRadius() == radius);
	}

}
