package ro.mycode.classes;

public class Configurare {
    private static String nume;
    private static int conex;

    public static void setNume(String name) {
        nume = name;
    }

    public static void setConex(int max) {
        conex = max;
    }

    public static String getNume() {
        return nume;
    }

    public static int getConex() {
        return conex;
    }

}
