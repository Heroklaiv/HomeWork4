import java.util.Scanner;

public class Celsius implements Temperature {
    public void translate() {
        Scanner scanner = new Scanner(System.in);
        double celcius = scanner.nextDouble();
        //Farengate
        System.out.println("Farengate "+((celcius * 1.8) + 32));
        //Kelvin
        System.out.println("Kelvin "+(celcius + 273.15));

    }


}