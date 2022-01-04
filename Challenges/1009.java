import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        double fixedSalary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();

        double salary = fixedSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", salary);

        scanner.close();

    }
 
}