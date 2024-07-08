import java.util.Scanner;

public class Farengate implements Temperature {

    public void translate() {
        Scanner scanner = new Scanner(System.in);
        double farengate = scanner.nextDouble();
        //Celsius
        System.out.println("Celsius "+(farengate - 32) / 1.8);
        //Kelvin
        System.out.println("Kelvin "+((farengate - 32) / 1.8)+273.15);

    }
}
