package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe07a {

    public static void main(String[] args) {
        try {
            Hobby lesen = new Hobby("Lesen");
            lesen.setPriority(lesen.getPriority() + 1);
        } catch (DataFormatException e) {
            System.out.println("Es ist ein Fehler aufgetreten: " + e.getMessage());
        }

    }
}
