import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int number = 0b1101_1000;
        Scanner scanner = new Scanner(System.in);
        String task = "";
        Boolean test = false;

        do {

            System.out.println("Podaj podstawę liczby:");
            task = scanner.next();

            switch (task) {
                case "trzy":
                    System.out.println("Podana liczba w systemie trojkowym wynosi: " + convertToTri(number, 3));
                    test = true;
                    break;
                case "dziesiec":
                    System.out.println("Podana liczba w systemie dziesietnym wynosi: " + convertToDec(number));
                    test = true;
                    break;
                case "szesnascie":
                    System.out.println("Podana liczba w systemie szesnastkowym wynosi: " + convertToHex(number));
                    test = true;
                    break;
                default:
                    System.out.println("Blad, sprobuj jeszcze raz!");
            }
        }

        while (test != true);
    }

    public static String convertToTri(int number, int base){
        String result = "";
        int temporary;

        while (number > 0) {
            temporary = number % base;
            result += temporary;
            number /= base; // number / base => number
        }
        return new StringBuffer(result).reverse().toString();
    }

    public static String convertToDec(int number){
        return Integer.toString(number);
    }

    public static String convertToHex(int number){
        return Integer.toHexString(number);
    }
}