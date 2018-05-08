package aufgabe15b;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class Student {
	private ArrayList<Studium> studiumse;
	
	public Student (Studium s) throws DataFormatException {
		studiumse = new ArrayList<Studium>();
		
		linkStudium(s);
	}
	
	public void linkStudium(Studium s) throws DataFormatException {
		if (checkStudium(s)) {
			studiumse.add(s);
		} else {
			throw new DataFormatException("Studium ist bereits enthalten.");
		}
	}
	
	private boolean checkStudium(Studium s) {
		return studiumse.contains(s);
	}
}
