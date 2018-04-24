package blatt02;

public class Aufgabe05a {

    public static void main(String[] args) {
        if(args.length == 2) {
            if (args[0].equals("-o") && Character.isDigit(args[1].charAt(0))) {
                System.out.println("ok");
            }
        } else {
            System.out.println("nicht ok");
        }
    }
}
