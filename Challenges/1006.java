import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble() * 2; 
        double b = scanner.nextDouble() * 3;
        double c = scanner.nextDouble() * 5;

        double media = (a + b + c) / 10;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
 
    }
 
}