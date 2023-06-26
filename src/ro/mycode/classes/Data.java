package ro.mycode.classes;

public class Data {
    private static int anCurent;

    public static void setCurrentYear(int an) {
        anCurent = an;
    }

    public static int getAge(int anNastere) {
        return anCurent - anNastere;
    }
}
