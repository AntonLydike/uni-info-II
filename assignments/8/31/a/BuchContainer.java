package blatt08.a31;

import blatt08.data.EmployeeContainer;

import java.util.Observable;

public class BuchContainer extends Observable {

    private static BuchContainer unique = null;

    public static BuchContainer instance() throws LoadSaveException {
        if (unique == null)
            unique = new BuchContainer();
        return unique;
    }
}
