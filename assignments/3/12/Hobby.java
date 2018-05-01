package aufgabe12;

import java.util.zip.DataFormatException;

public class Hobby {


    private String name;
    private int priority = 1;

    public Hobby(String name) throws DataFormatException {
        this.setName(name);
    }

    public Hobby(String name, int priority) throws DataFormatException {
        this.setName(name);
        this.setPriority(priority);
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    private void setName(String name) throws DataFormatException {
        if(checkName(name)) {
            this.name = name;
        } else {
            throw new DataFormatException("Name ist ungueltig!");
        }
    }

    public void setPriority(int priority) throws DataFormatException{
        if(checkPriority(priority)) {
            this.priority = priority;
        } else {
            throw new DataFormatException("Priority ist ungueltig!");
        }
    }

    private static boolean checkName(String name) {
        return !name.isEmpty();
    }

    private static boolean checkPriority(int priority) {
        return priority > 0 && priority < 6;
    }
}
