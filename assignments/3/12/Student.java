package aufgabe12;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class Student {
    private List<String> email = new ArrayList<>();

    public void addEmail(String email) throws DataFormatException {
        if(!checkEmail(email) ) {
            throw new DataFormatException("Email ist ungueltig. email=" + email);
        } else {
            if (!this.email.contains(email)) {
                this.email.add(email);
            } else {
                throw new DataFormatException("Email bereits vorhanden. email=" +email);
            }
        }
    }

    public List<String> getEmail() {
        return this.email;
    }

    public void deleteEmail(String email) {
        this.email.remove(email);
    }

    public int getEmailCount() {
        return this.email.size();
    }

    private static boolean checkEmail(String email) {
        return email.indexOf("@") >= 1 && email.length() > (email.indexOf("@") + 1);
    }
}
