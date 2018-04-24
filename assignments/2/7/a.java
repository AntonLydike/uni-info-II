package aufgabe7;

import java.util.zip.DataFormatException;
import vorgaben.Hobby;

public class A {
	public static void main(String[] args) {
		Hobby h;
		
		try {
			h = new Hobby("Lesen");
			h.setPriority(h.getPriority() + 1);	
		} catch (DataFormatException e) {
			System.err.println("Error encountered while managing hobby: " 
								+ e.toString());
			e.printStackTrace();
		}
	}
}
