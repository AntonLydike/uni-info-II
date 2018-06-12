package aufgabe33b;

import java.util.Observable;

public class B extends Observable {

    private static B instance = null;

    public B instance() {
        if(instance == null)
            instance = new B();
        return instance;
    }
}
