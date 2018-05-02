package aufgabe9;

import aufgabe9.Contact;

import java.util.zip.DataFormatException;

public class B {

    public static void main(String args[]) {
        if (args.length < 1) {
            System.err.println("Fehlende Eingabeparameter!");
            System.exit(0);
        }
        Contact contact;
        try {
            contact = new Contact(args[0]);

        } catch (DataFormatException e) {
            System.err.println("Kontakt konnte nicht erstellt werden: " + e.getMessage());
            return;
        }

        if (args.length > 1) {
            try {
                contact.setBirthday(args[1]);
            } catch (DataFormatException e) {
                System.err.println("Geburtstag konnte nicht gesetzt werden: " + e.getMessage());
            }
        }
        for (int i = 2; i < args.length; i++) {
            try {
                contact.addTelephone(args[i]);
            } catch (DataFormatException e) {
                System.err.println("Telefon konnte nicht gesetzt werden: " + e.getMessage());
            }
        }

        for (String telephone : contact.getTelephone()) {
            System.out.println(telephone);
        }

    }
}
