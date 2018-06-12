package aufgabe33b;

import java.util.*;

public class A implements Observer {
	
	private int countChanges = 0;
	private B b;
	
	public A (B b) {
		super();
		this.b = b;
		b.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		countChanges++;
	}
}

class B extends Observable {}