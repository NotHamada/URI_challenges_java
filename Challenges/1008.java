import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double perhour = scanner.nextDouble();

        double salary = hours * perhour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        scanner.close();
 
    }
 
}