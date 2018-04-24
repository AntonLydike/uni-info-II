package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe08 {

    public static void main(String args[]) {
	try {
	    Property p = new Property(100000.0, 34);
	    p.setPrice(p.getPrice() * 1.1);
	    System.out.println("Fee: " + p.getPrice() * Property.getFee() / 100);
	} catch (DataFormatException e) {
	    System.err.println(e.getMessage());
	}
    }
}
