import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
 
        double pi = 3.14159;

        double volume = pi * Math.pow(r, 3) * (4/3.0);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close(); 

    }

}