import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble() * 3.5; 
        double b = scanner.nextDouble() * 7.5;

        double media = (a + b) / 11;

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
 
    }
 
}