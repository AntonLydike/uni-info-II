package aufgabe33a;

public class A {

    private static A instance = null;

    public static A instance() {
        if(instance == null) {
            instance = new A();
        }
        return instance;
    }
}
