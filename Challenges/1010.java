import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
 
        Double[] first = new Double[3];
        Double[] second = new Double[3];

        for (int i = 0; i < 3; i++) {
            first[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 3; i++) {
            second[i] = scanner.nextDouble();
        }

        double codeFirst = first[0];
        double priceFirst = first[1];
        double quantityFirst = first[2];

        double codeSecond = second[0];
        double priceSecond = second[1];
        double quantitySecond = second[2];

        double totalFirst = priceFirst * quantityFirst;
        double totalSecond = priceSecond * quantitySecond;

        double total = totalFirst + totalSecond;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
 
    }
 
}