package aufgabe15b;

import java.util.Date;

public class Studium {
	private Date immatrikulation;
	private Date exmatrikulation;
	private Studiengang studiengang;
	
	public Studium (Date im) {
		setImmatrikulation(im);
	}
	
	public void setImmatrikulation(Date im) {
		immatrikulation = im;
	}
}
