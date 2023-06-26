package ro.mycode.classes;

public class Ct {
    private static int ct;

    public static void increment() {
        ct++;
    }

    public static int getCount() {
        return ct;
    }
}
