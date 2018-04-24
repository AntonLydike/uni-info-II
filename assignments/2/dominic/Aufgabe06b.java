package blatt02;

import java.util.ArrayList;

public class Aufgabe06b {

    public static void main (String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        int n = (int) (Math.random() * (100000 - 1)) + 1;

        for (int i = 0; i < n; i++) {
            list.add(new Double(Math.random()));
        }

        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Das arithmetische Mittel ist: " + (sum / list.size()));

    }
}
