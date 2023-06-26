package ro.mycode.classes;

public class Convertor {
    private static  double kmToMiles = 0.621371;

    public static double kilometersToMiles(double kilometers) {
        return kilometers * kmToMiles;
    }

    public static double milesToKilometers(double miles) {
        return miles / kmToMiles;
    }
}
