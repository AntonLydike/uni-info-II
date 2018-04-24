package blatt02;

import java.util.zip.DataFormatException;

public class Aufgabe07b {

    public static void main(String[] args) {
        try {
            Matrix matrix = new Matrix(2, 3);
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 3; column++) {
                    matrix.setValue(row, column, 1);
                }
            }
        } catch (DataFormatException e) {
            System.out.println("Es ist ein Fehler aufgetreten: " + e.getMessage());
        }
    }
}
