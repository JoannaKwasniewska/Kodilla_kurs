import java.util.Scanner;

public class ColorName {

    public static String getColorName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj pierwszą literę koloru ");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "C":
                    System.out.println("Czerwony");
                    break;
                case "Z":
                    System.out.println("Zielony");
                    break;
                case "N":
                    System.out.println("Niebieski");
                    break;
                case "Ż":
                    System.out.println("Żółty");
                    break;
                default:
                    System.out.println("Nie ma koloru na taką literę ;) Spróbuj jeszcze raz, nie poddawaj się : > ");
            }
        }
    }
    public static int getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę koloru:");
        int val = scanner.nextInt();
        return val;
    }
}
