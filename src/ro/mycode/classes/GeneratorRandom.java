package ro.mycode.classes;

public class GeneratorRandom {
    private static java.util.Random random = new java.util.Random();

    public static int generateRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
