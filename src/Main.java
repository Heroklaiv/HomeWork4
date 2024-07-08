import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите велечену для конвертации");
        System.out.println("1. Цельсия");
        System.out.println("2. Фаренгейты");
        System.out.println("3. Келвины");
        byte number = in.nextByte();
        switch (number) {
            case 1:
                Celsius celsius = new Celsius();
                celsius.translate();
                break;
            case 2:
                Farengate farengate = new Farengate();
                farengate.translate();
                break;
            case 3:
                Kelvin kelvin = new Kelvin();
                kelvin.translate();
                break;
        }

    }
}