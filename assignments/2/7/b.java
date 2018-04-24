package aufgabe7;

import java.util.zip.DataFormatException;
import vorgaben.Matrix;

public class B {
	public static void main(String[] args) {
		Matrix m;
		
		try {
			m = new Matrix(2,3);
		} catch (DataFormatException e) {
			System.err.println("Couldn't handle matrix: " + e.toString());
			e.printStackTrace();
			return;
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				m.setValue(i, j, 1);	
			}
		}
	}
}
