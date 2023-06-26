import ro.mycode.classes.*;

public class Main {
    public static void main(String[] args) {
        Ct.increment();
        System.out.println("CT: " + Ct.getCount());


        int result = Matematica.multiplu(5, 3);
        System.out.println("Multiplicarea: " + result);

        String text = "Buna ziua!";
        boolean isNullOrEmpty = Validare.Stringg.isNullOrEmpty(text);
        System.out.println("este acest string gol?" + isNullOrEmpty);



        Cerc circle = new Cerc();
        double area = circle.getArea();
        System.out.println("Aria cercului " + area);


        Data.setCurrentYear(2023);
        int varsta = Data.getAge(2002);
        System.out.println("Varsta: " + varsta);

        Configurare.setNume("app");
        Configurare.setConex(10);
        String appName = Configurare.getNume();
        int mCon = Configurare.getConex();
        System.out.println("Nume: " + appName);
        System.out.println("Conexiuni: " + mCon);


        int randomNr = GeneratorRandom.generateRandomNumber(1, 100);
        System.out.println("nr random: " + randomNr);



        double km = 10.0;
        double miles = Convertor.kilometersToMiles(km);
        System.out.println(km + " km sunt egali cu  " + miles + " miles");



    }
}