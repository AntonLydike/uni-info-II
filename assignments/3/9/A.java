package aufgabe9;

import aufgabe9.Circle;
import aufgabe9.Point;

import java.util.zip.DataFormatException;

public class A {

    public static void main(String args[]) {

        if(args.length % 3 != 0) {
            System.out.println("Die Anzahl der Eingabeparameter ist nicht durch 3 teilbar!");
            System.exit(0);
        }

        int n = 0;
        for (int i = 0; i < args.length; i = i+3) {
            try {
                double x = Double.parseDouble(args[i]);
                double y = Double.parseDouble(args[i+1]);
                double r = Double.parseDouble(args[i+2]);

                Point p = new Point(x,y);
                Circle c = new Circle(r, p);
                n++;
            } catch (NumberFormatException e) {
                System.err.println("Couldn't convert!");
            } catch (DataFormatException e) {
                System.err.println("Could not create circle!" + e.getMessage());
            }
        }

        System.out.println("Es wurde(n) " + n + " Kreis(e) erzeugt.");
    }

}
