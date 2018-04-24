package blatt02;

public class Aufgabe06a {

    public static void main (String[] args) {

        if (args.length != 2) {
            System.exit(0);
        }

        try {
            System.out.println(Double.parseDouble(args[0]) * Double.parseDouble(args[1]));
        } catch (NumberFormatException e) {
            System.out.println("Mindestens ein Kommandozeilenparameter ist kein gültiger double-Wert");
        }

    }
}
