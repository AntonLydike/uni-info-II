package aufgabe15a;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class Student {
	private ArrayList<Studiengang> studiengänge;
	
	public Student (Studiengang s) throws DataFormatException {
		studiengänge = new ArrayList<Studiengang>();
		
		linkStudiengang(s);
	}
	
	public void linkStudiengang(Studiengang s) throws DataFormatException {
		if (checkStudiengang(s)) {
			studiengänge.add(s);
		} else {
			throw new DataFormatException("Studiengang ist bereits enthalten.");
		}
	}
	
	private boolean checkStudiengang(Studiengang s) {
		return studiengänge.contains(s);
	}
}
