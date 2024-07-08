import java.util.Scanner;

public class Kelvin  implements Temperature{

    public void translate() {
        Scanner scanner = new Scanner(System.in);
        double kelvin = scanner.nextDouble();
        //Farengate
        System.out.println("Farengate "+((kelvin - 273.15)*1.8 + 32));
        //Celsius
        System.out.println("Celsius "+(kelvin - 273.15));
    }
}
